package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzarz extends zzbae implements zzbbm {
    private static final zzarz zzp;
    private static volatile zzbbt zzq;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zzbao zzk = zzbae.zzbu();
    private zzarn zzl;
    private zzaru zzm;
    private zzary zzn;
    private zzarr zzo;

    static {
        zzarz zzarzVar = new zzarz();
        zzp = zzarzVar;
        zzbae.zzbn(zzarz.class, zzarzVar);
        zzbae.zzbp(zzbdy.zzc(), zzarzVar, zzarzVar, null, 525004180, zzbcx.zzk, zzarz.class);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzp, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006\u001a\u0007ဉ\u0006\bဉ\u0007\tဉ\b\n᠌\u0002\u000bဉ\t", new Object[]{"zzb", "zze", zzarp.zza, "zzf", zzars.zza, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzg", zzarv.zza, "zzo"});
        }
        if (i11 == 3) {
            return new zzarz();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaro(bArr);
        }
        if (i11 == 5) {
            return zzp;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzq;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzarz.class) {
            try {
                zzazzVar = zzq;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzp);
                    zzq = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzarz() {
    }
}
