package Tu;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes9.dex */
public abstract class d<T> extends CountDownLatch implements io.reactivex.s<T>, Nu.b {

    /* renamed from: a, reason: collision with root package name */
    T f35451a;

    /* renamed from: b, reason: collision with root package name */
    Throwable f35452b;

    /* renamed from: c, reason: collision with root package name */
    Nu.b f35453c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f35454d;

    public d() {
        super(1);
    }

    @Override // Nu.b
    public final void dispose() {
        this.f35454d = true;
        Nu.b bVar = this.f35453c;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // Nu.b
    public final boolean isDisposed() {
        return this.f35454d;
    }

    @Override // io.reactivex.s
    public final void onSubscribe(Nu.b bVar) {
        this.f35453c = bVar;
        if (this.f35454d) {
            bVar.dispose();
        }
    }

    public final T a() throws InterruptedException {
        if (getCount() != 0) {
            try {
                ev.e.b();
                await();
            } catch (InterruptedException e10) {
                dispose();
                throw ev.j.d(e10);
            }
        }
        Throwable th2 = this.f35452b;
        if (th2 == null) {
            return this.f35451a;
        }
        throw ev.j.d(th2);
    }

    @Override // io.reactivex.s
    public final void onComplete() {
        countDown();
    }
}
