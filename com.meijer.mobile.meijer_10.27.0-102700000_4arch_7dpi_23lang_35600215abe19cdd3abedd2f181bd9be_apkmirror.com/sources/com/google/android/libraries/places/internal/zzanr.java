package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzanr extends zzbae implements zzbbm {
    private static final zzanr zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private int zze;
    private zzbao zzf = zzbae.zzbu();
    private zzbao zzg = zzbae.zzbu();
    private zzbao zzh = zzbae.zzbu();

    static {
        zzanr zzanrVar = new zzanr();
        zzi = zzanrVar;
        zzbae.zzbn(zzanr.class, zzanrVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001င\u0000\u0002\u001a\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", zzant.class, "zzh", zzaho.class});
        }
        if (i11 == 3) {
            return new zzanr();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzanq(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzj;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzanr.class) {
            try {
                zzazzVar = zzj;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzi);
                    zzj = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzanr() {
    }
}
