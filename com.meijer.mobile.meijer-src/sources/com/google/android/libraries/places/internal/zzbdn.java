package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbdn extends zzbae implements zzbbm {
    private static final zzbdn zzg;
    private static volatile zzbbt zzh;
    private String zzb = "";
    private String zze = "";
    private String zzf = "";

    public static zzbdn zze() {
        return zzg;
    }

    public final String zzc() {
        return this.zzb;
    }

    static {
        zzbdn zzbdnVar = new zzbdn();
        zzg = zzbdnVar;
        zzbae.zzbn(zzbdn.class, zzbdnVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzbdn();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzbdm(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzh;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzbdn.class) {
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

    private zzbdn() {
    }
}
