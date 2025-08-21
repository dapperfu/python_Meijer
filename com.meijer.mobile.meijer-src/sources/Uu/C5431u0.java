package Uu;

import java.util.NoSuchElementException;

/* renamed from: Uu.u0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5431u0<T> extends io.reactivex.u<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f38920a;

    /* renamed from: b, reason: collision with root package name */
    final T f38921b;

    /* renamed from: Uu.u0$a */
    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f38922a;

        /* renamed from: b, reason: collision with root package name */
        final T f38923b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f38924c;

        /* renamed from: d, reason: collision with root package name */
        T f38925d;

        @Override // Ju.b
        public void dispose() {
            this.f38924c.dispose();
            this.f38924c = Mu.d.DISPOSED;
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38924c == Mu.d.DISPOSED;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38924c = Mu.d.DISPOSED;
            T t10 = this.f38925d;
            if (t10 != null) {
                this.f38925d = null;
                this.f38922a.onSuccess(t10);
                return;
            }
            T t11 = this.f38923b;
            if (t11 != null) {
                this.f38922a.onSuccess(t11);
            } else {
                this.f38922a.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38924c = Mu.d.DISPOSED;
            this.f38925d = null;
            this.f38922a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38925d = t10;
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38924c, bVar)) {
                this.f38924c = bVar;
                this.f38922a.onSubscribe(this);
            }
        }

        a(io.reactivex.w<? super T> wVar, T t10) {
            this.f38922a = wVar;
            this.f38923b = t10;
        }
    }

    @Override // io.reactivex.u
    protected void p(io.reactivex.w<? super T> wVar) {
        this.f38920a.subscribe(new a(wVar, this.f38921b));
    }

    public C5431u0(io.reactivex.q<T> qVar, T t10) {
        this.f38920a = qVar;
        this.f38921b = t10;
    }
}
