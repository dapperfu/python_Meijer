package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzlf extends zzady implements zzafc {
    private static final zzlf zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    public static zzlf zzf() {
        return zzb;
    }

    static /* synthetic */ void zzl(zzlf zzlfVar, long j10) {
        zzlfVar.zzd |= 8;
        zzlfVar.zzh = j10;
    }

    static /* synthetic */ void zzn(zzlf zzlfVar, long j10) {
        zzlfVar.zzd |= 4;
        zzlfVar.zzg = j10;
    }

    static /* synthetic */ void zzo(zzlf zzlfVar, long j10) {
        zzlfVar.zzd |= 16;
        zzlfVar.zzi = j10;
    }

    public final long zza() {
        return this.zzh;
    }

    public final long zzb() {
        return this.zzg;
    }

    public final long zzc() {
        return this.zzi;
    }

    public final String zzi() {
        return this.zzf;
    }

    public final String zzj() {
        return this.zze;
    }

    static {
        zzlf zzlfVar = new zzlf();
        zzb = zzlfVar;
        zzady.zzaM(zzlf.class, zzlfVar);
    }

    public static zzle zzd() {
        return (zzle) zzb.zzay();
    }

    public static zzlf zzg(zzacw zzacwVar) throws zzaeg {
        return (zzlf) zzady.zzaC(zzb, zzacwVar);
    }

    public static zzlf zzh(zzacw zzacwVar, zzadk zzadkVar) throws zzaeg {
        return (zzlf) zzady.zzaD(zzb, zzacwVar, zzadkVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzady.zzaJ(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzlf();
        }
        zzld zzldVar = null;
        if (i11 == 4) {
            return new zzle(zzldVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzlf() {
    }

    static /* synthetic */ void zzk(zzlf zzlfVar, String str) {
        str.getClass();
        zzlfVar.zzd |= 2;
        zzlfVar.zzf = str;
    }

    static /* synthetic */ void zzp(zzlf zzlfVar, String str) {
        str.getClass();
        zzlfVar.zzd |= 1;
        zzlfVar.zze = str;
    }
}
