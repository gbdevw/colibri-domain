package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.MACD;

@RegisterForReflection
public class MACDSerde implements Serde<MACD> {

    @Override
    public Serializer<MACD> serializer() {
        return new MACDSerializer();
    }

    @Override
    public Deserializer<MACD> deserializer() {
        return new MACDDeserializer();
    }
    
}
