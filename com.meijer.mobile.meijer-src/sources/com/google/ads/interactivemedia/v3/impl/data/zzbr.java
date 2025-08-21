package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.internal.zzps;

@zzps(zza = zzad.class)
/* loaded from: classes4.dex */
public abstract class zzbr {
    public static zzbr create(long j10, AdErrorEvent adErrorEvent) {
        return create(j10, (zzbp) null, (zzbq) null, adErrorEvent, (zzbw) null);
    }

    public abstract AdErrorEvent adErrorEvent();

    public abstract zzbp component();

    public abstract Long latency();

    public abstract String latencyMeasurementProtoBase64String();

    public abstract zzbw loggableException();

    public abstract zzbq method();

    public abstract long timestamp();

    public static zzbr create(long j10, zzbp zzbpVar, zzbq zzbqVar) {
        return create(j10, zzbpVar, zzbqVar, (AdErrorEvent) null, (zzbw) null);
    }

    private static zzbr create(long j10, zzbp zzbpVar, zzbq zzbqVar, AdErrorEvent adErrorEvent, zzbw zzbwVar) {
        return new zzad(j10, zzbpVar, zzbqVar, adErrorEvent, zzbwVar, null, null);
    }

    public static zzbr create(long j10, zzbp zzbpVar, zzbq zzbqVar, String str) {
        return new zzad(j10, zzbpVar, zzbqVar, null, null, null, str);
    }

    public static zzbr create(long j10, zzbp zzbpVar, zzbq zzbqVar, long j11) {
        return new zzad(j10, zzbpVar, zzbqVar, null, null, Long.valueOf(j11), null);
    }

    public static zzbr create(long j10, zzbp zzbpVar, zzbq zzbqVar, Throwable th2) {
        return create(j10, zzbpVar, zzbqVar, (AdErrorEvent) null, zzbw.create(th2));
    }

    public static zzbr create(long j10, zzbp zzbpVar, zzbq zzbqVar, long j11, String str) {
        return new zzad(j10, zzbpVar, zzbqVar, null, null, Long.valueOf(j11), str);
    }
}
