package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Serializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.EMA;

@RegisterForReflection
public class EMASerializer implements Serializer<EMA> {

    @Override
    public byte[] serialize(String topic, EMA data) {
        return data.toByteArray();
    }
    
}
