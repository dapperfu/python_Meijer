package io.reactivex;

import gv.C14313a;

/* loaded from: classes9.dex */
public abstract class h<T> implements j<T> {
    protected abstract void d(i<? super T> iVar);

    @Override // io.reactivex.j
    public final void a(i<? super T> iVar) {
        Ru.b.e(iVar, "observer is null");
        i<? super T> iVarX = C14313a.x(this, iVar);
        Ru.b.e(iVarX, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            d(iVarX);
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
}
