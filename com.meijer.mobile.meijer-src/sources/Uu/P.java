package Uu;

import cv.C13558a;
import java.util.NoSuchElementException;

/* loaded from: classes10.dex */
public final class P<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f38152b;

    /* renamed from: c, reason: collision with root package name */
    final T f38153c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f38154d;

    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38155a;

        /* renamed from: b, reason: collision with root package name */
        final long f38156b;

        /* renamed from: c, reason: collision with root package name */
        final T f38157c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f38158d;

        /* renamed from: e, reason: collision with root package name */
        Ju.b f38159e;

        /* renamed from: f, reason: collision with root package name */
        long f38160f;

        /* renamed from: g, reason: collision with root package name */
        boolean f38161g;

        @Override // Ju.b
        public void dispose() {
            this.f38159e.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38159e.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38161g) {
                return;
            }
            this.f38161g = true;
            T t10 = this.f38157c;
            if (t10 == null && this.f38158d) {
                this.f38155a.onError(new NoSuchElementException());
                return;
            }
            if (t10 != null) {
                this.f38155a.onNext(t10);
            }
            this.f38155a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38161g) {
                C13558a.s(th2);
            } else {
                this.f38161g = true;
                this.f38155a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38161g) {
                return;
            }
            long j10 = this.f38160f;
            if (j10 != this.f38156b) {
                this.f38160f = j10 + 1;
                return;
            }
            this.f38161g = true;
            this.f38159e.dispose();
            this.f38155a.onNext(t10);
            this.f38155a.onComplete();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38159e, bVar)) {
                this.f38159e = bVar;
                this.f38155a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, long j10, T t10, boolean z10) {
            this.f38155a = sVar;
            this.f38156b = j10;
            this.f38157c = t10;
            this.f38158d = z10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38152b, this.f38153c, this.f38154d));
    }

    public P(io.reactivex.q<T> qVar, long j10, T t10, boolean z10) {
        super(qVar);
        this.f38152b = j10;
        this.f38153c = t10;
        this.f38154d = z10;
    }
}
