package com.google.android.libraries.places.internal;

import Be.p;
import Be.z;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class zzbql implements Runnable {
    private static final Logger zza = Logger.getLogger(zzbql.class.getName());
    private final Runnable zzb;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.run();
        } catch (Throwable th2) {
            zza.logp(Level.SEVERE, "io.grpc.internal.LogExceptionRunnable", "run", "Exception while executing runnable ".concat(String.valueOf(this.zzb)), th2);
            z.f(th2);
            throw new AssertionError(th2);
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 22);
        sb2.append("LogExceptionRunnable(");
        sb2.append(strValueOf);
        sb2.append(")");
        return sb2.toString();
    }

    public zzbql(Runnable runnable) {
        this.zzb = (Runnable) p.r(runnable, "task");
    }
}
