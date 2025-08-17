package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaxt extends zzbae implements zzbbm {
    private static final zzaxt zze;
    private static volatile zzbbt zzf;
    private zzban zzb = zzbae.zzbt();

    static {
        zzaxt zzaxtVar = new zzaxt();
        zze = zzaxtVar;
        zzbae.zzbn(zzaxt.class, zzaxtVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001&", new Object[]{"zzb"});
        }
        if (i11 == 3) {
            return new zzaxt();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaxs(bArr);
        }
        if (i11 == 5) {
            return zze;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzf;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaxt.class) {
            try {
                zzazzVar = zzf;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zze);
                    zzf = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzaxt() {
    }
}
