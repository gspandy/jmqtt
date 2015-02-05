package com.jmqtt.protocol;

public class MqttPublish extends MqttMessage implements IQos, IId, IDup, IRetain {

    private long id;
    private boolean dup;
    private QosType qos;
    private boolean retain;
    private String topicName;
    private byte[] data;

    public MqttPublish() {
        this(-1);
    }

    public MqttPublish(long id) {
        this.msgType = MESSAGE_TYPE_PUBLISH;
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
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
    public boolean isRetain() {
        return retain;
    }

    @Override
    public void setRetain(boolean retain) {
        this.retain = retain;
    }

    @Override
    public int getRemainingLength() {
        return -1;
    }

}
