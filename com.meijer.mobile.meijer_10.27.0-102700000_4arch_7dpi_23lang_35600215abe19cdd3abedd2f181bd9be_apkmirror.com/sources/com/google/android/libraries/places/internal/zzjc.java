package com.google.android.libraries.places.internal;

import com.google.common.util.concurrent.j;
import j$.time.Instant;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
final class zzjc implements j {
    final /* synthetic */ zzjf zza;

    @Override // com.google.common.util.concurrent.j
    public final void onFailure(Throwable th2) {
        zzjf zzjfVar = this.zza;
        zzjfVar.zzd = null;
        zzjfVar.zze = null;
        zzjfVar.zzf = null;
    }

    @Override // com.google.common.util.concurrent.j
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        final zzjf zzjfVar = this.zza;
        zzjfVar.zzd = Long.valueOf(r6.zzc() & 4294967295L);
        zzjfVar.zze = ((zzbdl) obj).zze();
        Long l10 = zzjfVar.zzd;
        if (l10 != null) {
            zzjfVar.zzf = zzjfVar.zzc(l10.longValue());
        }
        if (zzjfVar.zze != null) {
            long jZzc = (r6.zzc() - 3600) - Instant.now().getEpochSecond();
            if (jZzc <= 0) {
                return;
            }
            zzjfVar.zzb.schedule(new Callable() { // from class: com.google.android.libraries.places.internal.zzjd
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzjfVar.zzb();
                }
            }, jZzc, TimeUnit.SECONDS);
        }
    }

    zzjc(zzjf zzjfVar) {
        Objects.requireNonNull(zzjfVar);
        this.zza = zzjfVar;
    }
}
