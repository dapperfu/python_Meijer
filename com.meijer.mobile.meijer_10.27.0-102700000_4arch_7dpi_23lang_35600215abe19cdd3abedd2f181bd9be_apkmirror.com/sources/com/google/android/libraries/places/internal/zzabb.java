package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzabb extends zzbae implements zzbbm {
    private static final zzabb zzs;
    private static volatile zzbbt zzt;
    private int zzb;
    private long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private zzban zzk = zzbae.zzbt();
    private long zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private int zzq;
    private long zzr;

    static {
        zzabb zzabbVar = new zzabb();
        zzs = zzabbVar;
        zzbae.zzbn(zzabb.class, zzabbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzbak zzbakVar = zzaay.zza;
            zzbak zzbakVar2 = zzaax.zza;
            zzbak zzbakVar3 = zzaav.zza;
            return zzbae.zzbo(zzs, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006င\u0005\u0007\u0014\bဂ\u0006\t᠌\u0007\n᠌\b\u000b᠌\t\fဂ\n\rင\u000b\u000eဂ\f", new Object[]{"zzb", "zze", "zzf", "zzg", zzbakVar, "zzh", zzbakVar2, "zzi", zzbakVar3, "zzj", "zzk", "zzl", "zzm", zzbakVar, "zzn", zzbakVar2, "zzo", zzbakVar3, "zzp", "zzq", "zzr"});
        }
        if (i11 == 3) {
            return new zzabb();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaba(bArr);
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
        synchronized (zzabb.class) {
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

    private zzabb() {
    }
}
