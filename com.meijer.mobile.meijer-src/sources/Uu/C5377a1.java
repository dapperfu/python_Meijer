package Uu;

import cv.C13558a;

/* renamed from: Uu.a1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5377a1<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.c<T, T, T> f38373b;

    /* renamed from: Uu.a1$a */
    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38374a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.c<T, T, T> f38375b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f38376c;

        /* renamed from: d, reason: collision with root package name */
        T f38377d;

        /* renamed from: e, reason: collision with root package name */
        boolean f38378e;

        @Override // Ju.b
        public void dispose() {
            this.f38376c.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38376c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38378e) {
                return;
            }
            this.f38378e = true;
            this.f38374a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38378e) {
                C13558a.s(th2);
            } else {
                this.f38378e = true;
                this.f38374a.onError(th2);
            }
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38378e) {
                return;
            }
            io.reactivex.s<? super T> sVar = this.f38374a;
            T t11 = this.f38377d;
            if (t11 == null) {
                this.f38377d = t10;
                sVar.onNext(t10);
                return;
            }
            try {
                ?? r42 = (T) Nu.b.e(this.f38375b.apply(t11, t10), "The value returned by the accumulator is null");
                this.f38377d = r42;
                sVar.onNext(r42);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38376c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38376c, bVar)) {
                this.f38376c = bVar;
                this.f38374a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, Lu.c<T, T, T> cVar) {
            this.f38374a = sVar;
            this.f38375b = cVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38373b));
    }

    public C5377a1(io.reactivex.q<T> qVar, Lu.c<T, T, T> cVar) {
        super(qVar);
        this.f38373b = cVar;
    }
}
