package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.BOL;

@RegisterForReflection
public class BOLSerde implements Serde<BOL> {

    @Override
    public Serializer<BOL> serializer() {
        return new BOLSerializer();
    }

    @Override
    public Deserializer<BOL> deserializer() {
        return new BOLDeserializer();
    }
    
}
