package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzayf extends zzbae implements zzbbm {
    private static final zzayf zzf;
    private static volatile zzbbt zzg;
    private int zzb = 0;
    private Object zze;

    static {
        zzayf zzayfVar = new zzayf();
        zzf = zzayfVar;
        zzbae.zzbn(zzayf.class, zzayfVar);
    }

    public static zzaye zza() {
        return (zzaye) zzf.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzf, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"zze", "zzb", zzaqo.class});
        }
        if (i11 == 3) {
            return new zzayf();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaye(bArr);
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
        synchronized (zzayf.class) {
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

    private zzayf() {
    }

    final /* synthetic */ void zzc(zzaqo zzaqoVar) {
        zzaqoVar.getClass();
        this.zze = zzaqoVar;
        this.zzb = 1;
    }
}
