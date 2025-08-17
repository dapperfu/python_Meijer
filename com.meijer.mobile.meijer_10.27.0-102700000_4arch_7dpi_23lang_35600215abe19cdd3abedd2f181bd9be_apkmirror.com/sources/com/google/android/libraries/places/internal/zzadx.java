package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzadx extends zzbae implements zzbbm {
    private static final zzadx zzs;
    private static volatile zzbbt zzt;
    private int zzb;
    private long zze;
    private zzadm zzf;
    private zzadm zzg;
    private zzaeg zzh;
    private zzads zzi;
    private zzadc zzj;
    private zzaej zzk;
    private zzael zzl;
    private zzadz zzm;
    private zzacy zzn;
    private zzade zzo;
    private zzadv zzp;
    private zzaeb zzq;
    private zzaed zzr;

    static {
        zzadx zzadxVar = new zzadx();
        zzs = zzadxVar;
        zzbae.zzbn(zzadx.class, zzadxVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzs, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i11 == 3) {
            return new zzadx();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzadw(bArr);
        }
        if (i11 == 5) {
            return zzs;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzt;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzadx.class) {
            try {
                zzazzVar = zzt;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzs);
                    zzt = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzadx() {
    }
}
