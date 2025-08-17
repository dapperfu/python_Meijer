package Td;

import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
final class Q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ N f34929a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Callable f34930b;

    Q(N n10, Callable callable) {
        this.f34929a = n10;
        this.f34930b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f34929a.v(this.f34930b.call());
        } catch (Exception e10) {
            this.f34929a.u(e10);
        } catch (Throwable th2) {
            this.f34929a.u(new RuntimeException(th2));
        }
    }
}
