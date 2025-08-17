package Yu;

import gv.C14313a;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class r<T, U> extends AbstractC5436a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final Callable<? extends U> f41582b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.b<? super U, ? super T> f41583c;

    static final class a<T, U> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super U> f41584a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.b<? super U, ? super T> f41585b;

        /* renamed from: c, reason: collision with root package name */
        final U f41586c;

        /* renamed from: d, reason: collision with root package name */
        Nu.b f41587d;

        /* renamed from: e, reason: collision with root package name */
        boolean f41588e;

        @Override // Nu.b
        public void dispose() {
            this.f41587d.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41587d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41588e) {
                return;
            }
            this.f41588e = true;
            this.f41584a.onNext(this.f41586c);
            this.f41584a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41588e) {
                C14313a.s(th2);
            } else {
                this.f41588e = true;
                this.f41584a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41588e) {
                return;
            }
            try {
                this.f41585b.accept(this.f41586c, t10);
            } catch (Throwable th2) {
                this.f41587d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41587d, bVar)) {
                this.f41587d = bVar;
                this.f41584a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super U> sVar, U u10, Pu.b<? super U, ? super T> bVar) {
            this.f41584a = sVar;
            this.f41585b = bVar;
            this.f41586c = u10;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super U> sVar) {
        try {
            this.f41135a.subscribe(new a(sVar, Ru.b.e(this.f41582b.call(), "The initialSupplier returned a null value"), this.f41583c));
        } catch (Throwable th2) {
            Qu.e.m(th2, sVar);
        }
    }

    public r(io.reactivex.q<T> qVar, Callable<? extends U> callable, Pu.b<? super U, ? super T> bVar) {
        super(qVar);
        this.f41582b = callable;
        this.f41583c = bVar;
    }
}
