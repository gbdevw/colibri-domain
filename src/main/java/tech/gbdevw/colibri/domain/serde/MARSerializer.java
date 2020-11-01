package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Serializer;

import tech.gbdevw.colibri.domain.MAR;

public class MARSerializer implements Serializer<MAR> {

    @Override
    public byte[] serialize(String topic, MAR data) {
        return data.toByteArray();
    }
}
