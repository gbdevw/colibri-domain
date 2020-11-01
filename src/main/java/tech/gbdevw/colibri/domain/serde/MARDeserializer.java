package tech.gbdevw.colibri.domain.serde;

import com.google.protobuf.InvalidProtocolBufferException;

import org.apache.kafka.common.serialization.Deserializer;

import tech.gbdevw.colibri.domain.MAR;

public class MARDeserializer implements Deserializer<MAR> {

    @Override
    public MAR deserialize(String topic, byte[] data) {
        try 
        {
            return MAR.parseFrom(data);
        } 
        catch (InvalidProtocolBufferException e) 
        {
            throw new RuntimeException(e);
        }
    }
    
}
