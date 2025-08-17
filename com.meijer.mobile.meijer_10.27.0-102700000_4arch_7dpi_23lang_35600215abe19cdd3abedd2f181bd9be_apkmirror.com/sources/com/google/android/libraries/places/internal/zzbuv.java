package com.google.android.libraries.places.internal;

import java.util.concurrent.Future;

/* loaded from: classes6.dex */
final class zzbuv {
    final Object zza;
    Future zzb;
    boolean zzc;

    zzbuv(Object obj) {
        this.zza = obj;
    }

    final Future zzb() {
        this.zzc = true;
        return this.zzb;
    }

    final void zza(Future future) {
        boolean z10;
        synchronized (this.zza) {
            try {
                z10 = this.zzc;
                if (!z10) {
                    this.zzb = future;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            future.cancel(false);
        }
    }
}
