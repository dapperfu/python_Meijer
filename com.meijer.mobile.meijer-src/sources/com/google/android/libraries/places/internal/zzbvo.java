package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbvo implements Runnable {
    final /* synthetic */ zzbvq zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzd();
    }

    zzbvo(zzbvq zzbvqVar) {
        Objects.requireNonNull(zzbvqVar);
        this.zza = zzbvqVar;
    }
}
