package com.google.android.libraries.places.internal;

import io.constructor.BuildConfig;

/* loaded from: classes6.dex */
final class zzbxb {
    public static final zzbzd zza;
    public static final zzbzd zzb;
    public static final zzbzd zzc;
    public static final zzbzd zzd;
    public static final zzbzd zze;
    public static final zzbzd zzf;

    static {
        zzcbn zzcbnVar = zzbzd.zzd;
        zzcbn zzcbnVar2 = zzcbn.zza;
        zza = new zzbzd(zzcbnVar, zzcbm.zza(BuildConfig.SERVICE_SCHEME));
        zzb = new zzbzd(zzcbnVar, zzcbm.zza("http"));
        zzcbn zzcbnVar3 = zzbzd.zzb;
        zzc = new zzbzd(zzcbnVar3, zzcbm.zza("POST"));
        zzd = new zzbzd(zzcbnVar3, zzcbm.zza("GET"));
        zze = new zzbzd(zzbpf.zzg.zzd(), "application/grpc");
        zzf = new zzbzd("te", "trailers");
    }
}
