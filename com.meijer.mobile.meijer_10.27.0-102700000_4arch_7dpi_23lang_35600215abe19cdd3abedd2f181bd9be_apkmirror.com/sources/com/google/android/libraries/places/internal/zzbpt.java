package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbpt implements Runnable {
    final /* synthetic */ zzbqg zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzbqg zzbqgVar = this.zza;
        zzbqgVar.zzo().zza(2, "Terminated");
        zzbrx zzbrxVar = ((zzbrt) zzbqgVar.zzl()).zzb.zzj;
        zzbrxVar.zzG().remove(zzbqgVar);
        zzbrxVar.zzW().zze(zzbqgVar);
        zzbrxVar.zzq();
    }

    zzbpt(zzbqg zzbqgVar) {
        Objects.requireNonNull(zzbqgVar);
        this.zza = zzbqgVar;
    }
}
