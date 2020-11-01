package tech.gbdevw.colibri.domain.serde;

import org.apache.kafka.common.serialization.Serializer;

import tech.gbdevw.colibri.domain.SSO;

public class SSOSerializer implements Serializer<SSO> {

    @Override
    public byte[] serialize(String topic, SSO data) {
        return data.toByteArray();
    }
}
