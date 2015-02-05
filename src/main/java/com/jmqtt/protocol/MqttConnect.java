package com.jmqtt.protocol;

public class MqttConnect extends MqttMessage {

    public MqttConnect() {
        this.msgType = MESSAGE_TYPE_CONNECT;
    }

    @Override
    public int getRemainingLength() {
        return -1;
    }

}
