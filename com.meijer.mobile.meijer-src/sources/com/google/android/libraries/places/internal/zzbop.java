package com.google.android.libraries.places.internal;

import De.p;

/* loaded from: classes6.dex */
final class zzbop implements zzblu {
    final zzbjv zza;
    private final zzbls zzb;

    @Override // com.google.android.libraries.places.internal.zzblu
    public final zzblr zzb(zzbiu zzbiuVar, zzbip zzbipVar, zzbfd zzbfdVar, zzbfp[] zzbfpVarArr) {
        return new zzboo(this.zza, this.zzb, zzbfpVarArr);
    }

    @Override // com.google.android.libraries.places.internal.zzbhk
    public final zzbhf zzc() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    zzbop(zzbjv zzbjvVar, zzbls zzblsVar) {
        p.e(!zzbjvVar.zzj(), "error must not be OK");
        this.zza = zzbjvVar;
        this.zzb = zzblsVar;
    }
}
