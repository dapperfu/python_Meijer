package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.android.gms.internal.ads.xj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC10076xj0 extends Uj0 {

    /* renamed from: c, reason: collision with root package name */
    private final Executor f80680c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C10183yj0 f80681d;

    abstract void h(Object obj);

    AbstractC10076xj0(C10183yj0 c10183yj0, Executor executor) {
        this.f80681d = c10183yj0;
        executor.getClass();
        this.f80680c = executor;
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final void d(Throwable th2) {
        this.f80681d.f81106p = null;
        if (th2 instanceof ExecutionException) {
            this.f80681d.h(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            this.f80681d.cancel(false);
        } else {
            this.f80681d.h(th2);
        }
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final void e(Object obj) {
        this.f80681d.f81106p = null;
        h(obj);
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final boolean f() {
        return this.f80681d.isDone();
    }

    final void i() {
        try {
            this.f80680c.execute(this);
        } catch (RejectedExecutionException e10) {
            this.f80681d.h(e10);
        }
    }
}
