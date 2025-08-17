package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbek extends zzbae implements zzbbm {
    private static final zzbek zzo;
    private static volatile zzbbt zzp;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private zzbao zzl = zzbae.zzbu();
    private zzbao zzm = zzbae.zzbu();
    private String zzn = "";

    static {
        zzbek zzbekVar = new zzbek();
        zzo = zzbekVar;
        zzbae.zzbn(zzbek.class, zzbekVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzo, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0002\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȚ\nȚ\u000bȈ", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i11 == 3) {
            return new zzbek();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzbej(bArr);
        }
        if (i11 == 5) {
            return zzo;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzp;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzbek.class) {
            try {
                zzazzVar = zzp;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzo);
                    zzp = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzbek() {
    }
}
