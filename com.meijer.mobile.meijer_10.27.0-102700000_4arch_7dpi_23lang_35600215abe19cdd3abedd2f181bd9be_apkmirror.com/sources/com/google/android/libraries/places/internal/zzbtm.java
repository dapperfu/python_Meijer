package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbtm implements Runnable {
    final /* synthetic */ zzbtn zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb().zzc();
    }

    zzbtm(zzbtn zzbtnVar) {
        Objects.requireNonNull(zzbtnVar);
        this.zza = zzbtnVar;
    }
}
