package Yu;

import java.util.concurrent.atomic.AtomicReference;
import jv.C15079b;

/* loaded from: classes9.dex */
public final class J0<T, R> extends AbstractC5436a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super io.reactivex.l<T>, ? extends io.reactivex.q<R>> f40760b;

    static final class a<T, R> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final C15079b<T> f40761a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<Nu.b> f40762b;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f40761a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f40761a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f40761a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this.f40762b, bVar);
        }

        a(C15079b<T> c15079b, AtomicReference<Nu.b> atomicReference) {
            this.f40761a = c15079b;
            this.f40762b = atomicReference;
        }
    }

    static final class b<T, R> extends AtomicReference<Nu.b> implements io.reactivex.s<R>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f40763a;

        /* renamed from: b, reason: collision with root package name */
        Nu.b f40764b;

        @Override // Nu.b
        public void dispose() {
            this.f40764b.dispose();
            Qu.d.a(this);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40764b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onNext(R r10) {
            this.f40763a.onNext(r10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40764b, bVar)) {
                this.f40764b = bVar;
                this.f40763a.onSubscribe(this);
            }
        }

        b(io.reactivex.s<? super R> sVar) {
            this.f40763a = sVar;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            Qu.d.a(this);
            this.f40763a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Qu.d.a(this);
            this.f40763a.onError(th2);
        }
    }

    public J0(io.reactivex.q<T> qVar, Pu.o<? super io.reactivex.l<T>, ? extends io.reactivex.q<R>> oVar) {
        super(qVar);
        this.f40760b = oVar;
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super R> sVar) {
        C15079b c15079bE = C15079b.e();
        try {
            io.reactivex.q qVar = (io.reactivex.q) Ru.b.e(this.f40760b.apply(c15079bE), "The selector returned a null ObservableSource");
            b bVar = new b(sVar);
            qVar.subscribe(bVar);
            this.f41135a.subscribe(new a(c15079bE, bVar));
        } catch (Throwable th2) {
            Ou.a.b(th2);
            Qu.e.m(th2, sVar);
        }
    }
}
