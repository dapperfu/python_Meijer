package Yu;

import gv.C14313a;
import java.util.concurrent.Callable;

/* renamed from: Yu.s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5487s<T, U> extends io.reactivex.u<U> implements Su.a<U> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f41613a;

    /* renamed from: b, reason: collision with root package name */
    final Callable<? extends U> f41614b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.b<? super U, ? super T> f41615c;

    /* renamed from: Yu.s$a */
    static final class a<T, U> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super U> f41616a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.b<? super U, ? super T> f41617b;

        /* renamed from: c, reason: collision with root package name */
        final U f41618c;

        /* renamed from: d, reason: collision with root package name */
        Nu.b f41619d;

        /* renamed from: e, reason: collision with root package name */
        boolean f41620e;

        @Override // Nu.b
        public void dispose() {
            this.f41619d.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41619d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41620e) {
                return;
            }
            this.f41620e = true;
            this.f41616a.onSuccess(this.f41618c);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41620e) {
                C14313a.s(th2);
            } else {
                this.f41620e = true;
                this.f41616a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41620e) {
                return;
            }
            try {
                this.f41617b.accept(this.f41618c, t10);
            } catch (Throwable th2) {
                this.f41619d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41619d, bVar)) {
                this.f41619d = bVar;
                this.f41616a.onSubscribe(this);
            }
        }

        a(io.reactivex.w<? super U> wVar, U u10, Pu.b<? super U, ? super T> bVar) {
            this.f41616a = wVar;
            this.f41617b = bVar;
            this.f41618c = u10;
        }
    }

    @Override // Su.a
    public io.reactivex.l<U> b() {
        return C14313a.o(new r(this.f41613a, this.f41614b, this.f41615c));
    }

    @Override // io.reactivex.u
    protected void p(io.reactivex.w<? super U> wVar) {
        try {
            this.f41613a.subscribe(new a(wVar, Ru.b.e(this.f41614b.call(), "The initialSupplier returned a null value"), this.f41615c));
        } catch (Throwable th2) {
            Qu.e.o(th2, wVar);
        }
    }

    public C5487s(io.reactivex.q<T> qVar, Callable<? extends U> callable, Pu.b<? super U, ? super T> bVar) {
        this.f41613a = qVar;
        this.f41614b = callable;
        this.f41615c = bVar;
    }
}
