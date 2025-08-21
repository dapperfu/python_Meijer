package com.google.android.libraries.places.internal;

import com.google.common.util.concurrent.u;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
final class zzblk implements Runnable, zzbga {
    final /* synthetic */ zzblq zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private volatile ScheduledFuture zze;
    private volatile boolean zzf;

    final void zzb() {
        this.zzf = true;
        ScheduledFuture scheduledFuture = this.zze;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    final /* synthetic */ long zzd() {
        return this.zzd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzo().zzl(zzc());
    }

    final void zza() {
        if (this.zzf) {
            return;
        }
        if (this.zzc && !this.zzb) {
            zzblq zzblqVar = this.zza;
            if (zzblqVar.zzp() != null) {
                this.zze = zzblqVar.zzp().schedule(new zzbql(this), this.zzd, TimeUnit.NANOSECONDS);
            }
        }
        zzblq zzblqVar2 = this.zza;
        zzblqVar2.zzl().zzd(this, u.a());
        if (this.zzf) {
            zzb();
        }
    }

    final zzbjv zzc() {
        long j10 = this.zzd;
        long jAbs = Math.abs(j10);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long nanos = jAbs / timeUnit.toNanos(1L);
        long jAbs2 = Math.abs(j10) % timeUnit.toNanos(1L);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(true != this.zzb ? "CallOptions" : "Context");
        sb2.append(" deadline exceeded after ");
        if (j10 < 0) {
            sb2.append('-');
        }
        sb2.append(nanos);
        Locale locale = Locale.US;
        sb2.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
        sb2.append("s. ");
        zzblq zzblqVar = this.zza;
        sb2.append(String.format(locale, "Name resolution delay %.9f seconds.", Double.valueOf(((Long) zzblqVar.zzn().zzi(zzbfp.zza)) == null ? 0.0d : r2.longValue() / zzblq.zzb)));
        if (zzblqVar.zzo() != null) {
            zzbpl zzbplVar = new zzbpl();
            zzblqVar.zzo().zzn(zzbplVar);
            sb2.append(" ");
            sb2.append(zzbplVar);
        }
        return zzbjv.zzd.zze(sb2.toString());
    }

    zzblk(zzblq zzblqVar, zzbgg zzbggVar, boolean z10) {
        Objects.requireNonNull(zzblqVar);
        this.zza = zzblqVar;
        this.zzb = z10;
        if (zzbggVar == null) {
            this.zzc = false;
            this.zzd = 0L;
        } else {
            this.zzc = true;
            this.zzd = zzbggVar.zzc(TimeUnit.NANOSECONDS);
        }
    }
}
