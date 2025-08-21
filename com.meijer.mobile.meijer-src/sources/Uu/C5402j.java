package Uu;

import cv.C13558a;

/* renamed from: Uu.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5402j<T> extends io.reactivex.u<Boolean> implements Ou.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f38528a;

    /* renamed from: b, reason: collision with root package name */
    final Lu.q<? super T> f38529b;

    /* renamed from: Uu.j$a */
    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super Boolean> f38530a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.q<? super T> f38531b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f38532c;

        /* renamed from: d, reason: collision with root package name */
        boolean f38533d;

        @Override // Ju.b
        public void dispose() {
            this.f38532c.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38532c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38533d) {
                return;
            }
            this.f38533d = true;
            this.f38530a.onSuccess(Boolean.FALSE);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38533d) {
                C13558a.s(th2);
            } else {
                this.f38533d = true;
                this.f38530a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38533d) {
                return;
            }
            try {
                if (this.f38531b.test(t10)) {
                    this.f38533d = true;
                    this.f38532c.dispose();
                    this.f38530a.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38532c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38532c, bVar)) {
                this.f38532c = bVar;
                this.f38530a.onSubscribe(this);
            }
        }

        a(io.reactivex.w<? super Boolean> wVar, Lu.q<? super T> qVar) {
            this.f38530a = wVar;
            this.f38531b = qVar;
        }
    }

    @Override // Ou.a
    public io.reactivex.l<Boolean> b() {
        return C13558a.o(new C5399i(this.f38528a, this.f38529b));
    }

    @Override // io.reactivex.u
    protected void p(io.reactivex.w<? super Boolean> wVar) {
        this.f38528a.subscribe(new a(wVar, this.f38529b));
    }

    public C5402j(io.reactivex.q<T> qVar, Lu.q<? super T> qVar2) {
        this.f38528a = qVar;
        this.f38529b = qVar2;
    }
}
