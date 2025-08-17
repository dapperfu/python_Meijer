package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbzd {
    public static final zzcbn zza;
    public static final zzcbn zzb;
    public static final zzcbn zzc;
    public static final zzcbn zzd;
    public static final zzcbn zze;
    public final zzcbn zzf;
    public final zzcbn zzg;
    final int zzh;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzbzd(String str, String str2) {
        this(zzcbm.zza(str), zzcbm.zza(str2));
        zzcbn zzcbnVar = zzcbn.zza;
    }

    static {
        zzcbn zzcbnVar = zzcbn.zza;
        zza = zzcbm.zza(":status");
        zzb = zzcbm.zza(":method");
        zzc = zzcbm.zza(":path");
        zzd = zzcbm.zza(":scheme");
        zze = zzcbm.zza(":authority");
        zzcbm.zza(":host");
        zzcbm.zza(":version");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbzd) {
            zzbzd zzbzdVar = (zzbzd) obj;
            if (this.zzf.equals(zzbzdVar.zzf) && this.zzg.equals(zzbzdVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzf.hashCode() + 527) * 31) + this.zzg.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", this.zzf.zze(), this.zzg.zze());
    }

    public zzbzd(zzcbn zzcbnVar, zzcbn zzcbnVar2) {
        this.zzf = zzcbnVar;
        this.zzg = zzcbnVar2;
        this.zzh = zzcbnVar.zzj() + 32 + zzcbnVar2.zzj();
    }
}
