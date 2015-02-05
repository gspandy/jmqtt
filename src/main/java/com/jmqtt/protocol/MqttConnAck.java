package com.jmqtt.protocol;

public class MqttConnAck extends MqttMessage {

    public static final byte RC_ACCEPTED = 0;
    public static final byte RC_REFUSED_PROTOCOL_VERSION = 1;
    public static final byte RC_REFUSED_IDENTIFIER_REJECTED = 2;
    public static final byte RC_REFUSED_SERVER_UNAVAILABLE = 3;
    public static final byte RC_REFUSED_BAD_USERNAME_PASSWORD = 4;
    public static final byte RC_REFUSED_NOT_AUTHORIZED = 5;

    private byte reservedValue;
    private byte returnCode;

    public MqttConnAck() {
        this.msgType = MESSAGE_TYPE_CONNACK;
    }

    public byte getReservedValue() {
        return reservedValue;
    }

    public void setReservedValue(byte reservedValue) {
        this.reservedValue = reservedValue;
    }

    public byte getReturnCode() {
        return returnCode;
    }

    // 只能设置为本类中以RC_开头的静态常量
    public void setReturnCode(byte returnCode) {
        this.returnCode = returnCode;
    }

    @Override
    public int getRemainingLength() {
        return 2;
    }

}
