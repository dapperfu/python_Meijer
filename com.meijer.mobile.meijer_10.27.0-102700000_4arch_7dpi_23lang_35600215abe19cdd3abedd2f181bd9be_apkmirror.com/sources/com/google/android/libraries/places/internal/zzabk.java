package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzabk extends zzbae implements zzbbm {
    private static final zzabk zzu;
    private static volatile zzbbt zzv;
    private int zzb;
    private long zze;
    private zzuq zzf;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private int zzo;
    private long zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;

    static {
        zzabk zzabkVar = new zzabk();
        zzu = zzabkVar;
        zzbae.zzbn(zzabk.class, zzabkVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzu, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001စ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဇ\t\u000bင\n\fဂ\u000b\rင\f\u000eင\r\u000fင\u000e\u0010င\u000f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i11 == 3) {
            return new zzabk();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzabj(bArr);
        }
        if (i11 == 5) {
            return zzu;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzv;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzabk.class) {
            try {
                zzazzVar = zzv;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzu);
                    zzv = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzabk() {
    }
}
