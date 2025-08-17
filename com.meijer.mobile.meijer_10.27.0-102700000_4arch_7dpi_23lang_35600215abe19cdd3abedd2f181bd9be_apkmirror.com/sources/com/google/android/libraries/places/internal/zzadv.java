package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzadv extends zzbae implements zzbbm {
    private static final zzadv zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private int zze;
    private float zzf;

    static {
        zzadv zzadvVar = new zzadv();
        zzg = zzadvVar;
        zzbae.zzbn(zzadv.class, zzadvVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001", new Object[]{"zzb", "zze", zzadt.zza, "zzf"});
        }
        if (i11 == 3) {
            return new zzadv();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzadu(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzh;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzadv.class) {
            try {
                zzazzVar = zzh;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzg);
                    zzh = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzadv() {
    }
}
