package io.reactivex;

import gv.C14313a;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public abstract class u<T> implements y<T> {
    protected abstract void p(w<? super T> wVar);

    public static <T> u<T> d(x<T> xVar) {
        Ru.b.e(xVar, "source is null");
        return C14313a.p(new Zu.a(xVar));
    }

    public static <T> u<T> g(Throwable th2) {
        Ru.b.e(th2, "exception is null");
        return h(Ru.a.k(th2));
    }

    public static <T> u<T> h(Callable<? extends Throwable> callable) {
        Ru.b.e(callable, "errorSupplier is null");
        return C14313a.p(new Zu.d(callable));
    }

    public static <T> u<T> i(T t10) {
        Ru.b.e(t10, "item is null");
        return C14313a.p(new Zu.e(t10));
    }

    public static <T1, T2, R> u<R> s(y<? extends T1> yVar, y<? extends T2> yVar2, Pu.c<? super T1, ? super T2, ? extends R> cVar) {
        Ru.b.e(yVar, "source1 is null");
        Ru.b.e(yVar2, "source2 is null");
        return u(Ru.a.v(cVar), yVar, yVar2);
    }

    public static <T1, T2, T3, T4, T5, T6, R> u<R> t(y<? extends T1> yVar, y<? extends T2> yVar2, y<? extends T3> yVar3, y<? extends T4> yVar4, y<? extends T5> yVar5, y<? extends T6> yVar6, Pu.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        Ru.b.e(yVar, "source1 is null");
        Ru.b.e(yVar2, "source2 is null");
        Ru.b.e(yVar3, "source3 is null");
        Ru.b.e(yVar4, "source4 is null");
        Ru.b.e(yVar5, "source5 is null");
        Ru.b.e(yVar6, "source6 is null");
        return u(Ru.a.z(kVar), yVar, yVar2, yVar3, yVar4, yVar5, yVar6);
    }

    public static <T, R> u<R> u(Pu.o<? super Object[], ? extends R> oVar, y<? extends T>... yVarArr) {
        Ru.b.e(oVar, "zipper is null");
        Ru.b.e(yVarArr, "sources is null");
        return yVarArr.length == 0 ? g(new NoSuchElementException()) : C14313a.p(new Zu.l(yVarArr, oVar));
    }

    @Override // io.reactivex.y
    public final void a(w<? super T> wVar) {
        Ru.b.e(wVar, "observer is null");
        w<? super T> wVarZ = C14313a.z(this, wVar);
        Ru.b.e(wVarZ, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            p(wVarZ);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            Ou.a.b(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final T c() {
        Tu.g gVar = new Tu.g();
        a(gVar);
        return (T) gVar.a();
    }

    public final u<T> e(Pu.a aVar) {
        Ru.b.e(aVar, "onFinally is null");
        return C14313a.p(new Zu.b(this, aVar));
    }

    public final u<T> f(Pu.g<? super Nu.b> gVar) {
        Ru.b.e(gVar, "onSubscribe is null");
        return C14313a.p(new Zu.c(this, gVar));
    }

    public final <R> u<R> j(Pu.o<? super T, ? extends R> oVar) {
        Ru.b.e(oVar, "mapper is null");
        return C14313a.p(new Zu.f(this, oVar));
    }

    public final u<T> k(t tVar) {
        Ru.b.e(tVar, "scheduler is null");
        return C14313a.p(new Zu.g(this, tVar));
    }

    public final u<T> l(Pu.o<? super Throwable, ? extends y<? extends T>> oVar) {
        Ru.b.e(oVar, "resumeFunctionInCaseOfError is null");
        return C14313a.p(new Zu.i(this, oVar));
    }

    public final u<T> m(T t10) {
        Ru.b.e(t10, "value is null");
        return C14313a.p(new Zu.h(this, null, t10));
    }

    public final Nu.b n(Pu.g<? super T> gVar) {
        return o(gVar, Ru.a.f33005f);
    }

    public final Nu.b o(Pu.g<? super T> gVar, Pu.g<? super Throwable> gVar2) {
        Ru.b.e(gVar, "onSuccess is null");
        Ru.b.e(gVar2, "onError is null");
        Tu.j jVar = new Tu.j(gVar, gVar2);
        a(jVar);
        return jVar;
    }

    public final u<T> q(t tVar) {
        Ru.b.e(tVar, "scheduler is null");
        return C14313a.p(new Zu.j(this, tVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l<T> r() {
        return this instanceof Su.a ? ((Su.a) this).b() : C14313a.o(new Zu.k(this));
    }

    public final <U, R> u<R> v(y<U> yVar, Pu.c<? super T, ? super U, ? extends R> cVar) {
        return s(this, yVar, cVar);
    }
}
