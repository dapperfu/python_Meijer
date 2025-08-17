package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.zztg;

/* loaded from: classes4.dex */
final class zzuz extends zztg.zzi implements Runnable {
    private final Runnable zza;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th2) {
            zzd(th2);
            throw th2;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zztg
    protected final String zza() {
        return "task=[" + this.zza.toString() + "]";
    }

    public zzuz(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }
}
