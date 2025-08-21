package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzps;
import com.google.ads.interactivemedia.v3.internal.zzqo;

@zzps(zza = zzae.class)
/* loaded from: classes4.dex */
public abstract class zzbw {
    static zzbw create(String str, String str2, String str3) {
        return new zzae(str, str2, str3);
    }

    public abstract String message();

    public abstract String name();

    public abstract String stackTrace();

    public static zzbw create(Throwable th2) {
        return new zzae(th2.getClass().getName(), th2.getMessage(), zzqo.zza(th2));
    }
}
