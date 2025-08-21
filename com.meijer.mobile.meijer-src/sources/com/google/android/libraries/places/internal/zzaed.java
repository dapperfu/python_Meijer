package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaed extends zzbae implements zzbbm {
    private static final zzaed zzl;
    private static volatile zzbbt zzm;
    private int zzb;
    private float zze;
    private float zzf;
    private zzadz zzg;
    private zzadz zzh;
    private zzade zzi;
    private zzade zzj;
    private long zzk;

    static {
        zzaed zzaedVar = new zzaed();
        zzl = zzaedVar;
        zzbae.zzbn(zzaed.class, zzaedVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဂ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new zzaed();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaec(bArr);
        }
        if (i11 == 5) {
            return zzl;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzm;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaed.class) {
            try {
                zzazzVar = zzm;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzl);
                    zzm = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzaed() {
    }
}
