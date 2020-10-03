package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Serializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.MFI;

@RegisterForReflection
public class MFISerializer implements Serializer<MFI> {

    @Override
    public byte[] serialize(String topic, MFI data) {
        return data.toByteArray();
    }
    
}
