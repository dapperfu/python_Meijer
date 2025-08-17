package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzt extends zzady implements zzafc {
    private static final zzt zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzady.zzaM(zzt.class, zztVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzady.zzaJ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzt();
        }
        zzr zzrVar = null;
        if (i11 == 4) {
            return new zzs(zzrVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzt() {
    }
}
