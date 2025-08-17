package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzdd extends zzbae implements zzbbm {
    private static final zzdd zzD;
    private static volatile zzbbt zzE;
    private int zzA;
    private float zzB;
    private float zzC;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private float zzj;
    private int zzk;
    private int zzl;
    private float zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private float zzr;
    private float zzs;
    private float zzt;
    private int zzu;
    private float zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private float zzz;

    static {
        zzdd zzddVar = new zzdd();
        zzD = zzddVar;
        zzbae.zzbn(zzdd.class, zzddVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzD, "\u0001\u0019\u0000\u0001\u0001\u0019\u0019\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005င\u0004\u0006ခ\u0005\u0007င\u0006\bင\u0007\tခ\b\nင\t\u000bင\n\fင\u000b\rင\f\u000eခ\r\u000fခ\u000e\u0010ခ\u000f\u0011င\u0010\u0012ခ\u0011\u0013င\u0012\u0014င\u0013\u0015င\u0014\u0016ခ\u0015\u0017င\u0016\u0018ခ\u0017\u0019ခ\u0018", new Object[]{"zzb", "zze", zzcu.zza(), "zzf", zzcw.zza(), "zzg", zzdc.zza, "zzh", zzdb.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC"});
        }
        if (i11 == 3) {
            return new zzdd();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzda(bArr);
        }
        if (i11 == 5) {
            return zzD;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzE;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzdd.class) {
            try {
                zzazzVar = zzE;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzD);
                    zzE = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzdd() {
    }
}
