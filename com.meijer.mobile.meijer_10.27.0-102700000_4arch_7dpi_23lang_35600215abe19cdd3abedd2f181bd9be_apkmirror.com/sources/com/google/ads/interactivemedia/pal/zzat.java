package com.google.ads.interactivemedia.pal;

import com.google.android.gms.common.internal.C6533o;
import com.google.android.gms.internal.pal.C10658e2;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzat {
    static final String zza = C6533o.a().b("play-services-pal");
    public static final int zzb;
    public static final int zzc;
    public static final C10658e2 zzd;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        zzb = (int) timeUnit.toMillis(20L);
        zzc = (int) timeUnit.toMillis(20L);
        zzd = C10658e2.a(150L);
    }
}
