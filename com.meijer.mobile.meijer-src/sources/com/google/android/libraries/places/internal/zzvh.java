package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzvh extends zzbae implements zzbbm {
    private static final zzvh zzj;
    private static volatile zzbbt zzk;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private zzvq zzi;

    static {
        zzvh zzvhVar = new zzvh();
        zzj = zzvhVar;
        zzbae.zzbn(zzvh.class, zzvhVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004᠌\u0003\u0005ဉ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzvg.zza, "zzi"});
        }
        if (i11 == 3) {
            return new zzvh();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzvf(bArr);
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
        synchronized (zzvh.class) {
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

    private zzvh() {
    }
}
