package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Serializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.Match;

@RegisterForReflection
public class MatchSerializer implements Serializer<Match> {

    @Override
    public byte[] serialize(String topic, Match data) {
        return data.toByteArray();
    }
    
}
