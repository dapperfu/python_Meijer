package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class N00 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f69631a;

    public N00(Xj0 xj0) {
        this.f69631a = xj0;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f69631a.k0(new Callable() { // from class: com.google.android.gms.internal.ads.M00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bundle bundle = new Bundle();
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", Nc.v.s().c());
                return new O00(bundle);
            }
        });
    }
}
