package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzafx extends zzbae implements zzbbm {
    private static final zzafx zzn;
    private static volatile zzbbt zzo;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private zzagv zzi;
    private zzagf zzj;
    private zzagt zzk;
    private int zzl;
    private int zzm;

    static {
        zzafx zzafxVar = new zzafx();
        zzn = zzafxVar;
        zzbae.zzbn(zzafx.class, zzafxVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\b᠌\u0007\t᠌\b", new Object[]{"zzb", "zze", zzafu.zza, "zzf", zzafw.zza, "zzg", "zzh", zzaft.zza, "zzi", "zzj", "zzk", "zzl", zzafr.zza, "zzm", zzafv.zza});
        }
        if (i11 == 3) {
            return new zzafx();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzafs(bArr);
        }
        if (i11 == 5) {
            return zzn;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzo;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzafx.class) {
            try {
                zzazzVar = zzo;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzn);
                    zzo = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzafx() {
    }
}
