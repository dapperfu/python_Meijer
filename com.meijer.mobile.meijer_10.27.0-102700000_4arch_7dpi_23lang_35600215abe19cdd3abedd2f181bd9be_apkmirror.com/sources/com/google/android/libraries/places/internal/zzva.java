package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzva extends zzbae implements zzbbm {
    private static final zzva zzt;
    private static volatile zzbbt zzu;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;

    static {
        zzva zzvaVar = new zzva();
        zzt = zzvaVar;
        zzbae.zzbn(zzva.class, zzvaVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzt, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b\nဋ\t\u000bဋ\n\fဋ\u000b\rဋ\f\u000eဋ\r\u000fဋ\u000e", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i11 == 3) {
            return new zzva();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzuz(bArr);
        }
        if (i11 == 5) {
            return zzt;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzu;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzva.class) {
            try {
                zzazzVar = zzu;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzt);
                    zzu = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzva() {
    }
}
