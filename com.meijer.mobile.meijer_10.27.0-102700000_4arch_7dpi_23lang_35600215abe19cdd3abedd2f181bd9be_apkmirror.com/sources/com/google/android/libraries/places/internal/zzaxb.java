package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaxb extends zzbae implements zzbbm {
    private static final zzaxb zzf;
    private static volatile zzbbt zzg;
    private int zzb = 0;
    private Object zze;

    static {
        zzaxb zzaxbVar = new zzaxb();
        zzf = zzaxbVar;
        zzbae.zzbn(zzaxb.class, zzaxbVar);
    }

    public static zzaxa zza() {
        return (zzaxa) zzf.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzf, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȼ\u0000", new Object[]{"zze", "zzb"});
        }
        if (i11 == 3) {
            return new zzaxb();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaxa(bArr);
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
        synchronized (zzaxb.class) {
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

    private zzaxb() {
    }

    final /* synthetic */ void zzc(String str) {
        str.getClass();
        this.zzb = 1;
        this.zze = str;
    }
}
