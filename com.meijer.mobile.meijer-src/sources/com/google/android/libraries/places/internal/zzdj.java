package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzdj extends zzbae implements zzbbm {
    private static final zzdj zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzdh zze;
    private zzdh zzf;

    static {
        zzdj zzdjVar = new zzdj();
        zzg = zzdjVar;
        zzbae.zzbn(zzdj.class, zzdjVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzdj();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzdi(bArr);
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
        synchronized (zzdj.class) {
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

    private zzdj() {
    }
}
