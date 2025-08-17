package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbmy implements Runnable {
    final /* synthetic */ zzbmz zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzf().zzd();
    }

    zzbmy(zzbmz zzbmzVar) {
        Objects.requireNonNull(zzbmzVar);
        this.zza = zzbmzVar;
    }
}
