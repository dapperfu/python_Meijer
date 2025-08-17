package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzavi extends zzbae implements zzbbm {
    private static final zzavi zzj;
    private static volatile zzbbt zzk;
    private int zzb;
    private zzbeg zze;
    private zzbeg zzf;
    private zzaxg zzg;
    private zzbao zzh = zzbae.zzbu();
    private String zzi = "";

    static {
        zzavi zzaviVar = new zzavi();
        zzj = zzaviVar;
        zzbae.zzbn(zzavi.class, zzaviVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzj, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဉ\u0001\u0004\u001b\u0005Ȉ", new Object[]{"zzb", "zze", "zzg", "zzf", "zzh", zzats.class, "zzi"});
        }
        if (i11 == 3) {
            return new zzavi();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzavh(bArr);
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
        synchronized (zzavi.class) {
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

    private zzavi() {
    }
}
