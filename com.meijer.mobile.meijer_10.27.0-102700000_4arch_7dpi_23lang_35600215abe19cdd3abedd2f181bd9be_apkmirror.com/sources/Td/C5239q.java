package Td;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: Td.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C5239q<T> implements r<T> {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f34937a = new CountDownLatch(1);

    public final void a() throws InterruptedException {
        this.f34937a.await();
    }

    public final boolean b(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f34937a.await(j10, timeUnit);
    }

    @Override // Td.InterfaceC5226d
    public final void onCanceled() {
        this.f34937a.countDown();
    }

    @Override // Td.InterfaceC5228f
    public final void onFailure(Exception exc) {
        this.f34937a.countDown();
    }

    @Override // Td.InterfaceC5229g
    public final void onSuccess(T t10) {
        this.f34937a.countDown();
    }

    /* synthetic */ C5239q(C5238p c5238p) {
    }
}
