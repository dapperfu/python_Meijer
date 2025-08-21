package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzagr extends zzbae implements zzbbm {
    private static final zzagr zzx;
    private static volatile zzbbt zzy;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private zzbam zzj = zzbae.zzbr();
    private int zzk;
    private zzafx zzl;
    private zzagn zzm;
    private zzaey zzn;
    private zzagh zzo;
    private zzagd zzp;
    private zzagj zzq;
    private zzafb zzr;
    private zzafg zzs;
    private zzagy zzt;
    private zzahf zzu;
    private zzafp zzv;
    private zzafl zzw;

    static {
        zzagr zzagrVar = new zzagr();
        zzx = zzagrVar;
        zzbae.zzbn(zzagr.class, zzagrVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzx, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0001\u0000\u0001᠌\u0001\u0002᠌\u0002\u0003င\u0003\u0004ဉ\u0006\u0005ဉ\u0007\u0006ဉ\b\u0007ဉ\t\bဇ\u0004\tဉ\n\nဉ\u000b\u000b\u0016\fင\u0005\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011င\u0000\u0012ဉ\u0010\u0013ဉ\u0011", new Object[]{"zzb", "zzf", zzagp.zza, "zzg", zzagq.zza, "zzh", "zzl", "zzm", "zzn", "zzo", "zzi", "zzp", "zzq", "zzj", "zzk", "zzr", "zzs", "zzt", "zzu", "zze", "zzv", "zzw"});
        }
        if (i11 == 3) {
            return new zzagr();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzago(bArr);
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
        synchronized (zzagr.class) {
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

    private zzagr() {
    }
}
