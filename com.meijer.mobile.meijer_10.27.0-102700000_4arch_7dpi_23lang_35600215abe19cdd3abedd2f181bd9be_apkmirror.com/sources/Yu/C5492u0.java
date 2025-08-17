package Yu;

import java.util.NoSuchElementException;

/* renamed from: Yu.u0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5492u0<T> extends io.reactivex.u<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f41695a;

    /* renamed from: b, reason: collision with root package name */
    final T f41696b;

    /* renamed from: Yu.u0$a */
    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f41697a;

        /* renamed from: b, reason: collision with root package name */
        final T f41698b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f41699c;

        /* renamed from: d, reason: collision with root package name */
        T f41700d;

        @Override // Nu.b
        public void dispose() {
            this.f41699c.dispose();
            this.f41699c = Qu.d.DISPOSED;
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41699c == Qu.d.DISPOSED;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41699c = Qu.d.DISPOSED;
            T t10 = this.f41700d;
            if (t10 != null) {
                this.f41700d = null;
                this.f41697a.onSuccess(t10);
                return;
            }
            T t11 = this.f41698b;
            if (t11 != null) {
                this.f41697a.onSuccess(t11);
            } else {
                this.f41697a.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41699c = Qu.d.DISPOSED;
            this.f41700d = null;
            this.f41697a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f41700d = t10;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41699c, bVar)) {
                this.f41699c = bVar;
                this.f41697a.onSubscribe(this);
            }
        }

        a(io.reactivex.w<? super T> wVar, T t10) {
            this.f41697a = wVar;
            this.f41698b = t10;
        }
    }

    @Override // io.reactivex.u
    protected void p(io.reactivex.w<? super T> wVar) {
        this.f41695a.subscribe(new a(wVar, this.f41696b));
    }

    public C5492u0(io.reactivex.q<T> qVar, T t10) {
        this.f41695a = qVar;
        this.f41696b = t10;
    }
}
