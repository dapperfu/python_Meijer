package com.google.android.libraries.places.internal;

import De.p;

/* loaded from: classes6.dex */
public final class zzbgu {
    private String zza;
    private zzbgv zzb;
    private Long zzc;
    private zzbhk zzd;

    public final zzbgu zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzbgu zzc(zzbgv zzbgvVar) {
        this.zzb = zzbgvVar;
        return this;
    }

    public final zzbgu zzd(zzbhk zzbhkVar) {
        this.zzd = zzbhkVar;
        return this;
    }

    public final zzbgw zze() {
        p.r(this.zza, "description");
        p.r(this.zzb, "severity");
        p.r(this.zzc, "timestampNanos");
        p.x(true, "at least one of channelRef and subchannelRef must be null");
        return new zzbgw(this.zza, this.zzb, this.zzc.longValue(), null, this.zzd, null);
    }

    public final zzbgu zzb(long j10) {
        this.zzc = Long.valueOf(j10);
        return this;
    }
}
