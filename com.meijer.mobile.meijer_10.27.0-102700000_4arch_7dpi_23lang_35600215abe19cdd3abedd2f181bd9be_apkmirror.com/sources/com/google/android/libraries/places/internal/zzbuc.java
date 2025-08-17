package com.google.android.libraries.places.internal;

import java.lang.Thread;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbuc implements Thread.UncaughtExceptionHandler {
    zzbuc(zzbvl zzbvlVar) {
        Objects.requireNonNull(zzbvlVar);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        throw new zzbjy(zzbjv.zzb(th2).zze("Uncaught exception in the SynchronizationContext. Re-thrown."), null);
    }
}
