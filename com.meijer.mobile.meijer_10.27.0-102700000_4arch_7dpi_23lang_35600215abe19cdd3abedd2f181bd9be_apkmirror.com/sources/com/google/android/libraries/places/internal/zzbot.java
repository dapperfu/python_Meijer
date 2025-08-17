package com.google.android.libraries.places.internal;

import Be.j;

/* loaded from: classes6.dex */
abstract class zzbot implements zzbmg {
    zzbot() {
    }

    protected abstract zzbmg zza();

    @Override // com.google.android.libraries.places.internal.zzblu
    public zzblr zzb(zzbiu zzbiuVar, zzbip zzbipVar, zzbfd zzbfdVar, zzbfp[] zzbfpVarArr) {
        throw null;
    }

    public final String toString() {
        return j.c(this).d("delegate", zza()).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbsj
    public final Runnable zzao(zzbsi zzbsiVar) {
        zza().zzao(zzbsiVar);
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzbhk
    public final zzbhf zzc() {
        return zza().zzc();
    }

    @Override // com.google.android.libraries.places.internal.zzbsj
    public void zzd(zzbjv zzbjvVar) {
        zza().zzd(zzbjvVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbsj
    public void zze(zzbjv zzbjvVar) {
        zza().zze(zzbjvVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbmg
    public final zzbez zzf() {
        return zza().zzf();
    }
}
