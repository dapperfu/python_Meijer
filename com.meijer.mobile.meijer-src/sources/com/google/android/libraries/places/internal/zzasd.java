package com.google.android.libraries.places.internal;

import java.util.List;

/* loaded from: classes6.dex */
public final class zzasd extends zzbae implements zzbbm {
    private static final zzasd zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzbao zze = zzbae.zzbu();
    private zzasm zzf;

    public static zzasd zzc() {
        return zzg;
    }

    public final List zza() {
        return this.zze;
    }

    static {
        zzasd zzasdVar = new zzasd();
        zzg = zzasdVar;
        zzbae.zzbn(zzasd.class, zzasdVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zze", zzash.class, "zzf"});
        }
        if (i11 == 3) {
            return new zzasd();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzasc(bArr);
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
        synchronized (zzasd.class) {
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

    private zzasd() {
    }
}
