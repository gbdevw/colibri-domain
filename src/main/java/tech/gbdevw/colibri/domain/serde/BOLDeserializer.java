package tech.gbdevw.colibri.domain.serde;

import com.google.protobuf.InvalidProtocolBufferException;

import org.apache.kafka.common.serialization.Deserializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.BOL;

@RegisterForReflection
public class BOLDeserializer implements Deserializer<BOL> {

    @Override
    public BOL deserialize(String topic, byte[] data) {
        try 
        {
            return BOL.parseFrom(data);
        } 
        catch (InvalidProtocolBufferException e) 
        {
            throw new RuntimeException(e);
        }
    }
    
}
