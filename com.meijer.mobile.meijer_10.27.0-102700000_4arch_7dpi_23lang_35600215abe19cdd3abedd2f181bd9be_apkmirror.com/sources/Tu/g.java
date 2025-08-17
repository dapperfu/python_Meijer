package Tu;

import io.reactivex.w;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes9.dex */
public final class g<T> extends CountDownLatch implements w<T>, io.reactivex.c, io.reactivex.i<T> {

    /* renamed from: a, reason: collision with root package name */
    T f35455a;

    /* renamed from: b, reason: collision with root package name */
    Throwable f35456b;

    /* renamed from: c, reason: collision with root package name */
    Nu.b f35457c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f35458d;

    public g() {
        super(1);
    }

    void b() {
        this.f35458d = true;
        Nu.b bVar = this.f35457c;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
    public void onError(Throwable th2) {
        this.f35456b = th2;
        countDown();
    }

    @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
    public void onSubscribe(Nu.b bVar) {
        this.f35457c = bVar;
        if (this.f35458d) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.w, io.reactivex.i
    public void onSuccess(T t10) {
        this.f35455a = t10;
        countDown();
    }

    public T a() throws InterruptedException {
        if (getCount() != 0) {
            try {
                ev.e.b();
                await();
            } catch (InterruptedException e10) {
                b();
                throw ev.j.d(e10);
            }
        }
        Throwable th2 = this.f35456b;
        if (th2 == null) {
            return this.f35455a;
        }
        throw ev.j.d(th2);
    }

    @Override // io.reactivex.c, io.reactivex.i
    public void onComplete() {
        countDown();
    }
}
