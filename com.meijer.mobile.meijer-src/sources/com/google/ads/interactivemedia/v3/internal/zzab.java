package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzab extends zzady implements zzafc {
    private static final zzab zzb;
    private int zzd;
    private int zze = 2;

    static {
        zzab zzabVar = new zzab();
        zzb = zzabVar;
        zzady.zzaM(zzab.class, zzabVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzady.zzaJ(zzb, "\u0004\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzd", "zze", zzac.zza});
        }
        if (i11 == 3) {
            return new zzab();
        }
        zzz zzzVar = null;
        if (i11 == 4) {
            return new zzaa(zzzVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzab() {
    }
}
