package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzae extends zzbae implements zzbbm {
    private static final zzae zzn;
    private static volatile zzbbt zzo;
    private int zzb;
    private zzcs zze;
    private boolean zzf;
    private zzbao zzg = zzbae.zzbu();
    private zzbao zzh = zzbae.zzbu();
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;

    static {
        zzae zzaeVar = new zzae();
        zzn = zzaeVar;
        zzbae.zzbn(zzae.class, zzaeVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003\u001b\u0004\u001b\u0005င\u0002\u0006င\u0003\u0007င\u0004\bင\u0005\tဂ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", zzao.class, "zzh", zzao.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new zzae();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzad(bArr);
        }
        if (i11 == 5) {
            return zzn;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzo;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzae.class) {
            try {
                zzazzVar = zzo;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzn);
                    zzo = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzae() {
    }
}
