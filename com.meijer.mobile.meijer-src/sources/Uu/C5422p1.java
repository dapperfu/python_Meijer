package Uu;

import cv.C13558a;

/* renamed from: Uu.p1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5422p1<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f38769b;

    /* renamed from: Uu.p1$a */
    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38770a;

        /* renamed from: b, reason: collision with root package name */
        boolean f38771b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f38772c;

        /* renamed from: d, reason: collision with root package name */
        long f38773d;

        @Override // Ju.b
        public void dispose() {
            this.f38772c.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38772c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38771b) {
                return;
            }
            this.f38771b = true;
            this.f38772c.dispose();
            this.f38770a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38771b) {
                C13558a.s(th2);
                return;
            }
            this.f38771b = true;
            this.f38772c.dispose();
            this.f38770a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38771b) {
                return;
            }
            long j10 = this.f38773d;
            long j11 = j10 - 1;
            this.f38773d = j11;
            if (j10 > 0) {
                boolean z10 = j11 == 0;
                this.f38770a.onNext(t10);
                if (z10) {
                    onComplete();
                }
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38772c, bVar)) {
                this.f38772c = bVar;
                if (this.f38773d != 0) {
                    this.f38770a.onSubscribe(this);
                    return;
                }
                this.f38771b = true;
                bVar.dispose();
                Mu.e.e(this.f38770a);
            }
        }

        a(io.reactivex.s<? super T> sVar, long j10) {
            this.f38770a = sVar;
            this.f38773d = j10;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38769b));
    }

    public C5422p1(io.reactivex.q<T> qVar, long j10) {
        super(qVar);
        this.f38769b = j10;
    }
}
