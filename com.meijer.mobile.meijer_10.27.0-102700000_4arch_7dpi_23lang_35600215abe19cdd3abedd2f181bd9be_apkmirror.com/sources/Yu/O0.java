package Yu;

import Yu.N0;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class O0<T, R> extends io.reactivex.u<R> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f40916a;

    /* renamed from: b, reason: collision with root package name */
    final Callable<R> f40917b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.c<R, ? super T, R> f40918c;

    @Override // io.reactivex.u
    protected void p(io.reactivex.w<? super R> wVar) {
        try {
            this.f40916a.subscribe(new N0.a(wVar, this.f40918c, Ru.b.e(this.f40917b.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th2) {
            Ou.a.b(th2);
            Qu.e.o(th2, wVar);
        }
    }

    public O0(io.reactivex.q<T> qVar, Callable<R> callable, Pu.c<R, ? super T, R> cVar) {
        this.f40916a = qVar;
        this.f40917b = callable;
        this.f40918c = cVar;
    }
}
