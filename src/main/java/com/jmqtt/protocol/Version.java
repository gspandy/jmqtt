package com.jmqtt.protocol;

import java.io.UnsupportedEncodingException;

public enum Version {

    VERSION_V31((byte) 3, "MQIsdp"), VERSION_V311((byte) 4, "MQTT");

    private byte value;
    private String name;
    private byte[] nameBytes;

    private Version(byte value, String name) {
        this.value = value;
        this.name = name;
        try {
            this.nameBytes = name.getBytes(MqttMessage.DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException e) {
            this.nameBytes = name.getBytes();
        }
    }

    public byte getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }

    public byte[] getNameBytes() {
        return this.nameBytes;
    }

    public static Version valueOf(byte value) {
        switch (value) {
        case 3:
            return VERSION_V31;
        case 4:
            return VERSION_V311;
        default:
            return null;
        }
    }

    public static Version valueOfByName(String name) {

        if (name.equalsIgnoreCase("MQIsdp")) {
            return VERSION_V31;
        } else if (name.equalsIgnoreCase("MQTT")) {
            return VERSION_V311;
        } else {
            return null;
        }

    }
}
