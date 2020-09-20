package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Serializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.Ticker;

@RegisterForReflection
public class TickerSerializer implements Serializer<Ticker> {

    @Override
    public byte[] serialize(String topic, Ticker data) {
        return data.toByteArray();
    }
    
}
