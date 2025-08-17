package Ce;

import Ce.J;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.stream.Collector;

/* loaded from: classes6.dex */
public abstract class L<E> extends J<E> implements List<E>, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private static final z0<Object> f3887b = new b(m0.f4081e, 0);

    public static final class a<E> extends J.a<E> {
        public a() {
            this(4);
        }

        public L<E> k() {
            this.f3884c = true;
            return L.o(this.f3882a, this.f3883b);
        }

        a(int i10) {
            super(i10);
        }

        a<E> l(a<E> aVar) {
            f(aVar.f3882a, aVar.f3883b);
            return this;
        }

        @Override // Ce.J.b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e10) {
            super.d(e10);
            return this;
        }

        public a<E> i(E... eArr) {
            super.e(eArr);
            return this;
        }

        public a<E> j(Iterable<? extends E> iterable) {
            super.b(iterable);
            return this;
        }
    }

    static class b<E> extends AbstractC3009a<E> {

        /* renamed from: c, reason: collision with root package name */
        private final L<E> f3888c;

        @Override // Ce.AbstractC3009a
        protected E a(int i10) {
            return this.f3888c.get(i10);
        }

        b(L<E> l10, int i10) {
            super(l10.size(), i10);
            this.f3888c = l10;
        }
    }

    private static class c<E> extends L<E> {

        /* renamed from: c, reason: collision with root package name */
        private final transient L<E> f3889c;

        @Override // Ce.L, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // Ce.L
        public L<E> F() {
            return this.f3889c;
        }

        @Override // Ce.L, Ce.J, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f3889c.contains(obj);
        }

        @Override // Ce.L, java.util.List
        public int indexOf(Object obj) {
            int iLastIndexOf = this.f3889c.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return L(iLastIndexOf);
            }
            return -1;
        }

        @Override // Ce.J
        boolean l() {
            return this.f3889c.l();
        }

        @Override // Ce.L, java.util.List
        public int lastIndexOf(Object obj) {
            int iIndexOf = this.f3889c.indexOf(obj);
            if (iIndexOf >= 0) {
                return L(iIndexOf);
            }
            return -1;
        }

        @Override // Ce.L, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f3889c.size();
        }

        c(L<E> l10) {
            this.f3889c = l10;
        }

        private int L(int i10) {
            return (size() - 1) - i10;
        }

        private int M(int i10) {
            return size() - i10;
        }

        @Override // Ce.L, java.util.List
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public L<E> subList(int i10, int i11) {
            Be.p.v(i10, i11, size());
            return this.f3889c.subList(M(i11), M(i10)).F();
        }

        @Override // java.util.List
        public E get(int i10) {
            Be.p.o(i10, size());
            return this.f3889c.get(L(i10));
        }

        @Override // Ce.L, Ce.J, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }
    }

    class d extends L<E> {

        /* renamed from: c, reason: collision with root package name */
        final transient int f3890c;

        /* renamed from: d, reason: collision with root package name */
        final transient int f3891d;

        @Override // Ce.J
        boolean l() {
            return true;
        }

        @Override // Ce.L, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        d(int i10, int i11) {
            this.f3890c = i10;
            this.f3891d = i11;
        }

        @Override // Ce.L, java.util.List
        /* renamed from: H */
        public L<E> subList(int i10, int i11) {
            Be.p.v(i10, i11, this.f3891d);
            L l10 = L.this;
            int i12 = this.f3890c;
            return l10.subList(i10 + i12, i11 + i12);
        }

        @Override // Ce.J
        Object[] f() {
            return L.this.f();
        }

        @Override // java.util.List
        public E get(int i10) {
            Be.p.o(i10, this.f3891d);
            return L.this.get(i10 + this.f3890c);
        }

        @Override // Ce.J
        int h() {
            return L.this.k() + this.f3890c + this.f3891d;
        }

        @Override // Ce.J
        int k() {
            return L.this.k() + this.f3890c;
        }

        @Override // Ce.L, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f3891d;
        }

        @Override // Ce.L, Ce.J, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }
    }

    static <E> L<E> n(Object[] objArr) {
        return o(objArr, objArr.length);
    }

    public static <E> L<E> t(E[] eArr) {
        return eArr.length == 0 ? x() : r((Object[]) eArr.clone());
    }

    @Override // Ce.J
    @Deprecated
    public final L<E> a() {
        return this;
    }

    @Override // java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public z0<E> listIterator() {
        return listIterator(0);
    }

    @SafeVarargs
    public static <E> L<E> E(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e20, E e21, E... eArr) {
        Be.p.e(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[eArr.length + 12];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        objArr[6] = e16;
        objArr[7] = e17;
        objArr[8] = e18;
        objArr[9] = e19;
        objArr[10] = e20;
        objArr[11] = e21;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return r(objArr);
    }

    static <E> L<E> o(Object[] objArr, int i10) {
        return i10 == 0 ? x() : new m0(objArr, i10);
    }

    public static <E> a<E> p() {
        return new a<>();
    }

    public static <E> a<E> q(int i10) {
        C3030w.b(i10, "expectedSize");
        return new a<>(i10);
    }

    public static <E> L<E> s(Collection<? extends E> collection) {
        if (!(collection instanceof J)) {
            return r(collection.toArray());
        }
        L<E> lA = ((J) collection).a();
        return lA.l() ? n(lA.toArray()) : lA;
    }

    public static <E> L<E> x() {
        return (L<E>) m0.f4081e;
    }

    L<E> I(int i10, int i11) {
        return new d(i10, i11 - i10);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return U.c(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return U.e(this, obj);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    L() {
    }

    public static <E> L<E> B(E e10, E e11, E e12) {
        return r(e10, e11, e12);
    }

    public static <E> L<E> C(E e10, E e11, E e12, E e13, E e14) {
        return r(e10, e11, e12, e13, e14);
    }

    public static <E> L<E> D(E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return r(e10, e11, e12, e13, e14, e15, e16);
    }

    public static <E> L<E> G(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Be.p.q(comparator);
        Object[] objArrN = Q.n(iterable);
        f0.b(objArrN);
        Arrays.sort(objArrN, comparator);
        return n(objArrN);
    }

    public static <E> Collector<E, ?, L<E>> K() {
        return C3029v.a();
    }

    private static <E> L<E> r(Object... objArr) {
        return n(f0.b(objArr));
    }

    public static <E> L<E> y(E e10) {
        return r(e10);
    }

    public static <E> L<E> z(E e10, E e11) {
        return r(e10, e11);
    }

    public L<E> F() {
        if (size() <= 1) {
            return this;
        }
        return new c(this);
    }

    @Override // java.util.List
    /* renamed from: H */
    public L<E> subList(int i10, int i11) {
        Be.p.v(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return x();
        }
        return I(i10, i11);
    }

    @Override // Ce.J, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // Ce.J
    int e(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return U.b(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // Ce.J, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public y0<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public z0<E> listIterator(int i10) {
        Be.p.t(i10, size());
        if (isEmpty()) {
            return (z0<E>) f3887b;
        }
        return new b(this, i10);
    }
}
