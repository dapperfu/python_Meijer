package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.android.gms.internal.ads.xj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC9951xj0 extends Uj0 {

    /* renamed from: c, reason: collision with root package name */
    private final Executor f79840c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C10058yj0 f79841d;

    abstract void h(Object obj);

    AbstractC9951xj0(C10058yj0 c10058yj0, Executor executor) {
        this.f79841d = c10058yj0;
        executor.getClass();
        this.f79840c = executor;
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final void d(Throwable th2) {
        this.f79841d.f80266p = null;
        if (th2 instanceof ExecutionException) {
            this.f79841d.h(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            this.f79841d.cancel(false);
        } else {
            this.f79841d.h(th2);
        }
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final void e(Object obj) {
        this.f79841d.f80266p = null;
        h(obj);
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final boolean f() {
        return this.f79841d.isDone();
    }

    final void i() {
        try {
            this.f79840c.execute(this);
        } catch (RejectedExecutionException e10) {
            this.f79841d.h(e10);
        }
    }
}
