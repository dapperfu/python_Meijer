package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbvb implements Runnable {
    final /* synthetic */ zzbip zza;
    final /* synthetic */ zzbvi zzb;

    zzbvb(zzbvi zzbviVar, zzbip zzbipVar) {
        this.zza = zzbipVar;
        Objects.requireNonNull(zzbviVar);
        this.zzb = zzbviVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb.zzY().zza(this.zza);
    }
}
