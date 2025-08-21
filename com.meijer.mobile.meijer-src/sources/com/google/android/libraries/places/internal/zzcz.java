package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzcz extends zzbae implements zzbbm {
    private static final zzcz zzm;
    private static volatile zzbbt zzn;
    private int zzb;
    private int zze;
    private zzbao zzf = zzbae.zzbu();
    private zzbao zzg = zzbae.zzbu();
    private zzbao zzh = zzbae.zzbu();
    private zzbao zzi = zzbae.zzbu();
    private zzbao zzj = zzbae.zzbu();
    private zzbao zzk = zzbae.zzbu();
    private zzbao zzl = zzbae.zzbu();

    static {
        zzcz zzczVar = new zzcz();
        zzm = zzczVar;
        zzbae.zzbn(zzcz.class, zzczVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzm, "\u0001\b\u0000\u0001\u0001✐\b\u0000\u0007\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b✐᠌\u0000", new Object[]{"zzb", "zzf", zzdd.class, "zzg", zzdf.class, "zzh", zzdv.class, "zzi", zzdn.class, "zzj", zzdx.class, "zzk", zzdl.class, "zzl", zzdj.class, "zze", zzcy.zza});
        }
        if (i11 == 3) {
            return new zzcz();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzcx(bArr);
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
        synchronized (zzcz.class) {
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

    private zzcz() {
    }
}
