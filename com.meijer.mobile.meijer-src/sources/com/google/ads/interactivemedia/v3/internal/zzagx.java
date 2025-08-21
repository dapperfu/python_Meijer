package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzagx extends zzady implements zzafc {
    private static final zzagx zzb;
    private zzaec zzd = zzady.zzaF();

    static {
        zzagx zzagxVar = new zzagx();
        zzb = zzagxVar;
        zzady.zzaM(zzagx.class, zzagxVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzady.zzaJ(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"zzd", zzagy.zza});
        }
        if (i11 == 3) {
            return new zzagx();
        }
        zzagv zzagvVar = null;
        if (i11 == 4) {
            return new zzagw(zzagvVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzagx() {
    }
}
