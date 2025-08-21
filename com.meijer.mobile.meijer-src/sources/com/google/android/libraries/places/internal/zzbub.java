package com.google.android.libraries.places.internal;

import De.u;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
final class zzbub {
    private final ScheduledExecutorService zza;
    private final Executor zzb;
    private final Runnable zzc;
    private final u zzd;
    private long zze;
    private boolean zzf;
    private ScheduledFuture zzg;

    final void zzb(boolean z10) {
        ScheduledFuture scheduledFuture;
        this.zzf = false;
        if (!z10 || (scheduledFuture = this.zzg) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.zzg = null;
    }

    final /* synthetic */ ScheduledExecutorService zzd() {
        return this.zza;
    }

    final /* synthetic */ Executor zze() {
        return this.zzb;
    }

    final /* synthetic */ Runnable zzf() {
        return this.zzc;
    }

    final /* synthetic */ long zzg() {
        return this.zze;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzf;
    }

    final /* synthetic */ void zzi(boolean z10) {
        this.zzf = false;
    }

    final /* synthetic */ void zzj(ScheduledFuture scheduledFuture) {
        this.zzg = scheduledFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final long zzc() {
        return this.zzd.d(TimeUnit.NANOSECONDS);
    }

    zzbub(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, u uVar) {
        this.zzc = runnable;
        this.zzb = executor;
        this.zza = scheduledExecutorService;
        this.zzd = uVar;
        uVar.g();
    }

    final void zza(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        long jZzc = zzc() + nanos;
        this.zzf = true;
        if (jZzc - this.zze < 0 || this.zzg == null) {
            ScheduledFuture scheduledFuture = this.zzg;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.zzg = this.zza.schedule(new zzbua(this, null), nanos, TimeUnit.NANOSECONDS);
        }
        this.zze = jZzc;
    }
}
