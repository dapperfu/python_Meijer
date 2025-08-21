package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class KY implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f68950a;

    /* renamed from: b, reason: collision with root package name */
    private final Sc.a f68951b;

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 54;
    }

    final /* synthetic */ LY a() throws Exception {
        return LY.a(this.f68951b);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f68950a.k0(new Callable() { // from class: com.google.android.gms.internal.ads.JY
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f68774a.a();
            }
        });
    }

    KY(Sc.a aVar, Xj0 xj0) {
        this.f68951b = aVar;
        this.f68950a = xj0;
    }
}
