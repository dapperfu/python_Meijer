package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbua implements Runnable {
    final /* synthetic */ zzbub zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzbub zzbubVar = this.zza;
        zzbtz zzbtzVar = new zzbtz(zzbubVar, null);
        zzbkd zzbkdVar = (zzbkd) zzbubVar.zze();
        zzbkdVar.zzb(zzbtzVar);
        zzbkdVar.zza();
    }

    /* synthetic */ zzbua(zzbub zzbubVar, byte[] bArr) {
        Objects.requireNonNull(zzbubVar);
        this.zza = zzbubVar;
    }
}
