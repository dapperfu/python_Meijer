package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbde extends zzbae implements zzbbm {
    private static final zzbde zzi;
    private static volatile zzbbt zzj;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    public static zzbde zze() {
        return zzi;
    }

    final /* synthetic */ void zzj(int i10) {
        this.zzh = 2;
    }

    static {
        zzbde zzbdeVar = new zzbde();
        zzi = zzbdeVar;
        zzbae.zzbn(zzbde.class, zzbdeVar);
    }

    public static zzbdc zzc() {
        return (zzbdc) zzi.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzi, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzbde();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzbdc(bArr);
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
        synchronized (zzbde.class) {
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

    private zzbde() {
    }

    final /* synthetic */ void zzf(zzbdd zzbddVar) {
        this.zzb = zzbddVar.zza();
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zze = str;
    }

    final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zzg = str;
    }
}
