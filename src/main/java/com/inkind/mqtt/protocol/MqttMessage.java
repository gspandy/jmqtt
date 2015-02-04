package com.inkind.mqtt.protocol;

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

    public static final byte CONNACK_ACCEPTED = 0;
    public static final byte CONNACK_REFUSED_PROTOCOL_VERSION = 1;
    public static final byte CONNACK_REFUSED_IDENTIFIER_REJECTED = 2;
    public static final byte CONNACK_REFUSED_SERVER_UNAVAILABLE = 3;
    public static final byte CONNACK_REFUSED_BAD_USERNAME_PASSWORD = 4;
    public static final byte CONNACK_REFUSED_NOT_AUTHORIZED = 5;

    private byte msgType;
    private boolean dup;
    private QoSType qos;
    private boolean retain;

    public MqttMessage(byte msgType) {
        this.msgType = msgType;
    }

    public byte getMsgType() {
        return msgType;
    }

    public int getRemainingLength() {
        return -1;
    }

}
