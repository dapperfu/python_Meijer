package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzps;

@zzps(zza = zzaf.class)
/* loaded from: classes4.dex */
public abstract class zzby {
    public abstract int connectionTimeoutMs();

    public abstract String content();

    public abstract String id();

    public abstract int readTimeoutMs();

    public abstract zzbx requestType();

    public abstract String url();

    public abstract String userAgent();

    public static zzby create(zzbx zzbxVar, String str, String str2, String str3, String str4, int i10, int i11) {
        return new zzaf(zzbxVar, str, str2, str4, str3, i10, i11);
    }
}
