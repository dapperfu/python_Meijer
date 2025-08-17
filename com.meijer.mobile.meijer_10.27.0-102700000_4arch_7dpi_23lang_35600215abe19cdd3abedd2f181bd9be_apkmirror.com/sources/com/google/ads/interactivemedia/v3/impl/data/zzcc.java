package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.v3.internal.zzps;

@zzps(zza = zzam.class)
/* loaded from: classes4.dex */
public abstract class zzcc {
    public static zzcb builder() {
        return new zzak();
    }

    abstract boolean attached();

    abstract zzbb bounds();

    abstract String detailedReason();

    abstract boolean hidden();

    abstract FriendlyObstructionPurpose purpose();

    abstract String type();
}
