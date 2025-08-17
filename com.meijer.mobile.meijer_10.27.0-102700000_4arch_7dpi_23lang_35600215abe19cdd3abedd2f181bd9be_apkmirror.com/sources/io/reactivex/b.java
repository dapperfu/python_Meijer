package io.reactivex;

import gv.C14313a;

/* loaded from: classes9.dex */
public abstract class b implements d {
    protected abstract void h(c cVar);

    public static b c(Throwable th2) {
        Ru.b.e(th2, "error is null");
        return C14313a.l(new Uu.a(th2));
    }

    public static b d(Pu.a aVar) {
        Ru.b.e(aVar, "run is null");
        return C14313a.l(new Uu.b(aVar));
    }

    private static NullPointerException j(Throwable th2) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th2);
        return nullPointerException;
    }

    @Override // io.reactivex.d
    public final void a(c cVar) {
        Ru.b.e(cVar, "observer is null");
        try {
            c cVarW = C14313a.w(this, cVar);
            Ru.b.e(cVarW, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            h(cVarW);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            Ou.a.b(th2);
            C14313a.s(th2);
            throw j(th2);
        }
    }

    public final b e(t tVar) {
        Ru.b.e(tVar, "scheduler is null");
        return C14313a.l(new Uu.c(this, tVar));
    }

    public final b f(Pu.o<? super Throwable, ? extends d> oVar) {
        Ru.b.e(oVar, "errorMapper is null");
        return C14313a.l(new Uu.d(this, oVar));
    }

    public final Nu.b g(Pu.a aVar, Pu.g<? super Throwable> gVar) {
        Ru.b.e(gVar, "onError is null");
        Ru.b.e(aVar, "onComplete is null");
        Tu.i iVar = new Tu.i(gVar, aVar);
        a(iVar);
        return iVar;
    }

    public final b i(t tVar) {
        Ru.b.e(tVar, "scheduler is null");
        return C14313a.l(new Uu.e(this, tVar));
    }
}
