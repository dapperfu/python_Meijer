package com.google.android.libraries.places.internal;

import De.p;
import U.d;
import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class zzbkd implements Executor {
    private final Thread.UncaughtExceptionHandler zza;
    private final Queue zzb = new ConcurrentLinkedQueue();
    private final AtomicReference zzc = new AtomicReference();

    public final void zza() {
        while (d.a(this.zzc, null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.zzb.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th2) {
                        this.zza.uncaughtException(Thread.currentThread(), th2);
                    }
                } catch (Throwable th3) {
                    this.zzc.set(null);
                    throw th3;
                }
            }
            this.zzc.set(null);
            if (this.zzb.isEmpty()) {
                return;
            }
        }
    }

    public final void zzb(Runnable runnable) {
        this.zzb.add((Runnable) p.r(runnable, "runnable is null"));
    }

    public final void zzc() {
        p.x(Thread.currentThread() == this.zzc.get(), "Not called from the SynchronizationContext");
    }

    public final zzbkc zzd(Runnable runnable, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzbkb zzbkbVar = new zzbkb(runnable);
        return new zzbkc(zzbkbVar, scheduledExecutorService.schedule(new zzbka(this, zzbkbVar, runnable), j10, timeUnit), null);
    }

    public zzbkd(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zza = (Thread.UncaughtExceptionHandler) p.r(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        zzb(runnable);
        zza();
    }
}
