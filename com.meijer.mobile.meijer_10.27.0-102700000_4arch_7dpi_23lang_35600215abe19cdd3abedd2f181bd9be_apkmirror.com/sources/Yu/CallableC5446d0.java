package Yu;

import gv.C14313a;
import java.util.concurrent.Callable;

/* renamed from: Yu.d0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class CallableC5446d0<T> extends io.reactivex.l<T> implements Callable<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<? extends T> f41205a;

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return (T) Ru.b.e(this.f41205a.call(), "The callable returned a null value");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        Tu.k kVar = new Tu.k(sVar);
        sVar.onSubscribe(kVar);
        if (kVar.isDisposed()) {
            return;
        }
        try {
            kVar.c(Ru.b.e(this.f41205a.call(), "Callable returned null"));
        } catch (Throwable th2) {
            Ou.a.b(th2);
            if (kVar.isDisposed()) {
                C14313a.s(th2);
            } else {
                sVar.onError(th2);
            }
        }
    }

    public CallableC5446d0(Callable<? extends T> callable) {
        this.f41205a = callable;
    }
}
