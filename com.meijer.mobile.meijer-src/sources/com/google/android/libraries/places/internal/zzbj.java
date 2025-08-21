package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbj extends zzbae implements zzbbm {
    private static final zzbj zzk;
    private static volatile zzbbt zzl;
    private int zzb;
    private zzcj zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        zzbj zzbjVar = new zzbj();
        zzk = zzbjVar;
        zzbae.zzbn(zzbj.class, zzbjVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzbj();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzbi(bArr);
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
        synchronized (zzbj.class) {
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

    private zzbj() {
    }
}
