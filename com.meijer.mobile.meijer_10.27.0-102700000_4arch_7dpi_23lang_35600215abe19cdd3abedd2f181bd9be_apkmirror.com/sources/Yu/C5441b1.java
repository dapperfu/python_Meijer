package Yu;

import gv.C14313a;
import java.util.concurrent.Callable;

/* renamed from: Yu.b1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5441b1<T, R> extends AbstractC5436a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.c<R, ? super T, R> f41165b;

    /* renamed from: c, reason: collision with root package name */
    final Callable<R> f41166c;

    /* renamed from: Yu.b1$a */
    static final class a<T, R> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f41167a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.c<R, ? super T, R> f41168b;

        /* renamed from: c, reason: collision with root package name */
        R f41169c;

        /* renamed from: d, reason: collision with root package name */
        Nu.b f41170d;

        /* renamed from: e, reason: collision with root package name */
        boolean f41171e;

        @Override // Nu.b
        public void dispose() {
            this.f41170d.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41170d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41171e) {
                return;
            }
            this.f41171e = true;
            this.f41167a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41171e) {
                C14313a.s(th2);
            } else {
                this.f41171e = true;
                this.f41167a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41171e) {
                return;
            }
            try {
                R r10 = (R) Ru.b.e(this.f41168b.apply(this.f41169c, t10), "The accumulator returned a null value");
                this.f41169c = r10;
                this.f41167a.onNext(r10);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f41170d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41170d, bVar)) {
                this.f41170d = bVar;
                this.f41167a.onSubscribe(this);
                this.f41167a.onNext(this.f41169c);
            }
        }

        a(io.reactivex.s<? super R> sVar, Pu.c<R, ? super T, R> cVar, R r10) {
            this.f41167a = sVar;
            this.f41168b = cVar;
            this.f41169c = r10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super R> sVar) {
        try {
            this.f41135a.subscribe(new a(sVar, this.f41165b, Ru.b.e(this.f41166c.call(), "The seed supplied is null")));
        } catch (Throwable th2) {
            Ou.a.b(th2);
            Qu.e.m(th2, sVar);
        }
    }

    public C5441b1(io.reactivex.q<T> qVar, Callable<R> callable, Pu.c<R, ? super T, R> cVar) {
        super(qVar);
        this.f41165b = cVar;
        this.f41166c = callable;
    }
}
