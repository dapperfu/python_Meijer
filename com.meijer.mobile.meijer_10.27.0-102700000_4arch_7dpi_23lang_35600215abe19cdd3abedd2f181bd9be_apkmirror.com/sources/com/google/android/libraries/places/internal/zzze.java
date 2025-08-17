package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzze extends zzbae implements zzbbm {
    private static final zzze zzv;
    private static volatile zzbbt zzw;
    private int zzb;
    private Object zzf;
    private zzyx zzg;
    private zzyu zzh;
    private zzzb zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private int zzp;
    private long zzq;
    private long zzr;
    private int zze = 0;
    private zzban zzs = zzbae.zzbt();
    private zzban zzt = zzbae.zzbt();
    private zzbao zzu = zzbae.zzbu();

    static {
        zzze zzzeVar = new zzze();
        zzv = zzzeVar;
        zzbae.zzbn(zzze.class, zzzeVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzbak zzbakVar = zzzi.zza;
            zzbak zzbakVar2 = zzzh.zza;
            return zzbae.zzbo(zzv, "\u0001\u0012\u0001\u0001\u0001\u0012\u0012\u0000\u0003\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u00035\u0000\u0004᠌\u0003\u0005᠌\u0004\u0006\u083f\u0000\u00077\u0000\bဂ\u0005\t᠌\u0006\n᠌\u0007\u000bဂ\b\fင\t\rဂ\n\u000eဂ\u000b\u000f%\u0010%\u0011\u001b\u0012ဉ\u0002", new Object[]{"zzf", "zze", "zzb", "zzg", "zzh", "zzj", zzbakVar, "zzk", zzbakVar2, zzb.zza(), "zzl", "zzm", zzbakVar, "zzn", zzbakVar2, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", zzzd.class, "zzi"});
        }
        if (i11 == 3) {
            return new zzze();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzys(bArr);
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
        synchronized (zzze.class) {
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

    private zzze() {
    }
}
