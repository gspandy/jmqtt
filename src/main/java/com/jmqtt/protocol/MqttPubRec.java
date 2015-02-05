package com.jmqtt.protocol;

public class MqttPubRec extends MqttMessage implements IId {

    private long id;

    public MqttPubRec() {
        this(-1);
    }

    public MqttPubRec(long id) {
        this.msgType = MESSAGE_TYPE_PUBREC;
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
