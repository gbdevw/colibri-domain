package tech.gbdevw.colibri.domain.serde;

import com.google.protobuf.InvalidProtocolBufferException;

import org.apache.kafka.common.serialization.Deserializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.Ticker;

@RegisterForReflection
public class TickerDeserializer implements Deserializer<Ticker> {

    @Override
    public Ticker deserialize(String topic, byte[] data) {
        try 
        {
            return Ticker.parseFrom(data);
        } 
        catch (InvalidProtocolBufferException e) 
        {
            throw new RuntimeException(e);
        }
    }
    
}
