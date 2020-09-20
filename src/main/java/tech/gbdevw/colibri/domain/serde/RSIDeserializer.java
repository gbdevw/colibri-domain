package tech.gbdevw.colibri.domain.serde;

import com.google.protobuf.InvalidProtocolBufferException;

import org.apache.kafka.common.serialization.Deserializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.RSI;

@RegisterForReflection
public class RSIDeserializer implements Deserializer<RSI> {

    @Override
    public RSI deserialize(String topic, byte[] data) {
        try 
        {
            return RSI.parseFrom(data);
        } 
        catch (InvalidProtocolBufferException e) 
        {
            throw new RuntimeException(e);
        }
    }
    
}
