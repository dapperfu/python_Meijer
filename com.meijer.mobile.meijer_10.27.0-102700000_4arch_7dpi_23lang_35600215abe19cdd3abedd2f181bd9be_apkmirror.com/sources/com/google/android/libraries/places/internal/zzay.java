package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzay extends zzbae implements zzbbm {
    private static final zzay zzk;
    private static volatile zzbbt zzl;
    private int zzb;
    private zzcs zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        zzay zzayVar = new zzay();
        zzk = zzayVar;
        zzbae.zzbn(zzay.class, zzayVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဉ\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzf", "zze", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzay();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzax(bArr);
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
        synchronized (zzay.class) {
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

    private zzay() {
    }
}
