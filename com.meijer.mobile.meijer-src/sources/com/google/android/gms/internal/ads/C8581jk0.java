package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.jk0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8581jk0 extends TimeoutException {
    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* synthetic */ C8581jk0(String str, C8688kk0 c8688kk0) {
        super(str);
    }
}
