package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbod implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzboh zzb;

    zzbod(zzboh zzbohVar, boolean z10) {
        this.zza = z10;
        Objects.requireNonNull(zzbohVar);
        this.zzb = zzbohVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza) {
            zzbok zzbokVar = this.zzb.zza;
            zzbokVar.zzf = true;
            if (zzbokVar.zzi() > 0) {
                zzbokVar.zzk().f().g();
            }
        }
        this.zzb.zza.zzl(false);
    }
}
