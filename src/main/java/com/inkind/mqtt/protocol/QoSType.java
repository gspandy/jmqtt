package com.inkind.mqtt.protocol;

public enum QoSType {

    MOST_ONCE((byte) 0), LEAST_ONCE((byte) 1), EXACTLY_ONCE((byte) 2), RESERVED((byte) 3);

    private byte value;

    private QoSType(byte value) {
        this.value = value;
    }

    public byte value() {
        return this.value;
    }

    public static QoSType valueOf(byte value) {
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
