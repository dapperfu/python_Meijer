package com.google.android.libraries.places.internal;

import De.p;

/* loaded from: classes6.dex */
public final class zzbhn {
    private final String zza;
    private final Object zzb;

    private zzbhn(String str, Object obj) {
        this.zza = str;
        this.zzb = obj;
    }

    public final String toString() {
        return this.zza;
    }

    final /* synthetic */ Object zzc() {
        return this.zzb;
    }

    public static zzbhn zza(String str) {
        p.r("internal:health-check-consumer-listener", "debugString");
        return new zzbhn("internal:health-check-consumer-listener", null);
    }

    public static zzbhn zzb(String str, Object obj) {
        p.r("internal:disable-subchannel-reconnect", "debugString");
        return new zzbhn("internal:disable-subchannel-reconnect", obj);
    }
}
