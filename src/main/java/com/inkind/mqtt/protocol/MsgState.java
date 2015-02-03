package com.inkind.mqtt.protocol;

public enum MsgState {
    INVALID,
    PUBLISH_QOS0,
    PUBLISH_QOS1,
    WAIT_FOR_PUBACK,
    PUBLISH_QOS2,
    WAIT_FOR_PUBREC,
    RESEND_PUBREL,
    WAIT_FOR_PUBREL,
    RESEND_PUBCOMP,
    WAIT_FOR_PUBCOMP,
    SEND_PUBREC,
    QUEUED;
}
