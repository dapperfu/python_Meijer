package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class M6 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Handler f68527a;

    M6(O6 o62, Handler handler) {
        this.f68527a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f68527a.post(runnable);
    }
}
