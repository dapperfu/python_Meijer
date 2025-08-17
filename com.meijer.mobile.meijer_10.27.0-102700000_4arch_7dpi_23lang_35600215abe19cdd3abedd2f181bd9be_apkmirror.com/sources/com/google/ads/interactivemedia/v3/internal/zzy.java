package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzy extends zzady implements zzafc {
    private static final zzy zzb;
    private int zzd;
    private zzab zze;
    private zzaf zzf;

    static {
        zzy zzyVar = new zzy();
        zzb = zzyVar;
        zzady.zzaM(zzy.class, zzyVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzady.zzaJ(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzy();
        }
        zzw zzwVar = null;
        if (i11 == 4) {
            return new zzx(zzwVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzy() {
    }
}
