package com.dynatrace.android.agent.comm;

import h8.C14387c;

/* loaded from: classes4.dex */
public class InvalidResponseException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private C14387c f64183a;

    public InvalidResponseException(String str, C14387c c14387c) {
        super(str);
        this.f64183a = c14387c;
    }

    public C14387c a() {
        return this.f64183a;
    }

    public InvalidResponseException(String str, Throwable th2, C14387c c14387c) {
        super(str, th2);
        this.f64183a = c14387c;
    }
}
