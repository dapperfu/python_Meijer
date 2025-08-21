package com.google.firebase;

import android.os.SystemClock;

/* loaded from: classes8.dex */
public abstract class n {
    public abstract long b();

    public abstract long c();

    public abstract long d();

    public static n a(long j10, long j11, long j12) {
        return new a(j10, j11, j12);
    }

    public static n e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }
}
