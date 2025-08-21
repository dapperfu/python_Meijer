package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzm extends zzady implements zzafc {
    private static final zzm zzb;
    private int zzd;
    private int zze;
    private boolean zzh;
    private zzai zzj;
    private zzal zzk;
    private boolean zzf = true;
    private String zzg = "unknown_host";
    private boolean zzi = true;

    static /* synthetic */ void zzg(zzm zzmVar, boolean z10) {
        zzmVar.zzd |= 8;
        zzmVar.zzh = false;
    }

    static /* synthetic */ void zzh(zzm zzmVar, boolean z10) {
        zzmVar.zzd |= 16;
        zzmVar.zzi = false;
    }

    static /* synthetic */ void zzi(zzm zzmVar, String str) {
        zzmVar.zzd |= 4;
        zzmVar.zzg = "a.3.35.1";
    }

    static /* synthetic */ void zzo(zzm zzmVar, int i10) {
        zzmVar.zze = 2;
        zzmVar.zzd |= 1;
    }

    public final String zze() {
        return this.zzg;
    }

    public final boolean zzj() {
        return this.zzh;
    }

    public final boolean zzk() {
        return this.zzi;
    }

    public final boolean zzl() {
        return this.zzf;
    }

    public final int zzn() {
        int iZza = zzo.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    static {
        zzm zzmVar = new zzm();
        zzb = zzmVar;
        zzady.zzaM(zzm.class, zzmVar);
    }

    public static zzl zza() {
        return (zzl) zzb.zzay();
    }

    public final zzai zzc() {
        zzai zzaiVar = this.zzj;
        return zzaiVar == null ? zzai.zzd() : zzaiVar;
    }

    public final zzal zzd() {
        zzal zzalVar = this.zzk;
        return zzalVar == null ? zzal.zzb() : zzalVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzady.zzaJ(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zzd", "zze", zzn.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new zzm();
        }
        zzk zzkVar = null;
        if (i11 == 4) {
            return new zzl(zzkVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzm() {
    }

    static /* synthetic */ void zzf(zzm zzmVar, zzai zzaiVar) {
        zzaiVar.getClass();
        zzmVar.zzj = zzaiVar;
        zzmVar.zzd |= 32;
    }
}
