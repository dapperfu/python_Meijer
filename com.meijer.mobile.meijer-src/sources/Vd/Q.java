package Vd;

import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
final class Q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ N f39862a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Callable f39863b;

    Q(N n10, Callable callable) {
        this.f39862a = n10;
        this.f39863b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f39862a.v(this.f39863b.call());
        } catch (Exception e10) {
            this.f39862a.u(e10);
        } catch (Throwable th2) {
            this.f39862a.u(new RuntimeException(th2));
        }
    }
}
