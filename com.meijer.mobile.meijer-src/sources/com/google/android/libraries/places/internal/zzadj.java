package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzadj extends zzbae implements zzbbm {
    private static final zzadj zzm;
    private static volatile zzbbt zzn;
    private int zzb;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzl;
    private String zze = "";
    private zzbao zzk = zzbae.zzbu();

    static {
        zzadj zzadjVar = new zzadj();
        zzm = zzadjVar;
        zzbae.zzbn(zzadj.class, zzadjVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007\u001b\bင\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzadg.class, "zzl"});
        }
        if (i11 == 3) {
            return new zzadj();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzadi(bArr);
        }
        if (i11 == 5) {
            return zzm;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzn;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzadj.class) {
            try {
                zzazzVar = zzn;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzm);
                    zzn = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzadj() {
    }
}
