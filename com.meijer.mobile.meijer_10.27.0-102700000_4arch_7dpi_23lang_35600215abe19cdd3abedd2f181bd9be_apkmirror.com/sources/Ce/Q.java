package Ce;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class Q {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends E<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f3914b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f3915c;

        /* renamed from: Ce.Q$a$a, reason: collision with other inner class name */
        class C0069a implements Iterator<T> {

            /* renamed from: a, reason: collision with root package name */
            boolean f3916a = true;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f3917b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f3918c;

            C0069a(a aVar, Iterator it) {
                this.f3917b = it;
                this.f3918c = aVar;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f3917b.hasNext();
            }

            @Override // java.util.Iterator
            public T next() {
                T t10 = (T) this.f3917b.next();
                this.f3916a = false;
                return t10;
            }

            @Override // java.util.Iterator
            public void remove() {
                C3030w.c(!this.f3916a);
                this.f3917b.remove();
            }
        }

        a(Iterable iterable, int i10) {
            this.f3914b = iterable;
            this.f3915c = i10;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.f3914b;
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.subList(Math.min(list.size(), this.f3915c), list.size()).iterator();
            }
            Iterator<T> it = iterable.iterator();
            S.b(it, this.f3915c);
            return new C0069a(this, it);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class b<T> extends E<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f3919b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f3920c;

        b(Iterable iterable, int i10) {
            this.f3919b = iterable;
            this.f3920c = i10;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return S.s(this.f3919b.iterator(), this.f3920c);
        }
    }

    private static <T> boolean k(List<T> list, Be.q<? super T> qVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            T t10 = list.get(i10);
            if (!qVar.apply(t10)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, t10);
                    } catch (IllegalArgumentException unused) {
                        m(list, qVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        m(list, qVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    private static <E> Collection<E> b(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : U.h(iterable.iterator());
    }

    public static <T> T f(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) S.o(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) g(list);
    }

    public static <T> boolean j(Iterable<T> iterable, Be.q<? super T> qVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? k((List) iterable, (Be.q) Be.p.q(qVar)) : S.w(iterable.iterator(), qVar);
    }

    public static <T> boolean a(Iterable<T> iterable, Be.q<? super T> qVar) {
        return S.c(iterable.iterator(), qVar);
    }

    public static <T> Iterable<T> c(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return E.a(iterable, iterable2);
    }

    public static <T> T d(Iterable<T> iterable, int i10) {
        Be.p.q(iterable);
        if (iterable instanceof List) {
            return (T) ((List) iterable).get(i10);
        }
        return (T) S.n(iterable.iterator(), i10);
    }

    public static <T> T e(Iterable<? extends T> iterable, T t10) {
        return (T) S.p(iterable.iterator(), t10);
    }

    private static <T> T g(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> T h(Iterable<T> iterable) {
        return (T) S.q(iterable.iterator());
    }

    public static <T> Iterable<T> i(Iterable<T> iterable, int i10) {
        boolean z10;
        Be.p.q(iterable);
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Be.p.e(z10, "limit is negative");
        return new b(iterable, i10);
    }

    public static <T> Iterable<T> l(Iterable<T> iterable, int i10) {
        boolean z10;
        Be.p.q(iterable);
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Be.p.e(z10, "number to skip cannot be negative");
        return new a(iterable, i10);
    }

    private static <T> void m(List<T> list, Be.q<? super T> qVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (qVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    static Object[] n(Iterable<?> iterable) {
        return b(iterable).toArray();
    }

    public static String o(Iterable<?> iterable) {
        return S.y(iterable.iterator());
    }
}
