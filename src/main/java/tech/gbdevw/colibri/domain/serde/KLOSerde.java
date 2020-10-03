package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.KLO;

@RegisterForReflection
public class KLOSerde implements Serde<KLO> {

    @Override
    public Serializer<KLO> serializer() {
        return new KLOSerializer();
    }

    @Override
    public Deserializer<KLO> deserializer() {
        return new KLODeserializer();
    }
    
}
