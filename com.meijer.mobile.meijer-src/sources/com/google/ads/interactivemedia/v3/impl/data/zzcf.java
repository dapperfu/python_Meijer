package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.VersionInfo;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignals;
import com.google.ads.interactivemedia.v3.internal.zzps;

@zzps(zza = zzao.class)
/* loaded from: classes4.dex */
public abstract class zzcf {
    public static zzcf createBy3rdPartyData(VersionInfo versionInfo, VersionInfo versionInfo2, String str, String str2) {
        return createBy3rdPartyData(zzcg.create(versionInfo), zzcg.create(versionInfo2), str, str2);
    }

    public abstract zzcg adapterVersion();

    public abstract Boolean isPublisherCreated();

    public abstract String name();

    public abstract zzcg sdkVersion();

    public abstract String signals();

    public static zzcf createBy1stPartyData(SecureSignals secureSignals) {
        return new zzao(null, null, "", secureSignals.getSecureSignal(), Boolean.TRUE);
    }

    public static zzcf createBy3rdPartyData(zzcg zzcgVar, zzcg zzcgVar2, String str, String str2) {
        return new zzao(zzcgVar, zzcgVar2, str, str2, Boolean.FALSE);
    }
}
