package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Serializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.RSI;

@RegisterForReflection
public class RSISerializer implements Serializer<RSI> {

    @Override
    public byte[] serialize(String topic, RSI data) {
        return data.toByteArray();
    }
    
}
