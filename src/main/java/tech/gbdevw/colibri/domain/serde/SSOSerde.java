package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import tech.gbdevw.colibri.domain.SSO;

public class SSOSerde implements Serde<SSO> {

    @Override
    public Serializer<SSO> serializer() {
        return new SSOSerializer();
    }

    @Override
    public Deserializer<SSO> deserializer() {
        return new SSODeserializer();
    }
    
}
