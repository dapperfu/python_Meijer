package gh;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes7.dex */
class k {

    /* renamed from: e, reason: collision with root package name */
    private static k f133449e;

    /* renamed from: a, reason: collision with root package name */
    private Handler f133450a;

    /* renamed from: b, reason: collision with root package name */
    private HandlerThread f133451b;

    /* renamed from: c, reason: collision with root package name */
    private int f133452c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final Object f133453d = new Object();

    private void a() {
        synchronized (this.f133453d) {
            try {
                if (this.f133450a == null) {
                    if (this.f133452c <= 0) {
                        throw new IllegalStateException("CameraThread is not open");
                    }
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f133451b = handlerThread;
                    handlerThread.start();
                    this.f133450a = new Handler(this.f133451b.getLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static k d() {
        if (f133449e == null) {
            f133449e = new k();
        }
        return f133449e;
    }

    private void f() {
        synchronized (this.f133453d) {
            this.f133451b.quit();
            this.f133451b = null;
            this.f133450a = null;
        }
    }

    protected void b() {
        synchronized (this.f133453d) {
            try {
                int i10 = this.f133452c - 1;
                this.f133452c = i10;
                if (i10 == 0) {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected void c(Runnable runnable) {
        synchronized (this.f133453d) {
            a();
            this.f133450a.post(runnable);
        }
    }

    protected void e(Runnable runnable) {
        synchronized (this.f133453d) {
            this.f133452c++;
            c(runnable);
        }
    }

    private k() {
    }
}
