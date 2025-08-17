package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzahh extends zzady implements zzafc {
    private static final zzahh zzb;
    private long zzd;
    private long zze;

    public static zzahh zze() {
        return zzb;
    }

    static {
        zzahh zzahhVar = new zzahh();
        zzb = zzahhVar;
        zzady.zzaM(zzahh.class, zzahhVar);
    }

    public static zzahg zzc() {
        return (zzahg) zzb.zzay();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzady.zzaJ(zzb, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzahh();
        }
        zzahf zzahfVar = null;
        if (i11 == 4) {
            return new zzahg(zzahfVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzahh() {
    }
}
