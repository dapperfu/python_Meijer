package Tu;

import gv.C14313a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class j<T> extends AtomicReference<Nu.b> implements w<T>, Nu.b {

    /* renamed from: a, reason: collision with root package name */
    final Pu.g<? super T> f35463a;

    /* renamed from: b, reason: collision with root package name */
    final Pu.g<? super Throwable> f35464b;

    @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
    public void onError(Throwable th2) {
        lazySet(Qu.d.DISPOSED);
        try {
            this.f35464b.accept(th2);
        } catch (Throwable th3) {
            Ou.a.b(th3);
            C14313a.s(new CompositeException(th2, th3));
        }
    }

    @Override // io.reactivex.w, io.reactivex.i
    public void onSuccess(T t10) {
        lazySet(Qu.d.DISPOSED);
        try {
            this.f35463a.accept(t10);
        } catch (Throwable th2) {
            Ou.a.b(th2);
            C14313a.s(th2);
        }
    }

    public j(Pu.g<? super T> gVar, Pu.g<? super Throwable> gVar2) {
        this.f35463a = gVar;
        this.f35464b = gVar2;
    }

    @Override // Nu.b
    public void dispose() {
        Qu.d.a(this);
    }

    @Override // Nu.b
    public boolean isDisposed() {
        if (get() == Qu.d.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
    public void onSubscribe(Nu.b bVar) {
        Qu.d.o(this, bVar);
    }
}
