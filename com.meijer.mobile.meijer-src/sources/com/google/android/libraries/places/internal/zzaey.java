package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaey extends zzbae implements zzbbm {
    private static final zzaey zzk;
    private static volatile zzbbt zzl;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private int zzj;

    static {
        zzaey zzaeyVar = new zzaey();
        zzk = zzaeyVar;
        zzbae.zzbn(zzaey.class, zzaeyVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004\u0006᠌\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzaex.zza});
        }
        if (i11 == 3) {
            return new zzaey();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaew(bArr);
        }
        if (i11 == 5) {
            return zzk;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzl;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaey.class) {
            try {
                zzazzVar = zzl;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzk);
                    zzl = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzaey() {
    }
}
