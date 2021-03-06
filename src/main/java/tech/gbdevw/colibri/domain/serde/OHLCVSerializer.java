package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Serializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.OHLCV;

@RegisterForReflection
public class OHLCVSerializer implements Serializer<OHLCV> {

    @Override
    public byte[] serialize(String topic, OHLCV data) {
        return data.toByteArray();
    }
}