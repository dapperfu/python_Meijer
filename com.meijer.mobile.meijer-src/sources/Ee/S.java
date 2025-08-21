package Ee;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class S {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends AbstractC3213b<T> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f7233c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ De.q f7234d;

        a(Iterator it, De.q qVar) {
            this.f7233c = it;
            this.f7234d = qVar;
        }

        @Override // Ee.AbstractC3213b
        protected T a() {
            while (this.f7233c.hasNext()) {
                T t10 = (T) this.f7233c.next();
                if (this.f7234d.apply(t10)) {
                    return t10;
                }
            }
            return c();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class b<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        private int f7235a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7236b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f7237c;

        b(int i10, Iterator it) {
            this.f7236b = i10;
            this.f7237c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7235a < this.f7236b && this.f7237c.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f7237c.remove();
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                this.f7235a++;
                return (T) this.f7237c.next();
            }
            throw new NoSuchElementException();
        }
    }

    private static final class c<T> extends AbstractC3212a<T> {

        /* renamed from: d, reason: collision with root package name */
        static final z0<Object> f7238d = new c(new Object[0], 0);

        /* renamed from: c, reason: collision with root package name */
        private final T[] f7239c;

        c(T[] tArr, int i10) {
            super(tArr.length, i10);
            this.f7239c = tArr;
        }

        @Override // Ee.AbstractC3212a
        protected T a(int i10) {
            return this.f7239c[i10];
        }
    }

    private static class d<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        private Iterator<? extends T> f7240a;

        /* renamed from: b, reason: collision with root package name */
        private Iterator<? extends T> f7241b = S.i();

        /* renamed from: c, reason: collision with root package name */
        private Iterator<? extends Iterator<? extends T>> f7242c;

        /* renamed from: d, reason: collision with root package name */
        private Deque<Iterator<? extends Iterator<? extends T>>> f7243d;

        private Iterator<? extends Iterator<? extends T>> a() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.f7242c;
                if (it != null && it.hasNext()) {
                    return this.f7242c;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.f7243d;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.f7242c = this.f7243d.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) De.p.q(this.f7241b)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> itA = a();
                this.f7242c = itA;
                if (itA == null) {
                    return false;
                }
                Iterator<? extends T> next = itA.next();
                this.f7241b = next;
                if (next instanceof d) {
                    d dVar = (d) next;
                    this.f7241b = dVar.f7241b;
                    if (this.f7243d == null) {
                        this.f7243d = new ArrayDeque();
                    }
                    this.f7243d.addFirst(this.f7242c);
                    if (dVar.f7243d != null) {
                        while (!dVar.f7243d.isEmpty()) {
                            this.f7243d.addFirst(dVar.f7243d.removeLast());
                        }
                    }
                    this.f7242c = dVar.f7242c;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it = this.f7240a;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.f7240a = null;
        }

        d(Iterator<? extends Iterator<? extends T>> it) {
            this.f7242c = (Iterator) De.p.q(it);
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                Iterator<? extends T> it = this.f7241b;
                this.f7240a = it;
                return it.next();
            }
            throw new NoSuchElementException();
        }
    }

    private enum e implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            C3233w.c(false);
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }
    }

    private static class f<E> implements h0<E> {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator<? extends E> f7246a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f7247b;

        /* renamed from: c, reason: collision with root package name */
        private E f7248c;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7247b || this.f7246a.hasNext();
        }

        @Override // Ee.h0, java.util.Iterator
        public E next() {
            if (!this.f7247b) {
                return this.f7246a.next();
            }
            E e10 = (E) e0.a(this.f7248c);
            this.f7247b = false;
            this.f7248c = null;
            return e10;
        }

        @Override // Ee.h0
        public E peek() {
            if (!this.f7247b) {
                this.f7248c = this.f7246a.next();
                this.f7247b = true;
            }
            return (E) e0.a(this.f7248c);
        }

        @Override // java.util.Iterator
        public void remove() {
            De.p.x(!this.f7247b, "Can't remove after you've peeked at next");
            this.f7246a.remove();
        }

        public f(Iterator<? extends E> it) {
            this.f7246a = (Iterator) De.p.q(it);
        }
    }

    private static final class g<T> extends y0<T> {

        /* renamed from: a, reason: collision with root package name */
        private final T f7249a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f7250b;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f7250b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f7250b) {
                throw new NoSuchElementException();
            }
            this.f7250b = true;
            return this.f7249a;
        }

        g(T t10) {
            this.f7249a = t10;
        }
    }

    public static boolean g(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    static void d(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException("position (" + i10 + ") must not be negative");
    }

    public static <T> Iterator<T> f(Iterator<? extends Iterator<? extends T>> it) {
        return new d(it);
    }

    static <T> z0<T> j() {
        return (z0<T>) c.f7238d;
    }

    static <T> Iterator<T> k() {
        return e.INSTANCE;
    }

    public static <T> int r(Iterator<T> it, De.q<? super T> qVar) {
        De.p.r(qVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (qVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static <T> h0<T> t(Iterator<? extends T> it) {
        return it instanceof f ? (f) it : new f(it);
    }

    public static <T> y0<T> x(T t10) {
        return new g(t10);
    }

    public static String y(Iterator<?> it) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z10 = false;
        }
        sb2.append(']');
        return sb2.toString();
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        De.p.q(collection);
        De.p.q(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static int b(Iterator<?> it, int i10) {
        boolean z10;
        De.p.q(it);
        int i11 = 0;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        De.p.e(z10, "numberToAdvance must be nonnegative");
        while (i11 < i10 && it.hasNext()) {
            it.next();
            i11++;
        }
        return i11;
    }

    public static <T> boolean c(Iterator<T> it, De.q<? super T> qVar) {
        if (r(it, qVar) != -1) {
            return true;
        }
        return false;
    }

    static void e(Iterator<?> it) {
        De.p.q(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean h(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !De.l.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    static <T> y0<T> i() {
        return j();
    }

    public static <T> y0<T> l(Iterator<T> it, De.q<? super T> qVar) {
        De.p.q(it);
        De.p.q(qVar);
        return new a(it, qVar);
    }

    public static <T> T m(Iterator<T> it, De.q<? super T> qVar) {
        De.p.q(it);
        De.p.q(qVar);
        while (it.hasNext()) {
            T next = it.next();
            if (qVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <T> T n(Iterator<T> it, int i10) {
        d(i10);
        int iB = b(it, i10);
        if (it.hasNext()) {
            return it.next();
        }
        throw new IndexOutOfBoundsException("position (" + i10 + ") must be less than the number of elements that remained (" + iB + ")");
    }

    public static <T> T o(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T p(Iterator<? extends T> it, T t10) {
        if (it.hasNext()) {
            return it.next();
        }
        return t10;
    }

    public static <T> T q(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        for (int i10 = 0; i10 < 4 && it.hasNext(); i10++) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append('>');
        throw new IllegalArgumentException(sb2.toString());
    }

    public static <T> Iterator<T> s(Iterator<T> it, int i10) {
        boolean z10;
        De.p.q(it);
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        De.p.e(z10, "limit is negative");
        return new b(i10, it);
    }

    static <T> T u(Iterator<T> it) {
        if (it.hasNext()) {
            T next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    public static boolean v(Iterator<?> it, Collection<?> collection) {
        De.p.q(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean w(Iterator<T> it, De.q<? super T> qVar) {
        De.p.q(qVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (qVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }
}
