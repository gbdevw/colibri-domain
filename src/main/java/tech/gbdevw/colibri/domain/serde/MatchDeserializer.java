package tech.gbdevw.colibri.domain.serde;

import com.google.protobuf.InvalidProtocolBufferException;

import org.apache.kafka.common.serialization.Deserializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.Match;

@RegisterForReflection
public class MatchDeserializer implements Deserializer<Match> {

    @Override
    public Match deserialize(String topic, byte[] data) {
        try 
        {
            return Match.parseFrom(data);
        } 
        catch (InvalidProtocolBufferException e) 
        {
            throw new RuntimeException(e);
        }
    }
}
