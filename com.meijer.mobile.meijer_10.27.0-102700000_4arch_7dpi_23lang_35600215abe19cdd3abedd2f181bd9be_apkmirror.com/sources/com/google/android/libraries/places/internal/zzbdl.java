package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbdl extends zzbae implements zzbbm {
    private static final zzbdl zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private int zze;
    private zzbck zzf;

    public static zzbdl zzf() {
        return zzg;
    }

    public final int zzc() {
        return this.zze;
    }

    static {
        zzbdl zzbdlVar = new zzbdl();
        zzg = zzbdlVar;
        zzbae.zzbn(zzbdl.class, zzbdlVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzbdl();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzbdk(bArr);
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
        synchronized (zzbdl.class) {
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

    public final zzbck zze() {
        zzbck zzbckVar = this.zzf;
        return zzbckVar == null ? zzbck.zzg() : zzbckVar;
    }

    private zzbdl() {
    }
}
