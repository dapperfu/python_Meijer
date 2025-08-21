package com.google.android.libraries.places.internal;

import De.p;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbqb implements Runnable {
    final /* synthetic */ zzbqe zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzbqe zzbqeVar = this.zza;
        zzbqg zzbqgVar = zzbqeVar.zzc;
        zzbqgVar.zzI(null);
        if (zzbqgVar.zzF() != null) {
            p.x(zzbqgVar.zzC() == null, "Unexpected non-null activeTransport");
            zzbqeVar.zza.zzd(zzbqgVar.zzF());
            return;
        }
        zzbmg zzbmgVar = zzbqeVar.zza;
        if (zzbqgVar.zzA() == zzbmgVar) {
            zzbqgVar.zzD(zzbmgVar);
            zzbqgVar.zzB(null);
            zzbqgVar.zzH(zzbqgVar.zzr().zzf());
            zzbqgVar.zzh(zzbfy.READY);
        }
    }

    zzbqb(zzbqe zzbqeVar) {
        Objects.requireNonNull(zzbqeVar);
        this.zza = zzbqeVar;
    }
}
