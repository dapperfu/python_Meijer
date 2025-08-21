package Vd;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: Vd.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C5523q<T> implements r<T> {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f39870a = new CountDownLatch(1);

    public final void a() throws InterruptedException {
        this.f39870a.await();
    }

    public final boolean b(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f39870a.await(j10, timeUnit);
    }

    @Override // Vd.InterfaceC5510d
    public final void onCanceled() {
        this.f39870a.countDown();
    }

    @Override // Vd.InterfaceC5512f
    public final void onFailure(Exception exc) {
        this.f39870a.countDown();
    }

    @Override // Vd.InterfaceC5513g
    public final void onSuccess(T t10) {
        this.f39870a.countDown();
    }

    /* synthetic */ C5523q(C5522p c5522p) {
    }
}
