package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzcq extends zzbae implements zzbbm {
    private static volatile zzbbt zzA;
    private static final zzcq zzz;
    private int zzb;
    private int zze;
    private int zzf;
    private float zzg;
    private int zzh;
    private int zzi;
    private float zzj;
    private int zzk;
    private int zzl;
    private float zzm;
    private int zzn;
    private int zzo;
    private float zzp;
    private int zzq;
    private float zzr;
    private float zzs;
    private double zzt;
    private int zzu;
    private boolean zzv;
    private int zzw;
    private boolean zzx;
    private int zzy;

    static {
        zzcq zzcqVar = new zzcq();
        zzz = zzcqVar;
        zzbae.zzbn(zzcq.class, zzcqVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzz, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ခ\u0002\u0004င\u0003\u0005င\u0004\u0006ခ\u0005\u0007င\u0006\bင\u0007\tခ\b\nင\t\u000bင\n\fခ\u000b\rင\f\u000eခ\r\u000fခ\u000e\u0010က\u000f\u0011᠌\u0010\u0012ဇ\u0011\u0013᠌\u0012\u0014ဇ\u0013\u0015᠌\u0014", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", zzcp.zza, "zzv", "zzw", zzcn.zza, "zzx", "zzy", zzco.zza});
        }
        if (i11 == 3) {
            return new zzcq();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzcm(bArr);
        }
        if (i11 == 5) {
            return zzz;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzA;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzcq.class) {
            try {
                zzazzVar = zzA;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzz);
                    zzA = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzcq() {
    }
}
