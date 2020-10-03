package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.SMA;

@RegisterForReflection
public class SMASerde implements Serde<SMA> {

    @Override
    public Serializer<SMA> serializer() {
        return new SMASerializer();
    }

    @Override
    public Deserializer<SMA> deserializer() {
        return new SMADeserializer();
    }
    
}
