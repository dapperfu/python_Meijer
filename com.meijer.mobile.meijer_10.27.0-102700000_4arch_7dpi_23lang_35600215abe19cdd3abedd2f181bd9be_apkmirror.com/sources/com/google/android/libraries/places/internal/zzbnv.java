package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbnv implements Runnable {
    final /* synthetic */ zzbny zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzf().zzd();
    }

    zzbnv(zzbny zzbnyVar) {
        Objects.requireNonNull(zzbnyVar);
        this.zza = zzbnyVar;
    }
}
