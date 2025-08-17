package Ce;

import Ce.J;
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
public final class H<K, V> extends AbstractMap<K, V> implements InterfaceC3016h<K, V>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    transient K[] f3848a;

    /* renamed from: b, reason: collision with root package name */
    transient V[] f3849b;

    /* renamed from: c, reason: collision with root package name */
    transient int f3850c;

    /* renamed from: d, reason: collision with root package name */
    transient int f3851d;

    /* renamed from: e, reason: collision with root package name */
    private transient int[] f3852e;

    /* renamed from: f, reason: collision with root package name */
    private transient int[] f3853f;

    /* renamed from: g, reason: collision with root package name */
    private transient int[] f3854g;

    /* renamed from: h, reason: collision with root package name */
    private transient int[] f3855h;

    /* renamed from: i, reason: collision with root package name */
    private transient int f3856i;

    /* renamed from: j, reason: collision with root package name */
    private transient int f3857j;

    /* renamed from: k, reason: collision with root package name */
    private transient int[] f3858k;

    /* renamed from: l, reason: collision with root package name */
    private transient int[] f3859l;

    /* renamed from: m, reason: collision with root package name */
    private transient Set<K> f3860m;

    /* renamed from: n, reason: collision with root package name */
    private transient Set<V> f3861n;

    /* renamed from: o, reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f3862o;

    /* renamed from: p, reason: collision with root package name */
    private transient InterfaceC3016h<V, K> f3863p;

    final class a extends AbstractC3013e<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f3864a;

        /* renamed from: b, reason: collision with root package name */
        int f3865b;

        a(int i10) {
            this.f3864a = (K) e0.a(H.this.f3848a[i10]);
            this.f3865b = i10;
        }

        void a() {
            int i10 = this.f3865b;
            if (i10 != -1) {
                H h10 = H.this;
                if (i10 <= h10.f3850c && Be.l.a(h10.f3848a[i10], this.f3864a)) {
                    return;
                }
            }
            this.f3865b = H.this.s(this.f3864a);
        }

        @Override // Ce.AbstractC3013e, java.util.Map.Entry
        public K getKey() {
            return this.f3864a;
        }

        @Override // Ce.AbstractC3013e, java.util.Map.Entry
        public V getValue() {
            a();
            int i10 = this.f3865b;
            if (i10 == -1) {
                return (V) e0.b();
            }
            return (V) e0.a(H.this.f3849b[i10]);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            a();
            int i10 = this.f3865b;
            if (i10 == -1) {
                H.this.put(this.f3864a, v10);
                return (V) e0.b();
            }
            V v11 = (V) e0.a(H.this.f3849b[i10]);
            if (!Be.l.a(v11, v10)) {
                H.this.N(this.f3865b, v10, false);
                return v11;
            }
            return v10;
        }
    }

    static final class b<K, V> extends AbstractC3013e<V, K> {

        /* renamed from: a, reason: collision with root package name */
        final H<K, V> f3867a;

        /* renamed from: b, reason: collision with root package name */
        final V f3868b;

        /* renamed from: c, reason: collision with root package name */
        int f3869c;

        private void a() {
            int i10 = this.f3869c;
            if (i10 != -1) {
                H<K, V> h10 = this.f3867a;
                if (i10 <= h10.f3850c && Be.l.a(this.f3868b, h10.f3849b[i10])) {
                    return;
                }
            }
            this.f3869c = this.f3867a.x(this.f3868b);
        }

        @Override // Ce.AbstractC3013e, java.util.Map.Entry
        public V getKey() {
            return this.f3868b;
        }

        b(H<K, V> h10, int i10) {
            this.f3867a = h10;
            this.f3868b = (V) e0.a(h10.f3849b[i10]);
            this.f3869c = i10;
        }

        @Override // Ce.AbstractC3013e, java.util.Map.Entry
        public K getValue() {
            a();
            int i10 = this.f3869c;
            if (i10 == -1) {
                return (K) e0.b();
            }
            return (K) e0.a(this.f3867a.f3848a[i10]);
        }

        @Override // java.util.Map.Entry
        public K setValue(K k10) {
            a();
            int i10 = this.f3869c;
            if (i10 == -1) {
                this.f3867a.G(this.f3868b, k10, false);
                return (K) e0.b();
            }
            K k11 = (K) e0.a(this.f3867a.f3848a[i10]);
            if (!Be.l.a(k11, k10)) {
                this.f3867a.M(this.f3869c, k10, false);
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
                if (iS != -1 && Be.l.a(value, H.this.f3849b[iS])) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Ce.H.h
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
            int iV = H.this.v(key, iC);
            if (iV == -1 || !Be.l.a(value, H.this.f3849b[iV])) {
                return false;
            }
            H.this.J(iV, iC);
            return true;
        }
    }

    static class d<K, V> extends AbstractMap<V, K> implements InterfaceC3016h<V, K>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final H<K, V> f3871a;

        /* renamed from: b, reason: collision with root package name */
        private transient Set<Map.Entry<V, K>> f3872b;

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<K> values() {
            return this.f3871a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f3871a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f3871a.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            return this.f3871a.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.f3872b;
            if (set != null) {
                return set;
            }
            e eVar = new e(this.f3871a);
            this.f3872b = eVar;
            return eVar;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public K get(Object obj) {
            return this.f3871a.A(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.f3871a.values();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public K put(V v10, K k10) {
            return this.f3871a.G(v10, k10, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public K remove(Object obj) {
            return this.f3871a.L(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f3871a.f3850c;
        }

        @Override // Ce.InterfaceC3016h
        public K t(V v10, K k10) {
            return this.f3871a.G(v10, k10, true);
        }

        @Override // Ce.InterfaceC3016h
        public InterfaceC3016h<K, V> z() {
            return this.f3871a;
        }

        d(H<K, V> h10) {
            this.f3871a = h10;
        }
    }

    static class e<K, V> extends h<K, V, Map.Entry<V, K>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iX = this.f3875a.x(key);
                if (iX != -1 && Be.l.a(this.f3875a.f3848a[iX], value)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Ce.H.h
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<V, K> a(int i10) {
            return new b(this.f3875a, i10);
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
            int iY = this.f3875a.y(key, iC);
            if (iY == -1 || !Be.l.a(this.f3875a.f3848a[iY], value)) {
                return false;
            }
            this.f3875a.K(iY, iC);
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

        @Override // Ce.H.h
        K a(int i10) {
            return (K) e0.a(H.this.f3848a[i10]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return H.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iC = I.c(obj);
            int iV = H.this.v(obj, iC);
            if (iV != -1) {
                H.this.J(iV, iC);
                return true;
            }
            return false;
        }
    }

    final class g extends h<K, V, V> {
        g() {
            super(H.this);
        }

        @Override // Ce.H.h
        V a(int i10) {
            return (V) e0.a(H.this.f3849b[i10]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return H.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iC = I.c(obj);
            int iY = H.this.y(obj, iC);
            if (iY != -1) {
                H.this.K(iY, iC);
                return true;
            }
            return false;
        }
    }

    static abstract class h<K, V, T> extends AbstractSet<T> {

        /* renamed from: a, reason: collision with root package name */
        final H<K, V> f3875a;

        class a implements Iterator<T> {

            /* renamed from: a, reason: collision with root package name */
            private int f3876a;

            /* renamed from: b, reason: collision with root package name */
            private int f3877b = -1;

            /* renamed from: c, reason: collision with root package name */
            private int f3878c;

            /* renamed from: d, reason: collision with root package name */
            private int f3879d;

            a() {
                this.f3876a = ((H) h.this.f3875a).f3856i;
                H<K, V> h10 = h.this.f3875a;
                this.f3878c = h10.f3851d;
                this.f3879d = h10.f3850c;
            }

            private void a() {
                if (h.this.f3875a.f3851d != this.f3878c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                a();
                if (this.f3876a != -2 && this.f3879d > 0) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public T next() {
                if (hasNext()) {
                    T t10 = (T) h.this.a(this.f3876a);
                    this.f3877b = this.f3876a;
                    this.f3876a = ((H) h.this.f3875a).f3859l[this.f3876a];
                    this.f3879d--;
                    return t10;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z10;
                a();
                if (this.f3877b != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C3030w.c(z10);
                h.this.f3875a.H(this.f3877b);
                int i10 = this.f3876a;
                H<K, V> h10 = h.this.f3875a;
                if (i10 == h10.f3850c) {
                    this.f3876a = this.f3877b;
                }
                this.f3877b = -1;
                this.f3878c = h10.f3851d;
            }
        }

        abstract T a(int i10);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f3875a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f3875a.f3850c;
        }

        h(H<K, V> h10) {
            this.f3875a = h10;
        }
    }

    private void C(int i10, int i11) {
        Be.p.d(i10 != -1);
        int iF = f(i11);
        int[] iArr = this.f3854g;
        int[] iArr2 = this.f3852e;
        iArr[i10] = iArr2[iF];
        iArr2[iF] = i10;
    }

    private void D(int i10, int i11) {
        Be.p.d(i10 != -1);
        int iF = f(i11);
        int[] iArr = this.f3855h;
        int[] iArr2 = this.f3853f;
        iArr[i10] = iArr2[iF];
        iArr2[iF] = i10;
    }

    private void I(int i10, int i11, int i12) {
        Be.p.d(i10 != -1);
        j(i10, i11);
        k(i10, i12);
        O(this.f3858k[i10], this.f3859l[i10]);
        E(this.f3850c - 1, i10);
        K[] kArr = this.f3848a;
        int i13 = this.f3850c;
        kArr[i13 - 1] = null;
        this.f3849b[i13 - 1] = null;
        this.f3850c = i13 - 1;
        this.f3851d++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(int i10, K k10, boolean z10) {
        int i11;
        Be.p.d(i10 != -1);
        int iC = I.c(k10);
        int iV = v(k10, iC);
        int i12 = this.f3857j;
        if (iV == -1) {
            i11 = -2;
        } else {
            if (!z10) {
                throw new IllegalArgumentException("Key already present in map: " + k10);
            }
            i12 = this.f3858k[iV];
            i11 = this.f3859l[iV];
            J(iV, iC);
            if (i10 == this.f3850c) {
                i10 = iV;
            }
        }
        if (i12 == i10) {
            i12 = this.f3858k[i10];
        } else if (i12 == this.f3850c) {
            i12 = iV;
        }
        if (i11 == i10) {
            iV = this.f3859l[i10];
        } else if (i11 != this.f3850c) {
            iV = i11;
        }
        O(this.f3858k[i10], this.f3859l[i10]);
        j(i10, I.c(this.f3848a[i10]));
        this.f3848a[i10] = k10;
        C(i10, I.c(k10));
        O(i12, i10);
        O(i10, iV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(int i10, V v10, boolean z10) {
        Be.p.d(i10 != -1);
        int iC = I.c(v10);
        int iY = y(v10, iC);
        if (iY != -1) {
            if (!z10) {
                throw new IllegalArgumentException("Value already present in map: " + v10);
            }
            K(iY, iC);
            if (i10 == this.f3850c) {
                i10 = iY;
            }
        }
        k(i10, I.c(this.f3849b[i10]));
        this.f3849b[i10] = v10;
        D(i10, iC);
    }

    private void O(int i10, int i11) {
        if (i10 == -2) {
            this.f3856i = i11;
        } else {
            this.f3859l[i10] = i11;
        }
        if (i11 == -2) {
            this.f3857j = i10;
        } else {
            this.f3858k[i11] = i10;
        }
    }

    private void j(int i10, int i11) {
        Be.p.d(i10 != -1);
        int iF = f(i11);
        int[] iArr = this.f3852e;
        int i12 = iArr[iF];
        if (i12 == i10) {
            int[] iArr2 = this.f3854g;
            iArr[iF] = iArr2[i10];
            iArr2[i10] = -1;
            return;
        }
        int i13 = this.f3854g[i12];
        while (true) {
            int i14 = i12;
            i12 = i13;
            if (i12 == -1) {
                throw new AssertionError("Expected to find entry with key " + this.f3848a[i10]);
            }
            if (i12 == i10) {
                int[] iArr3 = this.f3854g;
                iArr3[i14] = iArr3[i10];
                iArr3[i10] = -1;
                return;
            }
            i13 = this.f3854g[i12];
        }
    }

    private void k(int i10, int i11) {
        Be.p.d(i10 != -1);
        int iF = f(i11);
        int[] iArr = this.f3853f;
        int i12 = iArr[iF];
        if (i12 == i10) {
            int[] iArr2 = this.f3855h;
            iArr[iF] = iArr2[i10];
            iArr2[i10] = -1;
            return;
        }
        int i13 = this.f3855h[i12];
        while (true) {
            int i14 = i12;
            i12 = i13;
            if (i12 == -1) {
                throw new AssertionError("Expected to find entry with value " + this.f3849b[i10]);
            }
            if (i12 == i10) {
                int[] iArr3 = this.f3855h;
                iArr3[i14] = iArr3[i10];
                iArr3[i10] = -1;
                return;
            }
            i13 = this.f3855h[i12];
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

    @Override // Ce.InterfaceC3016h
    public V t(K k10, V v10) {
        return F(k10, v10, true);
    }

    private void E(int i10, int i11) {
        int i12;
        int i13;
        if (i10 == i11) {
            return;
        }
        int i14 = this.f3858k[i10];
        int i15 = this.f3859l[i10];
        O(i14, i11);
        O(i11, i15);
        K[] kArr = this.f3848a;
        K k10 = kArr[i10];
        V[] vArr = this.f3849b;
        V v10 = vArr[i10];
        kArr[i11] = k10;
        vArr[i11] = v10;
        int iF = f(I.c(k10));
        int[] iArr = this.f3852e;
        int i16 = iArr[iF];
        if (i16 == i10) {
            iArr[iF] = i11;
        } else {
            int i17 = this.f3854g[i16];
            while (true) {
                i12 = i16;
                i16 = i17;
                if (i16 == i10) {
                    break;
                } else {
                    i17 = this.f3854g[i16];
                }
            }
            this.f3854g[i12] = i11;
        }
        int[] iArr2 = this.f3854g;
        iArr2[i11] = iArr2[i10];
        iArr2[i10] = -1;
        int iF2 = f(I.c(v10));
        int[] iArr3 = this.f3853f;
        int i18 = iArr3[iF2];
        if (i18 == i10) {
            iArr3[iF2] = i11;
        } else {
            int i19 = this.f3855h[i18];
            while (true) {
                i13 = i18;
                i18 = i19;
                if (i18 == i10) {
                    break;
                } else {
                    i19 = this.f3855h[i18];
                }
            }
            this.f3855h[i13] = i11;
        }
        int[] iArr4 = this.f3855h;
        iArr4[i11] = iArr4[i10];
        iArr4[i10] = -1;
    }

    private int f(int i10) {
        return i10 & (this.f3852e.length - 1);
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
        int[] iArr = this.f3854g;
        if (iArr.length < i10) {
            int iC = J.b.c(iArr.length, i10);
            this.f3848a = (K[]) Arrays.copyOf(this.f3848a, iC);
            this.f3849b = (V[]) Arrays.copyOf(this.f3849b, iC);
            this.f3854g = q(this.f3854g, iC);
            this.f3855h = q(this.f3855h, iC);
            this.f3858k = q(this.f3858k, iC);
            this.f3859l = q(this.f3859l, iC);
        }
        if (this.f3852e.length < i10) {
            int iA = I.a(i10, 1.0d);
            this.f3852e = i(iA);
            this.f3853f = i(iA);
            for (int i11 = 0; i11 < this.f3850c; i11++) {
                int iF = f(I.c(this.f3848a[i11]));
                int[] iArr2 = this.f3854g;
                int[] iArr3 = this.f3852e;
                iArr2[i11] = iArr3[iF];
                iArr3[iF] = i11;
                int iF2 = f(I.c(this.f3849b[i11]));
                int[] iArr4 = this.f3855h;
                int[] iArr5 = this.f3853f;
                iArr4[i11] = iArr5[iF2];
                iArr5[iF2] = i11;
            }
        }
    }

    void B(int i10) {
        C3030w.b(i10, "expectedSize");
        int iA = I.a(i10, 1.0d);
        this.f3850c = 0;
        this.f3848a = (K[]) new Object[i10];
        this.f3849b = (V[]) new Object[i10];
        this.f3852e = i(iA);
        this.f3853f = i(iA);
        this.f3854g = i(i10);
        this.f3855h = i(i10);
        this.f3856i = -2;
        this.f3857j = -2;
        this.f3858k = i(i10);
        this.f3859l = i(i10);
    }

    void H(int i10) {
        J(i10, I.c(this.f3848a[i10]));
    }

    void J(int i10, int i11) {
        I(i10, i11, I.c(this.f3849b[i10]));
    }

    void K(int i10, int i11) {
        I(i10, I.c(this.f3848a[i10]), i11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public Set<V> values() {
        Set<V> set = this.f3861n;
        if (set != null) {
            return set;
        }
        g gVar = new g();
        this.f3861n = gVar;
        return gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f3848a, 0, this.f3850c, (Object) null);
        Arrays.fill(this.f3849b, 0, this.f3850c, (Object) null);
        Arrays.fill(this.f3852e, -1);
        Arrays.fill(this.f3853f, -1);
        Arrays.fill(this.f3854g, 0, this.f3850c, -1);
        Arrays.fill(this.f3855h, 0, this.f3850c, -1);
        Arrays.fill(this.f3858k, 0, this.f3850c, -1);
        Arrays.fill(this.f3859l, 0, this.f3850c, -1);
        this.f3850c = 0;
        this.f3856i = -2;
        this.f3857j = -2;
        this.f3851d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f3862o;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.f3862o = cVar;
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f3860m;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.f3860m = fVar;
        return fVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f3850c;
    }

    int v(Object obj, int i10) {
        return r(obj, i10, this.f3852e, this.f3854g, this.f3848a);
    }

    int y(Object obj, int i10) {
        return r(obj, i10, this.f3853f, this.f3855h, this.f3849b);
    }

    @Override // Ce.InterfaceC3016h
    public InterfaceC3016h<V, K> z() {
        InterfaceC3016h<V, K> interfaceC3016h = this.f3863p;
        if (interfaceC3016h != null) {
            return interfaceC3016h;
        }
        d dVar = new d(this);
        this.f3863p = dVar;
        return dVar;
    }

    private H(int i10) {
        B(i10);
    }

    K A(Object obj) {
        int iX = x(obj);
        if (iX == -1) {
            return null;
        }
        return this.f3848a[iX];
    }

    V F(K k10, V v10, boolean z10) {
        boolean z11;
        int iC = I.c(k10);
        int iV = v(k10, iC);
        if (iV != -1) {
            V v11 = this.f3849b[iV];
            if (Be.l.a(v11, v10)) {
                return v10;
            }
            N(iV, v10, z10);
            return v11;
        }
        int iC2 = I.c(v10);
        int iY = y(v10, iC2);
        if (z10) {
            if (iY != -1) {
                K(iY, iC2);
            }
        } else {
            if (iY == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            Be.p.l(z11, "Value already present: %s", v10);
        }
        n(this.f3850c + 1);
        K[] kArr = this.f3848a;
        int i10 = this.f3850c;
        kArr[i10] = k10;
        this.f3849b[i10] = v10;
        C(i10, iC);
        D(this.f3850c, iC2);
        O(this.f3857j, this.f3850c);
        O(this.f3850c, -2);
        this.f3850c++;
        this.f3851d++;
        return null;
    }

    K G(V v10, K k10, boolean z10) {
        boolean z11;
        int i10;
        int iC = I.c(v10);
        int iY = y(v10, iC);
        if (iY != -1) {
            K k11 = this.f3848a[iY];
            if (Be.l.a(k11, k10)) {
                return k10;
            }
            M(iY, k10, z10);
            return k11;
        }
        int i11 = this.f3857j;
        int iC2 = I.c(k10);
        int iV = v(k10, iC2);
        if (z10) {
            if (iV != -1) {
                i11 = this.f3858k[iV];
                J(iV, iC2);
            }
        } else {
            if (iV == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            Be.p.l(z11, "Key already present: %s", k10);
        }
        n(this.f3850c + 1);
        K[] kArr = this.f3848a;
        int i12 = this.f3850c;
        kArr[i12] = k10;
        this.f3849b[i12] = v10;
        C(i12, iC2);
        D(this.f3850c, iC);
        if (i11 == -2) {
            i10 = this.f3856i;
        } else {
            i10 = this.f3859l[i11];
        }
        O(i11, this.f3850c);
        O(this.f3850c, i10);
        this.f3850c++;
        this.f3851d++;
        return null;
    }

    K L(Object obj) {
        int iC = I.c(obj);
        int iY = y(obj, iC);
        if (iY == -1) {
            return null;
        }
        K k10 = this.f3848a[iY];
        K(iY, iC);
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
        if (x(obj) != -1) {
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
        return this.f3849b[iS];
    }

    int r(Object obj, int i10, int[] iArr, int[] iArr2, Object[] objArr) {
        int i11 = iArr[f(i10)];
        while (i11 != -1) {
            if (Be.l.a(objArr[i11], obj)) {
                return i11;
            }
            i11 = iArr2[i11];
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        int iC = I.c(obj);
        int iV = v(obj, iC);
        if (iV == -1) {
            return null;
        }
        V v10 = this.f3849b[iV];
        J(iV, iC);
        return v10;
    }

    int s(Object obj) {
        return v(obj, I.c(obj));
    }

    int x(Object obj) {
        return y(obj, I.c(obj));
    }
}
