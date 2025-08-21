package ih;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import jh.C15034c;

/* renamed from: ih.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C14740g implements InterfaceC14744k {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f137599a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14744k f137600b;

    /* renamed from: c, reason: collision with root package name */
    private final C15034c f137601c;

    /* renamed from: d, reason: collision with root package name */
    final Semaphore f137602d;

    private void k() throws InterruptedException {
        Semaphore semaphore = this.f137602d;
        if (semaphore != null) {
            try {
                semaphore.acquire();
            } catch (InterruptedException e10) {
                throw new RejectedExecutionException("Thread interrupted while waiting for event thread semaphore", e10);
            }
        }
    }

    private void m(Throwable th2) {
        this.f137601c.n("Caught unexpected error from EventHandler: " + th2.toString());
        this.f137601c.b("Stack trace: {}", new C14750q(th2));
        n(th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(Throwable th2) {
        try {
            this.f137600b.onError(th2);
        } catch (Throwable th3) {
            this.f137601c.n("Caught unexpected error from EventHandler.onError(): " + th3.toString());
            this.f137601c.b("Stack trace: {}", new C14750q(th2));
        }
    }

    private void o() {
        Semaphore semaphore = this.f137602d;
        if (semaphore != null) {
            semaphore.release();
        }
    }

    @Override // ih.InterfaceC14744k
    public void a(final String str) throws Exception {
        l(new Runnable() { // from class: ih.f
            @Override // java.lang.Runnable
            public final void run() {
                C14740g.f(this.f137597a, str);
            }
        });
    }

    @Override // ih.InterfaceC14744k
    public void b(final String str, final C14751r c14751r) throws Exception {
        l(new Runnable() { // from class: ih.d
            @Override // java.lang.Runnable
            public final void run() {
                C14740g.i(this.f137593a, str, c14751r);
            }
        });
    }

    @Override // ih.InterfaceC14744k
    public void c() throws Exception {
        l(new Runnable() { // from class: ih.e
            @Override // java.lang.Runnable
            public final void run() {
                C14740g.e(this.f137596a);
            }
        });
    }

    @Override // ih.InterfaceC14744k
    public void d() throws Exception {
        l(new Runnable() { // from class: ih.a
            @Override // java.lang.Runnable
            public final void run() {
                C14740g.h(this.f137588a);
            }
        });
    }

    @Override // ih.InterfaceC14744k
    public void onError(final Throwable th2) throws Exception {
        l(new Runnable() { // from class: ih.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f137591a.n(th2);
            }
        });
    }

    C14740g(Executor executor, InterfaceC14744k interfaceC14744k, C15034c c15034c, Semaphore semaphore) {
        this.f137599a = executor;
        this.f137600b = interfaceC14744k;
        this.f137601c = c15034c;
        this.f137602d = semaphore;
    }

    public static /* synthetic */ void e(C14740g c14740g) {
        c14740g.getClass();
        try {
            c14740g.f137600b.c();
        } catch (Exception e10) {
            c14740g.m(e10);
        }
    }

    public static /* synthetic */ void f(C14740g c14740g, String str) {
        c14740g.getClass();
        try {
            c14740g.f137600b.a(str);
        } catch (Exception e10) {
            c14740g.m(e10);
        }
    }

    public static /* synthetic */ void g(C14740g c14740g, Runnable runnable) {
        c14740g.getClass();
        try {
            runnable.run();
        } finally {
            c14740g.o();
        }
    }

    public static /* synthetic */ void h(C14740g c14740g) {
        c14740g.getClass();
        try {
            c14740g.f137600b.d();
        } catch (Exception e10) {
            c14740g.m(e10);
        }
    }

    public static /* synthetic */ void i(C14740g c14740g, String str, C14751r c14751r) {
        c14740g.getClass();
        try {
            c14740g.f137600b.b(str, c14751r);
        } catch (Exception e10) {
            c14740g.m(e10);
        } finally {
            c14751r.a();
        }
    }

    private void l(final Runnable runnable) throws Exception {
        k();
        try {
            this.f137599a.execute(new Runnable() { // from class: ih.b
                @Override // java.lang.Runnable
                public final void run() {
                    C14740g.g(this.f137589a, runnable);
                }
            });
        } catch (Exception e10) {
            o();
            throw e10;
        }
    }
}
