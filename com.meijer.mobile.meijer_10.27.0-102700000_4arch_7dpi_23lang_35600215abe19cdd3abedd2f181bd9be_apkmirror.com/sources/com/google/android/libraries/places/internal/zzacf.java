package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzacf extends zzbae implements zzbbm {
    private static final zzacf zzk;
    private static volatile zzbbt zzl;
    private int zzb;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        zzacf zzacfVar = new zzacf();
        zzk = zzacfVar;
        zzbae.zzbn(zzacf.class, zzacfVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzacf();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzace(bArr);
        }
        if (i11 == 5) {
            return zzk;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzl;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzacf.class) {
            try {
                zzazzVar = zzl;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzk);
                    zzl = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzacf() {
    }
}
