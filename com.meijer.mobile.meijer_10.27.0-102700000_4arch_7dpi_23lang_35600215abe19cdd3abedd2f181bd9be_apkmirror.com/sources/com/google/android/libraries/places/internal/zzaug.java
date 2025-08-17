package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaug extends zzbae implements zzbbm {
    private static final zzaug zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private zzbao zze = zzbae.zzbu();
    private zzbao zzf = zzbae.zzbu();
    private zzbao zzg = zzbae.zzbu();
    private zzatv zzh;

    static {
        zzaug zzaugVar = new zzaug();
        zzi = zzaugVar;
        zzbae.zzbn(zzaug.class, zzaugVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဉ\u0000", new Object[]{"zzb", "zze", zzaxi.class, "zzf", zzava.class, "zzg", zzauf.class, "zzh"});
        }
        if (i11 == 3) {
            return new zzaug();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzatt(bArr);
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
        synchronized (zzaug.class) {
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

    private zzaug() {
    }
}
