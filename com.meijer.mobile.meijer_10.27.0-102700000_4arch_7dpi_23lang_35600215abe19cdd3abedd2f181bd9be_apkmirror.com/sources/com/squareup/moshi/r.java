package com.squareup.moshi;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes11.dex */
final class r<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator<Comparable> f126398i = new a();

    /* renamed from: a, reason: collision with root package name */
    final Comparator<? super K> f126399a;

    /* renamed from: b, reason: collision with root package name */
    g<K, V>[] f126400b;

    /* renamed from: c, reason: collision with root package name */
    final g<K, V> f126401c;

    /* renamed from: d, reason: collision with root package name */
    int f126402d;

    /* renamed from: e, reason: collision with root package name */
    int f126403e;

    /* renamed from: f, reason: collision with root package name */
    int f126404f;

    /* renamed from: g, reason: collision with root package name */
    private r<K, V>.d f126405g;

    /* renamed from: h, reason: collision with root package name */
    private r<K, V>.e f126406h;

    static final class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private g<K, V> f126407a;

        /* renamed from: b, reason: collision with root package name */
        private int f126408b;

        /* renamed from: c, reason: collision with root package name */
        private int f126409c;

        /* renamed from: d, reason: collision with root package name */
        private int f126410d;

        void a(g<K, V> gVar) {
            gVar.f126422c = null;
            gVar.f126420a = null;
            gVar.f126421b = null;
            gVar.f126428i = 1;
            int i10 = this.f126408b;
            if (i10 > 0) {
                int i11 = this.f126410d;
                if ((i11 & 1) == 0) {
                    this.f126410d = i11 + 1;
                    this.f126408b = i10 - 1;
                    this.f126409c++;
                }
            }
            gVar.f126420a = this.f126407a;
            this.f126407a = gVar;
            int i12 = this.f126410d;
            int i13 = i12 + 1;
            this.f126410d = i13;
            int i14 = this.f126408b;
            if (i14 > 0 && (i13 & 1) == 0) {
                this.f126410d = i12 + 2;
                this.f126408b = i14 - 1;
                this.f126409c++;
            }
            int i15 = 4;
            while (true) {
                int i16 = i15 - 1;
                if ((this.f126410d & i16) != i16) {
                    return;
                }
                int i17 = this.f126409c;
                if (i17 == 0) {
                    g<K, V> gVar2 = this.f126407a;
                    g<K, V> gVar3 = gVar2.f126420a;
                    g<K, V> gVar4 = gVar3.f126420a;
                    gVar3.f126420a = gVar4.f126420a;
                    this.f126407a = gVar3;
                    gVar3.f126421b = gVar4;
                    gVar3.f126422c = gVar2;
                    gVar3.f126428i = gVar2.f126428i + 1;
                    gVar4.f126420a = gVar3;
                    gVar2.f126420a = gVar3;
                } else if (i17 == 1) {
                    g<K, V> gVar5 = this.f126407a;
                    g<K, V> gVar6 = gVar5.f126420a;
                    this.f126407a = gVar6;
                    gVar6.f126422c = gVar5;
                    gVar6.f126428i = gVar5.f126428i + 1;
                    gVar5.f126420a = gVar6;
                    this.f126409c = 0;
                } else if (i17 == 2) {
                    this.f126409c = 0;
                }
                i15 *= 2;
            }
        }

        g<K, V> c() {
            g<K, V> gVar = this.f126407a;
            if (gVar.f126420a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }

        b() {
        }

        void b(int i10) {
            this.f126408b = ((Integer.highestOneBit(i10) * 2) - 1) - i10;
            this.f126410d = 0;
            this.f126409c = 0;
            this.f126407a = null;
        }
    }

    static class c<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private g<K, V> f126411a;

        void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f126420a = gVar2;
                gVar2 = gVar;
                gVar = gVar.f126421b;
            }
            this.f126411a = gVar2;
        }

        public g<K, V> a() {
            g<K, V> gVar = this.f126411a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f126420a;
            gVar.f126420a = null;
            g<K, V> gVar3 = gVar.f126422c;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.f126411a = gVar4;
                    return gVar;
                }
                gVar2.f126420a = gVar4;
                gVar3 = gVar2.f126421b;
            }
        }

        c() {
        }
    }

    final class d extends AbstractSet<Map.Entry<K, V>> {

        class a extends r<K, V>.f<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            r.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && r.this.f((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> gVarF;
            if (!(obj instanceof Map.Entry) || (gVarF = r.this.f((Map.Entry) obj)) == null) {
                return false;
            }
            r.this.i(gVarF, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return r.this.f126402d;
        }
    }

    final class e extends AbstractSet<K> {

        class a extends r<K, V>.f<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f126425f;
            }
        }

        e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            r.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return r.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return r.this.j(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return r.this.f126402d;
        }
    }

    abstract class f<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        g<K, V> f126416a;

        /* renamed from: b, reason: collision with root package name */
        g<K, V> f126417b = null;

        /* renamed from: c, reason: collision with root package name */
        int f126418c;

        f() {
            this.f126416a = r.this.f126401c.f126423d;
            this.f126418c = r.this.f126403e;
        }

        final g<K, V> a() {
            g<K, V> gVar = this.f126416a;
            r rVar = r.this;
            if (gVar == rVar.f126401c) {
                throw new NoSuchElementException();
            }
            if (rVar.f126403e != this.f126418c) {
                throw new ConcurrentModificationException();
            }
            this.f126416a = gVar.f126423d;
            this.f126417b = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f126416a != r.this.f126401c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.f126417b;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            r.this.i(gVar, true);
            this.f126417b = null;
            this.f126418c = r.this.f126403e;
        }
    }

    static final class g<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        g<K, V> f126420a;

        /* renamed from: b, reason: collision with root package name */
        g<K, V> f126421b;

        /* renamed from: c, reason: collision with root package name */
        g<K, V> f126422c;

        /* renamed from: d, reason: collision with root package name */
        g<K, V> f126423d;

        /* renamed from: e, reason: collision with root package name */
        g<K, V> f126424e;

        /* renamed from: f, reason: collision with root package name */
        final K f126425f;

        /* renamed from: g, reason: collision with root package name */
        final int f126426g;

        /* renamed from: h, reason: collision with root package name */
        V f126427h;

        /* renamed from: i, reason: collision with root package name */
        int f126428i;

        g() {
            this.f126425f = null;
            this.f126426g = -1;
            this.f126424e = this;
            this.f126423d = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f126421b; gVar2 != null; gVar2 = gVar2.f126421b) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f126422c; gVar2 != null; gVar2 = gVar2.f126422c) {
                gVar = gVar2;
            }
            return gVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f126425f;
                if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
                    V v10 = this.f126427h;
                    if (v10 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v10.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f126425f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f126427h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f126425f;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f126427h;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f126427h;
            this.f126427h = v10;
            return v11;
        }

        public String toString() {
            return this.f126425f + "=" + this.f126427h;
        }

        g(g<K, V> gVar, K k10, int i10, g<K, V> gVar2, g<K, V> gVar3) {
            this.f126420a = gVar;
            this.f126425f = k10;
            this.f126426g = i10;
            this.f126428i = 1;
            this.f126423d = gVar2;
            this.f126424e = gVar3;
            gVar3.f126423d = this;
            gVar2.f126424e = this;
        }
    }

    r() {
        this(null);
    }

    static <K, V> g<K, V>[] b(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i10 = 0; i10 < length; i10++) {
            g<K, V> gVar = gVarArr[i10];
            if (gVar != null) {
                cVar.b(gVar);
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    g<K, V> gVarA = cVar.a();
                    if (gVarA == null) {
                        break;
                    }
                    if ((gVarA.f126426g & length) == 0) {
                        i11++;
                    } else {
                        i12++;
                    }
                }
                bVar.b(i11);
                bVar2.b(i12);
                cVar.b(gVar);
                while (true) {
                    g<K, V> gVarA2 = cVar.a();
                    if (gVarA2 == null) {
                        break;
                    }
                    if ((gVarA2.f126426g & length) == 0) {
                        bVar.a(gVarA2);
                    } else {
                        bVar2.a(gVarA2);
                    }
                }
                gVarArr2[i10] = i11 > 0 ? bVar.c() : null;
                gVarArr2[i10 + length] = i12 > 0 ? bVar2.c() : null;
            }
        }
        return gVarArr2;
    }

    private static int r(int i10) {
        int i11 = i10 ^ ((i10 >>> 20) ^ (i10 >>> 12));
        return (i11 >>> 4) ^ ((i11 >>> 7) ^ i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    g<K, V> g(Object obj) {
        if (obj != 0) {
            try {
                return d(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    void i(g<K, V> gVar, boolean z10) {
        int i10;
        if (z10) {
            g<K, V> gVar2 = gVar.f126424e;
            gVar2.f126423d = gVar.f126423d;
            gVar.f126423d.f126424e = gVar2;
            gVar.f126424e = null;
            gVar.f126423d = null;
        }
        g<K, V> gVar3 = gVar.f126421b;
        g<K, V> gVar4 = gVar.f126422c;
        g<K, V> gVar5 = gVar.f126420a;
        int i11 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                k(gVar, gVar3);
                gVar.f126421b = null;
            } else if (gVar4 != null) {
                k(gVar, gVar4);
                gVar.f126422c = null;
            } else {
                k(gVar, null);
            }
            h(gVar5, false);
            this.f126402d--;
            this.f126403e++;
            return;
        }
        g<K, V> gVarB = gVar3.f126428i > gVar4.f126428i ? gVar3.b() : gVar4.a();
        i(gVarB, false);
        g<K, V> gVar6 = gVar.f126421b;
        if (gVar6 != null) {
            i10 = gVar6.f126428i;
            gVarB.f126421b = gVar6;
            gVar6.f126420a = gVarB;
            gVar.f126421b = null;
        } else {
            i10 = 0;
        }
        g<K, V> gVar7 = gVar.f126422c;
        if (gVar7 != null) {
            i11 = gVar7.f126428i;
            gVarB.f126422c = gVar7;
            gVar7.f126420a = gVarB;
            gVar.f126422c = null;
        }
        gVarB.f126428i = Math.max(i10, i11) + 1;
        k(gVar, gVarB);
    }

    class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    r(Comparator<? super K> comparator) {
        this.f126402d = 0;
        this.f126403e = 0;
        this.f126399a = comparator == null ? f126398i : comparator;
        this.f126401c = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.f126400b = gVarArr;
        this.f126404f = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    private void a() {
        g<K, V>[] gVarArrB = b(this.f126400b);
        this.f126400b = gVarArrB;
        this.f126404f = (gVarArrB.length / 2) + (gVarArrB.length / 4);
    }

    private boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private void h(g<K, V> gVar, boolean z10) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.f126421b;
            g<K, V> gVar3 = gVar.f126422c;
            int i10 = gVar2 != null ? gVar2.f126428i : 0;
            int i11 = gVar3 != null ? gVar3.f126428i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                g<K, V> gVar4 = gVar3.f126421b;
                g<K, V> gVar5 = gVar3.f126422c;
                int i13 = (gVar4 != null ? gVar4.f126428i : 0) - (gVar5 != null ? gVar5.f126428i : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    q(gVar3);
                }
                n(gVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                g<K, V> gVar6 = gVar2.f126421b;
                g<K, V> gVar7 = gVar2.f126422c;
                int i14 = (gVar6 != null ? gVar6.f126428i : 0) - (gVar7 != null ? gVar7.f126428i : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    n(gVar2);
                }
                q(gVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                gVar.f126428i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                gVar.f126428i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            gVar = gVar.f126420a;
        }
    }

    private void k(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f126420a;
        gVar.f126420a = null;
        if (gVar2 != null) {
            gVar2.f126420a = gVar3;
        }
        if (gVar3 == null) {
            int i10 = gVar.f126426g;
            this.f126400b[i10 & (r0.length - 1)] = gVar2;
        } else if (gVar3.f126421b == gVar) {
            gVar3.f126421b = gVar2;
        } else {
            gVar3.f126422c = gVar2;
        }
    }

    private void n(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f126421b;
        g<K, V> gVar3 = gVar.f126422c;
        g<K, V> gVar4 = gVar3.f126421b;
        g<K, V> gVar5 = gVar3.f126422c;
        gVar.f126422c = gVar4;
        if (gVar4 != null) {
            gVar4.f126420a = gVar;
        }
        k(gVar, gVar3);
        gVar3.f126421b = gVar;
        gVar.f126420a = gVar3;
        int iMax = Math.max(gVar2 != null ? gVar2.f126428i : 0, gVar4 != null ? gVar4.f126428i : 0) + 1;
        gVar.f126428i = iMax;
        gVar3.f126428i = Math.max(iMax, gVar5 != null ? gVar5.f126428i : 0) + 1;
    }

    private void q(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f126421b;
        g<K, V> gVar3 = gVar.f126422c;
        g<K, V> gVar4 = gVar2.f126421b;
        g<K, V> gVar5 = gVar2.f126422c;
        gVar.f126421b = gVar5;
        if (gVar5 != null) {
            gVar5.f126420a = gVar;
        }
        k(gVar, gVar2);
        gVar2.f126422c = gVar;
        gVar.f126420a = gVar2;
        int iMax = Math.max(gVar3 != null ? gVar3.f126428i : 0, gVar5 != null ? gVar5.f126428i : 0) + 1;
        gVar.f126428i = iMax;
        gVar2.f126428i = Math.max(iMax, gVar4 != null ? gVar4.f126428i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f126400b, (Object) null);
        this.f126402d = 0;
        this.f126403e++;
        g<K, V> gVar = this.f126401c;
        g<K, V> gVar2 = gVar.f126423d;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f126423d;
            gVar2.f126424e = null;
            gVar2.f126423d = null;
            gVar2 = gVar3;
        }
        gVar.f126424e = gVar;
        gVar.f126423d = gVar;
    }

    g<K, V> d(K k10, boolean z10) {
        int iCompareTo;
        g<K, V> gVar;
        Comparator<? super K> comparator = this.f126399a;
        g<K, V>[] gVarArr = this.f126400b;
        int iR = r(k10.hashCode());
        int length = (gVarArr.length - 1) & iR;
        g<K, V> gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == f126398i ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(gVar2.f126425f) : comparator.compare(k10, gVar2.f126425f);
                if (iCompareTo == 0) {
                    return gVar2;
                }
                g<K, V> gVar3 = iCompareTo < 0 ? gVar2.f126421b : gVar2.f126422c;
                if (gVar3 == null) {
                    break;
                }
                gVar2 = gVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i10 = iCompareTo;
        if (!z10) {
            return null;
        }
        g<K, V> gVar4 = this.f126401c;
        if (gVar2 != null) {
            g<K, V> gVar5 = gVar2;
            gVar = new g<>(gVar5, k10, iR, gVar4, gVar4.f126424e);
            if (i10 < 0) {
                gVar5.f126421b = gVar;
            } else {
                gVar5.f126422c = gVar;
            }
            h(gVar5, true);
        } else {
            if (comparator == f126398i && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            gVar = new g<>(gVar2, k10, iR, gVar4, gVar4.f126424e);
            gVarArr[length] = gVar;
        }
        int i11 = this.f126402d;
        this.f126402d = i11 + 1;
        if (i11 > this.f126404f) {
            a();
        }
        this.f126403e++;
        return gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        r<K, V>.d dVar = this.f126405g;
        if (dVar != null) {
            return dVar;
        }
        r<K, V>.d dVar2 = new d();
        this.f126405g = dVar2;
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        r<K, V>.e eVar = this.f126406h;
        if (eVar != null) {
            return eVar;
        }
        r<K, V>.e eVar2 = new e();
        this.f126406h = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        g<K, V> gVarD = d(k10, true);
        V v11 = gVarD.f126427h;
        gVarD.f126427h = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f126402d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (g(obj) != null) {
            return true;
        }
        return false;
    }

    g<K, V> f(Map.Entry<?, ?> entry) {
        g<K, V> gVarG = g(entry.getKey());
        if (gVarG != null && c(gVarG.f126427h, entry.getValue())) {
            return gVarG;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> gVarG = g(obj);
        if (gVarG != null) {
            return gVarG.f126427h;
        }
        return null;
    }

    g<K, V> j(Object obj) {
        g<K, V> gVarG = g(obj);
        if (gVarG != null) {
            i(gVarG, true);
        }
        return gVarG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> gVarJ = j(obj);
        if (gVarJ != null) {
            return gVarJ.f126427h;
        }
        return null;
    }
}
