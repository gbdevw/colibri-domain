package tech.gbdevw.colibri.domain.serde;

import com.google.protobuf.InvalidProtocolBufferException;

import org.apache.kafka.common.serialization.Deserializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.SMA;

@RegisterForReflection
public class SMADeserializer implements Deserializer<SMA> {

    @Override
    public SMA deserialize(String topic, byte[] data) {
        try 
        {
            return SMA.parseFrom(data);
        } 
        catch (InvalidProtocolBufferException e) 
        {
            throw new RuntimeException(e);
        }
    }
    
}
