package org.apache.fineract.infrastructure.event.external.service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.apache.fineract.infrastructure.event.external.data.ExternalEventConfigurationItemData;
import org.apache.fineract.infrastructure.event.external.repository.domain.ExternalEventConfiguration;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-23T10:54:30+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.10 (Azul Systems, Inc.)"
)
@Component
public class ExternalEventsConfigurationMapperImpl implements ExternalEventsConfigurationMapper {

    @Override
    public List<ExternalEventConfigurationItemData> map(List<ExternalEventConfiguration> source) {
        if ( source == null ) {
            return null;
        }

        List<ExternalEventConfigurationItemData> list = new ArrayList<ExternalEventConfigurationItemData>( source.size() );
        for ( ExternalEventConfiguration externalEventConfiguration : source ) {
            list.add( externalEventConfigurationToExternalEventConfigurationItemData( externalEventConfiguration ) );
        }

        return list;
    }

    protected ExternalEventConfigurationItemData externalEventConfigurationToExternalEventConfigurationItemData(ExternalEventConfiguration externalEventConfiguration) {
        if ( externalEventConfiguration == null ) {
            return null;
        }

        ExternalEventConfigurationItemData externalEventConfigurationItemData = new ExternalEventConfigurationItemData();

        externalEventConfigurationItemData.setType( externalEventConfiguration.getType() );
        externalEventConfigurationItemData.setEnabled( externalEventConfiguration.isEnabled() );

        return externalEventConfigurationItemData;
    }
}
