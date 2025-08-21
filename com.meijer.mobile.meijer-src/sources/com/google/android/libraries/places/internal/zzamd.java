package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzamd extends zzbae implements zzbbm {
    private static final zzamd zze;
    private static volatile zzbbt zzf;
    private zzbao zzb = zzbae.zzbu();

    static {
        zzamd zzamdVar = new zzamd();
        zze = zzamdVar;
        zzbae.zzbn(zzamd.class, zzamdVar);
    }

    public static zzamc zza() {
        return (zzamc) zze.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i11 == 3) {
            return new zzamd();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzamc(bArr);
        }
        if (i11 == 5) {
            return zze;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzf;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzamd.class) {
            try {
                zzazzVar = zzf;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zze);
                    zzf = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzc(Iterable iterable) {
        zzbao zzbaoVar = this.zzb;
        if (!zzbaoVar.zza()) {
            this.zzb = zzbae.zzbv(zzbaoVar);
        }
        zzaym.zzbc(iterable, this.zzb);
    }

    private zzamd() {
    }
}
