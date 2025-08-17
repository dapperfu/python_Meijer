package com.scandit.datacapture.core.internal.module.source.api2;

import android.os.Handler;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class B implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f124830a;

    public B(Handler handler) {
        Intrinsics.j(handler, "handler");
        this.f124830a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable != null) {
            this.f124830a.post(runnable);
        }
    }
}
