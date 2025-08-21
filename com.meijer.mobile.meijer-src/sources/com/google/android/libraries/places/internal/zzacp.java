package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzacp extends zzbae implements zzbbm {
    private static final zzacp zzj;
    private static volatile zzbbt zzk;
    private int zzb;
    private int zze;
    private float zzf;
    private int zzg;
    private float zzh;
    private int zzi;

    static {
        zzacp zzacpVar = new zzacp();
        zzj = zzacpVar;
        zzbae.zzbn(zzacp.class, zzacpVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003င\u0002\u0004ခ\u0003\u0005င\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzacp();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaco(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzk;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzacp.class) {
            try {
                zzazzVar = zzk;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzj);
                    zzk = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzacp() {
    }
}
