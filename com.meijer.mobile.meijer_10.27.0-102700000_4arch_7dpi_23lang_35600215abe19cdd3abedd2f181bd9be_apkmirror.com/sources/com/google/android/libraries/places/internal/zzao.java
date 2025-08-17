package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzao extends zzbae implements zzbbm {
    private static final zzao zzA;
    private static volatile zzbbt zzB;
    private int zzb;
    private boolean zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private float zzi;
    private float zzj;
    private boolean zzk;
    private float zzl;
    private double zzm;
    private int zzn;
    private long zzo;
    private float zzp;
    private float zzq;
    private float zzr;
    private float zzs;
    private float zzt;
    private float zzu;
    private float zzv;
    private float zzw;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;

    static {
        zzao zzaoVar = new zzao();
        zzA = zzaoVar;
        zzbae.zzbn(zzao.class, zzaoVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzbak zzbakVar = zzan.zza;
            return zzbae.zzbo(zzA, "\u0001\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ဇ\u0006\bခ\u0007\tက\b\n᠌\t\u000bဂ\n\fခ\u000b\rခ\f\u000eခ\r\u000fခ\u000e\u0010ခ\u000f\u0011ခ\u0010\u0012ခ\u0011\u0013ခ\u0012\u0014ဇ\u0013\u0015ဇ\u0014\u0016ဇ\u0015", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzbakVar, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", zzbakVar, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (i11 == 3) {
            return new zzao();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzam(bArr);
        }
        if (i11 == 5) {
            return zzA;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzB;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzao.class) {
            try {
                zzazzVar = zzB;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzA);
                    zzB = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzao() {
    }
}
