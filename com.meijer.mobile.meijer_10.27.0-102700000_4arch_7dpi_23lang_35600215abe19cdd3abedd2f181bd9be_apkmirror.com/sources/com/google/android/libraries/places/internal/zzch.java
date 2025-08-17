package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzch extends zzbae implements zzbbm {
    private static final zzch zzl;
    private static volatile zzbbt zzm;
    private int zzb;
    private zzbao zze = zzbae.zzbu();
    private zzbao zzf = zzbae.zzbu();
    private zzbao zzg = zzbae.zzbu();
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;

    static {
        zzch zzchVar = new zzch();
        zzl = zzchVar;
        zzbae.zzbn(zzch.class, zzchVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzl, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0003\u0000\u0002\u001b\u0003\u001b\u0004င\u0000\u0005င\u0001\u0006င\u0002\u0007ဂ\u0003\b\u001b", new Object[]{"zzb", "zzf", zzcg.class, "zzg", zzce.class, "zzh", "zzi", "zzj", "zzk", "zze", zzbs.class});
        }
        if (i11 == 3) {
            return new zzch();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzcc(bArr);
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
        synchronized (zzch.class) {
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

    private zzch() {
    }
}
