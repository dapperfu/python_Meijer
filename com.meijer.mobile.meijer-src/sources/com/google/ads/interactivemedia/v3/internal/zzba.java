package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzba extends zzady implements zzafc {
    private static final zzba zzb;
    private int zzd;
    private long zze = -1;

    static {
        zzba zzbaVar = new zzba();
        zzb = zzbaVar;
        zzady.zzaM(zzba.class, zzbaVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzady.zzaJ(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzba();
        }
        zzay zzayVar = null;
        if (i11 == 4) {
            return new zzaz(zzayVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzba() {
    }
}
