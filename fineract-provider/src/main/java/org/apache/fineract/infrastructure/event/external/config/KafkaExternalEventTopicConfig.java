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
package org.apache.fineract.infrastructure.event.external.config;

import static org.apache.kafka.clients.producer.ProducerConfig.BOOTSTRAP_SERVERS_CONFIG;

import java.util.HashMap;
import java.util.Map;
import org.apache.fineract.infrastructure.core.config.FineractProperties;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
@Conditional(ExternalEventsKafkaTopicAutoCreateCondition.class)
public class KafkaExternalEventTopicConfig {

    @Autowired
    private FineractProperties fineractProperties;

    @Bean
    public KafkaAdmin admin() {
        Map<String, Object> props = new HashMap<>(
                fineractProperties.getEvents().getExternal().getProducer().getKafka().getAdmin().getExtraPropertiesMap());
        props.put(BOOTSTRAP_SERVERS_CONFIG, fineractProperties.getEvents().getExternal().getProducer().getKafka().getBootstrapServers());
        return new KafkaAdmin(props);
    }

    @Bean
    public NewTopic externalEventsTopic() {
        FineractProperties.KafkaTopicProperties topicProperties = fineractProperties.getEvents().getExternal().getProducer().getKafka()
                .getTopic();
        return TopicBuilder.name(topicProperties.getName()).partitions(topicProperties.getPartitions())
                .replicas(topicProperties.getReplicas()).build();
    }

}
