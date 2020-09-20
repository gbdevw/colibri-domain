package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Serializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.MACD;

@RegisterForReflection
public class MACDSerializer implements Serializer<MACD> {

    @Override
    public byte[] serialize(String topic, MACD data) {
        return data.toByteArray();
    }
    
}
