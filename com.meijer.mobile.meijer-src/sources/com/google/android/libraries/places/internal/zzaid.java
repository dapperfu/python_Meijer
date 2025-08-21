package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaid extends zzbae implements zzbbm {
    private static final zzaid zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private int zze;
    private int zzf;

    final /* synthetic */ void zzc(int i10) {
        this.zzb |= 1;
        this.zze = 1;
    }

    final /* synthetic */ void zzd(int i10) {
        this.zzb |= 2;
        this.zzf = i10;
    }

    static {
        zzaid zzaidVar = new zzaid();
        zzg = zzaidVar;
        zzbae.zzbn(zzaid.class, zzaidVar);
    }

    public static zzaic zza() {
        return (zzaic) zzg.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzaid();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaic(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzh;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaid.class) {
            try {
                zzazzVar = zzh;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzg);
                    zzh = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzaid() {
    }
}
