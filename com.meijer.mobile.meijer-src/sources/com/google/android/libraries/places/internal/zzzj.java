package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzzj extends zzbae implements zzbbm {
    private static final zzzj zzj;
    private static volatile zzbbt zzk;
    private int zzb;
    private zzcs zze;
    private zzzf zzf;
    private zzbao zzg = zzbae.zzbu();
    private int zzh;
    private int zzi;

    static {
        zzzj zzzjVar = new zzzj();
        zzj = zzzjVar;
        zzbae.zzbn(zzzj.class, zzzjVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0001\u0002\u001b\u0003᠌\u0002\u0004᠌\u0003\u0005ဉ\u0000", new Object[]{"zzb", "zzf", "zzg", zzyq.class, "zzh", zzzi.zza, "zzi", zzzh.zza, "zze"});
        }
        if (i11 == 3) {
            return new zzzj();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzzg(bArr);
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
        synchronized (zzzj.class) {
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

    private zzzj() {
    }
}
