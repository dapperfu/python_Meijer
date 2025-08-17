package com.google.android.libraries.places.internal;

import android.content.Context;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;

/* loaded from: classes6.dex */
final class zzov implements zzoy {
    final zzbes zza = zzbew.zza(zzea.zza());
    final zzbes zzb;
    final zzbes zzc;
    private final Context zzd;
    private final zzmo zze;

    final zzmp zza() {
        zzmn zzmnVarZzd = zzmp.zzd(zzmi.zzd(this.zzd));
        zzmnVarZzd.zzc(this.zze);
        return zzmnVarZzd.zze();
    }

    @Override // com.google.android.libraries.places.internal.zzoy
    public final zzdy zzb() {
        return (zzdy) this.zza.zzb();
    }

    @Override // com.google.android.libraries.places.internal.zzoy
    public final PlacesClient zzc() {
        return Places.zzb(zzmi.zzd(this.zzd), zza());
    }

    @Override // com.google.android.libraries.places.internal.zzoy
    public final zzoz zzd() {
        return new zzpa(new zzmu(zzmj.zza(this.zzd), (zzeo) this.zzc.zzb()), zza());
    }

    @Override // com.google.android.libraries.places.internal.zzoy
    public final zzor zze() {
        return new zzor(zzmi.zzd(this.zzd));
    }

    zzov(Context context, zzmo zzmoVar) {
        this.zzd = context;
        this.zze = zzmoVar;
        zzbep zzbepVarZza = zzbeq.zza(context);
        this.zzb = zzbepVarZza;
        this.zzc = zzbeo.zza(zzmk.zza(zzbepVarZza, zzei.zza()));
    }
}
