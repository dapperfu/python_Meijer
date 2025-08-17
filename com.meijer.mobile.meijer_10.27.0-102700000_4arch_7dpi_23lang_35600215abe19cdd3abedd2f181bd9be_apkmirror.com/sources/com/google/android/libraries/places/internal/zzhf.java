package com.google.android.libraries.places.internal;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.CircularBounds;
import com.google.android.libraries.places.api.model.RectangularBounds;

/* loaded from: classes6.dex */
final class zzhf {
    zzhf() {
    }

    static final zzbee zza(LatLng latLng) {
        zzbed zzbedVarZzf = zzbee.zzf();
        zzbedVarZzf.zza(latLng.f84814a);
        zzbedVarZzf.zzb(latLng.f84815b);
        return (zzbee) zzbedVarZzf.zzG();
    }

    static final zzatq zzb(CircularBounds circularBounds) {
        LatLng center = circularBounds.getCenter();
        zzatp zzatpVarZza = zzatq.zza();
        zzbed zzbedVarZzf = zzbee.zzf();
        zzbedVarZzf.zza(center.f84814a);
        zzbedVarZzf.zzb(center.f84815b);
        zzatpVarZza.zza(zzbedVarZzf);
        zzatpVarZza.zzb(circularBounds.getRadius());
        return (zzatq) zzatpVarZza.zzG();
    }

    static final zzaqo zzc(RectangularBounds rectangularBounds) {
        LatLng southwest = rectangularBounds.getSouthwest();
        LatLng northeast = rectangularBounds.getNortheast();
        zzaqn zzaqnVarZzd = zzaqo.zzd();
        zzbed zzbedVarZzf = zzbee.zzf();
        zzbedVarZzf.zza(southwest.f84814a);
        zzbedVarZzf.zzb(southwest.f84815b);
        zzaqnVarZzd.zza((zzbee) zzbedVarZzf.zzG());
        zzbed zzbedVarZzf2 = zzbee.zzf();
        zzbedVarZzf2.zza(northeast.f84814a);
        zzbedVarZzf2.zzb(northeast.f84815b);
        zzaqnVarZzd.zzb((zzbee) zzbedVarZzf2.zzG());
        return (zzaqo) zzaqnVarZzd.zzG();
    }
}
