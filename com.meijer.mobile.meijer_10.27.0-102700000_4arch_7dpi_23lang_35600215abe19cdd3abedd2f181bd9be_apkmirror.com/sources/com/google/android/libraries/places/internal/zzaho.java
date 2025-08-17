package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaho extends zzbae implements zzbbm {
    private static final zzaho zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private String zze = "";
    private int zzf;

    static {
        zzaho zzahoVar = new zzaho();
        zzg = zzahoVar;
        zzbae.zzbn(zzaho.class, zzahoVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", "zzf", zzahn.zza});
        }
        if (i11 == 3) {
            return new zzaho();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzahm(bArr);
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
        synchronized (zzaho.class) {
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

    private zzaho() {
    }
}
