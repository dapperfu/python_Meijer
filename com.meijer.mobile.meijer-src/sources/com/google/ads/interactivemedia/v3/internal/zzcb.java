package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzcb extends zzady implements zzafc {
    private static final zzcb zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private zzacw zzg = zzacw.zzb;

    public static zzcb zzc() {
        return zzb;
    }

    public final long zza() {
        return this.zze;
    }

    public final boolean zzd() {
        return (this.zzd & 1) != 0;
    }

    static {
        zzcb zzcbVar = new zzcb();
        zzb = zzcbVar;
        zzady.zzaM(zzcb.class, zzcbVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzady.zzaJ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzcb();
        }
        zzbz zzbzVar = null;
        if (i11 == 4) {
            return new zzca(zzbzVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzcb() {
    }
}
