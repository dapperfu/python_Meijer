package com.google.android.libraries.places.internal;

import java.util.List;

/* loaded from: classes6.dex */
public final class zzaxy extends zzbae implements zzbbm {
    private static final zzaxy zzf;
    private static volatile zzbbt zzg;
    private zzbao zzb = zzbae.zzbu();
    private zzbao zze = zzbae.zzbu();

    public static zzaxy zzd() {
        return zzf;
    }

    public final List zza() {
        return this.zzb;
    }

    public final List zzc() {
        return this.zze;
    }

    static {
        zzaxy zzaxyVar = new zzaxy();
        zzf = zzaxyVar;
        zzbae.zzbn(zzaxy.class, zzaxyVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzb", zzaww.class, "zze", zzaxq.class});
        }
        if (i11 == 3) {
            return new zzaxy();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaxx(bArr);
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
        synchronized (zzaxy.class) {
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

    private zzaxy() {
    }
}
