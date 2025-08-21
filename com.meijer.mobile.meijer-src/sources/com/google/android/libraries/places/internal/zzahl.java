package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzahl extends zzbae implements zzbbm {
    private static final zzahl zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private int zze;
    private String zzf = "";

    final /* synthetic */ void zzc(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    static {
        zzahl zzahlVar = new zzahl();
        zzg = zzahlVar;
        zzbae.zzbn(zzahl.class, zzahlVar);
    }

    public static zzahk zza() {
        return (zzahk) zzg.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzahl();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzahk(bArr);
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
        synchronized (zzahl.class) {
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

    private zzahl() {
    }
}
