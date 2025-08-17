package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzabi extends zzbae implements zzbbm {
    private static final zzabi zzm;
    private static volatile zzbbt zzn;
    private int zzb;
    private int zze;
    private long zzf;
    private zzaau zzg;
    private long zzh;
    private int zzi;
    private zzbam zzj = zzbae.zzbr();
    private zzbam zzk = zzbae.zzbr();
    private int zzl;

    static {
        zzabi zzabiVar = new zzabi();
        zzm = zzabiVar;
        zzbae.zzbn(zzabi.class, zzabiVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001᠌\u0000\u0002စ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006\u0016\u0007\u0016\bင\u0005", new Object[]{"zzb", "zze", zzabh.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new zzabi();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzabg(bArr);
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
        synchronized (zzabi.class) {
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

    private zzabi() {
    }
}
