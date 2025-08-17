package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzang extends zzbae implements zzbbm {
    private static final zzang zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;

    final /* synthetic */ void zzc(boolean z10) {
        this.zzb |= 1;
        this.zze = z10;
    }

    final /* synthetic */ void zzd(boolean z10) {
        this.zzb |= 2;
        this.zzf = z10;
    }

    final /* synthetic */ void zze(boolean z10) {
        this.zzb |= 4;
        this.zzg = z10;
    }

    final /* synthetic */ void zzf(boolean z10) {
        this.zzb |= 8;
        this.zzh = z10;
    }

    static {
        zzang zzangVar = new zzang();
        zzi = zzangVar;
        zzbae.zzbn(zzang.class, zzangVar);
    }

    public static zzanf zza() {
        return (zzanf) zzi.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzang();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzanf(bArr);
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
        synchronized (zzang.class) {
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

    private zzang() {
    }
}
