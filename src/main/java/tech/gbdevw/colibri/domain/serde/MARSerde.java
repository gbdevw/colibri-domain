package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import tech.gbdevw.colibri.domain.MAR;

public class MARSerde implements Serde<MAR> {

    @Override
    public Serializer<MAR> serializer() {
        return new MARSerializer();
    }

    @Override
    public Deserializer<MAR> deserializer() {
        return new MARDeserializer();
    }
    
}
