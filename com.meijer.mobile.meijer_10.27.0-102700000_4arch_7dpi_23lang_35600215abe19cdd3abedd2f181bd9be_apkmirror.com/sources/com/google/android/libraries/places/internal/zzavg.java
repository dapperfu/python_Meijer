package com.google.android.libraries.places.internal;

import java.util.List;

/* loaded from: classes6.dex */
public final class zzavg extends zzbae implements zzbbm {
    private static final zzavg zzh;
    private static volatile zzbbt zzi;
    private String zzb = "";
    private String zze = "";
    private zzbao zzf = zzbae.zzbu();
    private String zzg = "";

    public final String zza() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zze;
    }

    public final List zzd() {
        return this.zzf;
    }

    static {
        zzavg zzavgVar = new zzavg();
        zzh = zzavgVar;
        zzbae.zzbn(zzavg.class, zzavgVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzavg();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzavf(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzi;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzavg.class) {
            try {
                zzazzVar = zzi;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzh);
                    zzi = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzavg() {
    }
}
