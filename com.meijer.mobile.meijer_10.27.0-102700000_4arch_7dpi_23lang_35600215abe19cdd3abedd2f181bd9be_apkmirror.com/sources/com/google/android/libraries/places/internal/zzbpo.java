package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbpo implements Runnable {
    final /* synthetic */ zzbqg zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzbqg zzbqgVar = this.zza;
        zzbqgVar.zzt(null);
        zzbqgVar.zzo().zza(2, "CONNECTING after backoff");
        zzbqgVar.zzh(zzbfy.CONNECTING);
        zzbqgVar.zzf();
    }

    zzbpo(zzbqg zzbqgVar) {
        Objects.requireNonNull(zzbqgVar);
        this.zza = zzbqgVar;
    }
}
