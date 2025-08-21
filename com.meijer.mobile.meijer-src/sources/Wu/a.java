package Wu;

import Ou.e;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class a<T> implements e<T> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<C0889a<T>> f41448a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<C0889a<T>> f41449b = new AtomicReference<>();

    /* renamed from: Wu.a$a, reason: collision with other inner class name */
    static final class C0889a<E> extends AtomicReference<C0889a<E>> {

        /* renamed from: a, reason: collision with root package name */
        private E f41450a;

        C0889a() {
        }

        C0889a(E e10) {
            e(e10);
        }

        public E b() {
            return this.f41450a;
        }

        public void e(E e10) {
            this.f41450a = e10;
        }

        public E a() {
            E eB = b();
            e(null);
            return eB;
        }

        public C0889a<E> c() {
            return get();
        }

        public void d(C0889a<E> c0889a) {
            lazySet(c0889a);
        }
    }

    C0889a<T> b() {
        return this.f41449b.get();
    }

    C0889a<T> c() {
        return this.f41449b.get();
    }

    C0889a<T> d() {
        return this.f41448a.get();
    }

    void e(C0889a<T> c0889a) {
        this.f41449b.lazySet(c0889a);
    }

    C0889a<T> f(C0889a<T> c0889a) {
        return this.f41448a.getAndSet(c0889a);
    }

    @Override // Ou.f
    public boolean offer(T t10) {
        if (t10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        C0889a<T> c0889a = new C0889a<>(t10);
        f(c0889a).d(c0889a);
        return true;
    }

    public a() {
        C0889a<T> c0889a = new C0889a<>();
        e(c0889a);
        f(c0889a);
    }

    @Override // Ou.f
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // Ou.f
    public boolean isEmpty() {
        if (c() == d()) {
            return true;
        }
        return false;
    }

    @Override // Ou.e, Ou.f
    public T poll() {
        C0889a<T> c0889aC;
        C0889a<T> c0889aB = b();
        C0889a<T> c0889aC2 = c0889aB.c();
        if (c0889aC2 != null) {
            T tA = c0889aC2.a();
            e(c0889aC2);
            return tA;
        }
        if (c0889aB != d()) {
            do {
                c0889aC = c0889aB.c();
            } while (c0889aC == null);
            T tA2 = c0889aC.a();
            e(c0889aC);
            return tA2;
        }
        return null;
    }
}
