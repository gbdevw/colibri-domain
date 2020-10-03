package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.MFI;

@RegisterForReflection
public class MFISerde implements Serde<MFI> {

    @Override
    public Serializer<MFI> serializer() {
        return new MFISerializer();
    }

    @Override
    public Deserializer<MFI> deserializer() {
        return new MFIDeserializer();
    }
    
}
