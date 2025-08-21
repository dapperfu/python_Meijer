package com.launchdarkly.eventsource;

/* loaded from: classes8.dex */
public class UnsuccessfulResponseException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final int f91831a;

    public UnsuccessfulResponseException(int i10) {
        super("Unsuccessful response code received from stream: " + i10);
        this.f91831a = i10;
    }

    public int a() {
        return this.f91831a;
    }
}
