package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbno implements Runnable {
    final /* synthetic */ zzbgg zza;
    final /* synthetic */ zzbnz zzb;

    zzbno(zzbnz zzbnzVar, zzbgg zzbggVar) {
        this.zza = zzbggVar;
        Objects.requireNonNull(zzbnzVar);
        this.zzb = zzbnzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzq().zza(this.zza);
    }
}
