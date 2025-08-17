package Yu;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Yu.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5445d<T> implements Iterable<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f41200a;

    /* renamed from: b, reason: collision with root package name */
    final T f41201b;

    /* renamed from: Yu.d$a */
    static final class a<T> extends io.reactivex.observers.b<T> {

        /* renamed from: b, reason: collision with root package name */
        volatile Object f41202b;

        /* renamed from: Yu.d$a$a, reason: collision with other inner class name */
        final class C0884a implements Iterator<T> {

            /* renamed from: a, reason: collision with root package name */
            private Object f41203a;

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.f41203a == null) {
                        this.f41203a = a.this.f41202b;
                    }
                    if (ev.m.t(this.f41203a)) {
                        throw new NoSuchElementException();
                    }
                    if (ev.m.u(this.f41203a)) {
                        throw ev.j.d(ev.m.o(this.f41203a));
                    }
                    T t10 = (T) ev.m.p(this.f41203a);
                    this.f41203a = null;
                    return t10;
                } catch (Throwable th2) {
                    this.f41203a = null;
                    throw th2;
                }
            }

            C0884a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                this.f41203a = a.this.f41202b;
                return !ev.m.t(r0);
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public a<T>.C0884a b() {
            return new C0884a();
        }

        a(T t10) {
            this.f41202b = ev.m.z(t10);
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41202b = ev.m.e();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41202b = ev.m.m(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f41202b = ev.m.z(t10);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a(this.f41201b);
        this.f41200a.subscribe(aVar);
        return aVar.b();
    }

    public C5445d(io.reactivex.q<T> qVar, T t10) {
        this.f41200a = qVar;
        this.f41201b = t10;
    }
}
