package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzalw extends zzbae implements zzbbm {
    private static final zzalw zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private int zzf;
    private boolean zzh;
    private zzbao zze = zzbae.zzbu();
    private String zzg = "";

    static {
        zzalw zzalwVar = new zzalw();
        zzi = zzalwVar;
        zzbae.zzbn(zzalw.class, zzalwVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002᠌\u0000\u0003ဈ\u0001\u0004ဇ\u0002", new Object[]{"zzb", "zze", "zzf", zzalt.zza, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzalw();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzalv(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzj;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzalw.class) {
            try {
                zzazzVar = zzj;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzi);
                    zzj = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzalw() {
    }
}
