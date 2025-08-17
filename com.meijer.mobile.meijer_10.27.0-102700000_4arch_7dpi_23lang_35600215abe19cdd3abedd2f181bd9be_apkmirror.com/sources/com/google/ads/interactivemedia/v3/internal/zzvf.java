package com.google.ads.interactivemedia.v3.internal;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class zzvf {
    private String zza = null;

    public final zzvf zza(String str) {
        String.format(Locale.ROOT, "imasdk-%d", 0);
        this.zza = "imasdk-%d";
        return this;
    }

    public final ThreadFactory zzb() {
        String str = this.zza;
        return new zzve(Executors.defaultThreadFactory(), str, str != null ? new AtomicLong(0L) : null, null, null, null);
    }
}
