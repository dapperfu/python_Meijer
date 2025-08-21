package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.nk0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9009nk0 extends Uj0 {

    /* renamed from: c, reason: collision with root package name */
    private final Callable f77967c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ RunnableFutureC9116ok0 f77968d;

    C9009nk0(RunnableFutureC9116ok0 runnableFutureC9116ok0, Callable callable) {
        this.f77968d = runnableFutureC9116ok0;
        callable.getClass();
        this.f77967c = callable;
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final Object a() throws Exception {
        return this.f77967c.call();
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final String b() {
        return this.f77967c.toString();
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final void d(Throwable th2) {
        this.f77968d.h(th2);
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final void e(Object obj) {
        this.f77968d.g(obj);
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final boolean f() {
        return this.f77968d.isDone();
    }
}
