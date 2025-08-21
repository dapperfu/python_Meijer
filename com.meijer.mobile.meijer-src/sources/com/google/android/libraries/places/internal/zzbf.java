package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbf extends zzbae implements zzbbm {
    private static final zzbf zzn;
    private static volatile zzbbt zzo;
    private int zzb;
    private zzbam zze = zzbae.zzbr();
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzi;
    private float zzj;
    private float zzk;
    private int zzl;
    private zzbb zzm;

    static {
        zzbf zzbfVar = new zzbf();
        zzn = zzbfVar;
        zzbae.zzbn(zzbf.class, zzbfVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzbak zzbakVar = zzap.zza;
            zzbak zzbakVar2 = zzaz.zza;
            return zzbae.zzbo(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ࠬ\u0002᠌\u0000\u0003᠌\u0001\u0004င\u0002\u0005ဂ\u0003\u0006ခ\u0004\u0007ခ\u0005\b᠌\u0006\tဉ\u0007", new Object[]{"zzb", "zze", zzbakVar, "zzf", zzbakVar2, "zzg", zzbakVar2, "zzh", "zzi", "zzj", "zzk", "zzl", zzbakVar, "zzm"});
        }
        if (i11 == 3) {
            return new zzbf();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzbe(bArr);
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
        synchronized (zzbf.class) {
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

    private zzbf() {
    }
}
