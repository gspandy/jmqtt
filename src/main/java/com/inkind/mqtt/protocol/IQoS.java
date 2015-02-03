package com.inkind.mqtt.protocol;

public interface IQoS {

    public QoSType getQos();

    public void setQos(QoSType qos);
}
