package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbei extends zzbae implements zzbbm {
    private static final zzbei zzg;
    private static volatile zzbbt zzh;
    private String zzb = "";
    private long zze;
    private int zzf;

    public static zzbei zzg() {
        return zzg;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final long zze() {
        return this.zze;
    }

    public final int zzf() {
        return this.zzf;
    }

    static {
        zzbei zzbeiVar = new zzbei();
        zzg = zzbeiVar;
        zzbae.zzbn(zzbei.class, zzbeiVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzbei();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzbeh(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzh;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzbei.class) {
            try {
                zzazzVar = zzh;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzg);
                    zzh = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzbei() {
    }
}
