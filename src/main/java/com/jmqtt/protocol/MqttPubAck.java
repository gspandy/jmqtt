package com.jmqtt.protocol;

public class MqttPubAck extends MqttMessage implements IId {

    private long id;

    public MqttPubAck() {
        this(-1);
    }

    public MqttPubAck(long id) {
        this.msgType = MESSAGE_TYPE_PUBACK;
        this.id = id;
    }

    @Override
    public void setId(long id) {
        this.id = id;

    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public int getRemainingLength() {
        return 2;
    }

}
