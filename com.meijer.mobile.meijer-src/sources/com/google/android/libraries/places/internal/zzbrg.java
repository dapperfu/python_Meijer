package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbrg implements Runnable {
    final /* synthetic */ zzbjv zza;
    final /* synthetic */ zzbrh zzb;

    zzbrg(zzbrh zzbrhVar, zzbjv zzbjvVar) {
        this.zza = zzbjvVar;
        Objects.requireNonNull(zzbrhVar);
        this.zzb = zzbrhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
