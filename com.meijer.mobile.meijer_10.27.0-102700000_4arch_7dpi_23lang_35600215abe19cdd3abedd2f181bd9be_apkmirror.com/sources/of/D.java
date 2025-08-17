package of;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.InterfaceC15404a;

/* loaded from: classes7.dex */
class D implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final a f153426a;

    /* renamed from: b, reason: collision with root package name */
    private final wf.j f153427b;

    /* renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f153428c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC15404a f153429d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f153430e = new AtomicBoolean(false);

    interface a {
        void a(wf.j jVar, Thread thread, Throwable th2);
    }

    private boolean b(Thread thread, Throwable th2) {
        if (thread == null) {
            lf.g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th2 == null) {
            lf.g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f153429d.b()) {
            return true;
        }
        lf.g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    boolean a() {
        return this.f153430e.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        this.f153430e.set(true);
        try {
            try {
                if (b(thread, th2)) {
                    this.f153426a.a(this.f153427b, thread, th2);
                } else {
                    lf.g.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e10) {
                lf.g.f().e("An error occurred in the uncaught exception handler", e10);
                if (this.f153428c != null) {
                }
            }
            if (this.f153428c != null) {
                lf.g.f().b("Completed exception processing. Invoking default exception handler.");
                this.f153428c.uncaughtException(thread, th2);
            } else {
                lf.g.f().b("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f153430e.set(false);
        } catch (Throwable th3) {
            if (this.f153428c != null) {
                lf.g.f().b("Completed exception processing. Invoking default exception handler.");
                this.f153428c.uncaughtException(thread, th2);
            } else {
                lf.g.f().b("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f153430e.set(false);
            throw th3;
        }
    }

    public D(a aVar, wf.j jVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC15404a interfaceC15404a) {
        this.f153426a = aVar;
        this.f153427b = jVar;
        this.f153428c = uncaughtExceptionHandler;
        this.f153429d = interfaceC15404a;
    }
}
