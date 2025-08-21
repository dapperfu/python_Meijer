package io.reactivex;

import cv.C13558a;

/* loaded from: classes10.dex */
public abstract class h<T> implements j<T> {
    protected abstract void d(i<? super T> iVar);

    @Override // io.reactivex.j
    public final void a(i<? super T> iVar) {
        Nu.b.e(iVar, "observer is null");
        i<? super T> iVarX = C13558a.x(this, iVar);
        Nu.b.e(iVarX, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            d(iVarX);
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
}
