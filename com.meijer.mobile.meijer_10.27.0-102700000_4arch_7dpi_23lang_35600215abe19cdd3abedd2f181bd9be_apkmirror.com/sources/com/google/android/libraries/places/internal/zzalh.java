package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzalh extends zzbae implements zzbbm {
    private static final zzalh zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzzw zze;
    private byte zzf = 2;

    static {
        zzalh zzalhVar = new zzalh();
        zzg = zzalhVar;
        zzbae.zzbn(zzalh.class, zzalhVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i11 == 3) {
            return new zzalh();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzalg(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        if (i11 != 6) {
            this.zzf = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzbbt zzbbtVar = zzh;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzalh.class) {
            try {
                zzazzVar = zzh;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzg);
                    zzh = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzalh() {
    }
}
