package tech.gbdevw.colibri.domain.serde;

import com.google.protobuf.InvalidProtocolBufferException;

import org.apache.kafka.common.serialization.Deserializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.ROC;

@RegisterForReflection
public class ROCDeserializer implements Deserializer<ROC> {

    @Override
    public ROC deserialize(String topic, byte[] data) {
        try 
        {
            return ROC.parseFrom(data);
        } 
        catch (InvalidProtocolBufferException e) 
        {
            throw new RuntimeException(e);
        }
    }
    
}
