package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzzw extends zzbae implements zzbbm {
    private static final zzzw zzh;
    private static volatile zzbbt zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        zzzw zzzwVar = new zzzw();
        zzh = zzzwVar;
        zzbae.zzbn(zzzw.class, zzzwVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔆ\u0000\u0002ᔆ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzzw();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzzv(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        if (i11 != 6) {
            this.zzg = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzbbt zzbbtVar = zzi;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzzw.class) {
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

    private zzzw() {
    }
}
