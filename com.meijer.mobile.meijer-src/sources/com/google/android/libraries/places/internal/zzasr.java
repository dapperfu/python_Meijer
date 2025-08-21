package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzasr extends zzbae implements zzbbm {
    private static final zzasr zzl;
    private static volatile zzbbt zzm;
    private int zzb;
    private zzbeg zzg;
    private int zzi;
    private float zzj;
    private float zzk;
    private String zze = "";
    private String zzf = "";
    private zzbao zzh = zzbae.zzbu();

    static {
        zzasr zzasrVar = new zzasr();
        zzl = zzasrVar;
        zzbae.zzbn(zzasr.class, zzasrVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzl, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ț\u0005\f\u0006\u0001\u0007ခ\u0001", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new zzasr();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzasq(bArr);
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
        synchronized (zzasr.class) {
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

    private zzasr() {
    }
}
