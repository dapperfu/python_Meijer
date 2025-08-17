package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzv extends zzbae implements zzbbm {
    private static final zzv zzx;
    private static volatile zzbbt zzy;
    private int zzb;
    private zzcj zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private float zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private zzbao zzr = zzbae.zzbu();
    private zzbao zzs = zzbae.zzbu();
    private int zzt;
    private int zzu;
    private int zzv;
    private long zzw;

    static {
        zzv zzvVar = new zzv();
        zzx = zzvVar;
        zzbae.zzbn(zzv.class, zzvVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzx, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0002\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tခ\b\nဂ\t\u000bင\n\fဇ\u000b\r᠌\f\u000e\u001b\u000f\u001b\u0010င\r\u0011င\u000e\u0012ဂ\u0010\u0013င\u000f", new Object[]{"zzb", "zze", "zzf", zzu.zza, "zzg", "zzh", zzap.zza, "zzi", zzn.zza, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", zzac.zza, "zzr", zzao.class, "zzs", zzao.class, "zzt", "zzu", "zzw", "zzv"});
        }
        if (i11 == 3) {
            return new zzv();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzt(bArr);
        }
        if (i11 == 5) {
            return zzx;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzy;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzv.class) {
            try {
                zzazzVar = zzy;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzx);
                    zzy = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzv() {
    }
}
