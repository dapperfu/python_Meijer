package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzavw extends zzbae implements zzbbm {
    private static final zzavw zzk;
    private static volatile zzbbt zzl;
    private int zzb;
    private zzats zze;
    private zzats zzf;
    private zzats zzg;
    private zzats zzh;
    private String zzi = "";
    private zzbeg zzj;

    static {
        zzavw zzavwVar = new zzavw();
        zzk = zzavwVar;
        zzbae.zzbn(zzavw.class, zzavwVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005Ȉ\u0006ဉ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzavw();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzavv(bArr);
        }
        if (i11 == 5) {
            return zzk;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzl;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzavw.class) {
            try {
                zzazzVar = zzl;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzk);
                    zzl = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzavw() {
    }
}
