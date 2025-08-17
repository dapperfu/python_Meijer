package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaad extends zzbae implements zzbbm {
    private static final zzaad zzB;
    private static volatile zzbbt zzC;
    private int zzA;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private zzaak zzt;
    private zzaam zzu;
    private zzaaa zzv;
    private zzaaf zzw;
    private zzaah zzx;
    private int zzy;
    private int zzz;

    static {
        zzaad zzaadVar = new zzaad();
        zzB = zzaadVar;
        zzbae.zzbn(zzaad.class, zzaadVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzB, "\u0001\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0000\u0000\u0001ဋ\u0001\u0002ဋ\u0002\u0003ဋ\u0003\u0004ဋ\u0004\u0005ဋ\u0005\u0006ဋ\u0006\u0007ဋ\u0007\bဋ\b\tဋ\t\nဋ\n\u000bဋ\u000b\fဋ\f\rဋ\r\u000eဋ\u000e\u000fဉ\u000f\u0010ဋ\u0000\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015᠌\u0014\u0016ဋ\u0015\u0017ဋ\u0016", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zze", "zzu", "zzv", "zzw", "zzx", "zzy", zzaac.zza, "zzz", "zzA"});
        }
        if (i11 == 3) {
            return new zzaad();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaab(bArr);
        }
        if (i11 == 5) {
            return zzB;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzC;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaad.class) {
            try {
                zzazzVar = zzC;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzB);
                    zzC = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzaad() {
    }
}
