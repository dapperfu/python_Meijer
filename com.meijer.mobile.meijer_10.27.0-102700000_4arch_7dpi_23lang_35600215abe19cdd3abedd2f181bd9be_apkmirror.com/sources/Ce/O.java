package Ce;

import Ce.J;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes6.dex */
public abstract class O<E> extends J<E> implements Set<E> {

    /* renamed from: b, reason: collision with root package name */
    private transient L<E> f3909b;

    public static class a<E> extends J.a<E> {

        /* renamed from: d, reason: collision with root package name */
        Object[] f3910d;

        /* renamed from: e, reason: collision with root package name */
        private int f3911e;

        public a() {
            super(4);
        }

        private void k(E e10) {
            Objects.requireNonNull(this.f3910d);
            int length = this.f3910d.length - 1;
            int iHashCode = e10.hashCode();
            int iB = I.b(iHashCode);
            while (true) {
                int i10 = iB & length;
                Object[] objArr = this.f3910d;
                Object obj = objArr[i10];
                if (obj == null) {
                    objArr[i10] = e10;
                    this.f3911e += iHashCode;
                    super.d(e10);
                    return;
                } else if (obj.equals(e10)) {
                    return;
                } else {
                    iB = i10 + 1;
                }
            }
        }

        public a<E> i(E... eArr) {
            if (this.f3910d == null) {
                super.e(eArr);
                return this;
            }
            for (E e10 : eArr) {
                a(e10);
            }
            return this;
        }

        public O<E> l() {
            O<E> oR;
            int i10 = this.f3883b;
            if (i10 == 0) {
                return O.x();
            }
            if (i10 == 1) {
                Object obj = this.f3882a[0];
                Objects.requireNonNull(obj);
                return O.y(obj);
            }
            if (this.f3910d == null || O.q(i10) != this.f3910d.length) {
                oR = O.r(this.f3883b, this.f3882a);
                this.f3883b = oR.size();
            } else {
                Object[] objArrCopyOf = O.F(this.f3883b, this.f3882a.length) ? Arrays.copyOf(this.f3882a, this.f3883b) : this.f3882a;
                oR = new o0<>(objArrCopyOf, this.f3911e, this.f3910d, r5.length - 1, this.f3883b);
            }
            this.f3884c = true;
            this.f3910d = null;
            return oR;
        }

        /* JADX WARN: Multi-variable type inference failed */
        a<E> m(a<E> aVar) {
            if (this.f3910d == null) {
                f(aVar.f3882a, aVar.f3883b);
                return this;
            }
            for (int i10 = 0; i10 < aVar.f3883b; i10++) {
                Object obj = aVar.f3882a[i10];
                Objects.requireNonNull(obj);
                a(obj);
            }
            return this;
        }

        @Override // Ce.J.b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e10) {
            Be.p.q(e10);
            if (this.f3910d != null && O.q(this.f3883b) <= this.f3910d.length) {
                k(e10);
                return this;
            }
            this.f3910d = null;
            super.d(e10);
            return this;
        }

        public a<E> j(Iterable<? extends E> iterable) {
            Be.p.q(iterable);
            if (this.f3910d != null) {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
                return this;
            }
            super.b(iterable);
            return this;
        }
    }

    public static <E> O<E> B(E e10, E e11, E e12) {
        return r(3, e10, e11, e12);
    }

    public static <E> O<E> C(E e10, E e11, E e12, E e13) {
        return r(4, e10, e11, e12, e13);
    }

    public static <E> O<E> D(E e10, E e11, E e12, E e13, E e14) {
        return r(5, e10, e11, e12, e13, e14);
    }

    @SafeVarargs
    public static <E> O<E> E(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        Be.p.e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return r(length, objArr);
    }

    static int q(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            Be.p.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static <E> O<E> t(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? r(eArr.length, (Object[]) eArr.clone()) : y(eArr[0]) : x();
    }

    public static <E> O<E> z(E e10, E e11) {
        return r(2, e10, e11);
    }

    @Override // Ce.J, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: m */
    public abstract y0<E> iterator();

    boolean v() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean F(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    public static <E> a<E> p() {
        return new a<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> O<E> r(int i10, Object... objArr) {
        if (i10 == 0) {
            return x();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return y(obj);
        }
        int iQ = q(i10);
        Object[] objArr2 = new Object[iQ];
        int i11 = iQ - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object objA = f0.a(objArr[i14], i14);
            int iHashCode = objA.hashCode();
            int iB = I.b(iHashCode);
            while (true) {
                int i15 = iB & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = objA;
                    objArr2[i15] = objA;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new t0(obj3);
        }
        if (q(i13) < iQ / 2) {
            return r(i13, objArr);
        }
        if (F(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new o0(objArr, i12, objArr2, i11, i13);
    }

    public static <E> O<E> s(Collection<? extends E> collection) {
        if ((collection instanceof O) && !(collection instanceof SortedSet)) {
            O<E> o10 = (O) collection;
            if (!o10.l()) {
                return o10;
            }
        }
        Object[] array = collection.toArray();
        return r(array.length, array);
    }

    public static <E> O<E> x() {
        return o0.f4099i;
    }

    public static <E> O<E> y(E e10) {
        return new t0(e10);
    }

    @Override // Ce.J
    public L<E> a() {
        L<E> l10 = this.f3909b;
        if (l10 != null) {
            return l10;
        }
        L<E> lU = u();
        this.f3909b = lU;
        return lU;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof O) && v() && ((O) obj).v() && hashCode() != obj.hashCode()) {
            return false;
        }
        return s0.a(this, obj);
    }

    O() {
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return s0.d(this);
    }

    L<E> u() {
        return L.n(toArray());
    }
}
