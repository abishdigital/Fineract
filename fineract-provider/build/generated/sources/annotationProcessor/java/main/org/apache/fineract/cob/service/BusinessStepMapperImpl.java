package org.apache.fineract.cob.service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.apache.fineract.cob.data.BusinessStep;
import org.apache.fineract.cob.domain.BatchBusinessStep;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-27T12:43:30+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.10 (Azul Systems, Inc.)"
)
@Component
public class BusinessStepMapperImpl implements BusinessStepMapper {

    @Override
    public BusinessStep map(BatchBusinessStep source) {
        if ( source == null ) {
            return null;
        }

        BusinessStep businessStep = new BusinessStep();

        businessStep.setOrder( source.getStepOrder() );
        businessStep.setStepName( source.getStepName() );

        return businessStep;
    }

    @Override
    public List<BusinessStep> map(List<BatchBusinessStep> source) {
        if ( source == null ) {
            return null;
        }

        List<BusinessStep> list = new ArrayList<BusinessStep>( source.size() );
        for ( BatchBusinessStep batchBusinessStep : source ) {
            list.add( map( batchBusinessStep ) );
        }

        return list;
    }
}
