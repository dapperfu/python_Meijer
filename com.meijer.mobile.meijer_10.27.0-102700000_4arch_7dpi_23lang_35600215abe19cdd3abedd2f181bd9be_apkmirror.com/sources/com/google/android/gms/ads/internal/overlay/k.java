package com.google.android.gms.ads.internal.overlay;

import Lc.v;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
final class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final long f64634a;

    k(long j10) {
        this.f64634a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (AdOverlayInfoParcel.f64566z.remove(Long.valueOf(this.f64634a)) == null) {
            return null;
        }
        v.s().x(new Exception("Key was non-null in AdOverlayObjectsCleanupTask"), "AdOverlayObjectsCleanupTask");
        return null;
    }
}
