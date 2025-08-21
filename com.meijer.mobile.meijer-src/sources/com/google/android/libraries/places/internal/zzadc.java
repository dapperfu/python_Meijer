package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzadc extends zzbae implements zzbbm {
    private static final zzadc zzh;
    private static volatile zzbbt zzi;
    private int zzb;
    private int zzf;
    private String zze = "";
    private zzbao zzg = zzbae.zzbu();

    static {
        zzadc zzadcVar = new zzadc();
        zzh = zzadcVar;
        zzbae.zzbn(zzadc.class, zzadcVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", zzadb.class});
        }
        if (i11 == 3) {
            return new zzadc();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzacz(bArr);
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
        synchronized (zzadc.class) {
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

    private zzadc() {
    }
}
