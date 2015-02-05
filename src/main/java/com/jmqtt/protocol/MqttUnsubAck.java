package com.jmqtt.protocol;

public class MqttUnsubAck extends MqttMessage implements IId {

    private long id;

    public MqttUnsubAck() {
        this(-1);
    }

    public MqttUnsubAck(long id) {
        this.msgType = MESSAGE_TYPE_UNSUBACK;
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
