package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzauw extends zzbae implements zzbbm {
    private static final zzauw zzh;
    private static volatile zzbbt zzi;
    private String zzb = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    public static zzauw zzc() {
        return zzh;
    }

    final /* synthetic */ void zzd(String str) {
        this.zzb = str;
    }

    final /* synthetic */ void zzf(String str) {
        this.zzf = str;
    }

    static {
        zzauw zzauwVar = new zzauw();
        zzh = zzauwVar;
        zzbae.zzbn(zzauw.class, zzauwVar);
    }

    public static zzauv zza() {
        return (zzauv) zzh.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzauw();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzauv(bArr);
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
        synchronized (zzauw.class) {
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

    private zzauw() {
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zze = str;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zzg = str;
    }
}
