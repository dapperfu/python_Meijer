package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzabf extends zzbae implements zzbbm {
    private static final zzabf zzm;
    private static volatile zzbbt zzn;
    private int zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private zzuq zzk;
    private zzbao zzl = zzbae.zzbu();

    static {
        zzabf zzabfVar = new zzabf();
        zzm = zzabfVar;
        zzbae.zzbn(zzabf.class, zzabfVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဉ\u0006\b\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzuq.class});
        }
        if (i11 == 3) {
            return new zzabf();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzabe(bArr);
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
        synchronized (zzabf.class) {
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

    private zzabf() {
    }
}
