package com.google.android.libraries.places.internal;

import android.os.SystemClock;
import j$.time.Duration;

/* loaded from: classes6.dex */
public final class zzfa {
    static {
        new zzfa();
    }

    public static zzfa zza() {
        return new zzfa();
    }

    private zzfa() {
        SystemClock.elapsedRealtime();
        Duration.ofMillis(SystemClock.uptimeMillis()).toMillis();
    }
}
