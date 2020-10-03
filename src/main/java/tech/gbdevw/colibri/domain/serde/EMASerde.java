package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.EMA;

@RegisterForReflection
public class EMASerde implements Serde<EMA> {

    @Override
    public Serializer<EMA> serializer() {
        return new EMASerializer();
    }

    @Override
    public Deserializer<EMA> deserializer() {
        return new EMADeserializer();
    }
    
}
