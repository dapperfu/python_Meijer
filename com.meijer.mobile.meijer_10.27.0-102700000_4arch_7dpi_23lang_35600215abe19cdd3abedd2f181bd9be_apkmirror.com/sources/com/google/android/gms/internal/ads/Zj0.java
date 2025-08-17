package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes6.dex */
final class Zj0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Executor f72236a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7495aj0 f72237b;

    Zj0(Executor executor, AbstractC7495aj0 abstractC7495aj0) {
        this.f72236a = executor;
        this.f72237b = abstractC7495aj0;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f72236a.execute(runnable);
        } catch (RejectedExecutionException e10) {
            this.f72237b.h(e10);
        }
    }
}
