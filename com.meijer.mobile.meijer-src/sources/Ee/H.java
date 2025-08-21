package Ee;

import Ee.J;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes6.dex */
public final class H<K, V> extends AbstractMap<K, V> implements InterfaceC3219h<K, V>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    transient K[] f7160a;

    /* renamed from: b, reason: collision with root package name */
    transient V[] f7161b;

    /* renamed from: c, reason: collision with root package name */
    transient int f7162c;

    /* renamed from: d, reason: collision with root package name */
    transient int f7163d;

    /* renamed from: e, reason: collision with root package name */
    private transient int[] f7164e;

    /* renamed from: f, reason: collision with root package name */
    private transient int[] f7165f;

    /* renamed from: g, reason: collision with root package name */
    private transient int[] f7166g;

    /* renamed from: h, reason: collision with root package name */
    private transient int[] f7167h;

    /* renamed from: i, reason: collision with root package name */
    private transient int f7168i;

    /* renamed from: j, reason: collision with root package name */
    private transient int f7169j;

    /* renamed from: k, reason: collision with root package name */
    private transient int[] f7170k;

    /* renamed from: l, reason: collision with root package name */
    private transient int[] f7171l;

    /* renamed from: m, reason: collision with root package name */
    private transient Set<K> f7172m;

    /* renamed from: n, reason: collision with root package name */
    private transient Set<V> f7173n;

    /* renamed from: o, reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f7174o;

    /* renamed from: p, reason: collision with root package name */
    private transient InterfaceC3219h<V, K> f7175p;

    final class a extends AbstractC3216e<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f7176a;

        /* renamed from: b, reason: collision with root package name */
        int f7177b;

        a(int i10) {
            this.f7176a = (K) e0.a(H.this.f7160a[i10]);
            this.f7177b = i10;
        }

        void a() {
            int i10 = this.f7177b;
            if (i10 != -1) {
                H h10 = H.this;
                if (i10 <= h10.f7162c && De.l.a(h10.f7160a[i10], this.f7176a)) {
                    return;
                }
            }
            this.f7177b = H.this.s(this.f7176a);
        }

        @Override // Ee.AbstractC3216e, java.util.Map.Entry
        public K getKey() {
            return this.f7176a;
        }

        @Override // Ee.AbstractC3216e, java.util.Map.Entry
        public V getValue() {
            a();
            int i10 = this.f7177b;
            if (i10 == -1) {
                return (V) e0.b();
            }
            return (V) e0.a(H.this.f7161b[i10]);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            a();
            int i10 = this.f7177b;
            if (i10 == -1) {
                H.this.put(this.f7176a, v10);
                return (V) e0.b();
            }
            V v11 = (V) e0.a(H.this.f7161b[i10]);
            if (!De.l.a(v11, v10)) {
                H.this.N(this.f7177b, v10, false);
                return v11;
            }
            return v10;
        }
    }

    static final class b<K, V> extends AbstractC3216e<V, K> {

        /* renamed from: a, reason: collision with root package name */
        final H<K, V> f7179a;

        /* renamed from: b, reason: collision with root package name */
        final V f7180b;

        /* renamed from: c, reason: collision with root package name */
        int f7181c;

        private void a() {
            int i10 = this.f7181c;
            if (i10 != -1) {
                H<K, V> h10 = this.f7179a;
                if (i10 <= h10.f7162c && De.l.a(this.f7180b, h10.f7161b[i10])) {
                    return;
                }
            }
            this.f7181c = this.f7179a.v(this.f7180b);
        }

        @Override // Ee.AbstractC3216e, java.util.Map.Entry
        public V getKey() {
            return this.f7180b;
        }

        b(H<K, V> h10, int i10) {
            this.f7179a = h10;
            this.f7180b = (V) e0.a(h10.f7161b[i10]);
            this.f7181c = i10;
        }

        @Override // Ee.AbstractC3216e, java.util.Map.Entry
        public K getValue() {
            a();
            int i10 = this.f7181c;
            if (i10 == -1) {
                return (K) e0.b();
            }
            return (K) e0.a(this.f7179a.f7160a[i10]);
        }

        @Override // java.util.Map.Entry
        public K setValue(K k10) {
            a();
            int i10 = this.f7181c;
            if (i10 == -1) {
                this.f7179a.G(this.f7180b, k10, false);
                return (K) e0.b();
            }
            K k11 = (K) e0.a(this.f7179a.f7160a[i10]);
            if (!De.l.a(k11, k10)) {
                this.f7179a.M(this.f7181c, k10, false);
                return k11;
            }
            return k10;
        }
    }

    final class c extends h<K, V, Map.Entry<K, V>> {
        c() {
            super(H.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iS = H.this.s(key);
                if (iS != -1 && De.l.a(value, H.this.f7161b[iS])) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Ee.H.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(int i10) {
            return new a(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iC = I.c(key);
            int iT = H.this.t(key, iC);
            if (iT == -1 || !De.l.a(value, H.this.f7161b[iT])) {
                return false;
            }
            H.this.J(iT, iC);
            return true;
        }
    }

    static class d<K, V> extends AbstractMap<V, K> implements InterfaceC3219h<V, K>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final H<K, V> f7183a;

        /* renamed from: b, reason: collision with root package name */
        private transient Set<Map.Entry<V, K>> f7184b;

        @Override // Ee.InterfaceC3219h
        public InterfaceC3219h<K, V> C() {
            return this.f7183a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<K> values() {
            return this.f7183a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f7183a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f7183a.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            return this.f7183a.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.f7184b;
            if (set != null) {
                return set;
            }
            e eVar = new e(this.f7183a);
            this.f7184b = eVar;
            return eVar;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public K get(Object obj) {
            return this.f7183a.y(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.f7183a.values();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public K put(V v10, K k10) {
            return this.f7183a.G(v10, k10, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public K remove(Object obj) {
            return this.f7183a.L(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f7183a.f7162c;
        }

        @Override // Ee.InterfaceC3219h
        public K u(V v10, K k10) {
            return this.f7183a.G(v10, k10, true);
        }

        d(H<K, V> h10) {
            this.f7183a = h10;
        }
    }

    static class e<K, V> extends h<K, V, Map.Entry<V, K>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iV = this.f7187a.v(key);
                if (iV != -1 && De.l.a(this.f7187a.f7160a[iV], value)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Ee.H.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<V, K> a(int i10) {
            return new b(this.f7187a, i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iC = I.c(key);
            int iX = this.f7187a.x(key, iC);
            if (iX == -1 || !De.l.a(this.f7187a.f7160a[iX], value)) {
                return false;
            }
            this.f7187a.K(iX, iC);
            return true;
        }

        e(H<K, V> h10) {
            super(h10);
        }
    }

    final class f extends h<K, V, K> {
        f() {
            super(H.this);
        }

        @Override // Ee.H.h
        K a(int i10) {
            return (K) e0.a(H.this.f7160a[i10]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return H.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iC = I.c(obj);
            int iT = H.this.t(obj, iC);
            if (iT != -1) {
                H.this.J(iT, iC);
                return true;
            }
            return false;
        }
    }

    final class g extends h<K, V, V> {
        g() {
            super(H.this);
        }

        @Override // Ee.H.h
        V a(int i10) {
            return (V) e0.a(H.this.f7161b[i10]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return H.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iC = I.c(obj);
            int iX = H.this.x(obj, iC);
            if (iX != -1) {
                H.this.K(iX, iC);
                return true;
            }
            return false;
        }
    }

    static abstract class h<K, V, T> extends AbstractSet<T> {

        /* renamed from: a, reason: collision with root package name */
        final H<K, V> f7187a;

        class a implements Iterator<T> {

            /* renamed from: a, reason: collision with root package name */
            private int f7188a;

            /* renamed from: b, reason: collision with root package name */
            private int f7189b = -1;

            /* renamed from: c, reason: collision with root package name */
            private int f7190c;

            /* renamed from: d, reason: collision with root package name */
            private int f7191d;

            a() {
                this.f7188a = ((H) h.this.f7187a).f7168i;
                H<K, V> h10 = h.this.f7187a;
                this.f7190c = h10.f7163d;
                this.f7191d = h10.f7162c;
            }

            private void a() {
                if (h.this.f7187a.f7163d != this.f7190c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                a();
                if (this.f7188a != -2 && this.f7191d > 0) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public T next() {
                if (hasNext()) {
                    T t10 = (T) h.this.a(this.f7188a);
                    this.f7189b = this.f7188a;
                    this.f7188a = ((H) h.this.f7187a).f7171l[this.f7188a];
                    this.f7191d--;
                    return t10;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z10;
                a();
                if (this.f7189b != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C3233w.c(z10);
                h.this.f7187a.H(this.f7189b);
                int i10 = this.f7188a;
                H<K, V> h10 = h.this.f7187a;
                if (i10 == h10.f7162c) {
                    this.f7188a = this.f7189b;
                }
                this.f7189b = -1;
                this.f7190c = h10.f7163d;
            }
        }

        abstract T a(int i10);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f7187a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f7187a.f7162c;
        }

        h(H<K, V> h10) {
            this.f7187a = h10;
        }
    }

    private void B(int i10, int i11) {
        De.p.d(i10 != -1);
        int iF = f(i11);
        int[] iArr = this.f7166g;
        int[] iArr2 = this.f7164e;
        iArr[i10] = iArr2[iF];
        iArr2[iF] = i10;
    }

    private void D(int i10, int i11) {
        De.p.d(i10 != -1);
        int iF = f(i11);
        int[] iArr = this.f7167h;
        int[] iArr2 = this.f7165f;
        iArr[i10] = iArr2[iF];
        iArr2[iF] = i10;
    }

    private void I(int i10, int i11, int i12) {
        De.p.d(i10 != -1);
        j(i10, i11);
        k(i10, i12);
        O(this.f7170k[i10], this.f7171l[i10]);
        E(this.f7162c - 1, i10);
        K[] kArr = this.f7160a;
        int i13 = this.f7162c;
        kArr[i13 - 1] = null;
        this.f7161b[i13 - 1] = null;
        this.f7162c = i13 - 1;
        this.f7163d++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(int i10, K k10, boolean z10) {
        int i11;
        De.p.d(i10 != -1);
        int iC = I.c(k10);
        int iT = t(k10, iC);
        int i12 = this.f7169j;
        if (iT == -1) {
            i11 = -2;
        } else {
            if (!z10) {
                throw new IllegalArgumentException("Key already present in map: " + k10);
            }
            i12 = this.f7170k[iT];
            i11 = this.f7171l[iT];
            J(iT, iC);
            if (i10 == this.f7162c) {
                i10 = iT;
            }
        }
        if (i12 == i10) {
            i12 = this.f7170k[i10];
        } else if (i12 == this.f7162c) {
            i12 = iT;
        }
        if (i11 == i10) {
            iT = this.f7171l[i10];
        } else if (i11 != this.f7162c) {
            iT = i11;
        }
        O(this.f7170k[i10], this.f7171l[i10]);
        j(i10, I.c(this.f7160a[i10]));
        this.f7160a[i10] = k10;
        B(i10, I.c(k10));
        O(i12, i10);
        O(i10, iT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(int i10, V v10, boolean z10) {
        De.p.d(i10 != -1);
        int iC = I.c(v10);
        int iX = x(v10, iC);
        if (iX != -1) {
            if (!z10) {
                throw new IllegalArgumentException("Value already present in map: " + v10);
            }
            K(iX, iC);
            if (i10 == this.f7162c) {
                i10 = iX;
            }
        }
        k(i10, I.c(this.f7161b[i10]));
        this.f7161b[i10] = v10;
        D(i10, iC);
    }

    private void O(int i10, int i11) {
        if (i10 == -2) {
            this.f7168i = i11;
        } else {
            this.f7171l[i10] = i11;
        }
        if (i11 == -2) {
            this.f7169j = i10;
        } else {
            this.f7170k[i11] = i10;
        }
    }

    private void j(int i10, int i11) {
        De.p.d(i10 != -1);
        int iF = f(i11);
        int[] iArr = this.f7164e;
        int i12 = iArr[iF];
        if (i12 == i10) {
            int[] iArr2 = this.f7166g;
            iArr[iF] = iArr2[i10];
            iArr2[i10] = -1;
            return;
        }
        int i13 = this.f7166g[i12];
        while (true) {
            int i14 = i12;
            i12 = i13;
            if (i12 == -1) {
                throw new AssertionError("Expected to find entry with key " + this.f7160a[i10]);
            }
            if (i12 == i10) {
                int[] iArr3 = this.f7166g;
                iArr3[i14] = iArr3[i10];
                iArr3[i10] = -1;
                return;
            }
            i13 = this.f7166g[i12];
        }
    }

    private void k(int i10, int i11) {
        De.p.d(i10 != -1);
        int iF = f(i11);
        int[] iArr = this.f7165f;
        int i12 = iArr[iF];
        if (i12 == i10) {
            int[] iArr2 = this.f7167h;
            iArr[iF] = iArr2[i10];
            iArr2[i10] = -1;
            return;
        }
        int i13 = this.f7167h[i12];
        while (true) {
            int i14 = i12;
            i12 = i13;
            if (i12 == -1) {
                throw new AssertionError("Expected to find entry with value " + this.f7161b[i10]);
            }
            if (i12 == i10) {
                int[] iArr3 = this.f7167h;
                iArr3[i14] = iArr3[i10];
                iArr3[i10] = -1;
                return;
            }
            i13 = this.f7167h[i12];
        }
    }

    private static int[] q(int[] iArr, int i10) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
        Arrays.fill(iArrCopyOf, length, i10, -1);
        return iArrCopyOf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        return F(k10, v10, false);
    }

    @Override // Ee.InterfaceC3219h
    public V u(K k10, V v10) {
        return F(k10, v10, true);
    }

    private void E(int i10, int i11) {
        int i12;
        int i13;
        if (i10 == i11) {
            return;
        }
        int i14 = this.f7170k[i10];
        int i15 = this.f7171l[i10];
        O(i14, i11);
        O(i11, i15);
        K[] kArr = this.f7160a;
        K k10 = kArr[i10];
        V[] vArr = this.f7161b;
        V v10 = vArr[i10];
        kArr[i11] = k10;
        vArr[i11] = v10;
        int iF = f(I.c(k10));
        int[] iArr = this.f7164e;
        int i16 = iArr[iF];
        if (i16 == i10) {
            iArr[iF] = i11;
        } else {
            int i17 = this.f7166g[i16];
            while (true) {
                i12 = i16;
                i16 = i17;
                if (i16 == i10) {
                    break;
                } else {
                    i17 = this.f7166g[i16];
                }
            }
            this.f7166g[i12] = i11;
        }
        int[] iArr2 = this.f7166g;
        iArr2[i11] = iArr2[i10];
        iArr2[i10] = -1;
        int iF2 = f(I.c(v10));
        int[] iArr3 = this.f7165f;
        int i18 = iArr3[iF2];
        if (i18 == i10) {
            iArr3[iF2] = i11;
        } else {
            int i19 = this.f7167h[i18];
            while (true) {
                i13 = i18;
                i18 = i19;
                if (i18 == i10) {
                    break;
                } else {
                    i19 = this.f7167h[i18];
                }
            }
            this.f7167h[i13] = i11;
        }
        int[] iArr4 = this.f7167h;
        iArr4[i11] = iArr4[i10];
        iArr4[i10] = -1;
    }

    private int f(int i10) {
        return i10 & (this.f7164e.length - 1);
    }

    public static <K, V> H<K, V> g() {
        return h(16);
    }

    public static <K, V> H<K, V> h(int i10) {
        return new H<>(i10);
    }

    private static int[] i(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void n(int i10) {
        int[] iArr = this.f7166g;
        if (iArr.length < i10) {
            int iC = J.b.c(iArr.length, i10);
            this.f7160a = (K[]) Arrays.copyOf(this.f7160a, iC);
            this.f7161b = (V[]) Arrays.copyOf(this.f7161b, iC);
            this.f7166g = q(this.f7166g, iC);
            this.f7167h = q(this.f7167h, iC);
            this.f7170k = q(this.f7170k, iC);
            this.f7171l = q(this.f7171l, iC);
        }
        if (this.f7164e.length < i10) {
            int iA = I.a(i10, 1.0d);
            this.f7164e = i(iA);
            this.f7165f = i(iA);
            for (int i11 = 0; i11 < this.f7162c; i11++) {
                int iF = f(I.c(this.f7160a[i11]));
                int[] iArr2 = this.f7166g;
                int[] iArr3 = this.f7164e;
                iArr2[i11] = iArr3[iF];
                iArr3[iF] = i11;
                int iF2 = f(I.c(this.f7161b[i11]));
                int[] iArr4 = this.f7167h;
                int[] iArr5 = this.f7165f;
                iArr4[i11] = iArr5[iF2];
                iArr5[iF2] = i11;
            }
        }
    }

    void A(int i10) {
        C3233w.b(i10, "expectedSize");
        int iA = I.a(i10, 1.0d);
        this.f7162c = 0;
        this.f7160a = (K[]) new Object[i10];
        this.f7161b = (V[]) new Object[i10];
        this.f7164e = i(iA);
        this.f7165f = i(iA);
        this.f7166g = i(i10);
        this.f7167h = i(i10);
        this.f7168i = -2;
        this.f7169j = -2;
        this.f7170k = i(i10);
        this.f7171l = i(i10);
    }

    @Override // Ee.InterfaceC3219h
    public InterfaceC3219h<V, K> C() {
        InterfaceC3219h<V, K> interfaceC3219h = this.f7175p;
        if (interfaceC3219h != null) {
            return interfaceC3219h;
        }
        d dVar = new d(this);
        this.f7175p = dVar;
        return dVar;
    }

    void H(int i10) {
        J(i10, I.c(this.f7160a[i10]));
    }

    void J(int i10, int i11) {
        I(i10, i11, I.c(this.f7161b[i10]));
    }

    void K(int i10, int i11) {
        I(i10, I.c(this.f7160a[i10]), i11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public Set<V> values() {
        Set<V> set = this.f7173n;
        if (set != null) {
            return set;
        }
        g gVar = new g();
        this.f7173n = gVar;
        return gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f7160a, 0, this.f7162c, (Object) null);
        Arrays.fill(this.f7161b, 0, this.f7162c, (Object) null);
        Arrays.fill(this.f7164e, -1);
        Arrays.fill(this.f7165f, -1);
        Arrays.fill(this.f7166g, 0, this.f7162c, -1);
        Arrays.fill(this.f7167h, 0, this.f7162c, -1);
        Arrays.fill(this.f7170k, 0, this.f7162c, -1);
        Arrays.fill(this.f7171l, 0, this.f7162c, -1);
        this.f7162c = 0;
        this.f7168i = -2;
        this.f7169j = -2;
        this.f7163d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f7174o;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.f7174o = cVar;
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f7172m;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.f7172m = fVar;
        return fVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f7162c;
    }

    int t(Object obj, int i10) {
        return r(obj, i10, this.f7164e, this.f7166g, this.f7160a);
    }

    int x(Object obj, int i10) {
        return r(obj, i10, this.f7165f, this.f7167h, this.f7161b);
    }

    private H(int i10) {
        A(i10);
    }

    V F(K k10, V v10, boolean z10) {
        boolean z11;
        int iC = I.c(k10);
        int iT = t(k10, iC);
        if (iT != -1) {
            V v11 = this.f7161b[iT];
            if (De.l.a(v11, v10)) {
                return v10;
            }
            N(iT, v10, z10);
            return v11;
        }
        int iC2 = I.c(v10);
        int iX = x(v10, iC2);
        if (z10) {
            if (iX != -1) {
                K(iX, iC2);
            }
        } else {
            if (iX == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            De.p.l(z11, "Value already present: %s", v10);
        }
        n(this.f7162c + 1);
        K[] kArr = this.f7160a;
        int i10 = this.f7162c;
        kArr[i10] = k10;
        this.f7161b[i10] = v10;
        B(i10, iC);
        D(this.f7162c, iC2);
        O(this.f7169j, this.f7162c);
        O(this.f7162c, -2);
        this.f7162c++;
        this.f7163d++;
        return null;
    }

    K G(V v10, K k10, boolean z10) {
        boolean z11;
        int i10;
        int iC = I.c(v10);
        int iX = x(v10, iC);
        if (iX != -1) {
            K k11 = this.f7160a[iX];
            if (De.l.a(k11, k10)) {
                return k10;
            }
            M(iX, k10, z10);
            return k11;
        }
        int i11 = this.f7169j;
        int iC2 = I.c(k10);
        int iT = t(k10, iC2);
        if (z10) {
            if (iT != -1) {
                i11 = this.f7170k[iT];
                J(iT, iC2);
            }
        } else {
            if (iT == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            De.p.l(z11, "Key already present: %s", k10);
        }
        n(this.f7162c + 1);
        K[] kArr = this.f7160a;
        int i12 = this.f7162c;
        kArr[i12] = k10;
        this.f7161b[i12] = v10;
        B(i12, iC2);
        D(this.f7162c, iC);
        if (i11 == -2) {
            i10 = this.f7168i;
        } else {
            i10 = this.f7171l[i11];
        }
        O(i11, this.f7162c);
        O(this.f7162c, i10);
        this.f7162c++;
        this.f7163d++;
        return null;
    }

    K L(Object obj) {
        int iC = I.c(obj);
        int iX = x(obj, iC);
        if (iX == -1) {
            return null;
        }
        K k10 = this.f7160a[iX];
        K(iX, iC);
        return k10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (s(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        if (v(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int iS = s(obj);
        if (iS == -1) {
            return null;
        }
        return this.f7161b[iS];
    }

    int r(Object obj, int i10, int[] iArr, int[] iArr2, Object[] objArr) {
        int i11 = iArr[f(i10)];
        while (i11 != -1) {
            if (De.l.a(objArr[i11], obj)) {
                return i11;
            }
            i11 = iArr2[i11];
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        int iC = I.c(obj);
        int iT = t(obj, iC);
        if (iT == -1) {
            return null;
        }
        V v10 = this.f7161b[iT];
        J(iT, iC);
        return v10;
    }

    int s(Object obj) {
        return t(obj, I.c(obj));
    }

    int v(Object obj) {
        return x(obj, I.c(obj));
    }

    K y(Object obj) {
        int iV = v(obj);
        if (iV == -1) {
            return null;
        }
        return this.f7160a[iV];
    }
}
