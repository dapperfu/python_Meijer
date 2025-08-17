package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzdh extends zzbae implements zzbbm {
    private static final zzdh zzh;
    private static volatile zzbbt zzi;
    private int zzb;
    private zzbao zze = zzbae.zzbu();
    private float zzf;
    private float zzg;

    static {
        zzdh zzdhVar = new zzdh();
        zzh = zzdhVar;
        zzbae.zzbn(zzdh.class, zzdhVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ခ\u0000\u0003ခ\u0001", new Object[]{"zzb", "zze", zzdp.class, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzdh();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzdg(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzi;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzdh.class) {
            try {
                zzazzVar = zzi;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzh);
                    zzi = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzdh() {
    }
}
