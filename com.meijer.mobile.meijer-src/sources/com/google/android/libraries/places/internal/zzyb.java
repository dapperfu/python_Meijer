package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzyb extends zzbae implements zzbbm {
    private static final zzyb zzj;
    private static volatile zzbbt zzk;
    private int zzb;
    private long zze;
    private zzayz zzf = zzayz.zzb;
    private int zzg;
    private long zzh;
    private long zzi;

    static {
        zzyb zzybVar = new zzyb();
        zzj = zzybVar;
        zzbae.zzbn(zzyb.class, zzybVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ည\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", zzb.zza(), "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzyb();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzya(bArr);
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
        synchronized (zzyb.class) {
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

    private zzyb() {
    }
}
