package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzbng {
    final zzbhy zza;
    final zzbjv zzb;

    private zzbng(zzbhy zzbhyVar, zzbjv zzbjvVar) {
        this.zza = zzbhyVar;
        this.zzb = zzbjvVar;
    }

    public final zzbng zza(zzbhy zzbhyVar) {
        return new zzbng(zzbhyVar, this.zzb);
    }

    public final zzbng zzb(zzbjv zzbjvVar) {
        return new zzbng(this.zza, zzbjvVar);
    }

    /* synthetic */ zzbng(zzbhy zzbhyVar, zzbjv zzbjvVar, byte[] bArr) {
        this(null, null);
    }
}
