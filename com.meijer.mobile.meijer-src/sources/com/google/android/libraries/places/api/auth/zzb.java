package com.google.android.libraries.places.api.auth;

/* loaded from: classes6.dex */
public abstract class zzb {
    public static final zzb zza;

    public static zza zzd() {
        return new zzc();
    }

    public abstract boolean zza();

    public abstract String zzb();

    public abstract String zzc();

    static {
        zzc zzcVar = new zzc();
        zzcVar.zza(false);
        zza = zzcVar.zzd();
    }
}
