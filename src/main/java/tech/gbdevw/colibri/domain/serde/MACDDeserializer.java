package tech.gbdevw.colibri.domain.serde;

import com.google.protobuf.InvalidProtocolBufferException;

import org.apache.kafka.common.serialization.Deserializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.MACD;

@RegisterForReflection
public class MACDDeserializer implements Deserializer<MACD> {

    @Override
    public MACD deserialize(String topic, byte[] data) {
        try 
        {
            return MACD.parseFrom(data);
        } 
        catch (InvalidProtocolBufferException e) 
        {
            throw new RuntimeException(e);
        }
    }
}
