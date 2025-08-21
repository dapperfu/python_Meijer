package com.google.ads.interactivemedia.v3.internal;

import java.util.logging.Logger;

/* loaded from: classes4.dex */
final class zzut {
    private final zzqp zza = new zzqp();
    private final String zzb;
    private volatile Logger zzc;

    final Logger zza() {
        Logger logger = this.zzc;
        if (logger != null) {
            return logger;
        }
        synchronized (this.zza) {
            try {
                Logger logger2 = this.zzc;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.zzb);
                this.zzc = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    zzut(Class cls) {
        this.zzb = cls.getName();
    }
}
