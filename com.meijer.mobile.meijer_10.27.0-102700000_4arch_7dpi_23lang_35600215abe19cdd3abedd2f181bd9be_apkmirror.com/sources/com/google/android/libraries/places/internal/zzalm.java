package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzalm extends zzbae implements zzbbm {
    private static final zzalm zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private zzaje zze;
    private int zzf;
    private int zzg;
    private zzamd zzh;

    final /* synthetic */ void zzc(int i10) {
        this.zzb |= 4;
        this.zzg = i10;
    }

    final /* synthetic */ void zzf(int i10) {
        this.zzf = i10 - 1;
        this.zzb |= 2;
    }

    static {
        zzalm zzalmVar = new zzalm();
        zzi = zzalmVar;
        zzbae.zzbn(zzalm.class, zzalmVar);
    }

    public static zzalk zza() {
        return (zzalk) zzi.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"zzb", "zze", "zzf", zzall.zza, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzalm();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzalk(bArr);
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
        synchronized (zzalm.class) {
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

    private zzalm() {
    }

    final /* synthetic */ void zzd(zzamd zzamdVar) {
        zzamdVar.getClass();
        this.zzh = zzamdVar;
        this.zzb |= 8;
    }
}
