package Uu;

import cv.C13558a;
import java.util.concurrent.Callable;

/* renamed from: Uu.d0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC5385d0<T> extends io.reactivex.l<T> implements Callable<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<? extends T> f38430a;

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return (T) Nu.b.e(this.f38430a.call(), "The callable returned a null value");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        Pu.k kVar = new Pu.k(sVar);
        sVar.onSubscribe(kVar);
        if (kVar.isDisposed()) {
            return;
        }
        try {
            kVar.c(Nu.b.e(this.f38430a.call(), "Callable returned null"));
        } catch (Throwable th2) {
            Ku.a.b(th2);
            if (kVar.isDisposed()) {
                C13558a.s(th2);
            } else {
                sVar.onError(th2);
            }
        }
    }

    public CallableC5385d0(Callable<? extends T> callable) {
        this.f38430a = callable;
    }
}
