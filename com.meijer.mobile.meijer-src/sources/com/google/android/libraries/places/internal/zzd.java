package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzd extends zzbae implements zzbbm {
    private static final zzd zzq;
    private static volatile zzbbt zzr;
    private int zzb;
    private zzcs zze;
    private zzah zzf;
    private zzk zzg;
    private zzm zzh;
    private zzh zzi;
    private zzv zzj;
    private zzf zzk;
    private zzq zzl;
    private zzab zzm;
    private zzz zzn;
    private zzs zzo;
    private zzx zzp;

    static {
        zzd zzdVar = new zzd();
        zzq = zzdVar;
        zzbae.zzbn(zzd.class, zzdVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bဉ\b\tဉ\t\nဉ\u0000\u000bဉ\n\fဉ\u000b", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zze", "zzo", "zzp"});
        }
        if (i11 == 3) {
            return new zzd();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzc(bArr);
        }
        if (i11 == 5) {
            return zzq;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzr;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzd.class) {
            try {
                zzazzVar = zzr;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzq);
                    zzr = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzd() {
    }
}
