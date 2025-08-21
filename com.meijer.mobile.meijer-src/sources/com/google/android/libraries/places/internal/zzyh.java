package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzyh extends zzbae implements zzbbm {
    private static final zzyh zzk;
    private static volatile zzbbt zzl;
    private int zzb;
    private long zze;
    private zzayz zzf;
    private double zzg;
    private zzayz zzh;
    private double zzi;
    private zzayz zzj;

    static {
        zzyh zzyhVar = new zzyh();
        zzk = zzyhVar;
        zzbae.zzbn(zzyh.class, zzyhVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ည\u0001\u0003က\u0002\u0004ည\u0003\u0005က\u0004\u0006ည\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzyh();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzyg(bArr);
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
        synchronized (zzyh.class) {
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

    private zzyh() {
        zzayz zzayzVar = zzayz.zzb;
        this.zzf = zzayzVar;
        this.zzh = zzayzVar;
        this.zzj = zzayzVar;
    }
}
