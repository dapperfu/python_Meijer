package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaam extends zzbae implements zzbbm {
    private static final zzaam zzo;
    private static volatile zzbbt zzp;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;

    static {
        zzaam zzaamVar = new zzaam();
        zzo = zzaamVar;
        zzbae.zzbn(zzaam.class, zzaamVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzo, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b\nဋ\t", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i11 == 3) {
            return new zzaam();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaal(bArr);
        }
        if (i11 == 5) {
            return zzo;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzp;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaam.class) {
            try {
                zzazzVar = zzp;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzo);
                    zzp = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzaam() {
    }
}
