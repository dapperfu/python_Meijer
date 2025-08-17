package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzps;

@zzps(zza = zzaq.class)
/* loaded from: classes4.dex */
public abstract class zzch {
    public abstract Integer height();

    public abstract Integer width();

    public static zzch create(Integer num, Integer num2) {
        return new zzaq(num, num2);
    }
}
