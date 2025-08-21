package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbx extends zzbae implements zzbbm {
    private static final zzbx zzk;
    private static volatile zzbbt zzl;
    private int zzb;
    private int zze;
    private float zzf;
    private float zzg;
    private boolean zzh;
    private int zzi;
    private long zzj;

    static {
        zzbx zzbxVar = new zzbx();
        zzk = zzbxVar;
        zzbae.zzbn(zzbx.class, zzbxVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဂ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzbx();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzbw(bArr);
        }
        if (i11 == 5) {
            return zzk;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzl;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzbx.class) {
            try {
                zzazzVar = zzl;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzk);
                    zzl = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzbx() {
    }
}
