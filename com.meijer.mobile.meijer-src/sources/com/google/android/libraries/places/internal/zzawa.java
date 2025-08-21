package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzawa extends zzbae implements zzbbm {
    private static final zzawa zzi;
    private static volatile zzbbt zzj;
    private String zzb = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        zzawa zzawaVar = new zzawa();
        zzi = zzawaVar;
        zzbae.zzbn(zzawa.class, zzawaVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzi, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzawa();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzavz(bArr);
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
        synchronized (zzawa.class) {
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

    private zzawa() {
    }
}
