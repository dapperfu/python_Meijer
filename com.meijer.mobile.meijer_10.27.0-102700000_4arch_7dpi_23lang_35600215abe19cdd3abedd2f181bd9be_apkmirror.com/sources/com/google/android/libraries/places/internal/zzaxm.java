package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaxm extends zzbae implements zzbbm {
    private static final zzaxm zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private zzbee zze;
    private int zzf;
    private zzaxk zzg;
    private int zzh;

    final /* synthetic */ void zzf(int i10) {
        this.zzf = i10 - 2;
    }

    final /* synthetic */ void zzg(int i10) {
        this.zzh = i10 - 2;
    }

    static {
        zzaxm zzaxmVar = new zzaxm();
        zzi = zzaxmVar;
        zzbae.zzbn(zzaxm.class, zzaxmVar);
    }

    public static zzaxl zza() {
        return (zzaxl) zzi.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001\u0004\f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzaxm();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaxl(bArr);
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
        synchronized (zzaxm.class) {
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

    private zzaxm() {
    }

    final /* synthetic */ void zzc(zzbee zzbeeVar) {
        zzbeeVar.getClass();
        this.zze = zzbeeVar;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzd(zzaxk zzaxkVar) {
        zzaxkVar.getClass();
        this.zzg = zzaxkVar;
        this.zzb |= 2;
    }
}
