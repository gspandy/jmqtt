package com.jmqtt.protocol;

import java.util.ArrayList;
import java.util.List;

public class MqttUnsubscribe extends MqttMessage implements IDup, IId {

    private long id;
    private boolean dup;
    // private QosType qos;
    private List<String> topicLst;

    public MqttUnsubscribe() {
        this(-1);
    }

    public MqttUnsubscribe(long id) {
        this.msgType = MESSAGE_TYPE_UNSUBSCRIBE;
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
        return QosType.LEAST_ONCE;
    }

    // @Override
    // public void setQos(QosType qos) {
    // this.qos = qos;
    // }

    public List<String> getTopicLst() {
        return topicLst;
    }

    public void setTopicLst(List<String> topicLst) {
        this.topicLst = topicLst;
    }

    public void addTopic(String topicName) {
        if (topicLst == null) {
            topicLst = new ArrayList<String>();
        }
        topicLst.add(topicName);
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
