package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbud implements Runnable {
    final /* synthetic */ zzbue zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzbvl zzbvlVar = this.zza.zzf;
        zzbvlVar.zzae(true);
        zzbuy zzbuyVarZzV = zzbvlVar.zzV();
        zzbuy zzbuyVarZzV2 = zzbvlVar.zzV();
        zzbvlVar.zzY().zzc(zzbvlVar.zzV().zza(), zzbuyVarZzV2.zzb(), zzbuyVarZzV.zzc());
    }

    zzbud(zzbue zzbueVar) {
        Objects.requireNonNull(zzbueVar);
        this.zza = zzbueVar;
    }
}
