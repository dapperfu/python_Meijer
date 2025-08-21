package hh;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes8.dex */
class k {

    /* renamed from: e, reason: collision with root package name */
    private static k f135515e;

    /* renamed from: a, reason: collision with root package name */
    private Handler f135516a;

    /* renamed from: b, reason: collision with root package name */
    private HandlerThread f135517b;

    /* renamed from: c, reason: collision with root package name */
    private int f135518c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final Object f135519d = new Object();

    private void a() {
        synchronized (this.f135519d) {
            try {
                if (this.f135516a == null) {
                    if (this.f135518c <= 0) {
                        throw new IllegalStateException("CameraThread is not open");
                    }
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f135517b = handlerThread;
                    handlerThread.start();
                    this.f135516a = new Handler(this.f135517b.getLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static k d() {
        if (f135515e == null) {
            f135515e = new k();
        }
        return f135515e;
    }

    private void f() {
        synchronized (this.f135519d) {
            this.f135517b.quit();
            this.f135517b = null;
            this.f135516a = null;
        }
    }

    protected void b() {
        synchronized (this.f135519d) {
            try {
                int i10 = this.f135518c - 1;
                this.f135518c = i10;
                if (i10 == 0) {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected void c(Runnable runnable) {
        synchronized (this.f135519d) {
            a();
            this.f135516a.post(runnable);
        }
    }

    protected void e(Runnable runnable) {
        synchronized (this.f135519d) {
            this.f135518c++;
            c(runnable);
        }
    }

    private k() {
    }
}
