package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzps;

@zzps(zza = zzaw.class)
/* loaded from: classes4.dex */
public abstract class zzcn {
    public static zzcn create(Integer num, boolean z10) {
        return new zzaw(num, z10);
    }

    public abstract Integer downloadBandwidthKbps();

    public abstract boolean rendersUiNatively();
}
