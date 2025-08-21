package com.google.android.libraries.places.internal;

import com.google.android.gms.maps.model.LatLng;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.z;

/* loaded from: classes6.dex */
public final class zzhl {
    private final zzbif zza;
    private final zzir zzb;

    zzhl(zzbif zzbifVar, zzir zzirVar) {
        this.zza = zzbifVar;
        this.zzb = zzirVar;
    }

    public final q zza(LatLng latLng, com.google.android.libraries.places.api.auth.zzb zzbVar, String str) {
        zzasj zzasjVar = (zzasj) zzask.zzb(this.zza).zze(zzcam.zza(this.zzb.zzb(str, "results.placeId,results.types")), zzep.zza(zzbVar.zzb()));
        zzasa zzasaVarZza = zzasb.zza();
        double d10 = latLng.f85654a;
        double d11 = latLng.f85655b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(d10).length() + 1 + String.valueOf(d11).length());
        sb2.append(d10);
        sb2.append(",");
        sb2.append(d11);
        zzasaVarZza.zza(sb2.toString());
        zzasb zzasbVar = (zzasb) zzasaVarZza.zzG();
        z zVarA = z.a();
        zzcaj.zza(zzasjVar.zzc().zza(zzask.zza(), zzasjVar.zzd()), zzasbVar, new zzhk(this, zVarA));
        return zVarA;
    }
}
