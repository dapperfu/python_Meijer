package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class zzqf implements Serializable {
    zzqf() {
    }

    public static zzqf zzf() {
        return zzpv.zza;
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract zzqf zza(zzpz zzpzVar);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract Object zzd();

    public abstract boolean zze();

    public static zzqf zzg(Object obj) {
        return obj == null ? zzpv.zza : new zzqi(obj);
    }

    public static zzqf zzh(Object obj) {
        obj.getClass();
        return new zzqi(obj);
    }
}
