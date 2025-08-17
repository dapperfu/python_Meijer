package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.android.gms.internal.ads.ok0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableFutureC8991ok0 extends Bj0 implements RunnableFuture {

    /* renamed from: h, reason: collision with root package name */
    private volatile Uj0 f77417h;

    RunnableFutureC8991ok0(InterfaceC9309rj0 interfaceC9309rj0) {
        this.f77417h = new C8777mk0(this, interfaceC9309rj0);
    }

    RunnableFutureC8991ok0(Callable callable) {
        this.f77417h = new C8884nk0(this, callable);
    }

    static RunnableFutureC8991ok0 E(Runnable runnable, Object obj) {
        return new RunnableFutureC8991ok0(Executors.callable(runnable, obj));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7495aj0
    protected final String e() {
        Uj0 uj0 = this.f77417h;
        if (uj0 == null) {
            return super.e();
        }
        return "task=[" + uj0.toString() + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        Uj0 uj0 = this.f77417h;
        if (uj0 != null) {
            uj0.run();
        }
        this.f77417h = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7495aj0
    protected final void f() {
        Uj0 uj0;
        if (w() && (uj0 = this.f77417h) != null) {
            uj0.g();
        }
        this.f77417h = null;
    }
}
