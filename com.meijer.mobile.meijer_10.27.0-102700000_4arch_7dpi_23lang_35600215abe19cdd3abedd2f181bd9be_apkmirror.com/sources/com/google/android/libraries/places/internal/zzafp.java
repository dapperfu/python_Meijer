package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzafp extends zzbae implements zzbbm {
    private static final zzafp zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzafp zzafpVar = new zzafp();
        zzi = zzafpVar;
        zzbae.zzbn(zzafp.class, zzafpVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003", new Object[]{"zzb", "zze", zzafn.zza, "zzf", zzafo.zza, "zzg", zzafq.zza, "zzh"});
        }
        if (i11 == 3) {
            return new zzafp();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzafm(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzj;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzafp.class) {
            try {
                zzazzVar = zzj;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzi);
                    zzj = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzafp() {
    }
}
