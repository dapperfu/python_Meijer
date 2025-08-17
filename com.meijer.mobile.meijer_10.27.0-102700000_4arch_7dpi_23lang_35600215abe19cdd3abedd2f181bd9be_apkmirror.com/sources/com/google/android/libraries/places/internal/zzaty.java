package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaty extends zzbae implements zzbbm {
    private static final zzaty zzg;
    private static volatile zzbbt zzh;
    private boolean zzb;
    private boolean zze;
    private boolean zzf;

    static {
        zzaty zzatyVar = new zzaty();
        zzg = zzatyVar;
        zzbae.zzbn(zzaty.class, zzatyVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzaty();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzatx(bArr);
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
        synchronized (zzaty.class) {
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

    private zzaty() {
    }
}
