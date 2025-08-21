package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaly extends zzbae implements zzbbm {
    private static final zzaly zzf;
    private static volatile zzbbt zzg;
    private int zzb;
    private int zze;

    static {
        zzaly zzalyVar = new zzaly();
        zzf = zzalyVar;
        zzbae.zzbn(zzaly.class, zzalyVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzb", "zze"});
        }
        if (i11 == 3) {
            return new zzaly();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzalx(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzg;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaly.class) {
            try {
                zzazzVar = zzg;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzf);
                    zzg = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzaly() {
    }
}
