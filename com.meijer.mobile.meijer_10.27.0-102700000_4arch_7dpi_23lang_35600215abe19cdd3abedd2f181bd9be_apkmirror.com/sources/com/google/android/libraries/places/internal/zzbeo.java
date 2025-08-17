package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbeo implements zzbes {
    private static final Object zza = new Object();
    private volatile zzbes zzb;
    private volatile Object zzc = zza;

    private zzbeo(zzbes zzbesVar) {
        this.zzb = zzbesVar;
    }

    public static zzbes zza(zzbes zzbesVar) {
        return zzbesVar instanceof zzbeo ? zzbesVar : new zzbeo(zzbesVar);
    }

    private final synchronized Object zzc() {
        try {
            Object obj = this.zzc;
            Object obj2 = zza;
            if (obj != obj2) {
                return obj;
            }
            Object objZzb = this.zzb.zzb();
            Object obj3 = this.zzc;
            if (obj3 != obj2 && obj3 != objZzb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZzb + ". This is likely due to a circular dependency.");
            }
            this.zzc = objZzb;
            this.zzb = null;
            return objZzb;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcbd
    public final Object zzb() {
        Object obj = this.zzc;
        return obj == zza ? zzc() : obj;
    }
}
