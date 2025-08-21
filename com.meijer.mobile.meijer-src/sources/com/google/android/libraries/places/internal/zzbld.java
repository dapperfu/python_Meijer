package com.google.android.libraries.places.internal;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class zzbld implements zzbvn {
    private static final Logger zzd = Logger.getLogger(zzbld.class.getName());
    private final ScheduledExecutorService zza;
    private final zzbkd zzb;
    private zzbkc zzc;
    private zzbon zze;

    zzbld(zzbom zzbomVar, ScheduledExecutorService scheduledExecutorService, zzbkd zzbkdVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzbkdVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbvn
    public final void zza(Runnable runnable) {
        zzbkd zzbkdVar = this.zzb;
        zzbkdVar.zzc();
        if (this.zze == null) {
            this.zze = new zzbon();
        }
        zzbkc zzbkcVar = this.zzc;
        if (zzbkcVar == null || !zzbkcVar.zzb()) {
            long jZza = this.zze.zza();
            this.zzc = zzbkdVar.zzd(runnable, jZza, TimeUnit.NANOSECONDS, this.zza);
            zzd.logp(Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jZza));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbvn
    public final void zzb() {
        zzbkd zzbkdVar = this.zzb;
        zzbkdVar.zzc();
        zzbkdVar.zzb(new Runnable() { // from class: com.google.android.libraries.places.internal.zzblc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
        zzbkdVar.zza();
    }

    final /* synthetic */ void zzc() {
        zzbkc zzbkcVar = this.zzc;
        if (zzbkcVar != null && zzbkcVar.zzb()) {
            this.zzc.zza();
        }
        this.zze = null;
    }
}
