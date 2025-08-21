package com.google.android.libraries.places.internal;

import De.j;
import De.l;
import Ee.O;
import java.util.Set;

/* loaded from: classes6.dex */
final class zzbvm {
    final int zza;
    final long zzb;
    final long zzc;
    final double zzd;
    final Long zze;
    final Set zzf;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbvm)) {
            return false;
        }
        zzbvm zzbvmVar = (zzbvm) obj;
        return this.zza == zzbvmVar.zza && this.zzb == zzbvmVar.zzb && this.zzc == zzbvmVar.zzc && Double.compare(this.zzd, zzbvmVar.zzd) == 0 && l.a(this.zze, zzbvmVar.zze) && l.a(this.zzf, zzbvmVar.zzf);
    }

    public final int hashCode() {
        return l.b(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc), Double.valueOf(this.zzd), this.zze, this.zzf);
    }

    zzbvm(int i10, long j10, long j11, double d10, Long l10, Set set) {
        this.zza = i10;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = d10;
        this.zze = l10;
        this.zzf = O.s(set);
    }

    public final String toString() {
        return j.c(this).b("maxAttempts", this.zza).c("initialBackoffNanos", this.zzb).c("maxBackoffNanos", this.zzc).a("backoffMultiplier", this.zzd).d("perAttemptRecvTimeoutNanos", this.zze).d("retryableStatusCodes", this.zzf).toString();
    }
}
