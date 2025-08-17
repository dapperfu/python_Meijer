package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzann extends zzbae implements zzbbm {
    private static final zzann zzh;
    private static volatile zzbbt zzi;
    private int zzb;
    private int zze;
    private zzbao zzf = zzbae.zzbu();
    private zzbao zzg = zzbae.zzbu();

    static {
        zzann zzannVar = new zzann();
        zzh = zzannVar;
        zzbae.zzbn(zzann.class, zzannVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001င\u0000\u0002\u001a\u0003\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", zzanp.class});
        }
        if (i11 == 3) {
            return new zzann();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzanm(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzi;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzann.class) {
            try {
                zzazzVar = zzi;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzh);
                    zzi = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzann() {
    }
}
