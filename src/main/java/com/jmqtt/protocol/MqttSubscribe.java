package com.jmqtt.protocol;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;

public class MqttSubscribe extends MqttMessage implements IDup, IId {

    private long id;
    private boolean dup;
    // private QosType qos;
    private List<SimpleEntry<String, QosType>> topicLst;

    public MqttSubscribe() {
        this(-1);
    }

    public MqttSubscribe(long id) {
        this.msgType = MESSAGE_TYPE_SUBSCRIBE;
        this.id = id;
    }

    @Override
    public long getId() {
        return this.id;
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
        return QosType.LEAST_ONCE;
    }

    // @Override
    // public void setQos(QoSType qos) {
    // this.qos = qos;
    // }

    public List<SimpleEntry<String, QosType>> getTopicLst() {
        return topicLst;
    }

    public void setTopicLst(List<SimpleEntry<String, QosType>> topicLst) {
        this.topicLst = topicLst;
    }

    public void addTopic(String topicName, QosType qosType) {
        if (topicLst == null) {
            topicLst = new ArrayList<SimpleEntry<String, QosType>>();
        }
        topicLst.add(new SimpleEntry<String, QosType>(topicName, qosType));
    }

    public void clear() {
        topicLst.clear();
    }

    @Override
    public int getRemainingLength() {
        // TODO Auto-generated method stub
        return 0;
    }

}
