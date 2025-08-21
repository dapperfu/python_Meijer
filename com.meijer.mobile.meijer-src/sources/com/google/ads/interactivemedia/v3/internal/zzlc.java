package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzlc extends zzady implements zzafc {
    private static final zzlc zzb;
    private int zzd;
    private zzlf zze;
    private zzacw zzf;
    private zzacw zzg;

    public final zzacw zzd() {
        return this.zzg;
    }

    public final zzacw zze() {
        return this.zzf;
    }

    static {
        zzlc zzlcVar = new zzlc();
        zzb = zzlcVar;
        zzady.zzaM(zzlc.class, zzlcVar);
    }

    public static zzlc zzb(zzacw zzacwVar, zzadk zzadkVar) throws zzaeg {
        return (zzlc) zzady.zzaD(zzb, zzacwVar, zzadkVar);
    }

    public final zzlf zzc() {
        zzlf zzlfVar = this.zze;
        return zzlfVar == null ? zzlf.zzf() : zzlfVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzady.zzaJ(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzlc();
        }
        zzla zzlaVar = null;
        if (i11 == 4) {
            return new zzlb(zzlaVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzlc() {
        zzacw zzacwVar = zzacw.zzb;
        this.zzf = zzacwVar;
        this.zzg = zzacwVar;
    }
}
