package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes6.dex */
final class Zj0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Executor f73076a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7620aj0 f73077b;

    Zj0(Executor executor, AbstractC7620aj0 abstractC7620aj0) {
        this.f73076a = executor;
        this.f73077b = abstractC7620aj0;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f73076a.execute(runnable);
        } catch (RejectedExecutionException e10) {
            this.f73077b.h(e10);
        }
    }
}
