package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzacj extends zzbae implements zzbbm {
    private static final zzacj zzh;
    private static volatile zzbbt zzi;
    private int zzb;
    private long zze;
    private long zzf;
    private long zzg;

    static {
        zzacj zzacjVar = new zzacj();
        zzh = zzacjVar;
        zzbae.zzbn(zzacj.class, zzacjVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzacj();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaci(bArr);
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
        synchronized (zzacj.class) {
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

    private zzacj() {
    }
}
