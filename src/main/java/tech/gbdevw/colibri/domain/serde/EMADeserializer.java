package tech.gbdevw.colibri.domain.serde;

import com.google.protobuf.InvalidProtocolBufferException;

import org.apache.kafka.common.serialization.Deserializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.EMA;

@RegisterForReflection
public class EMADeserializer implements Deserializer<EMA> {

    @Override
    public EMA deserialize(String topic, byte[] data) {
        try 
        {
            return EMA.parseFrom(data);
        } 
        catch (InvalidProtocolBufferException e) 
        {
            throw new RuntimeException(e);
        }
    }
    
}
