package com.google.android.libraries.places.internal;

import java.lang.Thread;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class zzbqu implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzbrx zza;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        zzbrx zzbrxVar = this.zza;
        Logger logger = zzbrx.zza;
        Level level = Level.SEVERE;
        String strValueOf = String.valueOf(zzbrxVar.zzc());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 59);
        sb2.append("[");
        sb2.append(strValueOf);
        sb2.append("] Uncaught exception in the SynchronizationContext. Panic!");
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", sb2.toString(), th2);
        try {
            zzbrxVar.zzh(th2);
        } catch (Throwable th3) {
            zzbrx zzbrxVar2 = this.zza;
            Logger logger2 = zzbrx.zza;
            Level level2 = Level.SEVERE;
            String strValueOf2 = String.valueOf(zzbrxVar2.zzc());
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 37);
            sb3.append("[");
            sb3.append(strValueOf2);
            sb3.append("] Uncaught exception while panicking");
            logger2.logp(level2, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", sb3.toString(), th3);
        }
    }

    zzbqu(zzbrx zzbrxVar) {
        Objects.requireNonNull(zzbrxVar);
        this.zza = zzbrxVar;
    }
}
