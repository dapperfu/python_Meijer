package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaau extends zzbae implements zzbbm {
    private static final zzaau zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private int zzh;

    static {
        zzaau zzaauVar = new zzaau();
        zzi = zzaauVar;
        zzbae.zzbn(zzaau.class, zzaauVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzaau();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaat(bArr);
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
        synchronized (zzaau.class) {
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

    private zzaau() {
    }
}
