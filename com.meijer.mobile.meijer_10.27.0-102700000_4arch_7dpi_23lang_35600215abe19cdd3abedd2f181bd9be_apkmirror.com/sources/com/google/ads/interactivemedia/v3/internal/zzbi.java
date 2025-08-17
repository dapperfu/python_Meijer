package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzbi extends zzady implements zzafc {
    private static final zzbi zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;

    static {
        zzbi zzbiVar = new zzbi();
        zzb = zzbiVar;
        zzady.zzaM(zzbi.class, zzbiVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzady.zzaJ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzbx.zza});
        }
        if (i11 == 3) {
            return new zzbi();
        }
        zzbg zzbgVar = null;
        if (i11 == 4) {
            return new zzbh(zzbgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzbi() {
    }
}
