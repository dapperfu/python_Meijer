package com.scandit.datacapture.core.internal.module.source.api2;

import android.os.Handler;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class B implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f125782a;

    public B(Handler handler) {
        Intrinsics.j(handler, "handler");
        this.f125782a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable != null) {
            this.f125782a.post(runnable);
        }
    }
}
