package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzask {
    private static volatile zzbiu zza;

    private zzask() {
    }

    public static zzbiu zza() {
        zzbiu zzbiuVarZzf;
        zzbiu zzbiuVar = zza;
        if (zzbiuVar != null) {
            return zzbiuVar;
        }
        synchronized (zzask.class) {
            try {
                zzbiuVarZzf = zza;
                if (zzbiuVarZzf == null) {
                    zzbiq zzbiqVarZzi = zzbiu.zzi(null, null);
                    zzbiqVarZzi.zzc(zzbis.UNARY);
                    zzbiqVarZzi.zzd(zzbiu.zzh("google.maps.geocode.v4.GeocodeService", "GeocodeLocation"));
                    zzbiqVarZzi.zze(true);
                    zzbiqVarZzi.zza(zzbzw.zza(zzasb.zzc()));
                    zzbiqVarZzi.zzb(zzbzw.zza(zzasd.zzc()));
                    zzbiuVarZzf = zzbiqVarZzi.zzf();
                    zza = zzbiuVarZzf;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbiuVarZzf;
    }

    public static zzasj zzb(zzbfe zzbfeVar) {
        return (zzasj) zzbzx.zzb(new zzasi(), zzbfeVar, zzbfd.zza);
    }
}
