package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzawt extends zzbae implements zzbbm {
    private static final zzawt zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private zzbeg zze;
    private zzbeg zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        zzawt zzawtVar = new zzawt();
        zzi = zzawtVar;
        zzbae.zzbn(zzawt.class, zzawtVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\u0004Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzawt();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaws(bArr);
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
        synchronized (zzawt.class) {
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

    private zzawt() {
    }
}
