package Yu;

import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class C1<T, U extends Collection<? super T>> extends AbstractC5436a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final Callable<U> f40589b;

    static final class a<T, U extends Collection<? super T>> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super U> f40590a;

        /* renamed from: b, reason: collision with root package name */
        Nu.b f40591b;

        /* renamed from: c, reason: collision with root package name */
        U f40592c;

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f40592c = null;
            this.f40590a.onError(th2);
        }

        @Override // Nu.b
        public void dispose() {
            this.f40591b.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40591b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            U u10 = this.f40592c;
            this.f40592c = null;
            this.f40590a.onNext(u10);
            this.f40590a.onComplete();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f40592c.add(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40591b, bVar)) {
                this.f40591b = bVar;
                this.f40590a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super U> sVar, U u10) {
            this.f40590a = sVar;
            this.f40592c = u10;
        }
    }

    public C1(io.reactivex.q<T> qVar, int i10) {
        super(qVar);
        this.f40589b = Ru.a.e(i10);
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super U> sVar) {
        try {
            this.f41135a.subscribe(new a(sVar, (Collection) Ru.b.e(this.f40589b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            Ou.a.b(th2);
            Qu.e.m(th2, sVar);
        }
    }

    public C1(io.reactivex.q<T> qVar, Callable<U> callable) {
        super(qVar);
        this.f40589b = callable;
    }
}
