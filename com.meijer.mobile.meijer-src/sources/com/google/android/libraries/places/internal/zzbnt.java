package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbnt implements Runnable {
    final /* synthetic */ zzbnz zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzq().zzk();
    }

    zzbnt(zzbnz zzbnzVar) {
        Objects.requireNonNull(zzbnzVar);
        this.zza = zzbnzVar;
    }
}
