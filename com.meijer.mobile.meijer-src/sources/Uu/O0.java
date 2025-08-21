package Uu;

import Uu.N0;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class O0<T, R> extends io.reactivex.u<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f38141a;

    /* renamed from: b, reason: collision with root package name */
    final Callable<R> f38142b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.c<R, ? super T, R> f38143c;

    @Override // io.reactivex.u
    protected void p(io.reactivex.w<? super R> wVar) {
        try {
            this.f38141a.subscribe(new N0.a(wVar, this.f38143c, Nu.b.e(this.f38142b.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th2) {
            Ku.a.b(th2);
            Mu.e.o(th2, wVar);
        }
    }

    public O0(io.reactivex.q<T> qVar, Callable<R> callable, Lu.c<R, ? super T, R> cVar) {
        this.f38141a = qVar;
        this.f38142b = callable;
        this.f38143c = cVar;
    }
}
