package com.google.android.libraries.places.internal;

import java.util.List;

/* loaded from: classes6.dex */
public final class zzaum extends zzbae implements zzbbm {
    private static final zzaum zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzbao zze = zzbae.zzbu();
    private zzbao zzf = zzbae.zzbu();

    public static zzaum zzd() {
        return zzg;
    }

    public final int zza() {
        return this.zzb;
    }

    public final List zzc() {
        return this.zze;
    }

    static {
        zzaum zzaumVar = new zzaum();
        zzg = zzaumVar;
        zzbae.zzbn(zzaum.class, zzaumVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\u001b", new Object[]{"zzb", "zze", zzauj.class, "zzf", zzaul.class});
        }
        if (i11 == 3) {
            return new zzaum();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzauh(bArr);
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
        synchronized (zzaum.class) {
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

    private zzaum() {
    }
}
