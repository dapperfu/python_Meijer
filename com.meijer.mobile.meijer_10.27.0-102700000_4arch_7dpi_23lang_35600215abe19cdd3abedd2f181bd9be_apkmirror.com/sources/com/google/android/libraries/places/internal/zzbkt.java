package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* loaded from: classes6.dex */
public final class zzbkt {
    final /* synthetic */ zzbku zza;
    private final long zzb;

    public final void zza() {
        zzbku zzbkuVar = this.zza;
        AtomicLong atomicLongZzd = zzbkuVar.zzd();
        long j10 = this.zzb;
        long jMax = Math.max(j10 + j10, j10);
        if (atomicLongZzd.compareAndSet(j10, jMax)) {
            String strZzc = zzbkuVar.zzc();
            zzbku.zza.logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{strZzc, Long.valueOf(jMax)});
        }
    }

    /* synthetic */ zzbkt(zzbku zzbkuVar, long j10, byte[] bArr) {
        Objects.requireNonNull(zzbkuVar);
        this.zza = zzbkuVar;
        this.zzb = j10;
    }
}
