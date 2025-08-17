package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzxc extends zzbae implements zzbbm {
    private static final zzxc zzv;
    private static volatile zzbbt zzw;
    private int zzb;
    private int zze;
    private long zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private zzayz zzo;
    private zzayz zzp;
    private zzayz zzq;
    private long zzr;
    private double zzs;
    private zzayz zzt;
    private zzayz zzu;

    static {
        zzxc zzxcVar = new zzxc();
        zzv = zzxcVar;
        zzbae.zzbn(zzxc.class, zzxcVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzv, "\u0001\u0011\u0000\u0001\u0001\u0012\u0011\u0000\u0000\u0000\u0001င\u0002\u0002င\u0003\u0003ဇ\u0004\u0004ဇ\u0005\u0006ဂ\u0006\u0007ဂ\u0007\bဂ\b\tင\t\nည\n\u000bည\u000b\fည\f\rဂ\r\u000eက\u000e\u000fည\u000f\u0010ည\u0010\u0011᠌\u0000\u0012ဂ\u0001", new Object[]{"zzb", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zze", zzxn.zza, "zzf"});
        }
        if (i11 == 3) {
            return new zzxc();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzxb(bArr);
        }
        if (i11 == 5) {
            return zzv;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzw;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzxc.class) {
            try {
                zzazzVar = zzw;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzv);
                    zzw = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzxc() {
        zzayz zzayzVar = zzayz.zzb;
        this.zzo = zzayzVar;
        this.zzp = zzayzVar;
        this.zzq = zzayzVar;
        this.zzt = zzayzVar;
        this.zzu = zzayzVar;
    }
}
