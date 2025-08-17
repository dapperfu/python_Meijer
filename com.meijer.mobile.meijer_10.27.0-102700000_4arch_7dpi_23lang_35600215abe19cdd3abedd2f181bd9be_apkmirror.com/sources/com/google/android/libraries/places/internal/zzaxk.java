package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaxk extends zzbae implements zzbbm {
    private static final zzaxk zzh;
    private static volatile zzbbt zzi;
    private boolean zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;

    final /* synthetic */ void zzc(boolean z10) {
        this.zzb = z10;
    }

    final /* synthetic */ void zzd(boolean z10) {
        this.zze = z10;
    }

    final /* synthetic */ void zze(boolean z10) {
        this.zzf = z10;
    }

    final /* synthetic */ void zzf(boolean z10) {
        this.zzg = z10;
    }

    static {
        zzaxk zzaxkVar = new zzaxk();
        zzh = zzaxkVar;
        zzbae.zzbn(zzaxk.class, zzaxkVar);
    }

    public static zzaxj zza() {
        return (zzaxj) zzh.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzaxk();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaxj(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzi;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaxk.class) {
            try {
                zzazzVar = zzi;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzh);
                    zzi = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzaxk() {
    }
}
