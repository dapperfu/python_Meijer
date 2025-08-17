package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaj extends zzbae implements zzbbm {
    private static final zzaj zzw;
    private static volatile zzbbt zzx;
    private int zzb;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private zzbao zzk = zzbae.zzbu();
    private zzbao zzl = zzbae.zzbu();
    private zzbao zzm = zzbae.zzbu();
    private zzbao zzn = zzbae.zzbu();
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private long zzv;

    static {
        zzaj zzajVar = new zzaj();
        zzw = zzajVar;
        zzbae.zzbn(zzaj.class, zzajVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzw, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0004\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006ဇ\u0005\u0007\u001a\b\u001b\t\u001b\nင\u0006\u000bဂ\r\fင\u000b\rင\u0007\u000eင\b\u000fင\t\u0010င\n\u0011\u001b\u0012င\f", new Object[]{"zzb", "zze", zzap.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzl", "zzm", zzao.class, "zzn", zzao.class, "zzo", "zzv", "zzt", "zzp", "zzq", "zzr", "zzs", "zzk", zzcj.class, "zzu"});
        }
        if (i11 == 3) {
            return new zzaj();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzai(bArr);
        }
        if (i11 == 5) {
            return zzw;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzx;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaj.class) {
            try {
                zzazzVar = zzx;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzw);
                    zzx = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzaj() {
    }
}
