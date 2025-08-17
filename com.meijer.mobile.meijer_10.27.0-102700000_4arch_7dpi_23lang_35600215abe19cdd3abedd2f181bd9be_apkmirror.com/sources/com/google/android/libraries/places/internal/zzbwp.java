package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbwp {
    private static final zzbwn zza = new zzbwn(zzbwk.zza);
    private final zzbwk zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private final zzbqm zzg;
    private volatile long zzh;

    public zzbwp() {
        this.zzg = zzbqn.zza();
        this.zzb = zzbwk.zza;
    }

    public static zzbwn zze() {
        return zza;
    }

    public final void zzb(boolean z10) {
        if (z10) {
            this.zzd++;
        } else {
            this.zze++;
        }
    }

    public final void zza() {
        this.zzc++;
        this.zzb.zza();
    }

    public final void zzc(int i10) {
        if (i10 == 0) {
            return;
        }
        this.zzf += i10;
        this.zzb.zza();
    }

    public final void zzd() {
        this.zzg.zza(1L);
        this.zzh = this.zzb.zza();
    }

    /* synthetic */ zzbwp(zzbwk zzbwkVar, byte[] bArr) {
        this.zzg = zzbqn.zza();
        this.zzb = zzbwkVar;
    }
}
