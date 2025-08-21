package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbnm implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbnz zzb;

    zzbnm(zzbnz zzbnzVar, int i10) {
        this.zza = i10;
        Objects.requireNonNull(zzbnzVar);
        this.zzb = zzbnzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzq().zzc(this.zza);
    }
}
