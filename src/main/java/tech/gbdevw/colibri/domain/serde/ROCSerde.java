package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import tech.gbdevw.colibri.domain.ROC;

public class ROCSerde implements Serde<ROC> {

    @Override
    public Serializer<ROC> serializer() {
        return new ROCSerializer();
    }

    @Override
    public Deserializer<ROC> deserializer() {
        return new ROCDeserializer();
    }
    
}
