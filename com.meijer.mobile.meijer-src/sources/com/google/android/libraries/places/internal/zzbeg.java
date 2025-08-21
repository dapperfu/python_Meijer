package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbeg extends zzbae implements zzbbm {
    private static final zzbeg zzf;
    private static volatile zzbbt zzg;
    private String zzb = "";
    private String zze = "";

    public static zzbeg zzf() {
        return zzf;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zze() {
        return this.zze;
    }

    static {
        zzbeg zzbegVar = new zzbeg();
        zzf = zzbegVar;
        zzbae.zzbn(zzbeg.class, zzbegVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzb", "zze"});
        }
        if (i11 == 3) {
            return new zzbeg();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzbef(bArr);
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
        synchronized (zzbeg.class) {
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

    private zzbeg() {
    }
}
