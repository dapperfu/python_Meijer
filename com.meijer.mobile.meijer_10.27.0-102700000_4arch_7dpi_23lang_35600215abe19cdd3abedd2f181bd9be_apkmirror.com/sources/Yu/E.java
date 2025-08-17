package Yu;

import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class E<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<? extends io.reactivex.q<? extends T>> f40627a;

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        try {
            ((io.reactivex.q) Ru.b.e(this.f40627a.call(), "null ObservableSource supplied")).subscribe(sVar);
        } catch (Throwable th2) {
            Ou.a.b(th2);
            Qu.e.m(th2, sVar);
        }
    }

    public E(Callable<? extends io.reactivex.q<? extends T>> callable) {
        this.f40627a = callable;
    }
}
