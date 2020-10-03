package tech.gbdevw.colibri.domain.serde;

import com.google.protobuf.InvalidProtocolBufferException;

import org.apache.kafka.common.serialization.Deserializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.KLO;

@RegisterForReflection
public class KLODeserializer implements Deserializer<KLO> {

    @Override
    public KLO deserialize(String topic, byte[] data) {
        try 
        {
            return KLO.parseFrom(data);
        } 
        catch (InvalidProtocolBufferException e) 
        {
            throw new RuntimeException(e);
        }
    }
    
}
