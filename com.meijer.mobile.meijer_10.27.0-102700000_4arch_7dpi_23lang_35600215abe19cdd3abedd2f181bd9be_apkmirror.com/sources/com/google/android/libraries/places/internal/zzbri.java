package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbri extends zzbfe {
    final /* synthetic */ zzbrr zza;

    @Override // com.google.android.libraries.places.internal.zzbfe
    public final String zzb() {
        return this.zza.zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzbfe
    public final zzbfi zza(zzbiu zzbiuVar, zzbfd zzbfdVar) {
        zzbrx zzbrxVar = this.zza.zza;
        zzblq zzblqVar = new zzblq(zzbiuVar, zzbrxVar.zzp(zzbfdVar), zzbfdVar, zzbrxVar.zzah(), zzbrxVar.zzR() ? null : zzbrxVar.zzu().zzb(), zzbrxVar.zzT(), null);
        zzblqVar.zzf(zzbrxVar.zzy());
        return zzblqVar;
    }

    zzbri(zzbrr zzbrrVar) {
        Objects.requireNonNull(zzbrrVar);
        this.zza = zzbrrVar;
    }
}
