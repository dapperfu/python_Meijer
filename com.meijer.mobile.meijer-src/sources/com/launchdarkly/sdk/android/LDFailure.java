package com.launchdarkly.sdk.android;

import og.InterfaceC16126b;

@InterfaceC16126b(LDFailureSerialization.class)
/* loaded from: classes8.dex */
public class LDFailure extends LaunchDarklyException {
    private final a failureType;

    public enum a {
        INVALID_RESPONSE_BODY,
        NETWORK_FAILURE,
        UNEXPECTED_STREAM_ELEMENT_TYPE,
        UNEXPECTED_RESPONSE_CODE,
        UNKNOWN_ERROR
    }

    public LDFailure(String str, a aVar) {
        super(str);
        this.failureType = aVar;
    }

    public a a() {
        return this.failureType;
    }

    public LDFailure(String str, Throwable th2, a aVar) {
        super(str, th2);
        this.failureType = aVar;
    }
}
