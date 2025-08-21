package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzzb extends zzbae implements zzbbm {
    private static final zzzb zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        zzzb zzzbVar = new zzzb();
        zzg = zzzbVar;
        zzbae.zzbn(zzzb.class, zzzbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", zzyz.zza, "zzf", zzza.zza});
        }
        if (i11 == 3) {
            return new zzzb();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzyy(bArr);
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
        synchronized (zzzb.class) {
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

    private zzzb() {
    }
}
