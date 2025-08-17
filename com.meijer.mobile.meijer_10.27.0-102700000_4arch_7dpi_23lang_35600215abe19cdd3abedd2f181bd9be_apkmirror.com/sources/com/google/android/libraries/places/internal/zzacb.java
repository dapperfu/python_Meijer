package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzacb extends zzbae implements zzbbm {
    private static final zzacb zzv;
    private static volatile zzbbt zzw;
    private int zzb;
    private zzaby zze;
    private zzabk zzg;
    private zzabk zzh;
    private zzwj zzi;
    private int zzj;
    private zzabm zzk;
    private zzabi zzl;
    private zzabf zzm;
    private zzabo zzn;
    private zzabd zzp;
    private zzabq zzq;
    private zzaas zzr;
    private zzacs zzs;
    private zzacu zzt;
    private zzacj zzu;
    private zzbao zzf = zzbae.zzbu();
    private zzbao zzo = zzbae.zzbu();

    static {
        zzacb zzacbVar = new zzacb();
        zzv = zzacbVar;
        zzbae.zzbn(zzacb.class, zzacbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzv, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006᠌\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000b\u001b\fဉ\t\rဉ\n\u000eဉ\u000b\u000fဉ\f\u0010ဉ\r\u0011ဉ\u000e", new Object[]{"zzb", "zze", "zzf", zzacd.class, "zzg", "zzh", "zzi", "zzj", zzaca.zza, "zzk", "zzl", "zzm", "zzn", "zzo", zzabu.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i11 == 3) {
            return new zzacb();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzabz(bArr);
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
        synchronized (zzacb.class) {
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

    private zzacb() {
    }
}
