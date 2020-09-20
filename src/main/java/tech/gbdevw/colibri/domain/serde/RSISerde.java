package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serializer;

import io.quarkus.runtime.annotations.RegisterForReflection;

import org.apache.kafka.common.serialization.Serde;

import tech.gbdevw.colibri.domain.RSI;

@RegisterForReflection
public class RSISerde implements Serde<RSI> {

    @Override
    public Serializer<RSI> serializer() {
        return new RSISerializer();
    }

    @Override
    public Deserializer<RSI> deserializer() {
        return new RSIDeserializer();
    }
    
}
