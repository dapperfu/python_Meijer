package Yu;

import gv.C14313a;
import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
public final class S<T> extends io.reactivex.u<T> implements Su.a<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f40969a;

    /* renamed from: b, reason: collision with root package name */
    final long f40970b;

    /* renamed from: c, reason: collision with root package name */
    final T f40971c;

    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f40972a;

        /* renamed from: b, reason: collision with root package name */
        final long f40973b;

        /* renamed from: c, reason: collision with root package name */
        final T f40974c;

        /* renamed from: d, reason: collision with root package name */
        Nu.b f40975d;

        /* renamed from: e, reason: collision with root package name */
        long f40976e;

        /* renamed from: f, reason: collision with root package name */
        boolean f40977f;

        @Override // Nu.b
        public void dispose() {
            this.f40975d.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40975d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f40977f) {
                return;
            }
            this.f40977f = true;
            T t10 = this.f40974c;
            if (t10 != null) {
                this.f40972a.onSuccess(t10);
            } else {
                this.f40972a.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f40977f) {
                C14313a.s(th2);
            } else {
                this.f40977f = true;
                this.f40972a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f40977f) {
                return;
            }
            long j10 = this.f40976e;
            if (j10 != this.f40973b) {
                this.f40976e = j10 + 1;
                return;
            }
            this.f40977f = true;
            this.f40975d.dispose();
            this.f40972a.onSuccess(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40975d, bVar)) {
                this.f40975d = bVar;
                this.f40972a.onSubscribe(this);
            }
        }

        a(io.reactivex.w<? super T> wVar, long j10, T t10) {
            this.f40972a = wVar;
            this.f40973b = j10;
            this.f40974c = t10;
        }
    }

    @Override // Su.a
    public io.reactivex.l<T> b() {
        return C14313a.o(new P(this.f40969a, this.f40970b, this.f40971c, true));
    }

    @Override // io.reactivex.u
    public void p(io.reactivex.w<? super T> wVar) {
        this.f40969a.subscribe(new a(wVar, this.f40970b, this.f40971c));
    }

    public S(io.reactivex.q<T> qVar, long j10, T t10) {
        this.f40969a = qVar;
        this.f40970b = j10;
        this.f40971c = t10;
    }
}
