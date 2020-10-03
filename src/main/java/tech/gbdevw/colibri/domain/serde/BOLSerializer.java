package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Serializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.BOL;

@RegisterForReflection
public class BOLSerializer implements Serializer<BOL> {

    @Override
    public byte[] serialize(String topic, BOL data) {
        return data.toByteArray();
    }
    
}
