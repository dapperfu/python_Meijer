package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* renamed from: com.google.android.gms.internal.ads.ok0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableFutureC9116ok0 extends Bj0 implements RunnableFuture {

    /* renamed from: h, reason: collision with root package name */
    private volatile Uj0 f78257h;

    RunnableFutureC9116ok0(InterfaceC9434rj0 interfaceC9434rj0) {
        this.f78257h = new C8902mk0(this, interfaceC9434rj0);
    }

    RunnableFutureC9116ok0(Callable callable) {
        this.f78257h = new C9009nk0(this, callable);
    }

    static RunnableFutureC9116ok0 E(Runnable runnable, Object obj) {
        return new RunnableFutureC9116ok0(Executors.callable(runnable, obj));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7620aj0
    protected final String e() {
        Uj0 uj0 = this.f78257h;
        if (uj0 == null) {
            return super.e();
        }
        return "task=[" + uj0.toString() + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        Uj0 uj0 = this.f78257h;
        if (uj0 != null) {
            uj0.run();
        }
        this.f78257h = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7620aj0
    protected final void f() {
        Uj0 uj0;
        if (w() && (uj0 = this.f78257h) != null) {
            uj0.g();
        }
        this.f78257h = null;
    }
}
