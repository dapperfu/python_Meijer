package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzx extends zzbae implements zzbbm {
    private static final zzx zzh;
    private static volatile zzbbt zzi;
    private int zzb;
    private zzcj zze;
    private boolean zzf;
    private int zzg;

    static {
        zzx zzxVar = new zzx();
        zzh = zzxVar;
        zzbae.zzbn(zzx.class, zzxVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003င\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzx();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzw(bArr);
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
        synchronized (zzx.class) {
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

    private zzx() {
    }
}
