package com.jmqtt.protocol;

import java.util.ArrayList;
import java.util.List;

public class MqttSubAck extends MqttMessage implements IId {

    private long id;
    private List<QosType> qosTypeLst;

    public MqttSubAck() {
        this(-1);
    }

    public MqttSubAck(long id) {
        this.msgType = MESSAGE_TYPE_SUBACK;
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

    public List<QosType> getQosTypeLst() {
        return qosTypeLst;
    }

    public void setQosTypeLst(List<QosType> qosTypeLst) {
        this.qosTypeLst = qosTypeLst;
    }

    public void addQosType(QosType qosType) {
        if (qosTypeLst == null) {
            qosTypeLst = new ArrayList<QosType>();
        }
        qosTypeLst.add(qosType);
    }

    public void clear() {
        qosTypeLst.clear();
    }

    @Override
    public int getRemainingLength() {
        int remainingLength = 2;
        if (qosTypeLst != null) {
            remainingLength += qosTypeLst.size();
        }
        return remainingLength;
    }

}
