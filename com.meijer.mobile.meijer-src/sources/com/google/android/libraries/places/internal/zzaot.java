package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaot extends zzbae implements zzbbm {
    private static final zzaot zzm;
    private static volatile zzbbt zzn;
    private int zzb;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        zzaot zzaotVar = new zzaot();
        zzm = zzaotVar;
        zzbae.zzbn(zzaot.class, zzaotVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new zzaot();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaos(bArr);
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
        synchronized (zzaot.class) {
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

    private zzaot() {
    }
}
