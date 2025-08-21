package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzana extends zzbae implements zzbbm {
    private static final zzana zzk;
    private static volatile zzbbt zzl;
    private int zzb;
    private zzzy zze;
    private int zzf;
    private int zzg;
    private int zzi;
    private byte zzj = 2;
    private String zzh = "";

    static {
        zzana zzanaVar = new zzana();
        zzk = zzanaVar;
        zzbae.zzbn(zzana.class, zzanaVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzk, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005᠌\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", zzamz.zza});
        }
        if (i11 == 3) {
            return new zzana();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzamy(bArr);
        }
        if (i11 == 5) {
            return zzk;
        }
        if (i11 != 6) {
            this.zzj = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzbbt zzbbtVar = zzl;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzana.class) {
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

    private zzana() {
    }
}
