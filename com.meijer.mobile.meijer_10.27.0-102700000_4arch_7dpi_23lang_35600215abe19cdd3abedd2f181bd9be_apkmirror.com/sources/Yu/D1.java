package Yu;

import gv.C14313a;
import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class D1<T, U extends Collection<? super T>> extends io.reactivex.u<U> implements Su.a<U> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f40622a;

    /* renamed from: b, reason: collision with root package name */
    final Callable<U> f40623b;

    static final class a<T, U extends Collection<? super T>> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super U> f40624a;

        /* renamed from: b, reason: collision with root package name */
        U f40625b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f40626c;

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f40625b = null;
            this.f40624a.onError(th2);
        }

        @Override // Nu.b
        public void dispose() {
            this.f40626c.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40626c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            U u10 = this.f40625b;
            this.f40625b = null;
            this.f40624a.onSuccess(u10);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f40625b.add(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40626c, bVar)) {
                this.f40626c = bVar;
                this.f40624a.onSubscribe(this);
            }
        }

        a(io.reactivex.w<? super U> wVar, U u10) {
            this.f40624a = wVar;
            this.f40625b = u10;
        }
    }

    public D1(io.reactivex.q<T> qVar, int i10) {
        this.f40622a = qVar;
        this.f40623b = Ru.a.e(i10);
    }

    @Override // Su.a
    public io.reactivex.l<U> b() {
        return C14313a.o(new C1(this.f40622a, this.f40623b));
    }

    @Override // io.reactivex.u
    public void p(io.reactivex.w<? super U> wVar) {
        try {
            this.f40622a.subscribe(new a(wVar, (Collection) Ru.b.e(this.f40623b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            Ou.a.b(th2);
            Qu.e.o(th2, wVar);
        }
    }

    public D1(io.reactivex.q<T> qVar, Callable<U> callable) {
        this.f40622a = qVar;
        this.f40623b = callable;
    }
}
