package Uu;

import fv.C14269b;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class J0<T, R> extends AbstractC5375a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super io.reactivex.l<T>, ? extends io.reactivex.q<R>> f37985b;

    static final class a<T, R> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final C14269b<T> f37986a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<Ju.b> f37987b;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f37986a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f37986a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f37986a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this.f37987b, bVar);
        }

        a(C14269b<T> c14269b, AtomicReference<Ju.b> atomicReference) {
            this.f37986a = c14269b;
            this.f37987b = atomicReference;
        }
    }

    static final class b<T, R> extends AtomicReference<Ju.b> implements io.reactivex.s<R>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f37988a;

        /* renamed from: b, reason: collision with root package name */
        Ju.b f37989b;

        @Override // Ju.b
        public void dispose() {
            this.f37989b.dispose();
            Mu.d.a(this);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f37989b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onNext(R r10) {
            this.f37988a.onNext(r10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f37989b, bVar)) {
                this.f37989b = bVar;
                this.f37988a.onSubscribe(this);
            }
        }

        b(io.reactivex.s<? super R> sVar) {
            this.f37988a = sVar;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            Mu.d.a(this);
            this.f37988a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Mu.d.a(this);
            this.f37988a.onError(th2);
        }
    }

    public J0(io.reactivex.q<T> qVar, Lu.o<? super io.reactivex.l<T>, ? extends io.reactivex.q<R>> oVar) {
        super(qVar);
        this.f37985b = oVar;
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super R> sVar) {
        C14269b c14269bE = C14269b.e();
        try {
            io.reactivex.q qVar = (io.reactivex.q) Nu.b.e(this.f37985b.apply(c14269bE), "The selector returned a null ObservableSource");
            b bVar = new b(sVar);
            qVar.subscribe(bVar);
            this.f38360a.subscribe(new a(c14269bE, bVar));
        } catch (Throwable th2) {
            Ku.a.b(th2);
            Mu.e.m(th2, sVar);
        }
    }
}
