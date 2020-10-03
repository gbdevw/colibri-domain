package tech.gbdevw.colibri.domain.serde;

import com.google.protobuf.InvalidProtocolBufferException;

import org.apache.kafka.common.serialization.Deserializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.MFI;

@RegisterForReflection
public class MFIDeserializer implements Deserializer<MFI> {

    @Override
    public MFI deserialize(String topic, byte[] data) {
        try 
        {
            return MFI.parseFrom(data);
        } 
        catch (InvalidProtocolBufferException e) 
        {
            throw new RuntimeException(e);
        }
    }
    
}
