package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzass extends zzbae implements zzbbm {
    private static final zzass zzf;
    private static volatile zzbbt zzg;
    private zzbao zzb = zzbae.zzbu();
    private zzbao zze = zzbae.zzbu();

    static {
        zzass zzassVar = new zzass();
        zzf = zzassVar;
        zzbae.zzbn(zzass.class, zzassVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzb", zzasr.class, "zze", zzaso.class});
        }
        if (i11 == 3) {
            return new zzass();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzasp(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzg;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzass.class) {
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

    private zzass() {
    }
}
