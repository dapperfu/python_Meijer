package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaby extends zzbae implements zzbbm {
    private static final zzaby zzA;
    private static volatile zzbbt zzB;
    private int zzb;
    private long zze;
    private long zzh;
    private long zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private zzaaz zzr;
    private long zzs;
    private zzacw zzv;
    private zzacw zzw;
    private zzaaq zzz;
    private zzbao zzf = zzbae.zzbu();
    private zzbao zzg = zzbae.zzbu();
    private zzbao zzt = zzbae.zzbu();
    private zzbao zzu = zzbae.zzbu();
    private zzbao zzx = zzbae.zzbu();
    private zzbao zzy = zzbae.zzbu();

    static {
        zzaby zzabyVar = new zzaby();
        zzA = zzabyVar;
        zzbae.zzbn(zzaby.class, zzabyVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzA, "\u0001\u0016\u0000\u0001\u0001\u0019\u0016\u0000\u0006\u0000\u0001စ\u0000\u0003\u001b\u0004\u001b\u0005ဂ\u0001\u0006ဂ\u0002\u0007ဂ\u0003\bင\u0004\tင\u0005\nဂ\u0006\u000bဂ\u0007\fင\b\rင\t\u000eဂ\n\u000fဉ\u000b\u0010ဂ\f\u0011\u001b\u0012\u001b\u0013ဉ\r\u0014ဉ\u000e\u0015\u001b\u0016\u001b\u0019ဉ\u000f", new Object[]{"zzb", "zze", "zzf", zzacf.class, "zzg", zzach.class, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", zzacp.class, "zzu", zzacp.class, "zzv", "zzw", "zzx", zzabw.class, "zzy", zzabw.class, "zzz"});
        }
        if (i11 == 3) {
            return new zzaby();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzabx(bArr);
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
        synchronized (zzaby.class) {
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

    private zzaby() {
    }
}
