package Uu;

import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class C1<T, U extends Collection<? super T>> extends AbstractC5375a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final Callable<U> f37814b;

    static final class a<T, U extends Collection<? super T>> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super U> f37815a;

        /* renamed from: b, reason: collision with root package name */
        Ju.b f37816b;

        /* renamed from: c, reason: collision with root package name */
        U f37817c;

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f37817c = null;
            this.f37815a.onError(th2);
        }

        @Override // Ju.b
        public void dispose() {
            this.f37816b.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f37816b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            U u10 = this.f37817c;
            this.f37817c = null;
            this.f37815a.onNext(u10);
            this.f37815a.onComplete();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f37817c.add(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f37816b, bVar)) {
                this.f37816b = bVar;
                this.f37815a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super U> sVar, U u10) {
            this.f37815a = sVar;
            this.f37817c = u10;
        }
    }

    public C1(io.reactivex.q<T> qVar, int i10) {
        super(qVar);
        this.f37814b = Nu.a.e(i10);
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super U> sVar) {
        try {
            this.f38360a.subscribe(new a(sVar, (Collection) Nu.b.e(this.f37814b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            Ku.a.b(th2);
            Mu.e.m(th2, sVar);
        }
    }

    public C1(io.reactivex.q<T> qVar, Callable<U> callable) {
        super(qVar);
        this.f37814b = callable;
    }
}
