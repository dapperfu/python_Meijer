package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzml {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzml(String str, Object obj, int i10) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i10;
    }

    public static zzml zza(String str, long j10) {
        return new zzml(str, Long.valueOf(j10), 2);
    }

    public static zzml zzb(String str, boolean z10) {
        return new zzml(str, Boolean.valueOf(z10), 1);
    }

    public final Object zzc() {
        zzmq zzmqVarZza = zzms.zza();
        if (zzmqVarZza == null) {
            if (zzms.zzb() != null) {
                zzms.zzb().zza();
            }
            return this.zzb;
        }
        if (this.zzc - 1 != 0) {
            return zzmqVarZza.zzb(this.zza, ((Long) this.zzb).longValue());
        }
        return zzmqVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
    }
}
