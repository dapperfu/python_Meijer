package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbs extends zzbae implements zzbbm {
    private static final zzbs zzk;
    private static volatile zzbbt zzl;
    private int zzb;
    private float zze;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        zzbs zzbsVar = new zzbs();
        zzk = zzbsVar;
        zzbae.zzbn(zzbs.class, zzbsVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzk, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0000\u0002ခ\u0000\u0003င\u0001\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\bင\u0002", new Object[]{"zzb", "zze", "zzf", "zzh", "zzi", "zzj", "zzg"});
        }
        if (i11 == 3) {
            return new zzbs();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzbr(bArr);
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
        synchronized (zzbs.class) {
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

    private zzbs() {
    }
}
