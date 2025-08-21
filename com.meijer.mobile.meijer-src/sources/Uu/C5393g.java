package Uu;

import cv.C13558a;

/* renamed from: Uu.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5393g<T> extends io.reactivex.u<Boolean> implements Ou.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f38479a;

    /* renamed from: b, reason: collision with root package name */
    final Lu.q<? super T> f38480b;

    /* renamed from: Uu.g$a */
    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super Boolean> f38481a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.q<? super T> f38482b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f38483c;

        /* renamed from: d, reason: collision with root package name */
        boolean f38484d;

        @Override // Ju.b
        public void dispose() {
            this.f38483c.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38483c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38484d) {
                return;
            }
            this.f38484d = true;
            this.f38481a.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38484d) {
                C13558a.s(th2);
            } else {
                this.f38484d = true;
                this.f38481a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38484d) {
                return;
            }
            try {
                if (this.f38482b.test(t10)) {
                    return;
                }
                this.f38484d = true;
                this.f38483c.dispose();
                this.f38481a.onSuccess(Boolean.FALSE);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38483c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38483c, bVar)) {
                this.f38483c = bVar;
                this.f38481a.onSubscribe(this);
            }
        }

        a(io.reactivex.w<? super Boolean> wVar, Lu.q<? super T> qVar) {
            this.f38481a = wVar;
            this.f38482b = qVar;
        }
    }

    @Override // Ou.a
    public io.reactivex.l<Boolean> b() {
        return C13558a.o(new C5390f(this.f38479a, this.f38480b));
    }

    @Override // io.reactivex.u
    protected void p(io.reactivex.w<? super Boolean> wVar) {
        this.f38479a.subscribe(new a(wVar, this.f38480b));
    }

    public C5393g(io.reactivex.q<T> qVar, Lu.q<? super T> qVar2) {
        this.f38479a = qVar;
        this.f38480b = qVar2;
    }
}
