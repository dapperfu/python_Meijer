package Uu;

import cv.C13558a;

/* renamed from: Uu.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5390f<T> extends AbstractC5375a<T, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.q<? super T> f38462b;

    /* renamed from: Uu.f$a */
    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super Boolean> f38463a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.q<? super T> f38464b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f38465c;

        /* renamed from: d, reason: collision with root package name */
        boolean f38466d;

        @Override // Ju.b
        public void dispose() {
            this.f38465c.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38465c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38466d) {
                return;
            }
            this.f38466d = true;
            this.f38463a.onNext(Boolean.TRUE);
            this.f38463a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38466d) {
                C13558a.s(th2);
            } else {
                this.f38466d = true;
                this.f38463a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38466d) {
                return;
            }
            try {
                if (this.f38464b.test(t10)) {
                    return;
                }
                this.f38466d = true;
                this.f38465c.dispose();
                this.f38463a.onNext(Boolean.FALSE);
                this.f38463a.onComplete();
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38465c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38465c, bVar)) {
                this.f38465c = bVar;
                this.f38463a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super Boolean> sVar, Lu.q<? super T> qVar) {
            this.f38463a = sVar;
            this.f38464b = qVar;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super Boolean> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38462b));
    }

    public C5390f(io.reactivex.q<T> qVar, Lu.q<? super T> qVar2) {
        super(qVar);
        this.f38462b = qVar2;
    }
}
