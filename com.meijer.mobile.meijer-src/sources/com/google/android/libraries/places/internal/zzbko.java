package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbko implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbkp zzb;

    zzbko(zzbkp zzbkpVar, zzcaz zzcazVar, int i10) {
        this.zza = i10;
        Objects.requireNonNull(zzbkpVar);
        this.zzb = zzbkpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = zzcba.zza;
            this.zzb.zzx().zzc(this.zza);
        } catch (Throwable th2) {
            this.zzb.zzE(th2);
        }
    }
}
