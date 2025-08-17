package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.VersionInfo;
import com.google.ads.interactivemedia.v3.internal.zzps;

@zzps(zza = zzap.class)
/* loaded from: classes4.dex */
public abstract class zzcg {
    public static zzcg create(int i10, int i11, int i12) {
        return new zzap(i10, i11, i12);
    }

    public abstract int major();

    public abstract int micro();

    public abstract int minor();

    public static zzcg create(VersionInfo versionInfo) {
        return create(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }
}
