package com.launchdarkly.eventsource;

/* loaded from: classes7.dex */
public class UnsuccessfulResponseException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final int f90992a;

    public UnsuccessfulResponseException(int i10) {
        super("Unsuccessful response code received from stream: " + i10);
        this.f90992a = i10;
    }

    public int a() {
        return this.f90992a;
    }
}
