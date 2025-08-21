package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzald extends zzbae implements zzbbm {
    private static final zzald zze;
    private static volatile zzbbt zzf;
    private zzbam zzb = zzbae.zzbr();

    static {
        zzald zzaldVar = new zzald();
        zze = zzaldVar;
        zzbae.zzbn(zzald.class, zzaldVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"zzb", zzahj.zza});
        }
        if (i11 == 3) {
            return new zzald();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzalc(bArr);
        }
        if (i11 == 5) {
            return zze;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzf;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzald.class) {
            try {
                zzazzVar = zzf;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zze);
                    zzf = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzald() {
    }
}
