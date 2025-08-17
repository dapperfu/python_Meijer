package Ce;

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

/* renamed from: Ce.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C3032y<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f4125j = new Object();

    /* renamed from: a, reason: collision with root package name */
    private transient Object f4126a;

    /* renamed from: b, reason: collision with root package name */
    transient int[] f4127b;

    /* renamed from: c, reason: collision with root package name */
    transient Object[] f4128c;

    /* renamed from: d, reason: collision with root package name */
    transient Object[] f4129d;

    /* renamed from: e, reason: collision with root package name */
    private transient int f4130e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f4131f;

    /* renamed from: g, reason: collision with root package name */
    private transient Set<K> f4132g;

    /* renamed from: h, reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f4133h;

    /* renamed from: i, reason: collision with root package name */
    private transient Collection<V> f4134i;

    /* renamed from: Ce.y$a */
    class a extends C3032y<K, V>.e<K> {
        a() {
            super(C3032y.this, null);
        }

        @Override // Ce.C3032y.e
        K c(int i10) {
            return (K) C3032y.this.P(i10);
        }
    }

    /* renamed from: Ce.y$b */
    class b extends C3032y<K, V>.e<Map.Entry<K, V>> {
        b() {
            super(C3032y.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Ce.C3032y.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> c(int i10) {
            return new g(i10);
        }
    }

    /* renamed from: Ce.y$c */
    class c extends C3032y<K, V>.e<V> {
        c() {
            super(C3032y.this, null);
        }

        @Override // Ce.C3032y.e
        V c(int i10) {
            return (V) C3032y.this.f0(i10);
        }
    }

    /* renamed from: Ce.y$d */
    class d extends AbstractSet<Map.Entry<K, V>> {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C3032y.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> mapF = C3032y.this.F();
            if (mapF != null) {
                return mapF.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int iM = C3032y.this.M(entry.getKey());
                if (iM != -1 && Be.l.a(C3032y.this.f0(iM), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return C3032y.this.H();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iK;
            int iF;
            Map<K, V> mapF = C3032y.this.F();
            if (mapF != null) {
                return mapF.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C3032y.this.S() || (iF = C3033z.f(entry.getKey(), entry.getValue(), (iK = C3032y.this.K()), C3032y.this.W(), C3032y.this.U(), C3032y.this.V(), C3032y.this.X())) == -1) {
                return false;
            }
            C3032y.this.R(iF, iK);
            C3032y.f(C3032y.this);
            C3032y.this.L();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C3032y.this.size();
        }
    }

    /* renamed from: Ce.y$e */
    private abstract class e<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        int f4139a;

        /* renamed from: b, reason: collision with root package name */
        int f4140b;

        /* renamed from: c, reason: collision with root package name */
        int f4141c;

        private e() {
            this.f4139a = C3032y.this.f4130e;
            this.f4140b = C3032y.this.I();
            this.f4141c = -1;
        }

        abstract T c(int i10);

        private void a() {
            if (C3032y.this.f4130e != this.f4139a) {
                throw new ConcurrentModificationException();
            }
        }

        void d() {
            this.f4139a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4140b >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (hasNext()) {
                int i10 = this.f4140b;
                this.f4141c = i10;
                T tC = c(i10);
                this.f4140b = C3032y.this.J(this.f4140b);
                return tC;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z10;
            a();
            if (this.f4141c >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3030w.c(z10);
            d();
            C3032y c3032y = C3032y.this;
            c3032y.remove(c3032y.P(this.f4141c));
            this.f4140b = C3032y.this.v(this.f4140b, this.f4141c);
            this.f4141c = -1;
        }

        /* synthetic */ e(C3032y c3032y, a aVar) {
            this();
        }
    }

    /* renamed from: Ce.y$f */
    class f extends AbstractSet<K> {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C3032y.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C3032y.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return C3032y.this.Q();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapF = C3032y.this.F();
            return mapF != null ? mapF.keySet().remove(obj) : C3032y.this.T(obj) != C3032y.f4125j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C3032y.this.size();
        }
    }

    /* renamed from: Ce.y$g */
    final class g extends AbstractC3013e<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private final K f4144a;

        /* renamed from: b, reason: collision with root package name */
        private int f4145b;

        g(int i10) {
            this.f4144a = (K) C3032y.this.P(i10);
            this.f4145b = i10;
        }

        private void a() {
            int i10 = this.f4145b;
            if (i10 == -1 || i10 >= C3032y.this.size() || !Be.l.a(this.f4144a, C3032y.this.P(this.f4145b))) {
                this.f4145b = C3032y.this.M(this.f4144a);
            }
        }

        @Override // Ce.AbstractC3013e, java.util.Map.Entry
        public K getKey() {
            return this.f4144a;
        }

        @Override // Ce.AbstractC3013e, java.util.Map.Entry
        public V getValue() {
            Map<K, V> mapF = C3032y.this.F();
            if (mapF != null) {
                return (V) e0.a(mapF.get(this.f4144a));
            }
            a();
            int i10 = this.f4145b;
            return i10 == -1 ? (V) e0.b() : (V) C3032y.this.f0(i10);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            Map<K, V> mapF = C3032y.this.F();
            if (mapF != null) {
                return (V) e0.a(mapF.put(this.f4144a, v10));
            }
            a();
            int i10 = this.f4145b;
            if (i10 == -1) {
                C3032y.this.put(this.f4144a, v10);
                return (V) e0.b();
            }
            V v11 = (V) C3032y.this.f0(i10);
            C3032y.this.e0(this.f4145b, v10);
            return v11;
        }
    }

    /* renamed from: Ce.y$h */
    class h extends AbstractCollection<V> {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C3032y.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return C3032y.this.g0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C3032y.this.size();
        }
    }

    void N(int i10) {
        Be.p.e(i10 >= 0, "Expected size must be >= 0");
        this.f4130e = He.f.e(i10, 1, 1073741823);
    }

    void O(int i10, K k10, V v10, int i11, int i12) {
        b0(i10, C3033z.d(i11, 0, i12));
        d0(i10, k10);
        e0(i10, v10);
    }

    void s(int i10) {
    }

    public static <K, V> C3032y<K, V> E(int i10) {
        return new C3032y<>(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int K() {
        return (1 << (this.f4130e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] U() {
        int[] iArr = this.f4127b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] V() {
        Object[] objArr = this.f4128c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object W() {
        Object obj = this.f4126a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] X() {
        Object[] objArr = this.f4129d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    static /* synthetic */ int f(C3032y c3032y) {
        int i10 = c3032y.f4131f;
        c3032y.f4131f = i10 - 1;
        return i10;
    }

    Set<Map.Entry<K, V>> A() {
        return new d();
    }

    Map<K, V> B(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    Set<K> C() {
        return new f();
    }

    Collection<V> D() {
        return new h();
    }

    Map<K, V> F() {
        Object obj = this.f4126a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    int J(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f4131f) {
            return i11;
        }
        return -1;
    }

    void L() {
        this.f4130e += 32;
    }

    boolean S() {
        return this.f4126a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f4133h;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setA = A();
        this.f4133h = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f4132g;
        if (set != null) {
            return set;
        }
        Set<K> setC = C();
        this.f4132g = setC;
        return setC;
    }

    int v(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f4134i;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionD = D();
        this.f4134i = collectionD;
        return collectionD;
    }

    C3032y(int i10) {
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
        int iH = C3033z.h(W(), iC & iK);
        if (iH == 0) {
            return -1;
        }
        int iB = C3033z.b(iC, iK);
        do {
            int i10 = iH - 1;
            int iG = G(i10);
            if (C3033z.b(iG, iK) == iB && Be.l.a(obj, P(i10))) {
                return i10;
            }
            iH = C3033z.c(iG, iK);
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
            return f4125j;
        }
        int iK = K();
        int iF = C3033z.f(obj, null, iK, W(), U(), V(), null);
        if (iF == -1) {
            return f4125j;
        }
        V vF0 = f0(iF);
        R(iF, iK);
        this.f4131f--;
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
        Object objA = C3033z.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            C3033z.i(objA, i12 & i14, i13 + 1);
        }
        Object objW = W();
        int[] iArrU = U();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = C3033z.h(objW, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrU[i16];
                int iB = C3033z.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = C3033z.h(objA, i18);
                C3033z.i(objA, i18, iH);
                iArrU[i16] = C3033z.d(iB, iH2, i14);
                iH = C3033z.c(i17, i10);
            }
        }
        this.f4126a = objA;
        c0(i14);
        return i14;
    }

    private void b0(int i10, int i11) {
        U()[i10] = i11;
    }

    private void c0(int i10) {
        this.f4130e = C3033z.d(this.f4130e, 32 - Integer.numberOfLeadingZeros(i10), 31);
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
            int iH = C3033z.h(objW, iC);
            if (iH == size) {
                C3033z.i(objW, iC, i10 + 1);
                return;
            }
            while (true) {
                int i13 = iH - 1;
                int i14 = iArrU[i13];
                int iC2 = C3033z.c(i14, i11);
                if (iC2 == size) {
                    iArrU[i13] = C3033z.d(i14, i10 + 1, i11);
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
        this.f4127b = Arrays.copyOf(U(), i10);
        this.f4128c = Arrays.copyOf(V(), i10);
        this.f4129d = Arrays.copyOf(X(), i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (S()) {
            return;
        }
        L();
        Map<K, V> mapF = F();
        if (mapF != null) {
            this.f4130e = He.f.e(size(), 3, 1073741823);
            mapF.clear();
            this.f4126a = null;
            this.f4131f = 0;
            return;
        }
        Arrays.fill(V(), 0, this.f4131f, (Object) null);
        Arrays.fill(X(), 0, this.f4131f, (Object) null);
        C3033z.g(W());
        Arrays.fill(U(), 0, this.f4131f, 0);
        this.f4131f = 0;
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
        for (int i10 = 0; i10 < this.f4131f; i10++) {
            if (Be.l.a(obj, f0(i10))) {
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
            x();
        }
        Map<K, V> mapF = F();
        if (mapF != null) {
            return mapF.put(k10, v10);
        }
        int[] iArrU = U();
        Object[] objArrV = V();
        Object[] objArrX = X();
        int i10 = this.f4131f;
        int i11 = i10 + 1;
        int iC = I.c(k10);
        int iK = K();
        int i12 = iC & iK;
        int iH = C3033z.h(W(), i12);
        if (iH == 0) {
            if (i11 > iK) {
                iK = a0(iK, C3033z.e(iK), iC, i10);
            } else {
                C3033z.i(W(), i12, i11);
            }
        } else {
            int iB = C3033z.b(iC, iK);
            int i13 = 0;
            while (true) {
                int i14 = iH - 1;
                int i15 = iArrU[i14];
                if (C3033z.b(i15, iK) == iB && Be.l.a(k10, objArrV[i14])) {
                    V v11 = (V) objArrX[i14];
                    objArrX[i14] = v10;
                    s(i14);
                    return v11;
                }
                int iC2 = C3033z.c(i15, iK);
                i13++;
                if (iC2 == 0) {
                    if (i13 >= 9) {
                        return y().put(k10, v10);
                    }
                    if (i11 > iK) {
                        iK = a0(iK, C3033z.e(iK), iC, i10);
                    } else {
                        iArrU[i14] = C3033z.d(i15, i11, iK);
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
        this.f4131f = i11;
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
        if (v10 == f4125j) {
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
        return this.f4131f;
    }

    int x() {
        Be.p.x(S(), "Arrays already allocated");
        int i10 = this.f4130e;
        int iJ = C3033z.j(i10);
        this.f4126a = C3033z.a(iJ);
        c0(iJ - 1);
        this.f4127b = new int[i10];
        this.f4128c = new Object[i10];
        this.f4129d = new Object[i10];
        return i10;
    }

    Map<K, V> y() {
        Map<K, V> mapB = B(K() + 1);
        int I10 = I();
        while (I10 >= 0) {
            mapB.put(P(I10), f0(I10));
            I10 = J(I10);
        }
        this.f4126a = mapB;
        this.f4127b = null;
        this.f4128c = null;
        this.f4129d = null;
        L();
        return mapB;
    }
}
