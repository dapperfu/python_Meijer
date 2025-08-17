package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzm extends zzbae implements zzbbm {
    private static final zzm zzj;
    private static volatile zzbbt zzk;
    private int zzb;
    private zzcj zze;
    private long zzf;
    private int zzg;
    private boolean zzh;
    private zzao zzi;

    static {
        zzm zzmVar = new zzm();
        zzj = zzmVar;
        zzbae.zzbn(zzm.class, zzmVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005ဉ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", zzn.zza, "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzm();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzl(bArr);
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
        synchronized (zzm.class) {
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

    private zzm() {
    }
}
