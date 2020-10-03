package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Serializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.SMA;

@RegisterForReflection
public class SMASerializer implements Serializer<SMA> {

    @Override
    public byte[] serialize(String topic, SMA data) {
        return data.toByteArray();
    }
    
}
