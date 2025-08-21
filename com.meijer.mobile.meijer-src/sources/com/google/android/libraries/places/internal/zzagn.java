package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzagn extends zzbae implements zzbbm {
    private static final zzagn zzq;
    private static volatile zzbbt zzr;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private zzbao zzm = zzbae.zzbu();
    private int zzn;
    private int zzo;
    private int zzp;

    static {
        zzagn zzagnVar = new zzagn();
        zzq = zzagnVar;
        zzbae.zzbn(zzagn.class, zzagnVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\t\u001b\nင\b\u000b᠌\t\fင\n", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzagm.class, "zzn", "zzo", zzafq.zza, "zzp"});
        }
        if (i11 == 3) {
            return new zzagn();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzagk(bArr);
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
        synchronized (zzagn.class) {
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

    private zzagn() {
    }
}
