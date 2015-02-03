package com.inkind.mqtt.protocol;

public enum Version {

    VERSION_V31((byte) 3, "MQIsdp"), VERSION_V311((byte) 4, "MQTT");

    private byte value;
    private String name;

    private Version(byte value, String name) {
        this.value = value;
        this.name = name;
    }

    public byte getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
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
