package Ce;

import Ce.J;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/* loaded from: classes6.dex */
public abstract class M<K, V> implements Map<K, V>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    static final Map.Entry<?, ?>[] f3893d = new Map.Entry[0];

    /* renamed from: a, reason: collision with root package name */
    private transient O<Map.Entry<K, V>> f3894a;

    /* renamed from: b, reason: collision with root package name */
    private transient O<K> f3895b;

    /* renamed from: c, reason: collision with root package name */
    private transient J<V> f3896c;

    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        Comparator<? super V> f3897a;

        /* renamed from: b, reason: collision with root package name */
        Object[] f3898b;

        /* renamed from: c, reason: collision with root package name */
        int f3899c;

        /* renamed from: d, reason: collision with root package name */
        boolean f3900d;

        /* renamed from: e, reason: collision with root package name */
        C0068a f3901e;

        /* renamed from: Ce.M$a$a, reason: collision with other inner class name */
        static final class C0068a {

            /* renamed from: a, reason: collision with root package name */
            private final Object f3902a;

            /* renamed from: b, reason: collision with root package name */
            private final Object f3903b;

            /* renamed from: c, reason: collision with root package name */
            private final Object f3904c;

            IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f3902a + "=" + this.f3903b + " and " + this.f3902a + "=" + this.f3904c);
            }

            C0068a(Object obj, Object obj2, Object obj3) {
                this.f3902a = obj;
                this.f3903b = obj2;
                this.f3904c = obj3;
            }
        }

        public a() {
            this(4);
        }

        public M<K, V> c() {
            return b(true);
        }

        a(int i10) {
            this.f3898b = new Object[i10 * 2];
            this.f3899c = 0;
            this.f3900d = false;
        }

        private M<K, V> b(boolean z10) {
            Object[] objArrE;
            C0068a c0068a;
            C0068a c0068a2;
            if (z10 && (c0068a2 = this.f3901e) != null) {
                throw c0068a2.a();
            }
            int length = this.f3899c;
            if (this.f3897a == null) {
                objArrE = this.f3898b;
            } else {
                if (this.f3900d) {
                    this.f3898b = Arrays.copyOf(this.f3898b, length * 2);
                }
                objArrE = this.f3898b;
                if (!z10) {
                    objArrE = e(objArrE, this.f3899c);
                    if (objArrE.length < this.f3898b.length) {
                        length = objArrE.length >>> 1;
                    }
                }
                j(objArrE, length, this.f3897a);
            }
            this.f3900d = true;
            n0 n0VarB = n0.B(length, objArrE, this);
            if (!z10 || (c0068a = this.f3901e) == null) {
                return n0VarB;
            }
            throw c0068a.a();
        }

        private void d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f3898b;
            if (i11 > objArr.length) {
                this.f3898b = Arrays.copyOf(objArr, J.b.c(objArr.length, i11));
                this.f3900d = false;
            }
        }

        private Object[] e(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 += 2;
                    i12 += 2;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        static <V> void j(Object[] objArr, int i10, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, g0.b(comparator).e(Y.k()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public a<K, V> f(K k10, V v10) {
            d(this.f3899c + 1);
            C3030w.a(k10, v10);
            Object[] objArr = this.f3898b;
            int i10 = this.f3899c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f3899c = i10 + 1;
            return this;
        }

        public a<K, V> h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                d(this.f3899c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
            return this;
        }

        public M<K, V> a() {
            return c();
        }

        public a<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a<K, V> i(Map<? extends K, ? extends V> map) {
            return h(map.entrySet());
        }
    }

    abstract O<Map.Entry<K, V>> f();

    abstract O<K> g();

    @Override // java.util.Map
    public abstract V get(Object obj);

    abstract J<V> h();

    abstract boolean j();

    public static <K, V> a<K, V> a() {
        return new a<>();
    }

    public static <K, V> a<K, V> b(int i10) {
        C3030w.b(i10, "expectedSize");
        return new a<>(i10);
    }

    public static <K, V> M<K, V> c(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static <K, V> M<K, V> d(Map<? extends K, ? extends V> map) {
        if ((map instanceof M) && !(map instanceof SortedMap)) {
            M<K, V> m10 = (M) map;
            if (!m10.j()) {
                return m10;
            }
        }
        return c(map.entrySet());
    }

    public static <K, V> M<K, V> n() {
        return (M<K, V>) n0.f4084h;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public O<Map.Entry<K, V>> entrySet() {
        O<Map.Entry<K, V>> o10 = this.f3894a;
        if (o10 != null) {
            return o10;
        }
        O<Map.Entry<K, V>> oF = f();
        this.f3894a = oF;
        return oF;
    }

    @Override // java.util.Map
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public O<K> keySet() {
        O<K> o10 = this.f3895b;
        if (o10 != null) {
            return o10;
        }
        O<K> oG = g();
        this.f3895b = oG;
        return oG;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public J<V> values() {
        J<V> j10 = this.f3896c;
        if (j10 != null) {
            return j10;
        }
        J<V> jH = h();
        this.f3896c = jH;
        return jH;
    }

    M() {
    }

    public static <K, V> M<K, V> q(K k10, V v10) {
        C3030w.a(k10, v10);
        return n0.A(1, new Object[]{k10, v10});
    }

    public static <K, V> M<K, V> r(K k10, V v10, K k11, V v11) {
        C3030w.a(k10, v10);
        C3030w.a(k11, v11);
        return n0.A(2, new Object[]{k10, v10, k11, v11});
    }

    public static <K, V> M<K, V> s(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        C3030w.a(k10, v10);
        C3030w.a(k11, v11);
        C3030w.a(k12, v12);
        C3030w.a(k13, v13);
        return n0.A(4, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13});
    }

    public static <K, V> M<K, V> v(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        C3030w.a(k10, v10);
        C3030w.a(k11, v11);
        C3030w.a(k12, v12);
        C3030w.a(k13, v13);
        C3030w.a(k14, v14);
        return n0.A(5, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14});
    }

    @SafeVarargs
    public static <K, V> M<K, V> x(Map.Entry<? extends K, ? extends V>... entryArr) {
        return c(Arrays.asList(entryArr));
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return Y.c(this, obj);
    }

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        if (v11 != null) {
            return v11;
        }
        return v10;
    }

    @Override // java.util.Map
    public int hashCode() {
        return s0.d(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return Y.j(this);
    }
}
