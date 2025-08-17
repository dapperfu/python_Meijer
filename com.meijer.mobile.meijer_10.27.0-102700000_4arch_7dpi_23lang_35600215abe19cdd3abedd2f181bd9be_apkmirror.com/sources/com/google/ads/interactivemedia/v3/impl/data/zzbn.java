package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzps;

@zzps(zza = zzac.class)
/* loaded from: classes4.dex */
public abstract class zzbn {
    public abstract String adsIdentityToken();

    public abstract String appSetId();

    public abstract int appSetIdScope();

    public abstract String deviceId();

    public abstract String idType();

    public abstract boolean isLimitedAdTracking();

    public static zzbn create(String str, String str2, boolean z10, String str3, int i10, String str4) {
        return new zzac(str, str2, z10, str3, i10, str4);
    }
}
