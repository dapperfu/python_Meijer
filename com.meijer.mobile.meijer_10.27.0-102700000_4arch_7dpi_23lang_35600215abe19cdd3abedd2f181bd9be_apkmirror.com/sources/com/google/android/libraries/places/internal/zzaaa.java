package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaaa extends zzbae implements zzbbm {
    private static final zzaaa zzr;
    private static volatile zzbbt zzs;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
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

    static {
        zzaaa zzaaaVar = new zzaaa();
        zzr = zzaaaVar;
        zzbae.zzbn(zzaaa.class, zzaaaVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzr, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b\nဋ\t\u000bဋ\n\fဋ\u000b\rဋ\f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i11 == 3) {
            return new zzaaa();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzzz(bArr);
        }
        if (i11 == 5) {
            return zzr;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzs;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaaa.class) {
            try {
                zzazzVar = zzs;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzr);
                    zzs = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzaaa() {
    }
}
