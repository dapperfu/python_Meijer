package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbxf implements Runnable {
    final /* synthetic */ zzbkt zza;

    zzbxf(zzbxg zzbxgVar, zzbkt zzbktVar) {
        this.zza = zzbktVar;
        Objects.requireNonNull(zzbxgVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza();
    }
}
