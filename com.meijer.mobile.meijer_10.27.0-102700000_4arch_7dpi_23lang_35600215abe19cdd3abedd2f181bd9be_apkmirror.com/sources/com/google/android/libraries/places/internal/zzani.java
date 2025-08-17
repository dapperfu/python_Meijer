package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzani extends zzbae implements zzbbm {
    private static final zzani zzh;
    private static volatile zzbbt zzi;
    private int zzb;
    private int zze;
    private zzang zzf;
    private int zzg;

    final /* synthetic */ void zze(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzf(int i10) {
        this.zzg = i10 - 1;
        this.zzb |= 4;
    }

    static {
        zzani zzaniVar = new zzani();
        zzh = zzaniVar;
        zzbae.zzbn(zzani.class, zzaniVar);
    }

    public static zzanh zza() {
        return (zzanh) zzh.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", zzanz.zza, "zzf", "zzg", zzanj.zza});
        }
        if (i11 == 3) {
            return new zzani();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzanh(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzi;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzani.class) {
            try {
                zzazzVar = zzi;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzh);
                    zzi = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzani() {
    }

    final /* synthetic */ void zzc(zzang zzangVar) {
        zzangVar.getClass();
        this.zzf = zzangVar;
        this.zzb |= 2;
    }
}
