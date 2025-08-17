package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzacs extends zzbae implements zzbbm {
    private static final zzacs zzB;
    private static volatile zzbbt zzC;
    private boolean zzA;
    private int zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private float zzh;
    private float zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private float zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private int zzw;
    private zzbao zzx = zzbae.zzbu();
    private int zzy;
    private float zzz;

    static {
        zzacs zzacsVar = new zzacs();
        zzB = zzacsVar;
        zzbae.zzbn(zzacs.class, zzacsVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzbak zzbakVar = zzacr.zza;
            zzbak zzbakVar2 = zzwq.zza;
            return zzbae.zzbo(zzB, "\u0001\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0001\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nင\t\u000bင\n\fဇ\u000b\r᠌\f\u000eခ\r\u000f᠌\u000e\u0010᠌\u000f\u0011᠌\u0010\u0012᠌\u0011\u0013᠌\u0012\u0014\u001b\u0015င\u0013\u0016ခ\u0014\u0017ဇ\u0015", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", zzbakVar, "zzr", "zzs", zzbakVar2, "zzt", zzbakVar2, "zzu", zzbakVar2, "zzv", zzbakVar2, "zzw", zzwr.zza, "zzx", zzacl.class, "zzy", "zzz", "zzA"});
        }
        if (i11 == 3) {
            return new zzacs();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzacq(bArr);
        }
        if (i11 == 5) {
            return zzB;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzC;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzacs.class) {
            try {
                zzazzVar = zzC;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzB);
                    zzC = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzacs() {
    }
}
