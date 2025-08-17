package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzvl extends zzbae implements zzbbm {
    private static final zzvl zzy;
    private static volatile zzbbt zzz;
    private int zzb;
    private boolean zze;
    private int zzf;
    private boolean zzg;
    private int zzh;
    private boolean zzi;
    private int zzj;
    private boolean zzk;
    private int zzl;
    private boolean zzm;
    private int zzn;
    private boolean zzo;
    private int zzp;
    private boolean zzq;
    private int zzr;
    private boolean zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;

    static {
        zzvl zzvlVar = new zzvl();
        zzy = zzvlVar;
        zzbae.zzbn(zzvl.class, zzvlVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzy, "\u0001\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006င\u0005\u0007ဇ\u0006\bင\u0007\tဇ\b\nင\t\u000bဇ\n\fင\u000b\rဇ\f\u000eင\r\u000fဇ\u000e\u0010င\u000f\u0011င\u0010\u0012င\u0011\u0013င\u0012\u0014ဋ\u0013", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx"});
        }
        if (i11 == 3) {
            return new zzvl();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzvk(bArr);
        }
        if (i11 == 5) {
            return zzy;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzz;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzvl.class) {
            try {
                zzazzVar = zzz;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzy);
                    zzz = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzvl() {
    }
}
