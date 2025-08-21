package Uu;

import cv.C13558a;
import java.util.concurrent.Callable;

/* renamed from: Uu.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5426s<T, U> extends io.reactivex.u<U> implements Ou.a<U> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f38838a;

    /* renamed from: b, reason: collision with root package name */
    final Callable<? extends U> f38839b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.b<? super U, ? super T> f38840c;

    /* renamed from: Uu.s$a */
    static final class a<T, U> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super U> f38841a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.b<? super U, ? super T> f38842b;

        /* renamed from: c, reason: collision with root package name */
        final U f38843c;

        /* renamed from: d, reason: collision with root package name */
        Ju.b f38844d;

        /* renamed from: e, reason: collision with root package name */
        boolean f38845e;

        @Override // Ju.b
        public void dispose() {
            this.f38844d.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38844d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38845e) {
                return;
            }
            this.f38845e = true;
            this.f38841a.onSuccess(this.f38843c);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38845e) {
                C13558a.s(th2);
            } else {
                this.f38845e = true;
                this.f38841a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38845e) {
                return;
            }
            try {
                this.f38842b.accept(this.f38843c, t10);
            } catch (Throwable th2) {
                this.f38844d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38844d, bVar)) {
                this.f38844d = bVar;
                this.f38841a.onSubscribe(this);
            }
        }

        a(io.reactivex.w<? super U> wVar, U u10, Lu.b<? super U, ? super T> bVar) {
            this.f38841a = wVar;
            this.f38842b = bVar;
            this.f38843c = u10;
        }
    }

    @Override // Ou.a
    public io.reactivex.l<U> b() {
        return C13558a.o(new r(this.f38838a, this.f38839b, this.f38840c));
    }

    @Override // io.reactivex.u
    protected void p(io.reactivex.w<? super U> wVar) {
        try {
            this.f38838a.subscribe(new a(wVar, Nu.b.e(this.f38839b.call(), "The initialSupplier returned a null value"), this.f38840c));
        } catch (Throwable th2) {
            Mu.e.o(th2, wVar);
        }
    }

    public C5426s(io.reactivex.q<T> qVar, Callable<? extends U> callable, Lu.b<? super U, ? super T> bVar) {
        this.f38838a = qVar;
        this.f38839b = callable;
        this.f38840c = bVar;
    }
}
