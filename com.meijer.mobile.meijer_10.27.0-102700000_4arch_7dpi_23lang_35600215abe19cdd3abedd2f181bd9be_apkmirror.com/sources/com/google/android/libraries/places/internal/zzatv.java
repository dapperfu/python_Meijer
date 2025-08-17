package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzatv extends zzbae implements zzbbm {
    private static final zzatv zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzbeg zze;
    private zzbao zzf = zzbae.zzbu();

    static {
        zzatv zzatvVar = new zzatv();
        zzg = zzatvVar;
        zzbae.zzbn(zzatv.class, zzatvVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"zzb", "zze", "zzf", zzaxi.class});
        }
        if (i11 == 3) {
            return new zzatv();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzatu(bArr);
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
        synchronized (zzatv.class) {
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

    private zzatv() {
    }
}
