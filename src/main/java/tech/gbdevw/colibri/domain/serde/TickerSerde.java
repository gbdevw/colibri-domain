package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serializer;
import org.apache.kafka.common.serialization.Serde;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.Ticker;

@RegisterForReflection
public class TickerSerde implements Serde<Ticker> {

    @Override
    public Serializer<Ticker> serializer() {
        return new TickerSerializer();
    }

    @Override
    public Deserializer<Ticker> deserializer() {
        return new TickerDeserializer();
    }
    
}
