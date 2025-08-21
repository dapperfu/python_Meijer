package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzadm extends zzbae implements zzbbm {
    private static final zzadm zzj;
    private static volatile zzbbt zzk;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        zzadm zzadmVar = new zzadm();
        zzj = zzadmVar;
        zzbae.zzbn(zzadm.class, zzadmVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzadm();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzadl(bArr);
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
        synchronized (zzadm.class) {
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

    private zzadm() {
    }
}
