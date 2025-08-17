package com.launchdarkly.sdk.android;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import ih.C14724c;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.launchdarkly.sdk.android.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11543d implements v0 {

    /* renamed from: a, reason: collision with root package name */
    private final Application f91198a;

    /* renamed from: c, reason: collision with root package name */
    private final C14724c f91200c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f91201d = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: b, reason: collision with root package name */
    private final Handler f91199b = new Handler(Looper.getMainLooper());

    /* renamed from: com.launchdarkly.sdk.android.d$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f91202a;

        a(Runnable runnable) {
            this.f91202a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            C11543d.this.b(this.f91202a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Runnable runnable) {
        if (runnable != null) {
            try {
                runnable.run();
            } catch (RuntimeException e10) {
                i0.c(this.f91200c, e10, "Unexpected exception from asynchronous task", new Object[0]);
            }
        }
    }

    private Runnable c(Runnable runnable) {
        return new a(runnable);
    }

    @Override // com.launchdarkly.sdk.android.v0
    public ScheduledFuture<?> A0(Runnable runnable, long j10, long j11) {
        return this.f91201d.scheduleAtFixedRate(c(runnable), j10, j11, TimeUnit.MILLISECONDS);
    }

    @Override // com.launchdarkly.sdk.android.v0
    public ScheduledFuture<?> V2(Runnable runnable, long j10) {
        return this.f91201d.schedule(c(runnable), j10, TimeUnit.MILLISECONDS);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f91201d.shutdownNow();
    }

    C11543d(Application application, C14724c c14724c) {
        this.f91198a = application;
        this.f91200c = c14724c;
    }

    @Override // com.launchdarkly.sdk.android.v0
    public void u2(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b(runnable);
        } else {
            this.f91199b.post(c(runnable));
        }
    }
}
