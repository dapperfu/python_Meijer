package io.reactivex;

import cv.C13558a;

/* loaded from: classes10.dex */
public abstract class b implements d {
    protected abstract void h(c cVar);

    public static b c(Throwable th2) {
        Nu.b.e(th2, "error is null");
        return C13558a.l(new Qu.a(th2));
    }

    public static b d(Lu.a aVar) {
        Nu.b.e(aVar, "run is null");
        return C13558a.l(new Qu.b(aVar));
    }

    private static NullPointerException j(Throwable th2) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th2);
        return nullPointerException;
    }

    @Override // io.reactivex.d
    public final void a(c cVar) {
        Nu.b.e(cVar, "observer is null");
        try {
            c cVarW = C13558a.w(this, cVar);
            Nu.b.e(cVarW, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            h(cVarW);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            Ku.a.b(th2);
            C13558a.s(th2);
            throw j(th2);
        }
    }

    public final b e(t tVar) {
        Nu.b.e(tVar, "scheduler is null");
        return C13558a.l(new Qu.c(this, tVar));
    }

    public final b f(Lu.o<? super Throwable, ? extends d> oVar) {
        Nu.b.e(oVar, "errorMapper is null");
        return C13558a.l(new Qu.d(this, oVar));
    }

    public final Ju.b g(Lu.a aVar, Lu.g<? super Throwable> gVar) {
        Nu.b.e(gVar, "onError is null");
        Nu.b.e(aVar, "onComplete is null");
        Pu.i iVar = new Pu.i(gVar, aVar);
        a(iVar);
        return iVar;
    }

    public final b i(t tVar) {
        Nu.b.e(tVar, "scheduler is null");
        return C13558a.l(new Qu.e(this, tVar));
    }
}
