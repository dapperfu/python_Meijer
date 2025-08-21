package Uu;

import cv.C13558a;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class O1<T, U, V> extends io.reactivex.l<V> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.l<? extends T> f38144a;

    /* renamed from: b, reason: collision with root package name */
    final Iterable<U> f38145b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.c<? super T, ? super U, ? extends V> f38146c;

    static final class a<T, U, V> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super V> f38147a;

        /* renamed from: b, reason: collision with root package name */
        final Iterator<U> f38148b;

        /* renamed from: c, reason: collision with root package name */
        final Lu.c<? super T, ? super U, ? extends V> f38149c;

        /* renamed from: d, reason: collision with root package name */
        Ju.b f38150d;

        /* renamed from: e, reason: collision with root package name */
        boolean f38151e;

        void a(Throwable th2) {
            this.f38151e = true;
            this.f38150d.dispose();
            this.f38147a.onError(th2);
        }

        @Override // Ju.b
        public void dispose() {
            this.f38150d.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38150d.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38151e) {
                return;
            }
            this.f38151e = true;
            this.f38147a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38151e) {
                C13558a.s(th2);
            } else {
                this.f38151e = true;
                this.f38147a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38151e) {
                return;
            }
            try {
                try {
                    this.f38147a.onNext(Nu.b.e(this.f38149c.apply(t10, Nu.b.e(this.f38148b.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (this.f38148b.hasNext()) {
                            return;
                        }
                        this.f38151e = true;
                        this.f38150d.dispose();
                        this.f38147a.onComplete();
                    } catch (Throwable th2) {
                        Ku.a.b(th2);
                        a(th2);
                    }
                } catch (Throwable th3) {
                    Ku.a.b(th3);
                    a(th3);
                }
            } catch (Throwable th4) {
                Ku.a.b(th4);
                a(th4);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38150d, bVar)) {
                this.f38150d = bVar;
                this.f38147a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super V> sVar, Iterator<U> it, Lu.c<? super T, ? super U, ? extends V> cVar) {
            this.f38147a = sVar;
            this.f38148b = it;
            this.f38149c = cVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super V> sVar) {
        try {
            Iterator it = (Iterator) Nu.b.e(this.f38145b.iterator(), "The iterator returned by other is null");
            try {
                if (it.hasNext()) {
                    this.f38144a.subscribe(new a(sVar, it, this.f38146c));
                } else {
                    Mu.e.e(sVar);
                }
            } catch (Throwable th2) {
                Ku.a.b(th2);
                Mu.e.m(th2, sVar);
            }
        } catch (Throwable th3) {
            Ku.a.b(th3);
            Mu.e.m(th3, sVar);
        }
    }

    public O1(io.reactivex.l<? extends T> lVar, Iterable<U> iterable, Lu.c<? super T, ? super U, ? extends V> cVar) {
        this.f38144a = lVar;
        this.f38145b = iterable;
        this.f38146c = cVar;
    }
}
