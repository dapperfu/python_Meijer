package Uu;

import io.reactivex.exceptions.CompositeException;

/* loaded from: classes10.dex */
public final class F0<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super Throwable, ? extends T> f37881b;

    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f37882a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.o<? super Throwable, ? extends T> f37883b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f37884c;

        @Override // Ju.b
        public void dispose() {
            this.f37884c.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f37884c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f37882a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            try {
                T tApply = this.f37883b.apply(th2);
                if (tApply != null) {
                    this.f37882a.onNext(tApply);
                    this.f37882a.onComplete();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th2);
                    this.f37882a.onError(nullPointerException);
                }
            } catch (Throwable th3) {
                Ku.a.b(th3);
                this.f37882a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f37882a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f37884c, bVar)) {
                this.f37884c = bVar;
                this.f37882a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, Lu.o<? super Throwable, ? extends T> oVar) {
            this.f37882a = sVar;
            this.f37883b = oVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f37881b));
    }

    public F0(io.reactivex.q<T> qVar, Lu.o<? super Throwable, ? extends T> oVar) {
        super(qVar);
        this.f37881b = oVar;
    }
}
