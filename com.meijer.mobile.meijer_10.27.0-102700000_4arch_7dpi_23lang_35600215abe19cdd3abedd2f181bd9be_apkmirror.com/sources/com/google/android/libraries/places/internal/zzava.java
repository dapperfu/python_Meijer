package com.google.android.libraries.places.internal;

import java.util.List;

/* loaded from: classes6.dex */
public final class zzava extends zzbae implements zzbbm {
    private static final zzava zzj;
    private static volatile zzbbt zzk;
    private int zze;
    private int zzf;
    private String zzb = "";
    private zzbao zzg = zzbae.zzbu();
    private String zzh = "";
    private String zzi = "";

    public final String zza() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zzf;
    }

    public final List zze() {
        return this.zzg;
    }

    public final String zzf() {
        return this.zzh;
    }

    static {
        zzava zzavaVar = new zzava();
        zzj = zzavaVar;
        zzbae.zzbn(zzava.class, zzavaVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzj, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u001b\u0005Ȉ\u0006Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg", zzasu.class, "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzava();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzauz(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzk;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzava.class) {
            try {
                zzazzVar = zzk;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzj);
                    zzk = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzava() {
    }
}
