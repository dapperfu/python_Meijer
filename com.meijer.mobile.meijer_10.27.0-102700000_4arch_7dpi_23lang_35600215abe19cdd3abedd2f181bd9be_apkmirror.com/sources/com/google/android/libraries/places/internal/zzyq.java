package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzyq extends zzbae implements zzbbm {
    private static final zzyq zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private boolean zze;
    private long zzf;
    private zzuq zzg;
    private int zzh;

    static {
        zzyq zzyqVar = new zzyq();
        zzi = zzyqVar;
        zzbae.zzbn(zzyq.class, zzyqVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzyq();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzyp(bArr);
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
        synchronized (zzyq.class) {
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

    private zzyq() {
    }
}
