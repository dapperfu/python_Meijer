package Uu;

import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class E<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<? extends io.reactivex.q<? extends T>> f37852a;

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        try {
            ((io.reactivex.q) Nu.b.e(this.f37852a.call(), "null ObservableSource supplied")).subscribe(sVar);
        } catch (Throwable th2) {
            Ku.a.b(th2);
            Mu.e.m(th2, sVar);
        }
    }

    public E(Callable<? extends io.reactivex.q<? extends T>> callable) {
        this.f37852a = callable;
    }
}
