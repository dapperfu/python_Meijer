package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final class zzvb {
    public static Executor zzb() {
        return zzua.INSTANCE;
    }

    public static zzuv zza(ExecutorService executorService) {
        return executorService instanceof zzuv ? (zzuv) executorService : executorService instanceof ScheduledExecutorService ? new zzva((ScheduledExecutorService) executorService) : new zzux(executorService);
    }

    static Executor zzc(Executor executor, zztg zztgVar) {
        executor.getClass();
        if (executor == zzua.INSTANCE) {
            return executor;
        }
        return new zzuw(executor, zztgVar);
    }
}
