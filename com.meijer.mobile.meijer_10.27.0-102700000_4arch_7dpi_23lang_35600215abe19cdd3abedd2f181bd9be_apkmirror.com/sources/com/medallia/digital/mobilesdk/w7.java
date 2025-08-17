package com.medallia.digital.mobilesdk;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes7.dex */
final class w7 {

    /* renamed from: c, reason: collision with root package name */
    private static w7 f93221c;

    /* renamed from: a, reason: collision with root package name */
    private final Executor f93222a = Executors.newSingleThreadExecutor();

    /* renamed from: b, reason: collision with root package name */
    private final Executor f93223b = new b();

    private static class b implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f93224a;

        private b() {
            this.f93224a = new Handler(Looper.getMainLooper());
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f93224a.post(runnable);
        }
    }

    private w7() {
    }

    static w7 b() {
        if (f93221c == null) {
            f93221c = new w7();
        }
        return f93221c;
    }

    protected Executor a() {
        return this.f93222a;
    }

    protected Executor c() {
        return this.f93223b;
    }
}
