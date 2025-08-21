package com.google.android.libraries.places.internal;

import De.p;

/* loaded from: classes6.dex */
final class zzbfk extends zzbfe {
    private final zzbfe zza;
    private final zzbfj zzb;

    @Override // com.google.android.libraries.places.internal.zzbfe
    public final zzbfi zza(zzbiu zzbiuVar, zzbfd zzbfdVar) {
        return this.zzb.zza(zzbiuVar, zzbfdVar, this.zza);
    }

    @Override // com.google.android.libraries.places.internal.zzbfe
    public final String zzb() {
        return this.zza.zzb();
    }

    /* synthetic */ zzbfk(zzbfe zzbfeVar, zzbfj zzbfjVar, byte[] bArr) {
        this.zza = zzbfeVar;
        this.zzb = (zzbfj) p.r(zzbfjVar, "interceptor");
    }
}
