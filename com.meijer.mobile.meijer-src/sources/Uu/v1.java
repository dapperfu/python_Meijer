package Uu;

import cv.C13558a;

/* loaded from: classes10.dex */
public final class v1<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.q<? super T> f38949b;

    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38950a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.q<? super T> f38951b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f38952c;

        /* renamed from: d, reason: collision with root package name */
        boolean f38953d;

        @Override // Ju.b
        public void dispose() {
            this.f38952c.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38952c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38953d) {
                return;
            }
            this.f38953d = true;
            this.f38950a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38953d) {
                C13558a.s(th2);
            } else {
                this.f38953d = true;
                this.f38950a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38953d) {
                return;
            }
            try {
                if (this.f38951b.test(t10)) {
                    this.f38950a.onNext(t10);
                    return;
                }
                this.f38953d = true;
                this.f38952c.dispose();
                this.f38950a.onComplete();
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38952c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38952c, bVar)) {
                this.f38952c = bVar;
                this.f38950a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, Lu.q<? super T> qVar) {
            this.f38950a = sVar;
            this.f38951b = qVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38949b));
    }

    public v1(io.reactivex.q<T> qVar, Lu.q<? super T> qVar2) {
        super(qVar);
        this.f38949b = qVar2;
    }
}
