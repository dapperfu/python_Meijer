package qf;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import nf.InterfaceC15938a;

/* loaded from: classes8.dex */
class D implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final a f158278a;

    /* renamed from: b, reason: collision with root package name */
    private final yf.j f158279b;

    /* renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f158280c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC15938a f158281d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f158282e = new AtomicBoolean(false);

    interface a {
        void a(yf.j jVar, Thread thread, Throwable th2);
    }

    private boolean b(Thread thread, Throwable th2) {
        if (thread == null) {
            nf.g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th2 == null) {
            nf.g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f158281d.b()) {
            return true;
        }
        nf.g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    boolean a() {
        return this.f158282e.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        this.f158282e.set(true);
        try {
            try {
                if (b(thread, th2)) {
                    this.f158278a.a(this.f158279b, thread, th2);
                } else {
                    nf.g.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e10) {
                nf.g.f().e("An error occurred in the uncaught exception handler", e10);
                if (this.f158280c != null) {
                }
            }
            if (this.f158280c != null) {
                nf.g.f().b("Completed exception processing. Invoking default exception handler.");
                this.f158280c.uncaughtException(thread, th2);
            } else {
                nf.g.f().b("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f158282e.set(false);
        } catch (Throwable th3) {
            if (this.f158280c != null) {
                nf.g.f().b("Completed exception processing. Invoking default exception handler.");
                this.f158280c.uncaughtException(thread, th2);
            } else {
                nf.g.f().b("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f158282e.set(false);
            throw th3;
        }
    }

    public D(a aVar, yf.j jVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC15938a interfaceC15938a) {
        this.f158278a = aVar;
        this.f158279b = jVar;
        this.f158280c = uncaughtExceptionHandler;
        this.f158281d = interfaceC15938a;
    }
}
