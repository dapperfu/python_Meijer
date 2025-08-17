package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbz extends zzbae implements zzbbm {
    private static final zzbz zzs;
    private static volatile zzbbt zzt;
    private int zzb;
    private zzcj zze;
    private zzbs zzf;
    private zzbao zzg = zzbae.zzbu();
    private zzbao zzh = zzbae.zzbu();
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    static {
        zzbz zzbzVar = new zzbz();
        zzs = zzbzVar;
        zzbae.zzbn(zzbz.class, zzbzVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzs, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001b\u0005င\u0002\u0006င\u0003\u0007င\u0004\bင\u0005\tဂ\u0006\nဂ\u0007\u000bဂ\b\fဂ\t\rဂ\n\u000e᠌\u000b", new Object[]{"zzb", "zze", "zzf", "zzg", zzbx.class, "zzh", zzbx.class, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", zzby.zza});
        }
        if (i11 == 3) {
            return new zzbz();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzbv(bArr);
        }
        if (i11 == 5) {
            return zzs;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzt;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzbz.class) {
            try {
                zzazzVar = zzt;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzs);
                    zzt = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzbz() {
    }
}
