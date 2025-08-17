package ff;

import ef.C13655f;
import ff.i;
import gf.C14252a;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes7.dex */
public abstract class l<E> extends i<E> implements Set<E> {

    /* renamed from: b, reason: collision with root package name */
    private transient k<E> f131011b;

    private static final class a<E> extends c<E> {

        /* renamed from: c, reason: collision with root package name */
        private final Set<Object> f131012c;

        @Override // ff.l.c
        l<E> c() {
            int i10 = this.f131018b;
            return i10 != 0 ? i10 != 1 ? new p(this.f131012c, k.h(this.f131017a, this.f131018b)) : l.q(this.f131017a[0]) : l.p();
        }

        a(c<E> cVar) {
            super(cVar);
            this.f131012c = z.c(this.f131018b);
            for (int i10 = 0; i10 < this.f131018b; i10++) {
                this.f131012c.add(this.f131017a[i10]);
            }
        }

        @Override // ff.l.c
        c<E> a(E e10) {
            C13655f.h(e10);
            if (this.f131012c.add(e10)) {
                b(e10);
            }
            return this;
        }
    }

    private static final class b<E> extends c<E> {

        /* renamed from: c, reason: collision with root package name */
        private Object[] f131013c;

        /* renamed from: d, reason: collision with root package name */
        private int f131014d;

        /* renamed from: e, reason: collision with root package name */
        private int f131015e;

        /* renamed from: f, reason: collision with root package name */
        private int f131016f;

        @Override // ff.l.c
        l<E> c() {
            int i10 = this.f131018b;
            if (i10 == 0) {
                return l.p();
            }
            if (i10 == 1) {
                return l.q(this.f131017a[0]);
            }
            Object[] objArrCopyOf = this.f131017a;
            if (i10 != objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i10);
            }
            int i11 = this.f131016f;
            Object[] objArr = this.f131013c;
            return new y(objArrCopyOf, i11, objArr, objArr.length - 1);
        }

        @Override // ff.l.c
        c<E> e() {
            int iH = l.h(this.f131018b);
            if (iH * 2 < this.f131013c.length) {
                this.f131013c = l.s(iH, this.f131017a, this.f131018b);
            }
            return l.m(this.f131013c) ? new a(this) : this;
        }

        void f(int i10) {
            if (i10 > this.f131015e) {
                Object[] objArr = this.f131013c;
                if (objArr.length < 1073741824) {
                    int length = objArr.length * 2;
                    this.f131013c = l.s(length, this.f131017a, this.f131018b);
                    this.f131014d = l.o(length);
                    this.f131015e = (int) (length * 0.7d);
                }
            }
        }

        b(int i10) {
            super(i10);
            int iH = l.h(i10);
            this.f131013c = new Object[iH];
            this.f131014d = l.o(iH);
            this.f131015e = (int) (iH * 0.7d);
        }

        @Override // ff.l.c
        c<E> a(E e10) {
            C13655f.h(e10);
            int iHashCode = e10.hashCode();
            int iA = g.a(iHashCode);
            int length = this.f131013c.length - 1;
            for (int i10 = iA; i10 - iA < this.f131014d; i10++) {
                int i11 = i10 & length;
                Object obj = this.f131013c[i11];
                if (obj == null) {
                    b(e10);
                    this.f131013c[i11] = e10;
                    this.f131016f += iHashCode;
                    f(this.f131018b);
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
        E[] f131017a;

        /* renamed from: b, reason: collision with root package name */
        int f131018b;

        c(int i10) {
            this.f131017a = (E[]) new Object[i10];
            this.f131018b = 0;
        }

        abstract c<E> a(E e10);

        abstract l<E> c();

        c<E> e() {
            return this;
        }

        private void d(int i10) {
            E[] eArr = this.f131017a;
            if (i10 > eArr.length) {
                this.f131017a = (E[]) Arrays.copyOf(this.f131017a, i.a.a(eArr.length, i10));
            }
        }

        final void b(E e10) {
            d(this.f131018b + 1);
            E[] eArr = this.f131017a;
            int i10 = this.f131018b;
            this.f131018b = i10 + 1;
            eArr[i10] = e10;
        }

        c(c<E> cVar) {
            E[] eArr = cVar.f131017a;
            this.f131017a = (E[]) Arrays.copyOf(eArr, eArr.length);
            this.f131018b = cVar.f131018b;
        }
    }

    static int h(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            C13655f.e(iMax < 1073741824, "collection too large");
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
    public abstract AbstractC13883C<E> iterator();

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
            c cVarA = bVar.a(C13655f.h(objArr[i11]));
            i11++;
            bVar = cVarA;
        }
        return bVar.e().c();
    }

    static int o(int i10) {
        return C14252a.c(i10, RoundingMode.UNNECESSARY) * 12;
    }

    public static <E> l<E> p() {
        return y.f131093g;
    }

    public static <E> l<E> q(E e10) {
        return new C13882B(e10);
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
        k<E> kVar = this.f131011b;
        if (kVar != null) {
            return kVar;
        }
        k<E> kVarL = l();
        this.f131011b = kVarL;
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
