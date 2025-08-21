package com.google.android.libraries.places.internal;

import De.p;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class zzbvw implements Executor, Runnable {
    private static final Logger zza = Logger.getLogger(zzbvw.class.getName());
    private static final zzbvt zzb;
    private final Executor zzc;
    private final Queue zzd = new ConcurrentLinkedQueue();
    private volatile int zze = 0;

    final /* synthetic */ int zza() {
        return this.zze;
    }

    final /* synthetic */ void zzb(int i10) {
        this.zze = i10;
    }

    static {
        zzbvt zzbvvVar;
        byte[] bArr = null;
        try {
            zzbvvVar = new zzbvu(AtomicIntegerFieldUpdater.newUpdater(zzbvw.class, "zze"), bArr);
        } catch (Throwable th2) {
            zza.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th2);
            zzbvvVar = new zzbvv(bArr);
        }
        zzb = zzbvvVar;
    }

    private final void zzc(Runnable runnable) {
        if (zzb.zza(this, 0, -1)) {
            try {
                this.zzc.execute(this);
            } catch (Throwable th2) {
                if (runnable != null) {
                    this.zzd.remove(runnable);
                }
                zzb.zzb(this, 0);
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zzd.add((Runnable) p.r(runnable, "'r' must not be null."));
        zzc(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                Runnable runnable = (Runnable) this.zzd.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e10) {
                    Logger logger = zza;
                    Level level = Level.SEVERE;
                    String string = runnable.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 35);
                    sb2.append("Exception while executing runnable ");
                    sb2.append(string);
                    logger.logp(level, "io.grpc.internal.SerializingExecutor", "run", sb2.toString(), (Throwable) e10);
                }
            } catch (Throwable th2) {
                zzb.zzb(this, 0);
                throw th2;
            }
        }
        zzb.zzb(this, 0);
        if (this.zzd.isEmpty()) {
            return;
        }
        zzc(null);
    }

    public zzbvw(Executor executor) {
        p.r(executor, "'executor' must not be null.");
        this.zzc = executor;
    }
}
