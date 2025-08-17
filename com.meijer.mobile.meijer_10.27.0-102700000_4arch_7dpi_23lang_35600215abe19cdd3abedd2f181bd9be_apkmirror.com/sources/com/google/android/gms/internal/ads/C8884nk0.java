package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.nk0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8884nk0 extends Uj0 {

    /* renamed from: c, reason: collision with root package name */
    private final Callable f77127c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ RunnableFutureC8991ok0 f77128d;

    C8884nk0(RunnableFutureC8991ok0 runnableFutureC8991ok0, Callable callable) {
        this.f77128d = runnableFutureC8991ok0;
        callable.getClass();
        this.f77127c = callable;
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final Object a() throws Exception {
        return this.f77127c.call();
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final String b() {
        return this.f77127c.toString();
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final void d(Throwable th2) {
        this.f77128d.h(th2);
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final void e(Object obj) {
        this.f77128d.g(obj);
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final boolean f() {
        return this.f77128d.isDone();
    }
}
