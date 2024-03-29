/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.useradministration.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.fineract.infrastructure.core.api.JsonCommand;
import org.apache.fineract.infrastructure.core.data.CommandProcessingResult;
import org.apache.fineract.infrastructure.core.data.CommandProcessingResultBuilder;
import org.apache.fineract.infrastructure.core.exception.ErrorHandler;
import org.apache.fineract.useradministration.api.PasswordPreferencesApiConstants;
import org.apache.fineract.useradministration.data.PasswordPreferencesDataValidator;
import org.apache.fineract.useradministration.domain.PasswordValidationPolicy;
import org.apache.fineract.useradministration.domain.PasswordValidationPolicyRepository;
import org.apache.fineract.useradministration.exception.PasswordValidationPolicyNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
public class PasswordPreferencesWritePlatformServiceJpaRepositoryImpl implements PasswordPreferencesWritePlatformService {

    private final PasswordValidationPolicyRepository validationRepository;
    private final PasswordPreferencesDataValidator dataValidator;

    @Transactional
    @Override
    public CommandProcessingResult updatePreferences(final JsonCommand command) {

        this.dataValidator.validateForUpdate(command.json());
        Long validationPolicyId = command.longValueOfParameterNamed(PasswordPreferencesApiConstants.VALIDATION_POLICY_ID);
        try {
            final List<PasswordValidationPolicy> validationPolicies = this.validationRepository.findAll();

            Map<String, Object> changes = new HashMap<>(1);

            boolean found = false;

            for (PasswordValidationPolicy policy : validationPolicies) {
                if (policy.getId().equals(validationPolicyId)) {
                    found = true;
                    if (!policy.isActive()) {
                        changes = policy.activate();
                    }
                } else if (policy.isActive() && !policy.getId().equals(validationPolicyId)) {
                    policy.deActivate();
                }
            }

            if (!found) {
                throw new PasswordValidationPolicyNotFoundException(validationPolicyId);
            }

            if (!changes.isEmpty()) {
                this.validationRepository.saveAll(validationPolicies);
                this.validationRepository.flush();
            }

            return new CommandProcessingResultBuilder() //
                    .withCommandId(command.commandId()) //
                    .with(changes) //
                    .build();
        } catch (final JpaSystemException | DataIntegrityViolationException dve) {
            log.error("Error occured.", dve);
            throw ErrorHandler.getMappable(dve, "error.msg.password.validation.policy.unknown.data.integrity.issue",
                    "Unknown data integrity issue with resource.");
        }
    }
}
