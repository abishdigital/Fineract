package org.apache.fineract.infrastructure.event.external.service.serialization.mapper.loan;

import javax.annotation.processing.Generated;
import org.apache.fineract.avro.loan.v1.DelinquencyPausePeriodV1;
import org.apache.fineract.infrastructure.event.external.service.serialization.mapper.support.AvroDateTimeMapper;
import org.apache.fineract.portfolio.loanaccount.data.DelinquencyPausePeriod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-27T12:43:30+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.10 (Azul Systems, Inc.)"
)
@Component
public class LoanDelinquencyPausePeriodMapperImpl implements LoanDelinquencyPausePeriodMapper {

    private final AvroDateTimeMapper avroDateTimeMapper;

    @Autowired
    public LoanDelinquencyPausePeriodMapperImpl(AvroDateTimeMapper avroDateTimeMapper) {

        this.avroDateTimeMapper = avroDateTimeMapper;
    }

    @Override
    public DelinquencyPausePeriodV1 map(DelinquencyPausePeriod source) {
        if ( source == null ) {
            return null;
        }

        DelinquencyPausePeriodV1 delinquencyPausePeriodV1 = new DelinquencyPausePeriodV1();

        delinquencyPausePeriodV1.setActive( source.isActive() );
        delinquencyPausePeriodV1.setPausePeriodStart( avroDateTimeMapper.mapLocalDate( source.getPausePeriodStart() ) );
        delinquencyPausePeriodV1.setPausePeriodEnd( avroDateTimeMapper.mapLocalDate( source.getPausePeriodEnd() ) );

        return delinquencyPausePeriodV1;
    }
}
