package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzadk extends zzbae implements zzbbm {
    private static final zzadk zzv;
    private static volatile zzbbt zzw;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private zzbao zzj = zzbae.zzbu();
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;

    static {
        zzadk zzadkVar = new zzadk();
        zzv = zzadkVar;
        zzbae.zzbn(zzadk.class, zzadkVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzv, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006\u001b\u0007င\u0005\bင\u0006\tင\u0007\nင\b\u000bင\t\fင\n\rင\u000b\u000eင\f\u000fင\r\u0010င\u000e\u0011င\u000f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzadj.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i11 == 3) {
            return new zzadk();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzadh(bArr);
        }
        if (i11 == 5) {
            return zzv;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzw;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzadk.class) {
            try {
                zzazzVar = zzw;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzv);
                    zzw = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzadk() {
    }
}
