package tech.gbdevw.colibri.domain.serde;

import com.google.protobuf.InvalidProtocolBufferException;

import org.apache.kafka.common.serialization.Deserializer;

import tech.gbdevw.colibri.domain.SSO;

public class SSODeserializer implements Deserializer<SSO> {

    @Override
    public SSO deserialize(String topic, byte[] data) {
        try 
        {
            return SSO.parseFrom(data);
        } 
        catch (InvalidProtocolBufferException e) 
        {
            throw new RuntimeException(e);
        }
    }
    
}
