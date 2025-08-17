package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaaz extends zzbae implements zzbbm {
    private static final zzaaz zzq;
    private static volatile zzbbt zzr;
    private int zzb;
    private zzban zze = zzbae.zzbt();
    private zzban zzf = zzbae.zzbt();
    private zzban zzg = zzbae.zzbt();
    private zzban zzh = zzbae.zzbt();
    private zzban zzi = zzbae.zzbt();
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzaao zzo;
    private int zzp;

    static {
        zzaaz zzaazVar = new zzaaz();
        zzq = zzaazVar;
        zzbae.zzbn(zzaaz.class, zzaazVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0005\u0000\u0001\u0014\u0002\u0014\u0003\u0014\u0004\u0014\u0005\u0014\u0006င\u0000\u0007᠌\u0001\b᠌\u0002\t᠌\u0003\nင\u0004\u000bဉ\u0005\fင\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzaay.zza, "zzl", zzaax.zza, "zzm", zzaav.zza, "zzn", "zzo", "zzp"});
        }
        if (i11 == 3) {
            return new zzaaz();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaaw(bArr);
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
        synchronized (zzaaz.class) {
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

    private zzaaz() {
    }
}
