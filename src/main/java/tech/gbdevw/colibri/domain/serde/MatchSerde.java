package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.Match;

@RegisterForReflection
public class MatchSerde implements Serde<Match> {

    @Override
    public Serializer<Match> serializer() {
        return new MatchSerializer();
    }

    @Override
    public Deserializer<Match> deserializer() {
        return new MatchDeserializer();
    }
}
