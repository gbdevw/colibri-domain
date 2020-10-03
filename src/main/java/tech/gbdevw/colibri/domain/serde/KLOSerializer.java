package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Serializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.KLO;

@RegisterForReflection
public class KLOSerializer implements Serializer<KLO> {

        @Override
        public byte[] serialize(String topic, KLO data) {
            return data.toByteArray();
        }
}
