package tech.gbdevw.colibri.domain.serde;

import com.google.protobuf.InvalidProtocolBufferException;

import org.apache.kafka.common.serialization.Deserializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.OHLCV;

@RegisterForReflection
public class OHLCVDeserializer implements Deserializer<OHLCV> {

    @Override
    public OHLCV deserialize(String topic, byte[] data) {
        try 
        {
            return OHLCV.parseFrom(data);
        } 
        catch (InvalidProtocolBufferException e) 
        {
            throw new RuntimeException(e);
        }
    }
}