package com.google.android.gms.ads.internal.overlay;

import Nc.v;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
final class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final long f65474a;

    k(long j10) {
        this.f65474a = j10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (AdOverlayInfoParcel.f65406z.remove(Long.valueOf(this.f65474a)) == null) {
            return null;
        }
        v.s().x(new Exception("Key was non-null in AdOverlayObjectsCleanupTask"), "AdOverlayObjectsCleanupTask");
        return null;
    }
}
