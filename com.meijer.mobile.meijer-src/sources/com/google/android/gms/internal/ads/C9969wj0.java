package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.wj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9969wj0 extends AbstractC10076xj0 {

    /* renamed from: e, reason: collision with root package name */
    private final Callable f80360e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10183yj0 f80361f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9969wj0(C10183yj0 c10183yj0, Callable callable, Executor executor) {
        super(c10183yj0, executor);
        this.f80361f = c10183yj0;
        this.f80360e = callable;
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final Object a() throws Exception {
        return this.f80360e.call();
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final String b() {
        return this.f80360e.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10076xj0
    final void h(Object obj) {
        this.f80361f.g(obj);
    }
}
