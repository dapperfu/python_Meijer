package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zzky {
    private final Map zza = new HashMap();

    public final AtomicReference zza(String str) {
        synchronized (this) {
            try {
                if (!this.zza.containsKey(str)) {
                    this.zza.put(str, new AtomicReference());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (AtomicReference) this.zza.get(str);
    }
}
