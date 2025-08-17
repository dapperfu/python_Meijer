package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzatn extends zzbae implements zzbbm {
    private static final zzatn zzf;
    private static volatile zzbbt zzg;
    private int zzb = 0;
    private Object zze;

    public final boolean zza() {
        return this.zzb == 1;
    }

    static {
        zzatn zzatnVar = new zzatn();
        zzf = zzatnVar;
        zzbae.zzbn(zzatn.class, zzatnVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzf, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzb", zzatg.class, zzati.class});
        }
        if (i11 == 3) {
            return new zzatn();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzatc(bArr);
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
        synchronized (zzatn.class) {
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

    public final zzatg zzc() {
        return this.zzb == 1 ? (zzatg) this.zze : zzatg.zzg();
    }

    private zzatn() {
    }
}
