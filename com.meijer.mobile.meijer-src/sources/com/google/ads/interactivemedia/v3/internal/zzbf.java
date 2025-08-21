package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzbf extends zzady implements zzafc {
    private static final zzbf zzb;
    private int zzd;
    private int zze;
    private long zzf = -1;

    static {
        zzbf zzbfVar = new zzbf();
        zzb = zzbfVar;
        zzady.zzaM(zzbf.class, zzbfVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzady.zzaJ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", zzas.zza, "zzf"});
        }
        if (i11 == 3) {
            return new zzbf();
        }
        zzbd zzbdVar = null;
        if (i11 == 4) {
            return new zzbe(zzbdVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzbf() {
    }
}
