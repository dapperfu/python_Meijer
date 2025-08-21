package com.medallia.digital.mobilesdk;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes8.dex */
final class w7 {

    /* renamed from: c, reason: collision with root package name */
    private static w7 f94060c;

    /* renamed from: a, reason: collision with root package name */
    private final Executor f94061a = Executors.newSingleThreadExecutor();

    /* renamed from: b, reason: collision with root package name */
    private final Executor f94062b = new b();

    private static class b implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f94063a;

        private b() {
            this.f94063a = new Handler(Looper.getMainLooper());
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f94063a.post(runnable);
        }
    }

    private w7() {
    }

    static w7 b() {
        if (f94060c == null) {
            f94060c = new w7();
        }
        return f94060c;
    }

    protected Executor a() {
        return this.f94061a;
    }

    protected Executor c() {
        return this.f94062b;
    }
}
