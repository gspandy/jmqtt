package com.jmqtt.protocol;

public class MqttDisconnect extends MqttMessage {

    public static final MqttDisconnect INSTANCE = new MqttDisconnect();

    private MqttDisconnect() {
        this.msgType = MESSAGE_TYPE_DISCONNECT;
    }

    @Override
    public int getRemainingLength() {
        return 0;
    }

}
