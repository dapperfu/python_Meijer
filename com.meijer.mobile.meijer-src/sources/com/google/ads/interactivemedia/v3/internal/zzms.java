package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zzms {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    static zzmq zza() {
        return (zzmq) zza.get();
    }

    static zzmr zzb() {
        return (zzmr) zzb.get();
    }

    public static void zzc(zzmq zzmqVar) {
        zza.set(zzmqVar);
    }
}
