package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaoh extends zzbae implements zzbbm {
    private static final zzaoh zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzayz zze;
    private zzayz zzf;

    static {
        zzaoh zzaohVar = new zzaoh();
        zzg = zzaohVar;
        zzbae.zzbn(zzaoh.class, zzaohVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzaoh();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaog(bArr);
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
        synchronized (zzaoh.class) {
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

    private zzaoh() {
        zzayz zzayzVar = zzayz.zzb;
        this.zze = zzayzVar;
        this.zzf = zzayzVar;
    }
}
