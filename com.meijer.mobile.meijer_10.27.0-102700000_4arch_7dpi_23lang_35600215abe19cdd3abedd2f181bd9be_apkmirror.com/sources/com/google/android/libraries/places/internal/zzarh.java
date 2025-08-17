package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzarh extends zzbae implements zzbbm {
    private static final zzarh zzu;
    private static volatile zzbbt zzv;
    private int zzb;
    private int zze;
    private zzaqr zzf;
    private zzaqr zzg;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private zzaqr zzn;
    private zzaqt zzo;
    private zzaqx zzp;
    private int zzq;
    private int zzr;
    private zzaqv zzs;
    private byte zzt = 2;
    private zzbao zzh = zzbae.zzbu();

    static {
        zzarh zzarhVar = new zzarh();
        zzu = zzarhVar;
        zzbae.zzbn(zzarh.class, zzarhVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzt);
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzu, "\u0001\u000f\u0000\u0001\u0002\u0010\u000f\u0000\u0001\u0001\u0002ᔄ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u001b\u0006င\u0003\u0007င\u0004\bင\u0005\tင\u0006\nင\u0007\u000bဉ\b\fဉ\t\rဉ\n\u000eင\u000b\u000fင\f\u0010ဉ\r", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzarf.class, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i11 == 3) {
            return new zzarh();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzarg(bArr);
        }
        if (i11 == 5) {
            return zzu;
        }
        if (i11 != 6) {
            this.zzt = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzbbt zzbbtVar = zzv;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzarh.class) {
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

    private zzarh() {
    }
}
