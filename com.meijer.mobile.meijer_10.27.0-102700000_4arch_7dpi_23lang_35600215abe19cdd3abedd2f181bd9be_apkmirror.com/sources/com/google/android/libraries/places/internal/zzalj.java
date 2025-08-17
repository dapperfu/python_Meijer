package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzalj extends zzbae implements zzbbm {
    private static final zzalj zzb;
    private static volatile zzbbt zze;

    static {
        zzalj zzaljVar = new zzalj();
        zzb = zzaljVar;
        zzbae.zzbn(zzalj.class, zzaljVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (i11 == 2) {
            return zzbae.zzbo(zzb, "\u0001\u0000", null);
        }
        if (i11 == 3) {
            return new zzalj();
        }
        if (i11 == 4) {
            return new zzali(bArr);
        }
        if (i11 == 5) {
            return zzb;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zze;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzalj.class) {
            try {
                zzazzVar = zze;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzb);
                    zze = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzalj() {
    }
}
