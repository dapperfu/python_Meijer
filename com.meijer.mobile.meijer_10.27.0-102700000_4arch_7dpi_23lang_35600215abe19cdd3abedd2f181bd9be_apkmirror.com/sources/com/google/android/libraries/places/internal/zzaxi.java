package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaxi extends zzbae implements zzbbm {
    private static final zzaxi zzo;
    private static volatile zzbbt zzp;
    private int zzb;
    private zzbeg zzg;
    private zzbeg zzh;
    private double zzi;
    private zzasu zzj;
    private zzbck zzk;
    private zzbec zzn;
    private String zze = "";
    private String zzf = "";
    private String zzl = "";
    private String zzm = "";

    public final String zza() {
        return this.zzf;
    }

    public final boolean zzc() {
        return (this.zzb & 1) != 0;
    }

    public final boolean zze() {
        return (this.zzb & 2) != 0;
    }

    public final double zzg() {
        return this.zzi;
    }

    public final boolean zzh() {
        return (this.zzb & 4) != 0;
    }

    public final boolean zzj() {
        return (this.zzb & 8) != 0;
    }

    public final String zzl() {
        return this.zzl;
    }

    static {
        zzaxi zzaxiVar = new zzaxi();
        zzo = zzaxiVar;
        zzbae.zzbn(zzaxi.class, zzaxiVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzo, "\u0000\n\u0000\u0001\u0001\u0011\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0007\u0000\tဉ\u0000\fဉ\u0001\rဉ\u0002\u000eဉ\u0003\u000fȈ\u0010Ȉ\u0011ဉ\u0004", new Object[]{"zzb", "zze", "zzf", "zzi", "zzg", "zzh", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i11 == 3) {
            return new zzaxi();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaxh(bArr);
        }
        if (i11 == 5) {
            return zzo;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzp;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaxi.class) {
            try {
                zzazzVar = zzp;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzo);
                    zzp = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    public final zzbeg zzd() {
        zzbeg zzbegVar = this.zzg;
        return zzbegVar == null ? zzbeg.zzf() : zzbegVar;
    }

    public final zzbeg zzf() {
        zzbeg zzbegVar = this.zzh;
        return zzbegVar == null ? zzbeg.zzf() : zzbegVar;
    }

    public final zzasu zzi() {
        zzasu zzasuVar = this.zzj;
        return zzasuVar == null ? zzasu.zze() : zzasuVar;
    }

    public final zzbck zzk() {
        zzbck zzbckVar = this.zzk;
        return zzbckVar == null ? zzbck.zzg() : zzbckVar;
    }

    private zzaxi() {
    }
}
