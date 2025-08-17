package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzec {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzeb zzd = null;

    public final void zza(zzeb zzebVar) {
        this.zzd = null;
        zzc();
    }

    private final void zzc() {
        zzeb zzebVar = (zzeb) this.zzc.poll();
        this.zzd = zzebVar;
        if (zzebVar != null) {
            zzebVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public zzec() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    public final void zzb(zzeb zzebVar) {
        zzebVar.zzb(this);
        this.zzc.add(zzebVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}
