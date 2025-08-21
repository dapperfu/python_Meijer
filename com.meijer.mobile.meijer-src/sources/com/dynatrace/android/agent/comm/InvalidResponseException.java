package com.dynatrace.android.agent.comm;

import j8.C14965c;

/* loaded from: classes4.dex */
public class InvalidResponseException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private C14965c f65023a;

    public InvalidResponseException(String str, C14965c c14965c) {
        super(str);
        this.f65023a = c14965c;
    }

    public C14965c a() {
        return this.f65023a;
    }

    public InvalidResponseException(String str, Throwable th2, C14965c c14965c) {
        super(str, th2);
        this.f65023a = c14965c;
    }
}
