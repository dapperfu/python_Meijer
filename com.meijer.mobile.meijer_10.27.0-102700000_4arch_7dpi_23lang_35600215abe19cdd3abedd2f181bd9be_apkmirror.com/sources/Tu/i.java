package Tu;

import gv.C14313a;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class i extends AtomicReference<Nu.b> implements io.reactivex.c, Nu.b, Pu.g<Throwable> {

    /* renamed from: a, reason: collision with root package name */
    final Pu.g<? super Throwable> f35461a;

    /* renamed from: b, reason: collision with root package name */
    final Pu.a f35462b;

    @Override // Pu.g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th2) {
        C14313a.s(new OnErrorNotImplementedException(th2));
    }

    @Override // io.reactivex.c, io.reactivex.i
    public void onComplete() {
        try {
            this.f35462b.run();
        } catch (Throwable th2) {
            Ou.a.b(th2);
            C14313a.s(th2);
        }
        lazySet(Qu.d.DISPOSED);
    }

    @Override // io.reactivex.c, io.reactivex.i
    public void onError(Throwable th2) {
        try {
            this.f35461a.accept(th2);
        } catch (Throwable th3) {
            Ou.a.b(th3);
            C14313a.s(th3);
        }
        lazySet(Qu.d.DISPOSED);
    }

    public i(Pu.g<? super Throwable> gVar, Pu.a aVar) {
        this.f35461a = gVar;
        this.f35462b = aVar;
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

    @Override // io.reactivex.c, io.reactivex.i
    public void onSubscribe(Nu.b bVar) {
        Qu.d.o(this, bVar);
    }
}
