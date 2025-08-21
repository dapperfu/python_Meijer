package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaw extends zzbae implements zzbbm {
    private static final zzaw zzl;
    private static volatile zzbbt zzm;
    private int zzb;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private zzbam zzj = zzbae.zzbr();
    private int zzk;

    static {
        zzaw zzawVar = new zzaw();
        zzl = zzawVar;
        zzbae.zzbn(zzaw.class, zzawVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzbak zzbakVar = zzap.zza;
            zzbak zzbakVar2 = zzav.zza;
            return zzbae.zzbo(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005င\u0004\u0006ࠞ\u0007᠌\u0005", new Object[]{"zzb", "zze", zzbakVar, "zzf", "zzg", "zzh", "zzi", "zzj", zzbakVar2, "zzk", zzbakVar2});
        }
        if (i11 == 3) {
            return new zzaw();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzau(bArr);
        }
        if (i11 == 5) {
            return zzl;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzm;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaw.class) {
            try {
                zzazzVar = zzm;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzl);
                    zzm = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzaw() {
    }
}
