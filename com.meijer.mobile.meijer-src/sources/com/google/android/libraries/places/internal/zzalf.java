package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzalf extends zzbae implements zzbbm {
    private static final zzalf zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private zzbao zze = zzbae.zzbu();
    private int zzf;
    private int zzg;
    private zzamd zzh;

    final /* synthetic */ void zzc(int i10) {
        this.zzb |= 2;
        this.zzg = 1;
    }

    static {
        zzalf zzalfVar = new zzalf();
        zzi = zzalfVar;
        zzbae.zzbn(zzalf.class, zzalfVar);
    }

    public static zzale zza() {
        return (zzale) zzi.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002᠌\u0000\u0003ဋ\u0001\u0004ဉ\u0002", new Object[]{"zzb", "zze", "zzf", zzahz.zza, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzalf();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzale(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzj;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzalf.class) {
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

    private zzalf() {
    }

    final /* synthetic */ void zzd(zzamd zzamdVar) {
        zzamdVar.getClass();
        this.zzh = zzamdVar;
        this.zzb |= 4;
    }
}
