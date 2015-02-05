package com.jmqtt.protocol;

public class MqttPubComp extends MqttMessage implements IId {

    private long id;

    public MqttPubComp() {
        this(-1);
    }

    public MqttPubComp(long id) {
        this.msgType = MESSAGE_TYPE_PUBCOMP;
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
