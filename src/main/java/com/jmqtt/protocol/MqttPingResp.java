package com.jmqtt.protocol;

public class MqttPingResp extends MqttMessage {

    public static final MqttPingResp INSTANCE = new MqttPingResp();

    private MqttPingResp() {
        this.msgType = MESSAGE_TYPE_PINGRESP;
    }

    @Override
    public int getRemainingLength() {
        return 0;
    }

}
