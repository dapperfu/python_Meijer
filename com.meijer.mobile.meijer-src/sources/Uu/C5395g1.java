package Uu;

import cv.C13558a;
import java.util.NoSuchElementException;

/* renamed from: Uu.g1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5395g1<T> extends io.reactivex.u<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<? extends T> f38488a;

    /* renamed from: b, reason: collision with root package name */
    final T f38489b;

    /* renamed from: Uu.g1$a */
    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f38490a;

        /* renamed from: b, reason: collision with root package name */
        final T f38491b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f38492c;

        /* renamed from: d, reason: collision with root package name */
        T f38493d;

        /* renamed from: e, reason: collision with root package name */
        boolean f38494e;

        @Override // Ju.b
        public void dispose() {
            this.f38492c.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38492c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38494e) {
                return;
            }
            this.f38494e = true;
            T t10 = this.f38493d;
            this.f38493d = null;
            if (t10 == null) {
                t10 = this.f38491b;
            }
            if (t10 != null) {
                this.f38490a.onSuccess(t10);
            } else {
                this.f38490a.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38494e) {
                C13558a.s(th2);
            } else {
                this.f38494e = true;
                this.f38490a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38494e) {
                return;
            }
            if (this.f38493d == null) {
                this.f38493d = t10;
                return;
            }
            this.f38494e = true;
            this.f38492c.dispose();
            this.f38490a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38492c, bVar)) {
                this.f38492c = bVar;
                this.f38490a.onSubscribe(this);
            }
        }

        a(io.reactivex.w<? super T> wVar, T t10) {
            this.f38490a = wVar;
            this.f38491b = t10;
        }
    }

    @Override // io.reactivex.u
    public void p(io.reactivex.w<? super T> wVar) {
        this.f38488a.subscribe(new a(wVar, this.f38489b));
    }

    public C5395g1(io.reactivex.q<? extends T> qVar, T t10) {
        this.f38488a = qVar;
        this.f38489b = t10;
    }
}
