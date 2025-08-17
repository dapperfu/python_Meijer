package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzawz {
    private static volatile zzbiu zza;
    private static volatile zzbiu zzb;
    private static volatile zzbiu zzc;
    private static volatile zzbiu zzd;
    private static volatile zzbiu zze;

    private zzawz() {
    }

    public static zzbiu zza() {
        zzbiu zzbiuVarZzf;
        zzbiu zzbiuVar = zza;
        if (zzbiuVar != null) {
            return zzbiuVar;
        }
        synchronized (zzawz.class) {
            try {
                zzbiuVarZzf = zza;
                if (zzbiuVarZzf == null) {
                    zzbiq zzbiqVarZzi = zzbiu.zzi(null, null);
                    zzbiqVarZzi.zzc(zzbis.UNARY);
                    zzbiqVarZzi.zzd(zzbiu.zzh("google.maps.places.v1.Places", "SearchNearby"));
                    zzbiqVarZzi.zze(true);
                    zzbiqVarZzi.zza(zzbzw.zza(zzaxw.zzc()));
                    zzbiqVarZzi.zzb(zzbzw.zza(zzaxy.zzd()));
                    zzbiuVarZzf = zzbiqVarZzi.zzf();
                    zza = zzbiuVarZzf;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbiuVarZzf;
    }

    public static zzbiu zzb() {
        zzbiu zzbiuVarZzf;
        zzbiu zzbiuVar = zzb;
        if (zzbiuVar != null) {
            return zzbiuVar;
        }
        synchronized (zzawz.class) {
            try {
                zzbiuVarZzf = zzb;
                if (zzbiuVarZzf == null) {
                    zzbiq zzbiqVarZzi = zzbiu.zzi(null, null);
                    zzbiqVarZzi.zzc(zzbis.UNARY);
                    zzbiqVarZzi.zzd(zzbiu.zzh("google.maps.places.v1.Places", "SearchText"));
                    zzbiqVarZzi.zze(true);
                    zzbiqVarZzi.zza(zzbzw.zza(zzayi.zzc()));
                    zzbiqVarZzi.zzb(zzbzw.zza(zzayk.zzd()));
                    zzbiuVarZzf = zzbiqVarZzi.zzf();
                    zzb = zzbiuVarZzf;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbiuVarZzf;
    }

    public static zzbiu zzc() {
        zzbiu zzbiuVarZzf;
        zzbiu zzbiuVar = zzc;
        if (zzbiuVar != null) {
            return zzbiuVar;
        }
        synchronized (zzawz.class) {
            try {
                zzbiuVarZzf = zzc;
                if (zzbiuVarZzf == null) {
                    zzbiq zzbiqVarZzi = zzbiu.zzi(null, null);
                    zzbiqVarZzi.zzc(zzbis.UNARY);
                    zzbiqVarZzi.zzd(zzbiu.zzh("google.maps.places.v1.Places", "GetPhotoMedia"));
                    zzbiqVarZzi.zze(true);
                    zzbiqVarZzi.zza(zzbzw.zza(zzauu.zzc()));
                    zzbiqVarZzi.zzb(zzbzw.zza(zzavc.zzc()));
                    zzbiuVarZzf = zzbiqVarZzi.zzf();
                    zzc = zzbiuVarZzf;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbiuVarZzf;
    }

    public static zzbiu zzd() {
        zzbiu zzbiuVarZzf;
        zzbiu zzbiuVar = zzd;
        if (zzbiuVar != null) {
            return zzbiuVar;
        }
        synchronized (zzawz.class) {
            try {
                zzbiuVarZzf = zzd;
                if (zzbiuVarZzf == null) {
                    zzbiq zzbiqVarZzi = zzbiu.zzi(null, null);
                    zzbiqVarZzi.zzc(zzbis.UNARY);
                    zzbiqVarZzi.zzd(zzbiu.zzh("google.maps.places.v1.Places", "GetPlace"));
                    zzbiqVarZzi.zze(true);
                    zzbiqVarZzi.zza(zzbzw.zza(zzauw.zzc()));
                    zzbiqVarZzi.zzb(zzbzw.zza(zzaww.zzaW()));
                    zzbiuVarZzf = zzbiqVarZzi.zzf();
                    zzd = zzbiuVarZzf;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbiuVarZzf;
    }

    public static zzbiu zze() {
        zzbiu zzbiuVarZzf;
        zzbiu zzbiuVar = zze;
        if (zzbiuVar != null) {
            return zzbiuVar;
        }
        synchronized (zzawz.class) {
            try {
                zzbiuVarZzf = zze;
                if (zzbiuVarZzf == null) {
                    zzbiq zzbiqVarZzi = zzbiu.zzi(null, null);
                    zzbiqVarZzi.zzc(zzbis.UNARY);
                    zzbiqVarZzi.zzd(zzbiu.zzh("google.maps.places.v1.Places", "AutocompletePlaces"));
                    zzbiqVarZzi.zze(true);
                    zzbiqVarZzi.zza(zzbzw.zza(zzata.zzc()));
                    zzbiqVarZzi.zzb(zzbzw.zza(zzato.zzc()));
                    zzbiuVarZzf = zzbiqVarZzi.zzf();
                    zze = zzbiuVarZzf;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzbiuVarZzf;
    }

    public static zzawy zzf(zzbfe zzbfeVar) {
        return (zzawy) zzbzy.zzb(new zzawx(), zzbfeVar, zzbfd.zza);
    }
}
