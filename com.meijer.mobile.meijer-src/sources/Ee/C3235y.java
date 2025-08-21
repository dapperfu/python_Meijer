package Ee;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* renamed from: Ee.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C3235y<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f7437j = new Object();

    /* renamed from: a, reason: collision with root package name */
    private transient Object f7438a;

    /* renamed from: b, reason: collision with root package name */
    transient int[] f7439b;

    /* renamed from: c, reason: collision with root package name */
    transient Object[] f7440c;

    /* renamed from: d, reason: collision with root package name */
    transient Object[] f7441d;

    /* renamed from: e, reason: collision with root package name */
    private transient int f7442e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f7443f;

    /* renamed from: g, reason: collision with root package name */
    private transient Set<K> f7444g;

    /* renamed from: h, reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f7445h;

    /* renamed from: i, reason: collision with root package name */
    private transient Collection<V> f7446i;

    /* renamed from: Ee.y$a */
    class a extends C3235y<K, V>.e<K> {
        a() {
            super(C3235y.this, null);
        }

        @Override // Ee.C3235y.e
        K c(int i10) {
            return (K) C3235y.this.P(i10);
        }
    }

    /* renamed from: Ee.y$b */
    class b extends C3235y<K, V>.e<Map.Entry<K, V>> {
        b() {
            super(C3235y.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Ee.C3235y.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> c(int i10) {
            return new g(i10);
        }
    }

    /* renamed from: Ee.y$c */
    class c extends C3235y<K, V>.e<V> {
        c() {
            super(C3235y.this, null);
        }

        @Override // Ee.C3235y.e
        V c(int i10) {
            return (V) C3235y.this.f0(i10);
        }
    }

    /* renamed from: Ee.y$d */
    class d extends AbstractSet<Map.Entry<K, V>> {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C3235y.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> mapF = C3235y.this.F();
            if (mapF != null) {
                return mapF.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int iM = C3235y.this.M(entry.getKey());
                if (iM != -1 && De.l.a(C3235y.this.f0(iM), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return C3235y.this.H();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iK;
            int iF;
            Map<K, V> mapF = C3235y.this.F();
            if (mapF != null) {
                return mapF.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C3235y.this.S() || (iF = C3236z.f(entry.getKey(), entry.getValue(), (iK = C3235y.this.K()), C3235y.this.W(), C3235y.this.U(), C3235y.this.V(), C3235y.this.X())) == -1) {
                return false;
            }
            C3235y.this.R(iF, iK);
            C3235y.f(C3235y.this);
            C3235y.this.L();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C3235y.this.size();
        }
    }

    /* renamed from: Ee.y$e */
    private abstract class e<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        int f7451a;

        /* renamed from: b, reason: collision with root package name */
        int f7452b;

        /* renamed from: c, reason: collision with root package name */
        int f7453c;

        private e() {
            this.f7451a = C3235y.this.f7442e;
            this.f7452b = C3235y.this.I();
            this.f7453c = -1;
        }

        abstract T c(int i10);

        private void a() {
            if (C3235y.this.f7442e != this.f7451a) {
                throw new ConcurrentModificationException();
            }
        }

        void d() {
            this.f7451a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7452b >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (hasNext()) {
                int i10 = this.f7452b;
                this.f7453c = i10;
                T tC = c(i10);
                this.f7452b = C3235y.this.J(this.f7452b);
                return tC;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z10;
            a();
            if (this.f7453c >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3233w.c(z10);
            d();
            C3235y c3235y = C3235y.this;
            c3235y.remove(c3235y.P(this.f7453c));
            this.f7452b = C3235y.this.t(this.f7452b, this.f7453c);
            this.f7453c = -1;
        }

        /* synthetic */ e(C3235y c3235y, a aVar) {
            this();
        }
    }

    /* renamed from: Ee.y$f */
    class f extends AbstractSet<K> {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C3235y.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C3235y.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return C3235y.this.Q();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapF = C3235y.this.F();
            return mapF != null ? mapF.keySet().remove(obj) : C3235y.this.T(obj) != C3235y.f7437j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C3235y.this.size();
        }
    }

    /* renamed from: Ee.y$g */
    final class g extends AbstractC3216e<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private final K f7456a;

        /* renamed from: b, reason: collision with root package name */
        private int f7457b;

        g(int i10) {
            this.f7456a = (K) C3235y.this.P(i10);
            this.f7457b = i10;
        }

        private void a() {
            int i10 = this.f7457b;
            if (i10 == -1 || i10 >= C3235y.this.size() || !De.l.a(this.f7456a, C3235y.this.P(this.f7457b))) {
                this.f7457b = C3235y.this.M(this.f7456a);
            }
        }

        @Override // Ee.AbstractC3216e, java.util.Map.Entry
        public K getKey() {
            return this.f7456a;
        }

        @Override // Ee.AbstractC3216e, java.util.Map.Entry
        public V getValue() {
            Map<K, V> mapF = C3235y.this.F();
            if (mapF != null) {
                return (V) e0.a(mapF.get(this.f7456a));
            }
            a();
            int i10 = this.f7457b;
            return i10 == -1 ? (V) e0.b() : (V) C3235y.this.f0(i10);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            Map<K, V> mapF = C3235y.this.F();
            if (mapF != null) {
                return (V) e0.a(mapF.put(this.f7456a, v10));
            }
            a();
            int i10 = this.f7457b;
            if (i10 == -1) {
                C3235y.this.put(this.f7456a, v10);
                return (V) e0.b();
            }
            V v11 = (V) C3235y.this.f0(i10);
            C3235y.this.e0(this.f7457b, v10);
            return v11;
        }
    }

    /* renamed from: Ee.y$h */
    class h extends AbstractCollection<V> {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C3235y.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return C3235y.this.g0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C3235y.this.size();
        }
    }

    void N(int i10) {
        De.p.e(i10 >= 0, "Expected size must be >= 0");
        this.f7442e = Je.f.e(i10, 1, 1073741823);
    }

    void O(int i10, K k10, V v10, int i11, int i12) {
        b0(i10, C3236z.d(i11, 0, i12));
        d0(i10, k10);
        e0(i10, v10);
    }

    void s(int i10) {
    }

    public static <K, V> C3235y<K, V> E(int i10) {
        return new C3235y<>(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int K() {
        return (1 << (this.f7442e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] U() {
        int[] iArr = this.f7439b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] V() {
        Object[] objArr = this.f7440c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object W() {
        Object obj = this.f7438a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] X() {
        Object[] objArr = this.f7441d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    static /* synthetic */ int f(C3235y c3235y) {
        int i10 = c3235y.f7443f;
        c3235y.f7443f = i10 - 1;
        return i10;
    }

    Map<K, V> A(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    Set<K> B() {
        return new f();
    }

    Collection<V> D() {
        return new h();
    }

    Map<K, V> F() {
        Object obj = this.f7438a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    int J(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f7443f) {
            return i11;
        }
        return -1;
    }

    void L() {
        this.f7442e += 32;
    }

    boolean S() {
        return this.f7438a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f7445h;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setY = y();
        this.f7445h = setY;
        return setY;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f7444g;
        if (set != null) {
            return set;
        }
        Set<K> setB = B();
        this.f7444g = setB;
        return setB;
    }

    int t(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f7446i;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionD = D();
        this.f7446i = collectionD;
        return collectionD;
    }

    Set<Map.Entry<K, V>> y() {
        return new d();
    }

    C3235y(int i10) {
        N(i10);
    }

    private int G(int i10) {
        return U()[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int M(Object obj) {
        if (S()) {
            return -1;
        }
        int iC = I.c(obj);
        int iK = K();
        int iH = C3236z.h(W(), iC & iK);
        if (iH == 0) {
            return -1;
        }
        int iB = C3236z.b(iC, iK);
        do {
            int i10 = iH - 1;
            int iG = G(i10);
            if (C3236z.b(iG, iK) == iB && De.l.a(obj, P(i10))) {
                return i10;
            }
            iH = C3236z.c(iG, iK);
        } while (iH != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K P(int i10) {
        return (K) V()[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object T(Object obj) {
        if (S()) {
            return f7437j;
        }
        int iK = K();
        int iF = C3236z.f(obj, null, iK, W(), U(), V(), null);
        if (iF == -1) {
            return f7437j;
        }
        V vF0 = f0(iF);
        R(iF, iK);
        this.f7443f--;
        L();
        return vF0;
    }

    private void Z(int i10) {
        int iMin;
        int length = U().length;
        if (i10 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            Y(iMin);
        }
    }

    private int a0(int i10, int i11, int i12, int i13) {
        Object objA = C3236z.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            C3236z.i(objA, i12 & i14, i13 + 1);
        }
        Object objW = W();
        int[] iArrU = U();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = C3236z.h(objW, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrU[i16];
                int iB = C3236z.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = C3236z.h(objA, i18);
                C3236z.i(objA, i18, iH);
                iArrU[i16] = C3236z.d(iB, iH2, i14);
                iH = C3236z.c(i17, i10);
            }
        }
        this.f7438a = objA;
        c0(i14);
        return i14;
    }

    private void b0(int i10, int i11) {
        U()[i10] = i11;
    }

    private void c0(int i10) {
        this.f7442e = C3236z.d(this.f7442e, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    private void d0(int i10, K k10) {
        V()[i10] = k10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(int i10, V v10) {
        X()[i10] = v10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V f0(int i10) {
        return (V) X()[i10];
    }

    Iterator<Map.Entry<K, V>> H() {
        Map<K, V> mapF = F();
        if (mapF != null) {
            return mapF.entrySet().iterator();
        }
        return new b();
    }

    int I() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    Iterator<K> Q() {
        Map<K, V> mapF = F();
        if (mapF != null) {
            return mapF.keySet().iterator();
        }
        return new a();
    }

    void R(int i10, int i11) {
        Object objW = W();
        int[] iArrU = U();
        Object[] objArrV = V();
        Object[] objArrX = X();
        int size = size();
        int i12 = size - 1;
        if (i10 < i12) {
            Object obj = objArrV[i12];
            objArrV[i10] = obj;
            objArrX[i10] = objArrX[i12];
            objArrV[i12] = null;
            objArrX[i12] = null;
            iArrU[i10] = iArrU[i12];
            iArrU[i12] = 0;
            int iC = I.c(obj) & i11;
            int iH = C3236z.h(objW, iC);
            if (iH == size) {
                C3236z.i(objW, iC, i10 + 1);
                return;
            }
            while (true) {
                int i13 = iH - 1;
                int i14 = iArrU[i13];
                int iC2 = C3236z.c(i14, i11);
                if (iC2 == size) {
                    iArrU[i13] = C3236z.d(i14, i10 + 1, i11);
                    return;
                }
                iH = iC2;
            }
        } else {
            objArrV[i10] = null;
            objArrX[i10] = null;
            iArrU[i10] = 0;
        }
    }

    void Y(int i10) {
        this.f7439b = Arrays.copyOf(U(), i10);
        this.f7440c = Arrays.copyOf(V(), i10);
        this.f7441d = Arrays.copyOf(X(), i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (S()) {
            return;
        }
        L();
        Map<K, V> mapF = F();
        if (mapF != null) {
            this.f7442e = Je.f.e(size(), 3, 1073741823);
            mapF.clear();
            this.f7438a = null;
            this.f7443f = 0;
            return;
        }
        Arrays.fill(V(), 0, this.f7443f, (Object) null);
        Arrays.fill(X(), 0, this.f7443f, (Object) null);
        C3236z.g(W());
        Arrays.fill(U(), 0, this.f7443f, 0);
        this.f7443f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> mapF = F();
        if (mapF != null) {
            return mapF.containsKey(obj);
        }
        if (M(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> mapF = F();
        if (mapF != null) {
            return mapF.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f7443f; i10++) {
            if (De.l.a(obj, f0(i10))) {
                return true;
            }
        }
        return false;
    }

    Iterator<V> g0() {
        Map<K, V> mapF = F();
        if (mapF != null) {
            return mapF.values().iterator();
        }
        return new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> mapF = F();
        if (mapF != null) {
            return mapF.get(obj);
        }
        int iM = M(obj);
        if (iM == -1) {
            return null;
        }
        s(iM);
        return f0(iM);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        if (S()) {
            v();
        }
        Map<K, V> mapF = F();
        if (mapF != null) {
            return mapF.put(k10, v10);
        }
        int[] iArrU = U();
        Object[] objArrV = V();
        Object[] objArrX = X();
        int i10 = this.f7443f;
        int i11 = i10 + 1;
        int iC = I.c(k10);
        int iK = K();
        int i12 = iC & iK;
        int iH = C3236z.h(W(), i12);
        if (iH == 0) {
            if (i11 > iK) {
                iK = a0(iK, C3236z.e(iK), iC, i10);
            } else {
                C3236z.i(W(), i12, i11);
            }
        } else {
            int iB = C3236z.b(iC, iK);
            int i13 = 0;
            while (true) {
                int i14 = iH - 1;
                int i15 = iArrU[i14];
                if (C3236z.b(i15, iK) == iB && De.l.a(k10, objArrV[i14])) {
                    V v11 = (V) objArrX[i14];
                    objArrX[i14] = v10;
                    s(i14);
                    return v11;
                }
                int iC2 = C3236z.c(i15, iK);
                i13++;
                if (iC2 == 0) {
                    if (i13 >= 9) {
                        return x().put(k10, v10);
                    }
                    if (i11 > iK) {
                        iK = a0(iK, C3236z.e(iK), iC, i10);
                    } else {
                        iArrU[i14] = C3236z.d(i15, i11, iK);
                    }
                } else {
                    k10 = k10;
                    v10 = v10;
                    iH = iC2;
                }
            }
        }
        int i16 = iK;
        Z(i11);
        O(i10, k10, v10, iC, i16);
        this.f7443f = i11;
        L();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> mapF = F();
        if (mapF != null) {
            return mapF.remove(obj);
        }
        V v10 = (V) T(obj);
        if (v10 == f7437j) {
            return null;
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapF = F();
        if (mapF != null) {
            return mapF.size();
        }
        return this.f7443f;
    }

    int v() {
        De.p.x(S(), "Arrays already allocated");
        int i10 = this.f7442e;
        int iJ = C3236z.j(i10);
        this.f7438a = C3236z.a(iJ);
        c0(iJ - 1);
        this.f7439b = new int[i10];
        this.f7440c = new Object[i10];
        this.f7441d = new Object[i10];
        return i10;
    }

    Map<K, V> x() {
        Map<K, V> mapA = A(K() + 1);
        int I10 = I();
        while (I10 >= 0) {
            mapA.put(P(I10), f0(I10));
            I10 = J(I10);
        }
        this.f7438a = mapA;
        this.f7439b = null;
        this.f7440c = null;
        this.f7441d = null;
        L();
        return mapA;
    }
}
