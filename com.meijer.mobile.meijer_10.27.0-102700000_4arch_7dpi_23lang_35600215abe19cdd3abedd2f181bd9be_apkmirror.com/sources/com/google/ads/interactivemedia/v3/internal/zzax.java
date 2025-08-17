package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzax extends zzady implements zzafc {
    private static final zzax zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;
    private int zzg = 1000;

    static {
        zzax zzaxVar = new zzax();
        zzb = zzaxVar;
        zzady.zzaM(zzax.class, zzaxVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzaeb zzaebVar = zzbx.zza;
            return zzady.zzaJ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", zzaebVar, "zzg", zzaebVar});
        }
        if (i11 == 3) {
            return new zzax();
        }
        zzav zzavVar = null;
        if (i11 == 4) {
            return new zzaw(zzavVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzax() {
    }
}
