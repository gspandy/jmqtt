package com.jmqtt.protocol;

public class MqttPingReq extends MqttMessage {

    public static final MqttPingReq INSTANCE = new MqttPingReq();

    private MqttPingReq() {
        this.msgType = MESSAGE_TYPE_PINGREQ;
    }

    @Override
    public int getRemainingLength() {
        return 0;
    }

}
