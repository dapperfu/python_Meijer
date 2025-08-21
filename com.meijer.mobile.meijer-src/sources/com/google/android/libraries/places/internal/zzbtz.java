package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
final class zzbtz implements Runnable {
    final /* synthetic */ zzbub zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzbub zzbubVar = this.zza;
        byte[] bArr = null;
        if (!zzbubVar.zzh()) {
            zzbubVar.zzj(null);
            return;
        }
        long jZzg = zzbubVar.zzg();
        long jZzc = zzbubVar.zzc();
        if (jZzg - jZzc > 0) {
            zzbubVar.zzj(zzbubVar.zzd().schedule(new zzbua(zzbubVar, bArr), zzbubVar.zzg() - jZzc, TimeUnit.NANOSECONDS));
        } else {
            zzbubVar.zzi(false);
            zzbubVar.zzj(null);
            zzbubVar.zzf().run();
        }
    }

    /* synthetic */ zzbtz(zzbub zzbubVar, byte[] bArr) {
        Objects.requireNonNull(zzbubVar);
        this.zza = zzbubVar;
    }
}
