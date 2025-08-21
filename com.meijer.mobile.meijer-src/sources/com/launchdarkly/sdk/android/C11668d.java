package com.launchdarkly.sdk.android;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import jh.C15034c;

/* renamed from: com.launchdarkly.sdk.android.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11668d implements v0 {

    /* renamed from: a, reason: collision with root package name */
    private final Application f92037a;

    /* renamed from: c, reason: collision with root package name */
    private final C15034c f92039c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f92040d = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: b, reason: collision with root package name */
    private final Handler f92038b = new Handler(Looper.getMainLooper());

    /* renamed from: com.launchdarkly.sdk.android.d$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f92041a;

        a(Runnable runnable) {
            this.f92041a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11668d.this.b(this.f92041a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Runnable runnable) {
        if (runnable != null) {
            try {
                runnable.run();
            } catch (RuntimeException e10) {
                i0.c(this.f92039c, e10, "Unexpected exception from asynchronous task", new Object[0]);
            }
        }
    }

    private Runnable c(Runnable runnable) {
        return new a(runnable);
    }

    @Override // com.launchdarkly.sdk.android.v0
    public ScheduledFuture<?> V2(Runnable runnable, long j10) {
        return this.f92040d.schedule(c(runnable), j10, TimeUnit.MILLISECONDS);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f92040d.shutdownNow();
    }

    @Override // com.launchdarkly.sdk.android.v0
    public ScheduledFuture<?> y0(Runnable runnable, long j10, long j11) {
        return this.f92040d.scheduleAtFixedRate(c(runnable), j10, j11, TimeUnit.MILLISECONDS);
    }

    C11668d(Application application, C15034c c15034c) {
        this.f92037a = application;
        this.f92039c = c15034c;
    }

    @Override // com.launchdarkly.sdk.android.v0
    public void s2(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b(runnable);
        } else {
            this.f92038b.post(c(runnable));
        }
    }
}
