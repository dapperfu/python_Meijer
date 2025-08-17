package com.google.android.libraries.places.internal;

import Be.p;

/* loaded from: classes6.dex */
final class zzcal implements zzbfj {
    private final zzbip zza;

    final /* synthetic */ zzbip zzb() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbfj
    public final zzbfi zza(zzbiu zzbiuVar, zzbfd zzbfdVar, zzbfe zzbfeVar) {
        return new zzcak(this, zzbfeVar.zza(zzbiuVar, zzbfdVar));
    }

    zzcal(zzbip zzbipVar) {
        this.zza = (zzbip) p.r(zzbipVar, "extraHeaders");
    }
}
