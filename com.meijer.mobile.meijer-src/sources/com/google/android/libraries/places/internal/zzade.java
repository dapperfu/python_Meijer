package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzade extends zzbae implements zzbbm {
    private static final zzade zzm;
    private static volatile zzbbt zzn;
    private int zzb;
    private String zze = "";
    private int zzf;
    private int zzg;
    private float zzh;
    private float zzi;
    private float zzj;
    private long zzk;
    private boolean zzl;

    static {
        zzade zzadeVar = new zzade();
        zzm = zzadeVar;
        zzbae.zzbn(zzade.class, zzadeVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ဂ\u0006\bဇ\u0007", new Object[]{"zzb", "zze", "zzf", zzadt.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new zzade();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzadd(bArr);
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
        synchronized (zzade.class) {
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

    private zzade() {
    }
}
