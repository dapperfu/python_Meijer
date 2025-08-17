package com.google.android.libraries.places.internal;

import java.util.Optional;

/* loaded from: classes6.dex */
public final class zzey implements zzbep {
    private final zzbes zza;

    private zzey(zzbes zzbesVar) {
        this.zza = zzbesVar;
    }

    public static zzey zza(zzbes zzbesVar) {
        return new zzey(zzbesVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcbd
    public final /* bridge */ /* synthetic */ Object zzb() {
        Optional optional = (Optional) this.zza.zzb();
        zzbxh zzbxhVarZze = zzbxh.zze("mapsmobilesdks-pa.googleapis.com", 443);
        zzbxhVarZze.zzf();
        zzbip zzbipVar = new zzbip();
        zzbipVar.zzc(zzbil.zzc("X-Goog-Api-Key", zzbip.zza), (String) optional.orElse("AIzaSyDgmW4ZMvNblSXqMOgsbY8uRrTnfR3E7pY"));
        zzbxhVarZze.zzb(zzcam.zza(zzbipVar));
        return zzbxhVarZze.zzd();
    }
}
