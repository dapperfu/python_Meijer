package Yu;

import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class U<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<? extends Throwable> f41025a;

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        try {
            th = (Throwable) Ru.b.e(this.f41025a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            Ou.a.b(th);
        }
        Qu.e.m(th, sVar);
    }

    public U(Callable<? extends Throwable> callable) {
        this.f41025a = callable;
    }
}
