package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbew implements zzbes {
    private static final Object zza = new Object();
    private volatile zzbes zzb;
    private volatile Object zzc = zza;

    private zzbew(zzbes zzbesVar) {
        this.zzb = zzbesVar;
    }

    public static zzbes zza(zzbes zzbesVar) {
        return new zzbew(zzbesVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcbd
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzbes zzbesVar = this.zzb;
        if (zzbesVar == null) {
            return this.zzc;
        }
        Object objZzb = zzbesVar.zzb();
        this.zzc = objZzb;
        this.zzb = null;
        return objZzb;
    }
}
