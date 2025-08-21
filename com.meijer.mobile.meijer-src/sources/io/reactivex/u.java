package io.reactivex;

import cv.C13558a;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public abstract class u<T> implements y<T> {
    protected abstract void p(w<? super T> wVar);

    public static <T> u<T> d(x<T> xVar) {
        Nu.b.e(xVar, "source is null");
        return C13558a.p(new Vu.a(xVar));
    }

    public static <T> u<T> g(Throwable th2) {
        Nu.b.e(th2, "exception is null");
        return h(Nu.a.k(th2));
    }

    public static <T> u<T> h(Callable<? extends Throwable> callable) {
        Nu.b.e(callable, "errorSupplier is null");
        return C13558a.p(new Vu.d(callable));
    }

    public static <T> u<T> i(T t10) {
        Nu.b.e(t10, "item is null");
        return C13558a.p(new Vu.e(t10));
    }

    public static <T1, T2, R> u<R> s(y<? extends T1> yVar, y<? extends T2> yVar2, Lu.c<? super T1, ? super T2, ? extends R> cVar) {
        Nu.b.e(yVar, "source1 is null");
        Nu.b.e(yVar2, "source2 is null");
        return u(Nu.a.v(cVar), yVar, yVar2);
    }

    public static <T1, T2, T3, T4, T5, T6, R> u<R> t(y<? extends T1> yVar, y<? extends T2> yVar2, y<? extends T3> yVar3, y<? extends T4> yVar4, y<? extends T5> yVar5, y<? extends T6> yVar6, Lu.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        Nu.b.e(yVar, "source1 is null");
        Nu.b.e(yVar2, "source2 is null");
        Nu.b.e(yVar3, "source3 is null");
        Nu.b.e(yVar4, "source4 is null");
        Nu.b.e(yVar5, "source5 is null");
        Nu.b.e(yVar6, "source6 is null");
        return u(Nu.a.z(kVar), yVar, yVar2, yVar3, yVar4, yVar5, yVar6);
    }

    public static <T, R> u<R> u(Lu.o<? super Object[], ? extends R> oVar, y<? extends T>... yVarArr) {
        Nu.b.e(oVar, "zipper is null");
        Nu.b.e(yVarArr, "sources is null");
        return yVarArr.length == 0 ? g(new NoSuchElementException()) : C13558a.p(new Vu.l(yVarArr, oVar));
    }

    @Override // io.reactivex.y
    public final void a(w<? super T> wVar) {
        Nu.b.e(wVar, "observer is null");
        w<? super T> wVarZ = C13558a.z(this, wVar);
        Nu.b.e(wVarZ, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            p(wVarZ);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            Ku.a.b(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final T c() {
        Pu.g gVar = new Pu.g();
        a(gVar);
        return (T) gVar.a();
    }

    public final u<T> e(Lu.a aVar) {
        Nu.b.e(aVar, "onFinally is null");
        return C13558a.p(new Vu.b(this, aVar));
    }

    public final u<T> f(Lu.g<? super Ju.b> gVar) {
        Nu.b.e(gVar, "onSubscribe is null");
        return C13558a.p(new Vu.c(this, gVar));
    }

    public final <R> u<R> j(Lu.o<? super T, ? extends R> oVar) {
        Nu.b.e(oVar, "mapper is null");
        return C13558a.p(new Vu.f(this, oVar));
    }

    public final u<T> k(t tVar) {
        Nu.b.e(tVar, "scheduler is null");
        return C13558a.p(new Vu.g(this, tVar));
    }

    public final u<T> l(Lu.o<? super Throwable, ? extends y<? extends T>> oVar) {
        Nu.b.e(oVar, "resumeFunctionInCaseOfError is null");
        return C13558a.p(new Vu.i(this, oVar));
    }

    public final u<T> m(T t10) {
        Nu.b.e(t10, "value is null");
        return C13558a.p(new Vu.h(this, null, t10));
    }

    public final Ju.b n(Lu.g<? super T> gVar) {
        return o(gVar, Nu.a.f22739f);
    }

    public final Ju.b o(Lu.g<? super T> gVar, Lu.g<? super Throwable> gVar2) {
        Nu.b.e(gVar, "onSuccess is null");
        Nu.b.e(gVar2, "onError is null");
        Pu.j jVar = new Pu.j(gVar, gVar2);
        a(jVar);
        return jVar;
    }

    public final u<T> q(t tVar) {
        Nu.b.e(tVar, "scheduler is null");
        return C13558a.p(new Vu.j(this, tVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l<T> r() {
        return this instanceof Ou.a ? ((Ou.a) this).b() : C13558a.o(new Vu.k(this));
    }

    public final <U, R> u<R> v(y<U> yVar, Lu.c<? super T, ? super U, ? extends R> cVar) {
        return s(this, yVar, cVar);
    }
}
