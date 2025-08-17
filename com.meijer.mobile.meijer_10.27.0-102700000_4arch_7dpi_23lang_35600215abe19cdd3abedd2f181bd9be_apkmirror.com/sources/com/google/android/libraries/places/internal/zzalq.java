package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzalq extends zzbae implements zzbbm {
    private static final zzalq zzl;
    private static volatile zzbbt zzm;
    private int zzb;
    private int zze;
    private int zzg;
    private int zzh;
    private long zzi;
    private boolean zzk;
    private zzbao zzf = zzbae.zzbu();
    private String zzj = "";

    static {
        zzalq zzalqVar = new zzalq();
        zzl = zzalqVar;
        zzbae.zzbn(zzalq.class, zzalqVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001a\u0003င\u0001\u0004᠌\u0002\u0005ဂ\u0003\u0006ဈ\u0004\u0007ဇ\u0005", new Object[]{"zzb", "zze", zzaii.zza, "zzf", "zzg", "zzh", zzalt.zza, "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new zzalq();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzalp(bArr);
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
        synchronized (zzalq.class) {
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

    private zzalq() {
    }
}
