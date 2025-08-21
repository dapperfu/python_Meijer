package com.google.android.libraries.places.internal;

import De.p;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class zzbvs implements Executor {
    private static final Logger zza = Logger.getLogger(zzbvs.class.getName());
    private boolean zzb;
    private ArrayDeque zzc;

    zzbvs() {
    }

    private final void zza() {
        while (true) {
            Runnable runnable = (Runnable) this.zzc.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th2) {
                zza.logp(Level.SEVERE, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", "Exception while executing runnable ".concat(runnable.toString()), th2);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        p.r(runnable, "'task' must not be null.");
        if (this.zzb) {
            if (this.zzc == null) {
                this.zzc = new ArrayDeque(4);
            }
            this.zzc.add(runnable);
            return;
        }
        this.zzb = true;
        try {
            runnable.run();
            if (this.zzc != null) {
                zza();
            }
            this.zzb = false;
        } catch (Throwable th2) {
            try {
                Logger logger = zza;
                Level level = Level.SEVERE;
                String strValueOf = String.valueOf(runnable);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 35);
                sb2.append("Exception while executing runnable ");
                sb2.append(strValueOf);
                logger.logp(level, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "execute", sb2.toString(), th2);
                if (this.zzc != null) {
                    zza();
                }
                this.zzb = false;
            } catch (Throwable th3) {
                if (this.zzc != null) {
                    zza();
                }
                this.zzb = false;
                throw th3;
            }
        }
    }
}
