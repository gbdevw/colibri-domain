package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Serializer;

import tech.gbdevw.colibri.domain.FSO;

public class FSOSerializer implements Serializer<FSO> {

    @Override
    public byte[] serialize(String topic, FSO data) {
        return data.toByteArray();
    }
}
