package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzacl extends zzbae implements zzbbm {
    private static final zzacl zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private float zze;
    private float zzf;
    private float zzg;
    private long zzh;

    static {
        zzacl zzaclVar = new zzacl();
        zzi = zzaclVar;
        zzbae.zzbn(zzacl.class, zzaclVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဂ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzacl();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzack(bArr);
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
        synchronized (zzacl.class) {
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

    private zzacl() {
    }
}
