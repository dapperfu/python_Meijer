package com.google.android.libraries.places.internal;

import Be.j;

/* loaded from: classes6.dex */
abstract class zzbos implements zzblt {
    zzbos() {
    }

    @Override // com.google.android.libraries.places.internal.zzblt
    public void zzc(zzbjv zzbjvVar, zzbls zzblsVar, zzbip zzbipVar) {
        throw null;
    }

    protected abstract zzblt zze();

    public final String toString() {
        return j.c(this).d("delegate", zze()).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzblt
    public final void zza(zzbip zzbipVar) {
        zze().zza(zzbipVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbwj
    public final void zzb(zzbwi zzbwiVar) {
        zze().zzb(zzbwiVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbwj
    public final void zzd() {
        zze().zzd();
    }
}
