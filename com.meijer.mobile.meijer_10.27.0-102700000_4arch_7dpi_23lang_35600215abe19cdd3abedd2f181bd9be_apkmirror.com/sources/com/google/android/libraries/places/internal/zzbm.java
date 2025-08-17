package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbm extends zzbae implements zzbbm {
    private static final zzbm zzk;
    private static volatile zzbbt zzl;
    private int zzb;
    private int zze = 1;
    private zzbo zzf;
    private zzbh zzg;
    private zzcs zzh;
    private zzbj zzi;
    private zzbq zzj;

    static {
        zzbm zzbmVar = new zzbm();
        zzk = zzbmVar;
        zzbae.zzbn(zzbm.class, zzbmVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"zzb", "zze", zzbl.zza, "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzbm();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzbk(bArr);
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
        synchronized (zzbm.class) {
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

    private zzbm() {
    }
}
