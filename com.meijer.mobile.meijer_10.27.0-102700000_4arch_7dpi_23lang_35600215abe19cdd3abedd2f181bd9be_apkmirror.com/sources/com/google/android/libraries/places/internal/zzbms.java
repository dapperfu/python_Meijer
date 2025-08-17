package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbms implements Runnable {
    final /* synthetic */ zzbna zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzk().zzd();
    }

    zzbms(zzbna zzbnaVar) {
        Objects.requireNonNull(zzbnaVar);
        this.zza = zzbnaVar;
    }
}
