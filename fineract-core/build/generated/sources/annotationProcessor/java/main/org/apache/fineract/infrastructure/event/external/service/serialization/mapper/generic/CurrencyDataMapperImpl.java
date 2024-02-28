package org.apache.fineract.infrastructure.event.external.service.serialization.mapper.generic;

import javax.annotation.processing.Generated;
import org.apache.fineract.avro.generic.v1.CurrencyDataV1;
import org.apache.fineract.organisation.monetary.data.CurrencyData;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-23T10:54:30+0530",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.10 (Azul Systems, Inc.)"
)
@Component
public class CurrencyDataMapperImpl implements CurrencyDataMapper {

    @Override
    public CurrencyDataV1 map(CurrencyData source) {
        if ( source == null ) {
            return null;
        }

        CurrencyDataV1 currencyDataV1 = new CurrencyDataV1();

        currencyDataV1.setCode( source.getCode() );
        currencyDataV1.setName( source.getName() );
        currencyDataV1.setDecimalPlaces( source.getDecimalPlaces() );
        currencyDataV1.setInMultiplesOf( source.getInMultiplesOf() );
        currencyDataV1.setDisplaySymbol( source.getDisplaySymbol() );
        currencyDataV1.setNameCode( source.getNameCode() );
        currencyDataV1.setDisplayLabel( source.getDisplayLabel() );

        return currencyDataV1;
    }
}
