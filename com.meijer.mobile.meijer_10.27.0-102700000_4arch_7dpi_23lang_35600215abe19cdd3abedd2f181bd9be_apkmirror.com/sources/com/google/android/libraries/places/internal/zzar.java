package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzar extends zzbae implements zzbbm {
    private static final zzar zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzcs zze;
    private zzah zzf;

    static {
        zzar zzarVar = new zzar();
        zzg = zzarVar;
        zzbae.zzbn(zzar.class, zzarVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0000", new Object[]{"zzb", "zzf", "zze"});
        }
        if (i11 == 3) {
            return new zzar();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaq(bArr);
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
        synchronized (zzar.class) {
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

    private zzar() {
    }
}
