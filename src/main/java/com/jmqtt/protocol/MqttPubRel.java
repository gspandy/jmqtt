package com.jmqtt.protocol;

public class MqttPubRel extends MqttMessage implements IQos, IId, IDup {

    private long id;
    private boolean dup;
    private QosType qos;

    public MqttPubRel() {
        this(-1);
    }

    public MqttPubRel(long id) {
        this.msgType = MESSAGE_TYPE_PUBREL;
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
    public boolean isDup() {
        return dup;
    }

    @Override
    public void setDup(boolean dup) {
        this.dup = dup;
    }

    @Override
    public QosType getQos() {
        return qos;
    }

    @Override
    public void setQos(QosType qos) {
        this.qos = qos;
    }

    @Override
    public int getRemainingLength() {
        return 2;
    }

}
