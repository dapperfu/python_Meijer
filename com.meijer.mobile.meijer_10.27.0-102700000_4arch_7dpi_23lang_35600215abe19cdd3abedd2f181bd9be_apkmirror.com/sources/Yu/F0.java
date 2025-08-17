package Yu;

import io.reactivex.exceptions.CompositeException;

/* loaded from: classes9.dex */
public final class F0<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super Throwable, ? extends T> f40656b;

    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40657a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.o<? super Throwable, ? extends T> f40658b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f40659c;

        @Override // Nu.b
        public void dispose() {
            this.f40659c.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40659c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f40657a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            try {
                T tApply = this.f40658b.apply(th2);
                if (tApply != null) {
                    this.f40657a.onNext(tApply);
                    this.f40657a.onComplete();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th2);
                    this.f40657a.onError(nullPointerException);
                }
            } catch (Throwable th3) {
                Ou.a.b(th3);
                this.f40657a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f40657a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40659c, bVar)) {
                this.f40659c = bVar;
                this.f40657a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, Pu.o<? super Throwable, ? extends T> oVar) {
            this.f40657a = sVar;
            this.f40658b = oVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f40656b));
    }

    public F0(io.reactivex.q<T> qVar, Pu.o<? super Throwable, ? extends T> oVar) {
        super(qVar);
        this.f40656b = oVar;
    }
}
