package com.google.android.libraries.places.internal;

@Deprecated
/* loaded from: classes6.dex */
public final class zzbdy extends zzbab implements zzbbm {
    private static final zzbdy zzf;
    private static volatile zzbbt zzg;
    private byte zze = 2;

    public static zzbdy zzc() {
        return zzf;
    }

    static {
        zzbdy zzbdyVar = new zzbdy();
        zzf = zzbdyVar;
        zzbae.zzbn(zzbdy.class, zzbdyVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zze);
        }
        byte[] bArr = null;
        if (i11 == 2) {
            return zzbae.zzbo(zzf, "\u0003\u0000", null);
        }
        if (i11 == 3) {
            return new zzbdy();
        }
        if (i11 == 4) {
            return new zzbdx(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        if (i11 != 6) {
            this.zze = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzbbt zzbbtVar = zzg;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzbdy.class) {
            try {
                zzazzVar = zzg;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzf);
                    zzg = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzbdy() {
    }
}
