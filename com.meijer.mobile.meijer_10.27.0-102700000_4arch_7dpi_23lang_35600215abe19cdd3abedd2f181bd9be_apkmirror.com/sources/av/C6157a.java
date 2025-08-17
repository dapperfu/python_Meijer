package av;

import Su.e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: av.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6157a<T> implements e<T> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<C1166a<T>> f59481a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<C1166a<T>> f59482b = new AtomicReference<>();

    /* renamed from: av.a$a, reason: collision with other inner class name */
    static final class C1166a<E> extends AtomicReference<C1166a<E>> {

        /* renamed from: a, reason: collision with root package name */
        private E f59483a;

        C1166a() {
        }

        C1166a(E e10) {
            e(e10);
        }

        public E b() {
            return this.f59483a;
        }

        public void e(E e10) {
            this.f59483a = e10;
        }

        public E a() {
            E eB = b();
            e(null);
            return eB;
        }

        public C1166a<E> c() {
            return get();
        }

        public void d(C1166a<E> c1166a) {
            lazySet(c1166a);
        }
    }

    C1166a<T> b() {
        return this.f59482b.get();
    }

    C1166a<T> c() {
        return this.f59482b.get();
    }

    C1166a<T> d() {
        return this.f59481a.get();
    }

    void e(C1166a<T> c1166a) {
        this.f59482b.lazySet(c1166a);
    }

    C1166a<T> f(C1166a<T> c1166a) {
        return this.f59481a.getAndSet(c1166a);
    }

    @Override // Su.f
    public boolean offer(T t10) {
        if (t10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        C1166a<T> c1166a = new C1166a<>(t10);
        f(c1166a).d(c1166a);
        return true;
    }

    public C6157a() {
        C1166a<T> c1166a = new C1166a<>();
        e(c1166a);
        f(c1166a);
    }

    @Override // Su.f
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // Su.f
    public boolean isEmpty() {
        if (c() == d()) {
            return true;
        }
        return false;
    }

    @Override // Su.e, Su.f
    public T poll() {
        C1166a<T> c1166aC;
        C1166a<T> c1166aB = b();
        C1166a<T> c1166aC2 = c1166aB.c();
        if (c1166aC2 != null) {
            T tA = c1166aC2.a();
            e(c1166aC2);
            return tA;
        }
        if (c1166aB != d()) {
            do {
                c1166aC = c1166aB.c();
            } while (c1166aC == null);
            T tA2 = c1166aC.a();
            e(c1166aC);
            return tA2;
        }
        return null;
    }
}
