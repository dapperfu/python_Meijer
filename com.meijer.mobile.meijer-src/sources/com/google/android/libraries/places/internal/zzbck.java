package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbck extends zzbae implements zzbbm {
    private static final zzbck zzf;
    private static volatile zzbbt zzg;
    private long zzb;
    private int zze;

    public static zzbck zzg() {
        return zzf;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final int zze() {
        return this.zze;
    }

    final /* synthetic */ void zzh(long j10) {
        this.zzb = j10;
    }

    final /* synthetic */ void zzi(int i10) {
        this.zze = i10;
    }

    static {
        zzbck zzbckVar = new zzbck();
        zzf = zzbckVar;
        zzbae.zzbn(zzbck.class, zzbckVar);
    }

    public static zzbcj zzf() {
        return (zzbcj) zzf.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new zzbbx(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzb", "zze"});
        }
        if (i11 == 3) {
            return new zzbck();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzbcj(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzg;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzbck.class) {
            try {
                zzazzVar = zzg;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzf);
                    zzg = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzbck() {
    }
}
