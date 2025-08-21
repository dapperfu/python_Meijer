package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaxv extends zzbae implements zzbbm {
    private static final zzaxv zzf;
    private static volatile zzbbt zzg;
    private int zzb = 0;
    private Object zze;

    static {
        zzaxv zzaxvVar = new zzaxv();
        zzf = zzaxvVar;
        zzbae.zzbn(zzaxv.class, zzaxvVar);
    }

    public static zzaxu zza() {
        return (zzaxu) zzf.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzf, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003Ȼ\u0000\u0004<\u0000\u0005Ȼ\u0000", new Object[]{"zze", "zzb", zzauy.class, zzatq.class, zzaxt.class});
        }
        if (i11 == 3) {
            return new zzaxv();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaxu(bArr);
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
        synchronized (zzaxv.class) {
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

    private zzaxv() {
    }

    final /* synthetic */ void zzc(zzatq zzatqVar) {
        zzatqVar.getClass();
        this.zze = zzatqVar;
        this.zzb = 2;
    }
}
