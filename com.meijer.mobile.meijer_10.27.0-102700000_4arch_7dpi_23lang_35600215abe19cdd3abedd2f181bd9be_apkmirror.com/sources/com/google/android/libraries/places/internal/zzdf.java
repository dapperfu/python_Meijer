package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzdf extends zzbae implements zzbbm {
    private static final zzdf zzv;
    private static volatile zzbbt zzw;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private float zzi;
    private int zzj;
    private int zzk;
    private float zzl;
    private int zzm;
    private int zzn;
    private float zzo;
    private int zzp;
    private float zzq;
    private int zzr;
    private int zzs;
    private float zzt;
    private int zzu;

    static {
        zzdf zzdfVar = new zzdf();
        zzv = zzdfVar;
        zzbae.zzbn(zzdf.class, zzdfVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzv, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005ခ\u0004\u0006င\u0005\u0007င\u0006\bခ\u0007\tင\b\nင\t\u000bခ\n\fင\u000b\rခ\f\u000eင\r\u000fင\u000e\u0010ခ\u000f\u0011င\u0010", new Object[]{"zzb", "zze", zzcu.zza(), "zzf", zzcw.zza(), "zzg", zzbea.zza(), "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i11 == 3) {
            return new zzdf();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzde(bArr);
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
        synchronized (zzdf.class) {
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

    private zzdf() {
    }
}
