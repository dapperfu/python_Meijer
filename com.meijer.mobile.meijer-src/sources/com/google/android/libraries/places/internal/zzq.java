package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzq extends zzbae implements zzbbm {
    private static final zzq zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzcj zze;
    private int zzf;

    static {
        zzq zzqVar = new zzq();
        zzg = zzqVar;
        zzbae.zzbn(zzq.class, zzqVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", "zzf", zzp.zza});
        }
        if (i11 == 3) {
            return new zzq();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzo(bArr);
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
        synchronized (zzq.class) {
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

    private zzq() {
    }
}
