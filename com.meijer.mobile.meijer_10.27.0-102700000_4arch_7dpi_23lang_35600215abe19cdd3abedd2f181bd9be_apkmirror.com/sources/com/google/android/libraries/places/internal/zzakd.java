package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzakd extends zzbae implements zzbbm {
    private static final zzakd zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private zzzy zzf;
    private zzaje zzg;
    private byte zzh = 2;
    private String zze = "";

    final /* synthetic */ void zzc(zzaje zzajeVar) {
        this.zzg = zzajeVar;
        this.zzb |= 4;
    }

    static {
        zzakd zzakdVar = new zzakd();
        zzi = zzakdVar;
        zzbae.zzbn(zzakd.class, zzakdVar);
    }

    public static zzakc zza() {
        return (zzakc) zzi.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzi, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzakd();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzakc(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        if (i11 != 6) {
            this.zzh = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzbbt zzbbtVar = zzj;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzakd.class) {
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

    private zzakd() {
    }
}
