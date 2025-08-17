package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzce extends zzady implements zzafc {
    private static final zzce zzb;
    private int zzd;
    private String zze = "";

    static {
        zzce zzceVar = new zzce();
        zzb = zzceVar;
        zzady.zzaM(zzce.class, zzceVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzady.zzaJ(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzce();
        }
        zzcc zzccVar = null;
        if (i11 == 4) {
            return new zzcd(zzccVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzce() {
    }
}
