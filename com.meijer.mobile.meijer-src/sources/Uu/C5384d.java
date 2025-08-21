package Uu;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Uu.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5384d<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f38425a;

    /* renamed from: b, reason: collision with root package name */
    final T f38426b;

    /* renamed from: Uu.d$a */
    static final class a<T> extends io.reactivex.observers.b<T> {

        /* renamed from: b, reason: collision with root package name */
        volatile Object f38427b;

        /* renamed from: Uu.d$a$a, reason: collision with other inner class name */
        final class C0841a implements Iterator<T> {

            /* renamed from: a, reason: collision with root package name */
            private Object f38428a;

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.f38428a == null) {
                        this.f38428a = a.this.f38427b;
                    }
                    if (av.m.t(this.f38428a)) {
                        throw new NoSuchElementException();
                    }
                    if (av.m.u(this.f38428a)) {
                        throw av.j.d(av.m.o(this.f38428a));
                    }
                    T t10 = (T) av.m.p(this.f38428a);
                    this.f38428a = null;
                    return t10;
                } catch (Throwable th2) {
                    this.f38428a = null;
                    throw th2;
                }
            }

            C0841a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                this.f38428a = a.this.f38427b;
                return !av.m.t(r0);
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public a<T>.C0841a b() {
            return new C0841a();
        }

        a(T t10) {
            this.f38427b = av.m.z(t10);
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38427b = av.m.e();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38427b = av.m.m(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38427b = av.m.z(t10);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a(this.f38426b);
        this.f38425a.subscribe(aVar);
        return aVar.b();
    }

    public C5384d(io.reactivex.q<T> qVar, T t10) {
        this.f38425a = qVar;
        this.f38426b = t10;
    }
}
