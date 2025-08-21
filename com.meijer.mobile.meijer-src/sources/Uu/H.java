package Uu;

import cv.C13558a;

/* loaded from: classes10.dex */
public final class H<T, R> extends AbstractC5375a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super T, ? extends io.reactivex.k<R>> f37932b;

    static final class a<T, R> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f37933a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.o<? super T, ? extends io.reactivex.k<R>> f37934b;

        /* renamed from: c, reason: collision with root package name */
        boolean f37935c;

        /* renamed from: d, reason: collision with root package name */
        Ju.b f37936d;

        @Override // Ju.b
        public void dispose() {
            this.f37936d.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f37936d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f37935c) {
                return;
            }
            this.f37935c = true;
            this.f37933a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f37935c) {
                C13558a.s(th2);
            } else {
                this.f37935c = true;
                this.f37933a.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f37935c) {
                if (t10 instanceof io.reactivex.k) {
                    io.reactivex.k kVar = (io.reactivex.k) t10;
                    if (kVar.g()) {
                        C13558a.s(kVar.d());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                io.reactivex.k kVar2 = (io.reactivex.k) Nu.b.e(this.f37934b.apply(t10), "The selector returned a null Notification");
                if (kVar2.g()) {
                    this.f37936d.dispose();
                    onError(kVar2.d());
                } else if (!kVar2.f()) {
                    this.f37933a.onNext((Object) kVar2.e());
                } else {
                    this.f37936d.dispose();
                    onComplete();
                }
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f37936d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f37936d, bVar)) {
                this.f37936d = bVar;
                this.f37933a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super R> sVar, Lu.o<? super T, ? extends io.reactivex.k<R>> oVar) {
            this.f37933a = sVar;
            this.f37934b = oVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super R> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f37932b));
    }

    public H(io.reactivex.q<T> qVar, Lu.o<? super T, ? extends io.reactivex.k<R>> oVar) {
        super(qVar);
        this.f37932b = oVar;
    }
}
