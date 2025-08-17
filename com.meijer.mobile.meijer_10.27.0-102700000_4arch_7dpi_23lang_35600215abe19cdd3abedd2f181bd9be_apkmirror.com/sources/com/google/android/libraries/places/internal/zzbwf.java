package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbwf implements zzbsu {
    private final zzbwd zza;

    private zzbwf(zzbwd zzbwdVar) {
        this.zza = zzbwdVar;
    }

    public static zzbwf zzc(zzbwd zzbwdVar) {
        return new zzbwf(zzbwdVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbsu
    public final Object zza() {
        return zzbwe.zza(this.zza);
    }

    @Override // com.google.android.libraries.places.internal.zzbsu
    public final Object zzb(Object obj) {
        zzbwe.zzb(this.zza, obj);
        return null;
    }
}
