package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzwp extends zzbae implements zzbbm {
    private static final zzwp zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private int zze;
    private zzwo zzf;

    static {
        zzwp zzwpVar = new zzwp();
        zzg = zzwpVar;
        zzbae.zzbn(zzwp.class, zzwpVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", zzwl.zza, "zzf"});
        }
        if (i11 == 3) {
            return new zzwp();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzwk(bArr);
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
        synchronized (zzwp.class) {
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

    private zzwp() {
    }
}
