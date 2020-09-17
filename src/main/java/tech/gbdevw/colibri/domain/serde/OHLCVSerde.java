package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import tech.gbdevw.colibri.domain.OHLCV;

public class OHLCVSerde implements Serde<OHLCV> {

    @Override
    public Serializer<OHLCV> serializer() {
        return new OHLCVSerializer();
    }

    @Override
    public Deserializer<OHLCV> deserializer() {
        return new OHLCVDeserializer();
    }
    
}