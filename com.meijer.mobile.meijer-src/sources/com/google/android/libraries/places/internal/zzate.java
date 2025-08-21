package com.google.android.libraries.places.internal;

import java.util.List;

/* loaded from: classes6.dex */
public final class zzate extends zzbae implements zzbbm {
    private static final zzate zzf;
    private static volatile zzbbt zzg;
    private String zzb = "";
    private zzbao zze = zzbae.zzbu();

    public static zzate zzd() {
        return zzf;
    }

    public final String zza() {
        return this.zzb;
    }

    public final List zzc() {
        return this.zze;
    }

    static {
        zzate zzateVar = new zzate();
        zzf = zzateVar;
        zzbae.zzbn(zzate.class, zzateVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zze", zzatk.class});
        }
        if (i11 == 3) {
            return new zzate();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzatd(bArr);
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
        synchronized (zzate.class) {
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

    private zzate() {
    }
}
