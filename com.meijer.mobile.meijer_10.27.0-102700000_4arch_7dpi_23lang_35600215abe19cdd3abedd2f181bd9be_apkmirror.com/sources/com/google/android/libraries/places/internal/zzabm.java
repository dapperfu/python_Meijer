package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzabm extends zzbae implements zzbbm {
    private static final zzabm zzj;
    private static volatile zzbbt zzk;
    private int zzb;
    private long zze;
    private zzaau zzf;
    private long zzg;
    private int zzh;
    private boolean zzi;

    static {
        zzabm zzabmVar = new zzabm();
        zzj = zzabmVar;
        zzbae.zzbn(zzabm.class, zzabmVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001စ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzabm();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzabl(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzk;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzabm.class) {
            try {
                zzazzVar = zzk;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzj);
                    zzk = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzabm() {
    }
}
