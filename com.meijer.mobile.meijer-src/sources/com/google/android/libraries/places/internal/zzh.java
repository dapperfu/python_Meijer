package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzh extends zzbae implements zzbbm {
    private static final zzh zzn;
    private static volatile zzbbt zzo;
    private int zzb;
    private zzcj zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private boolean zzl;
    private zzao zzm;

    static {
        zzh zzhVar = new zzh();
        zzn = zzhVar;
        zzbae.zzbn(zzh.class, zzhVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဇ\u0005\u0007ဂ\u0006\bဇ\u0007\tဉ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzap.zza, "zzi", zzn.zza, "zzj", "zzk", "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new zzh();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzg(bArr);
        }
        if (i11 == 5) {
            return zzn;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzo;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzh.class) {
            try {
                zzazzVar = zzo;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzn);
                    zzo = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzh() {
    }
}
