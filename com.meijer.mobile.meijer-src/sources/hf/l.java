package hf;

import gf.C14359f;
import hf.i;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Set;
import jf.C15004a;

/* loaded from: classes8.dex */
public abstract class l<E> extends i<E> implements Set<E> {

    /* renamed from: b, reason: collision with root package name */
    private transient k<E> f135357b;

    private static final class a<E> extends c<E> {

        /* renamed from: c, reason: collision with root package name */
        private final Set<Object> f135358c;

        @Override // hf.l.c
        l<E> c() {
            int i10 = this.f135364b;
            return i10 != 0 ? i10 != 1 ? new p(this.f135358c, k.h(this.f135363a, this.f135364b)) : l.q(this.f135363a[0]) : l.p();
        }

        a(c<E> cVar) {
            super(cVar);
            this.f135358c = z.c(this.f135364b);
            for (int i10 = 0; i10 < this.f135364b; i10++) {
                this.f135358c.add(this.f135363a[i10]);
            }
        }

        @Override // hf.l.c
        c<E> a(E e10) {
            C14359f.h(e10);
            if (this.f135358c.add(e10)) {
                b(e10);
            }
            return this;
        }
    }

    private static final class b<E> extends c<E> {

        /* renamed from: c, reason: collision with root package name */
        private Object[] f135359c;

        /* renamed from: d, reason: collision with root package name */
        private int f135360d;

        /* renamed from: e, reason: collision with root package name */
        private int f135361e;

        /* renamed from: f, reason: collision with root package name */
        private int f135362f;

        @Override // hf.l.c
        l<E> c() {
            int i10 = this.f135364b;
            if (i10 == 0) {
                return l.p();
            }
            if (i10 == 1) {
                return l.q(this.f135363a[0]);
            }
            Object[] objArrCopyOf = this.f135363a;
            if (i10 != objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i10);
            }
            int i11 = this.f135362f;
            Object[] objArr = this.f135359c;
            return new y(objArrCopyOf, i11, objArr, objArr.length - 1);
        }

        @Override // hf.l.c
        c<E> e() {
            int iH = l.h(this.f135364b);
            if (iH * 2 < this.f135359c.length) {
                this.f135359c = l.s(iH, this.f135363a, this.f135364b);
            }
            return l.m(this.f135359c) ? new a(this) : this;
        }

        void f(int i10) {
            if (i10 > this.f135361e) {
                Object[] objArr = this.f135359c;
                if (objArr.length < 1073741824) {
                    int length = objArr.length * 2;
                    this.f135359c = l.s(length, this.f135363a, this.f135364b);
                    this.f135360d = l.o(length);
                    this.f135361e = (int) (length * 0.7d);
                }
            }
        }

        b(int i10) {
            super(i10);
            int iH = l.h(i10);
            this.f135359c = new Object[iH];
            this.f135360d = l.o(iH);
            this.f135361e = (int) (iH * 0.7d);
        }

        @Override // hf.l.c
        c<E> a(E e10) {
            C14359f.h(e10);
            int iHashCode = e10.hashCode();
            int iA = g.a(iHashCode);
            int length = this.f135359c.length - 1;
            for (int i10 = iA; i10 - iA < this.f135360d; i10++) {
                int i11 = i10 & length;
                Object obj = this.f135359c[i11];
                if (obj == null) {
                    b(e10);
                    this.f135359c[i11] = e10;
                    this.f135362f += iHashCode;
                    f(this.f135364b);
                    return this;
                }
                if (obj.equals(e10)) {
                    return this;
                }
            }
            return new a(this).a(e10);
        }
    }

    private static abstract class c<E> {

        /* renamed from: a, reason: collision with root package name */
        E[] f135363a;

        /* renamed from: b, reason: collision with root package name */
        int f135364b;

        c(int i10) {
            this.f135363a = (E[]) new Object[i10];
            this.f135364b = 0;
        }

        abstract c<E> a(E e10);

        abstract l<E> c();

        c<E> e() {
            return this;
        }

        private void d(int i10) {
            E[] eArr = this.f135363a;
            if (i10 > eArr.length) {
                this.f135363a = (E[]) Arrays.copyOf(this.f135363a, i.a.a(eArr.length, i10));
            }
        }

        final void b(E e10) {
            d(this.f135364b + 1);
            E[] eArr = this.f135363a;
            int i10 = this.f135364b;
            this.f135364b = i10 + 1;
            eArr[i10] = e10;
        }

        c(c<E> cVar) {
            E[] eArr = cVar.f135363a;
            this.f135363a = (E[]) Arrays.copyOf(eArr, eArr.length);
            this.f135364b = cVar.f135364b;
        }
    }

    static int h(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            C14359f.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    static boolean m(Object[] objArr) {
        int iO = o(objArr.length);
        int i10 = 0;
        while (i10 < objArr.length && objArr[i10] != null) {
            i10++;
            if (i10 > iO) {
                return true;
            }
        }
        int length = objArr.length - 1;
        while (length > i10 && objArr[length] != null) {
            if (((objArr.length - 1) - length) + i10 > iO) {
                return true;
            }
            length--;
        }
        int i11 = i10 + 1;
        while (i11 < length) {
            int i12 = 0;
            while (i11 < length && objArr[i11] != null) {
                i12++;
                if (i12 > iO) {
                    return true;
                }
                i11++;
            }
            i11++;
        }
        return false;
    }

    public static <E> l<E> r(E e10, E e11, E e12) {
        return k(3, e10, e11, e12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: e */
    public abstract AbstractC14513C<E> iterator();

    boolean n() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <E> l<E> k(int i10, Object... objArr) {
        if (i10 == 0) {
            return p();
        }
        int i11 = 0;
        if (i10 == 1) {
            return q(objArr[0]);
        }
        c bVar = new b(4);
        while (i11 < i10) {
            c cVarA = bVar.a(C14359f.h(objArr[i11]));
            i11++;
            bVar = cVarA;
        }
        return bVar.e().c();
    }

    static int o(int i10) {
        return C15004a.c(i10, RoundingMode.UNNECESSARY) * 12;
    }

    public static <E> l<E> p() {
        return y.f135439g;
    }

    public static <E> l<E> q(E e10) {
        return new C14512B(e10);
    }

    static Object[] s(int i10, Object[] objArr, int i11) {
        int i12;
        Object[] objArr2 = new Object[i10];
        int i13 = i10 - 1;
        for (int i14 = 0; i14 < i11; i14++) {
            Object obj = objArr[i14];
            int iA = g.a(obj.hashCode());
            while (true) {
                i12 = iA & i13;
                if (objArr2[i12] == null) {
                    break;
                }
                iA++;
            }
            objArr2[i12] = obj;
        }
        return objArr2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof l) && n() && ((l) obj).n() && hashCode() != obj.hashCode()) {
            return false;
        }
        return z.a(this, obj);
    }

    public k<E> f() {
        k<E> kVar = this.f135357b;
        if (kVar != null) {
            return kVar;
        }
        k<E> kVarL = l();
        this.f135357b = kVarL;
        return kVarL;
    }

    k<E> l() {
        return new w(this, toArray());
    }

    l() {
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return z.b(this);
    }
}
