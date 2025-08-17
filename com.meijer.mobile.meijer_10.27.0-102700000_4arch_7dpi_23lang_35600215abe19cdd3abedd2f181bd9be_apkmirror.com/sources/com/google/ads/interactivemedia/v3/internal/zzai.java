package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzai extends zzady implements zzafc {
    private static final zzai zzb;
    private int zzd;
    private boolean zze;
    private int zzf = 5000;
    private boolean zzg;
    private boolean zzh;

    public static zzai zzd() {
        return zzb;
    }

    static /* synthetic */ void zze(zzai zzaiVar, boolean z10) {
        zzaiVar.zzd |= 1;
        zzaiVar.zze = true;
    }

    public final int zza() {
        return this.zzf;
    }

    public final boolean zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zzh;
    }

    public final boolean zzh() {
        return this.zzg;
    }

    static {
        zzai zzaiVar = new zzai();
        zzb = zzaiVar;
        zzady.zzaM(zzai.class, zzaiVar);
    }

    public static zzah zzb() {
        return (zzah) zzb.zzay();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzady.zzaJ(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzai();
        }
        zzag zzagVar = null;
        if (i11 == 4) {
            return new zzah(zzagVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzai() {
    }
}
