package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbqd implements Runnable {
    final /* synthetic */ zzbqe zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzbqe zzbqeVar = this.zza;
        zzbqg zzbqgVar = zzbqeVar.zzc;
        zzbqgVar.zzy().remove(zzbqeVar.zza);
        if (zzbqgVar.zzE().zzc() == zzbfy.SHUTDOWN && zzbqgVar.zzy().isEmpty()) {
            zzbqgVar.zzi();
        }
    }

    zzbqd(zzbqe zzbqeVar) {
        Objects.requireNonNull(zzbqeVar);
        this.zza = zzbqeVar;
    }
}
