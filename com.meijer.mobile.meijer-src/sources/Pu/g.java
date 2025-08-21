package Pu;

import io.reactivex.w;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes10.dex */
public final class g<T> extends CountDownLatch implements w<T>, io.reactivex.c, io.reactivex.i<T> {

    /* renamed from: a, reason: collision with root package name */
    T f27227a;

    /* renamed from: b, reason: collision with root package name */
    Throwable f27228b;

    /* renamed from: c, reason: collision with root package name */
    Ju.b f27229c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f27230d;

    public g() {
        super(1);
    }

    void b() {
        this.f27230d = true;
        Ju.b bVar = this.f27229c;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
    public void onError(Throwable th2) {
        this.f27228b = th2;
        countDown();
    }

    @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
    public void onSubscribe(Ju.b bVar) {
        this.f27229c = bVar;
        if (this.f27230d) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.w, io.reactivex.i
    public void onSuccess(T t10) {
        this.f27227a = t10;
        countDown();
    }

    public T a() throws InterruptedException {
        if (getCount() != 0) {
            try {
                av.e.b();
                await();
            } catch (InterruptedException e10) {
                b();
                throw av.j.d(e10);
            }
        }
        Throwable th2 = this.f27228b;
        if (th2 == null) {
            return this.f27227a;
        }
        throw av.j.d(th2);
    }

    @Override // io.reactivex.c, io.reactivex.i
    public void onComplete() {
        countDown();
    }
}
