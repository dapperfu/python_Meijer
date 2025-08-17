package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzbo extends zzady implements zzafc {
    private static final zzbo zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static /* synthetic */ void zzc(zzbo zzboVar, long j10) {
        zzboVar.zzd |= 32;
        zzboVar.zzj = j10;
    }

    static /* synthetic */ void zzd(zzbo zzboVar, long j10) {
        zzboVar.zzd |= 4;
        zzboVar.zzg = j10;
    }

    static /* synthetic */ void zze(zzbo zzboVar, long j10) {
        zzboVar.zzd |= 1;
        zzboVar.zze = j10;
    }

    static /* synthetic */ void zzf(zzbo zzboVar, long j10) {
        zzboVar.zzd |= 8;
        zzboVar.zzh = j10;
    }

    static /* synthetic */ void zzg(zzbo zzboVar, long j10) {
        zzboVar.zzd |= 16;
        zzboVar.zzi = j10;
    }

    static {
        zzbo zzboVar = new zzbo();
        zzb = zzboVar;
        zzady.zzaM(zzbo.class, zzboVar);
    }

    public static zzbn zza() {
        return (zzbn) zzb.zzay();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzady.zzaJ(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new zzbo();
        }
        zzbm zzbmVar = null;
        if (i11 == 4) {
            return new zzbn(zzbmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzbo() {
    }
}
