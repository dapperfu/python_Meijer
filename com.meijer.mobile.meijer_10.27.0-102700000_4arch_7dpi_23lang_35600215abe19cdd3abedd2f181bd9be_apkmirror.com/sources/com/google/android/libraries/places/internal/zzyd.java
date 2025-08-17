package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzyd extends zzbae implements zzbbm {
    private static final zzyd zzx;
    private static volatile zzbbt zzy;
    private int zzb;
    private int zze;
    private long zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private float zzs;
    private float zzt;
    private int zzu;
    private zzayz zzv = zzayz.zzb;
    private long zzw;

    static {
        zzyd zzydVar = new zzyd();
        zzx = zzydVar;
        zzbae.zzbn(zzyd.class, zzydVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzx, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001င\u0002\u0002င\u0003\u0003င\u0004\u0004ဇ\u0005\u0005င\u0006\u0006င\u0007\u0007င\b\bင\t\tဇ\n\nင\u000b\u000bင\f\fင\r\rခ\u000e\u000eခ\u000f\u000fင\u0010\u0010᠌\u0000\u0011ဂ\u0001\u0012ည\u0011\u0013ဂ\u0012", new Object[]{"zzb", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zze", zzxn.zza, "zzf", "zzv", "zzw"});
        }
        if (i11 == 3) {
            return new zzyd();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzyc(bArr);
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
        synchronized (zzyd.class) {
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

    private zzyd() {
    }
}
