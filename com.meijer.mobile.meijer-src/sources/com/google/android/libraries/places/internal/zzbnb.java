package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbnb implements Runnable {
    final /* synthetic */ zzbsi zza;

    zzbnb(zzbnh zzbnhVar, zzbsi zzbsiVar) {
        this.zza = zzbsiVar;
        Objects.requireNonNull(zzbnhVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzc(true);
    }
}
