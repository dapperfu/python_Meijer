package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzadq extends zzbae implements zzbbm {
    private static final zzadq zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private long zzf;
    private zzbao zze = zzbae.zzbu();
    private zzbam zzg = zzbae.zzbr();
    private zzbam zzh = zzbae.zzbr();

    static {
        zzadq zzadqVar = new zzadq();
        zzi = zzadqVar;
        zzbae.zzbn(zzadq.class, zzadqVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzbak zzbakVar = zzwr.zza;
            return zzbae.zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002ဂ\u0000\u0003ࠬ\u0004ࠬ", new Object[]{"zzb", "zze", zzadp.class, "zzf", "zzg", zzbakVar, "zzh", zzbakVar});
        }
        if (i11 == 3) {
            return new zzadq();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzadn(bArr);
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
        synchronized (zzadq.class) {
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

    private zzadq() {
    }
}
