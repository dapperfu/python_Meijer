package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzcak extends zzbgn {
    final /* synthetic */ zzcal zza;

    @Override // com.google.android.libraries.places.internal.zzbgo, com.google.android.libraries.places.internal.zzbfi
    public final void zza(zzbfh zzbfhVar, zzbip zzbipVar) {
        zzbipVar.zzf(this.zza.zzb());
        zzf().zza(zzbfhVar, zzbipVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcak(zzcal zzcalVar, zzbfi zzbfiVar) {
        super(zzbfiVar);
        Objects.requireNonNull(zzcalVar);
        this.zza = zzcalVar;
    }
}
