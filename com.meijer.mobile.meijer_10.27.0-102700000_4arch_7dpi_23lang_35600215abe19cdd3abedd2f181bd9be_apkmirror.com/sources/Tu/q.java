package Tu;

import gv.C14313a;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class q<T> extends AtomicReference<Nu.b> implements io.reactivex.s<T>, Nu.b {

    /* renamed from: a, reason: collision with root package name */
    final Pu.g<? super T> f35483a;

    /* renamed from: b, reason: collision with root package name */
    final Pu.g<? super Throwable> f35484b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.a f35485c;

    /* renamed from: d, reason: collision with root package name */
    final Pu.g<? super Nu.b> f35486d;

    public q(Pu.g<? super T> gVar, Pu.g<? super Throwable> gVar2, Pu.a aVar, Pu.g<? super Nu.b> gVar3) {
        this.f35483a = gVar;
        this.f35484b = gVar2;
        this.f35485c = aVar;
        this.f35486d = gVar3;
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

    @Override // io.reactivex.s
    public void onComplete() {
        if (!isDisposed()) {
            lazySet(Qu.d.DISPOSED);
            try {
                this.f35485c.run();
            } catch (Throwable th2) {
                Ou.a.b(th2);
                C14313a.s(th2);
            }
        }
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        if (!isDisposed()) {
            lazySet(Qu.d.DISPOSED);
            try {
                this.f35484b.accept(th2);
                return;
            } catch (Throwable th3) {
                Ou.a.b(th3);
                C14313a.s(new CompositeException(th2, th3));
                return;
            }
        }
        C14313a.s(th2);
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        if (!isDisposed()) {
            try {
                this.f35483a.accept(t10);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                get().dispose();
                onError(th2);
            }
        }
    }

    @Override // io.reactivex.s
    public void onSubscribe(Nu.b bVar) {
        if (Qu.d.o(this, bVar)) {
            try {
                this.f35486d.accept(this);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                bVar.dispose();
                onError(th2);
            }
        }
    }
}
