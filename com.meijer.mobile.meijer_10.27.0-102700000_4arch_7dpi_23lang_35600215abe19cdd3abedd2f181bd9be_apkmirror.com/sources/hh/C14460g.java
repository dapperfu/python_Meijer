package hh;

import ih.C14724c;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* renamed from: hh.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C14460g implements InterfaceC14464k {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f134959a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14464k f134960b;

    /* renamed from: c, reason: collision with root package name */
    private final C14724c f134961c;

    /* renamed from: d, reason: collision with root package name */
    final Semaphore f134962d;

    private void k() throws InterruptedException {
        Semaphore semaphore = this.f134962d;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException e10) {
                throw new RejectedExecutionException("Thread interrupted while waiting for event thread semaphore", e10);
            }
        }
    }

    private void m(Throwable th2) {
        this.f134961c.n("Caught unexpected error from EventHandler: " + th2.toString());
        this.f134961c.b("Stack trace: {}", new C14470q(th2));
        n(th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(Throwable th2) {
        try {
            this.f134960b.onError(th2);
        } catch (Throwable th3) {
            this.f134961c.n("Caught unexpected error from EventHandler.onError(): " + th3.toString());
            this.f134961c.b("Stack trace: {}", new C14470q(th2));
        }
    }

    private void o() {
        Semaphore semaphore = this.f134962d;
        if (semaphore != null) {
            semaphore.release();
        }
    }

    @Override // hh.InterfaceC14464k
    public void a(final String str) throws Exception {
        l(new Runnable() { // from class: hh.f
            @Override // java.lang.Runnable
            public final void run() {
                C14460g.f(this.f134957a, str);
            }
        });
    }

    @Override // hh.InterfaceC14464k
    public void b() throws Exception {
        l(new Runnable() { // from class: hh.e
            @Override // java.lang.Runnable
            public final void run() {
                C14460g.e(this.f134956a);
            }
        });
    }

    @Override // hh.InterfaceC14464k
    public void c() throws Exception {
        l(new Runnable() { // from class: hh.a
            @Override // java.lang.Runnable
            public final void run() {
                C14460g.h(this.f134948a);
            }
        });
    }

    @Override // hh.InterfaceC14464k
    public void d(final String str, final C14471r c14471r) throws Exception {
        l(new Runnable() { // from class: hh.d
            @Override // java.lang.Runnable
            public final void run() {
                C14460g.i(this.f134953a, str, c14471r);
            }
        });
    }

    @Override // hh.InterfaceC14464k
    public void onError(final Throwable th2) throws Exception {
        l(new Runnable() { // from class: hh.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f134951a.n(th2);
            }
        });
    }

    C14460g(Executor executor, InterfaceC14464k interfaceC14464k, C14724c c14724c, Semaphore semaphore) {
        this.f134959a = executor;
        this.f134960b = interfaceC14464k;
        this.f134961c = c14724c;
        this.f134962d = semaphore;
    }

    public static /* synthetic */ void e(C14460g c14460g) {
        c14460g.getClass();
        try {
            c14460g.f134960b.b();
        } catch (Exception e10) {
            c14460g.m(e10);
        }
    }

    public static /* synthetic */ void f(C14460g c14460g, String str) {
        c14460g.getClass();
        try {
            c14460g.f134960b.a(str);
        } catch (Exception e10) {
            c14460g.m(e10);
        }
    }

    public static /* synthetic */ void g(C14460g c14460g, Runnable runnable) {
        c14460g.getClass();
        try {
            runnable.run();
        } finally {
            c14460g.o();
        }
    }

    public static /* synthetic */ void h(C14460g c14460g) {
        c14460g.getClass();
        try {
            c14460g.f134960b.c();
        } catch (Exception e10) {
            c14460g.m(e10);
        }
    }

    public static /* synthetic */ void i(C14460g c14460g, String str, C14471r c14471r) {
        c14460g.getClass();
        try {
            c14460g.f134960b.d(str, c14471r);
        } catch (Exception e10) {
            c14460g.m(e10);
        } finally {
            c14471r.a();
        }
    }

    private void l(final Runnable runnable) throws Exception {
        k();
        try {
            this.f134959a.execute(new Runnable() { // from class: hh.b
                @Override // java.lang.Runnable
                public final void run() {
                    C14460g.g(this.f134949a, runnable);
                }
            });
        } catch (Exception e10) {
            o();
            throw e10;
        }
    }
}
