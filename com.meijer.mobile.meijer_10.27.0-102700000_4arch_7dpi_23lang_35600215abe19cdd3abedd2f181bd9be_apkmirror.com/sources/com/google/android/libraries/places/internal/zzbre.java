package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbre implements Runnable {
    final /* synthetic */ zzbrf zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb.zzn();
    }

    zzbre(zzbrf zzbrfVar) {
        Objects.requireNonNull(zzbrfVar);
        this.zza = zzbrfVar;
    }
}
