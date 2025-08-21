package Uu;

import cv.C13558a;

/* renamed from: Uu.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5399i<T> extends AbstractC5375a<T, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.q<? super T> f38509b;

    /* renamed from: Uu.i$a */
    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super Boolean> f38510a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.q<? super T> f38511b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f38512c;

        /* renamed from: d, reason: collision with root package name */
        boolean f38513d;

        @Override // Ju.b
        public void dispose() {
            this.f38512c.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38512c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38513d) {
                return;
            }
            this.f38513d = true;
            this.f38510a.onNext(Boolean.FALSE);
            this.f38510a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38513d) {
                C13558a.s(th2);
            } else {
                this.f38513d = true;
                this.f38510a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38513d) {
                return;
            }
            try {
                if (this.f38511b.test(t10)) {
                    this.f38513d = true;
                    this.f38512c.dispose();
                    this.f38510a.onNext(Boolean.TRUE);
                    this.f38510a.onComplete();
                }
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38512c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38512c, bVar)) {
                this.f38512c = bVar;
                this.f38510a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super Boolean> sVar, Lu.q<? super T> qVar) {
            this.f38510a = sVar;
            this.f38511b = qVar;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super Boolean> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38509b));
    }

    public C5399i(io.reactivex.q<T> qVar, Lu.q<? super T> qVar2) {
        super(qVar);
        this.f38509b = qVar2;
    }
}
