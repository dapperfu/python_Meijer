package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.zztg;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* loaded from: classes4.dex */
class zztw extends zztg.zzi {
    private static final zzts zza;
    private static final zzut zzd = new zzut(zztw.class);
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    zztw(int i10) {
        this.remaining = i10;
    }

    final void zzz() {
        this.seenExceptions = null;
    }

    static {
        Throwable th2;
        zzts zztvVar;
        zztu zztuVar = null;
        try {
            zztvVar = new zztt(AtomicReferenceFieldUpdater.newUpdater(zztw.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zztw.class, "remaining"));
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            zztvVar = new zztv(zztuVar);
        }
        zza = zztvVar;
        if (th2 != null) {
            zzd.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    final int zzx() {
        return zza.zza(this);
    }
}
