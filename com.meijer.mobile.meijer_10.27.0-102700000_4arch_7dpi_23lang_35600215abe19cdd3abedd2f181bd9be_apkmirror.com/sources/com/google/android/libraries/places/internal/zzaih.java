package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaih extends zzbae implements zzbbm {
    private static final zzaih zzj;
    private static volatile zzbbt zzk;
    private int zzb;
    private zzbam zze = zzbae.zzbr();
    private zzbao zzf = zzbae.zzbu();
    private String zzg = "";
    private boolean zzh;
    private int zzi;

    static {
        zzaih zzaihVar = new zzaih();
        zzj = zzaihVar;
        zzbae.zzbn(zzaih.class, zzaihVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0016\u0002\u001a\u0003ဈ\u0000\u0004ဇ\u0001\u0005ဋ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzaih();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaig(bArr);
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
        synchronized (zzaih.class) {
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

    private zzaih() {
    }
}
