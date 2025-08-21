package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzzf extends zzbae implements zzbbm {
    private static final zzzf zzm;
    private static volatile zzbbt zzn;
    private int zzb;
    private int zzg;
    private int zzh;
    private long zzi;
    private int zzj;
    private double zzl;
    private zzbam zze = zzbae.zzbr();
    private zzbam zzf = zzbae.zzbr();
    private zzbao zzk = zzbae.zzbu();

    static {
        zzzf zzzfVar = new zzzf();
        zzm = zzzfVar;
        zzbae.zzbn(zzzf.class, zzzfVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001\u0016\u0002\u0016\u0003င\u0000\u0004င\u0001\u0005ဂ\u0002\u0006င\u0003\u0007\u001b\bက\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzze.class, "zzl"});
        }
        if (i11 == 3) {
            return new zzzf();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzyr(bArr);
        }
        if (i11 == 5) {
            return zzm;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzn;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzzf.class) {
            try {
                zzazzVar = zzn;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzm);
                    zzn = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzzf() {
    }
}
