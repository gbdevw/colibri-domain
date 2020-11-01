package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import tech.gbdevw.colibri.domain.FSO;

public class FSOSerde implements Serde<FSO> {

    @Override
    public Serializer<FSO> serializer() {
        return new FSOSerializer();
    }

    @Override
    public Deserializer<FSO> deserializer() {
        return new FSODeserializer();
    }
    
}
