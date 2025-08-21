package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbrl implements Runnable {
    final /* synthetic */ zzbrr zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza.zze();
    }

    zzbrl(zzbrr zzbrrVar) {
        Objects.requireNonNull(zzbrrVar);
        this.zza = zzbrrVar;
    }
}
