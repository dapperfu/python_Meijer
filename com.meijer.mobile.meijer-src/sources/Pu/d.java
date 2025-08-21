package Pu;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes10.dex */
public abstract class d<T> extends CountDownLatch implements io.reactivex.s<T>, Ju.b {

    /* renamed from: a, reason: collision with root package name */
    T f27223a;

    /* renamed from: b, reason: collision with root package name */
    Throwable f27224b;

    /* renamed from: c, reason: collision with root package name */
    Ju.b f27225c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f27226d;

    public d() {
        super(1);
    }

    @Override // Ju.b
    public final void dispose() {
        this.f27226d = true;
        Ju.b bVar = this.f27225c;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // Ju.b
    public final boolean isDisposed() {
        return this.f27226d;
    }

    @Override // io.reactivex.s
    public final void onSubscribe(Ju.b bVar) {
        this.f27225c = bVar;
        if (this.f27226d) {
            bVar.dispose();
        }
    }

    public final T a() throws InterruptedException {
        if (getCount() != 0) {
            try {
                av.e.b();
                await();
            } catch (InterruptedException e10) {
                dispose();
                throw av.j.d(e10);
            }
        }
        Throwable th2 = this.f27224b;
        if (th2 == null) {
            return this.f27223a;
        }
        throw av.j.d(th2);
    }

    @Override // io.reactivex.s
    public final void onComplete() {
        countDown();
    }
}
