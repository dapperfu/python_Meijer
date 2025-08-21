package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzal extends zzady implements zzafc {
    private static final zzal zzb;
    private int zzd;
    private boolean zzf;
    private boolean zzg;
    private long zze = 100;
    private long zzh = 300;

    public static zzal zzb() {
        return zzb;
    }

    static {
        zzal zzalVar = new zzal();
        zzb = zzalVar;
        zzady.zzaM(zzal.class, zzalVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzady.zzaJ(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzal();
        }
        zzaj zzajVar = null;
        if (i11 == 4) {
            return new zzak(zzajVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzal() {
    }
}
