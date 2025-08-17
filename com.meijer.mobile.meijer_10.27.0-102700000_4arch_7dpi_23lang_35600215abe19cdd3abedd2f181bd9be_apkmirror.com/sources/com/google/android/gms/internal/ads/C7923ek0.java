package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.ek0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7923ek0 {
    public static Executor c() {
        return EnumC10165zj0.INSTANCE;
    }

    public static Xj0 a(ExecutorService executorService) {
        return executorService instanceof Xj0 ? (Xj0) executorService : executorService instanceof ScheduledExecutorService ? new C7817dk0((ScheduledExecutorService) executorService) : new C7497ak0(executorService);
    }

    public static Yj0 b(ScheduledExecutorService scheduledExecutorService) {
        return new C7817dk0(scheduledExecutorService);
    }

    static Executor d(Executor executor, AbstractC7495aj0 abstractC7495aj0) {
        executor.getClass();
        if (executor == EnumC10165zj0.INSTANCE) {
            return executor;
        }
        return new Zj0(executor, abstractC7495aj0);
    }
}
