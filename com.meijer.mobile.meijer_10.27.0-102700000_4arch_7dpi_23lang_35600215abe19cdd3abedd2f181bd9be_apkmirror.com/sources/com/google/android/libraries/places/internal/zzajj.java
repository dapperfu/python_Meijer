package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzajj extends zzbae implements zzbbm {
    private static final zzajj zzp;
    private static volatile zzbbt zzq;
    private int zzb;
    private zzaje zzg;
    private zzzy zzh;
    private int zzk;
    private int zzl;
    private int zzn;
    private byte zzo = 2;
    private String zze = "";
    private String zzf = "";
    private int zzi = 1;
    private String zzj = "";
    private String zzm = "";

    static {
        zzajj zzajjVar = new zzajj();
        zzp = zzajjVar;
        zzbae.zzbn(zzajj.class, zzajjVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzo);
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzp, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005᠌\u0004\u0006ဈ\u0005\u0007᠌\u0006\bင\u0007\tဈ\b\n᠌\t", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", zzajg.zza, "zzj", "zzk", zzaji.zza, "zzl", "zzm", "zzn", zzajh.zza});
        }
        if (i11 == 3) {
            return new zzajj();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzajf(bArr);
        }
        if (i11 == 5) {
            return zzp;
        }
        if (i11 != 6) {
            this.zzo = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzbbt zzbbtVar = zzq;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzajj.class) {
            try {
                zzazzVar = zzq;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzp);
                    zzq = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzajj() {
    }
}
