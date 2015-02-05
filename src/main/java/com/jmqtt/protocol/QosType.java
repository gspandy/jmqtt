package com.jmqtt.protocol;

public enum QosType {

    MOST_ONCE((byte) 0), LEAST_ONCE((byte) 1), EXACTLY_ONCE((byte) 2), RESERVED((byte) 3);

    private byte value;

    private QosType(byte value) {
        this.value = value;
    }

    public byte value() {
        return this.value;
    }

    public static QosType valueOf(byte value) {
        switch (value) {
        case 0:
            return MOST_ONCE;
        case 1:
            return LEAST_ONCE;
        case 2:
            return EXACTLY_ONCE;
        case 3:
            return RESERVED;
        default:
            return null;
        }
    }
}
