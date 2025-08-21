package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzar extends zzady implements zzafc {
    private static final zzar zzb;
    private int zzd;
    private int zze;

    static {
        zzar zzarVar = new zzar();
        zzb = zzarVar;
        zzady.zzaM(zzar.class, zzarVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzady.zzaJ(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzau.zza});
        }
        if (i11 == 3) {
            return new zzar();
        }
        zzap zzapVar = null;
        if (i11 == 4) {
            return new zzaq(zzapVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzar() {
    }
}
