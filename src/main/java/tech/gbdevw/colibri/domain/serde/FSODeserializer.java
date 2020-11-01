package tech.gbdevw.colibri.domain.serde;

import com.google.protobuf.InvalidProtocolBufferException;

import org.apache.kafka.common.serialization.Deserializer;

import tech.gbdevw.colibri.domain.FSO;

public class FSODeserializer implements Deserializer<FSO> {

    @Override
    public FSO deserialize(String topic, byte[] data) {
        try 
        {
            return FSO.parseFrom(data);
        } 
        catch (InvalidProtocolBufferException e) 
        {
            throw new RuntimeException(e);
        }
    }
    
}
