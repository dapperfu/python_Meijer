package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzzy extends zzbae implements zzbbm {
    private static final zzzy zzh;
    private static volatile zzbbt zzi;
    private int zzb;
    private zzzw zze;
    private zzzw zzf;
    private byte zzg = 2;

    static {
        zzzy zzzyVar = new zzzy();
        zzh = zzzyVar;
        zzbae.zzbn(zzzy.class, zzzyVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzzy();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzzx(bArr);
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
        synchronized (zzzy.class) {
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

    private zzzy() {
    }
}
