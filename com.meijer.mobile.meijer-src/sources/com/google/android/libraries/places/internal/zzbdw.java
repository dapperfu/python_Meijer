package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbdw extends zzbae implements zzbbm {
    private static final zzbdw zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private long zze;
    private zzayz zzf = zzayz.zzb;
    private String zzg = "";
    private zzarz zzh;

    static {
        zzbdw zzbdwVar = new zzbdw();
        zzi = zzbdwVar;
        zzbae.zzbn(zzbdw.class, zzbdwVar);
    }

    public static zzbdv zzc() {
        return (zzbdv) zzi.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဈ\u0002\u0003ဉ\u0003\u0004ည\u0001", new Object[]{"zzb", "zze", "zzg", "zzh", "zzf"});
        }
        if (i11 == 3) {
            return new zzbdw();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzbdv(bArr);
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
        synchronized (zzbdw.class) {
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

    private zzbdw() {
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }
}
