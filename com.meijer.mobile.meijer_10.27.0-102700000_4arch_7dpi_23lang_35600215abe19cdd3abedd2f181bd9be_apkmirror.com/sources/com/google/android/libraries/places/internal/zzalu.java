package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzalu extends zzbae implements zzbbm {
    private static final zzalu zzm;
    private static volatile zzbbt zzn;
    private int zzb;
    private zzaih zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        zzalu zzaluVar = new zzalu();
        zzm = zzaluVar;
        zzbae.zzbn(zzalu.class, zzaluVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0006᠌\u0005\u0007င\u0006\b᠌\u0007", new Object[]{"zzb", "zze", "zzf", zzaii.zza, "zzg", zzalt.zza, "zzh", "zzi", "zzj", zzals.zza, "zzk", "zzl", zzahi.zza});
        }
        if (i11 == 3) {
            return new zzalu();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzalr(bArr);
        }
        if (i11 == 5) {
            return zzm;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzn;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzalu.class) {
            try {
                zzazzVar = zzn;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzm);
                    zzn = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzalu() {
    }
}
