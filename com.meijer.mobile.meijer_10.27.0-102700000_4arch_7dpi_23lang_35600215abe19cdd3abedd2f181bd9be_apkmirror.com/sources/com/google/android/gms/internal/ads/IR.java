package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes6.dex */
public final class IR implements HC {
    protected IR() {
    }

    @Override // com.google.android.gms.internal.ads.HC
    public final QH a(Looper looper, Handler.Callback callback) {
        return new C8749mT(new Handler(looper, callback));
    }

    @Override // com.google.android.gms.internal.ads.HC
    public final long zza() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.ads.HC
    public final long zzb() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.HC
    public final long zzc() {
        return System.nanoTime();
    }
}
