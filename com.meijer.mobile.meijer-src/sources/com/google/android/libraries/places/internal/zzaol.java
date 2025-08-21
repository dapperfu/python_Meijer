package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaol extends zzbae implements zzbbm {
    private static final zzaol zzq;
    private static volatile zzbbt zzr;
    private int zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private zzayz zzm;
    private zzayz zzn;
    private float zzo;
    private int zzp;

    static {
        zzaol zzaolVar = new zzaol();
        zzq = zzaolVar;
        zzbae.zzbn(zzaol.class, zzaolVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0006\u0004င\u0007\u0005ဂ\u0002\u0006ည\b\u0007ဂ\u0003\bည\t\tင\u0004\nင\u0005\u000bခ\n\fင\u000b", new Object[]{"zzb", "zze", "zzf", "zzk", "zzl", "zzg", "zzm", "zzh", "zzn", "zzi", "zzj", "zzo", "zzp"});
        }
        if (i11 == 3) {
            return new zzaol();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaok(bArr);
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
        synchronized (zzaol.class) {
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

    private zzaol() {
        zzayz zzayzVar = zzayz.zzb;
        this.zzm = zzayzVar;
        this.zzn = zzayzVar;
    }
}
