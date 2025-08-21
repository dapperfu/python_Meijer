package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzbs extends zzady implements zzafc {
    private static final zzbs zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzaec zzh = zzady.zzaF();
    private long zzi;

    static {
        zzbs zzbsVar = new zzbs();
        zzb = zzbsVar;
        zzady.zzaM(zzbs.class, zzbsVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzady.zzaJ(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzbs();
        }
        zzbq zzbqVar = null;
        if (i11 == 4) {
            return new zzbr(zzbqVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzbs() {
    }
}
