package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Serializer;

import io.quarkus.runtime.annotations.RegisterForReflection;
import tech.gbdevw.colibri.domain.ROC;

@RegisterForReflection
public class ROCSerializer implements Serializer<ROC> {

    @Override
    public byte[] serialize(String topic, ROC data) {
        return data.toByteArray();
    }
    
}
