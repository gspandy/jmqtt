package com.jmqtt.protocol;

public abstract class MqttMessage {

    public static final byte MESSAGE_TYPE_CONNECT = 1; // Client request to connect to Server
    public static final byte MESSAGE_TYPE_CONNACK = 2; // Connect Acknowledgment
    public static final byte MESSAGE_TYPE_PUBLISH = 3; // Publish message
    public static final byte MESSAGE_TYPE_PUBACK = 4; // Publish Acknowledgment
    public static final byte MESSAGE_TYPE_PUBREC = 5; // Publish Received (assured delivery part 1)
    public static final byte MESSAGE_TYPE_PUBREL = 6; // Publish Release (assured delivery part 2)
    public static final byte MESSAGE_TYPE_PUBCOMP = 7; // Publish Complete (assured delivery part 3)
    public static final byte MESSAGE_TYPE_SUBSCRIBE = 8; // Client Subscribe request
    public static final byte MESSAGE_TYPE_SUBACK = 9; // Subscribe Acknowledgment
    public static final byte MESSAGE_TYPE_UNSUBSCRIBE = 10; // Client Unsubscribe request
    public static final byte MESSAGE_TYPE_UNSUBACK = 11; // Unsubscribe Acknowledgment
    public static final byte MESSAGE_TYPE_PINGREQ = 12; // PING Request
    public static final byte MESSAGE_TYPE_PINGRESP = 13; // PING Response
    public static final byte MESSAGE_TYPE_DISCONNECT = 14; // Client is Disconnecting

    public static final String DEFAULT_CHARSET = "UTF-8";

    protected byte msgType;

    // private boolean dup;
    // private QoSType qos;
    // private boolean retain;

    public MqttMessage() {
    }

    public byte getMsgType() {
        return msgType;
    }

    public boolean isDup() {
        return false;
    }

    public QosType getQos() {
        return QosType.RESERVED;
    }

    public boolean isRetain() {
        return false;
    }

    public byte getFixedHeader() {
        return (byte) ((getMsgType() << 4) | (isDup() ? (0x01 << 3) : 0x00) | (getQos().value() << 1) | (isRetain() ? 0x01 : 0x00));
    }

    public abstract int getRemainingLength();

}
