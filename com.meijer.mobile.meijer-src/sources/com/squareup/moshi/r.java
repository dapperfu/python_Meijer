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

/* loaded from: classes12.dex */
final class r<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator<Comparable> f127350i = new a();

    /* renamed from: a, reason: collision with root package name */
    final Comparator<? super K> f127351a;

    /* renamed from: b, reason: collision with root package name */
    g<K, V>[] f127352b;

    /* renamed from: c, reason: collision with root package name */
    final g<K, V> f127353c;

    /* renamed from: d, reason: collision with root package name */
    int f127354d;

    /* renamed from: e, reason: collision with root package name */
    int f127355e;

    /* renamed from: f, reason: collision with root package name */
    int f127356f;

    /* renamed from: g, reason: collision with root package name */
    private r<K, V>.d f127357g;

    /* renamed from: h, reason: collision with root package name */
    private r<K, V>.e f127358h;

    static final class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private g<K, V> f127359a;

        /* renamed from: b, reason: collision with root package name */
        private int f127360b;

        /* renamed from: c, reason: collision with root package name */
        private int f127361c;

        /* renamed from: d, reason: collision with root package name */
        private int f127362d;

        void a(g<K, V> gVar) {
            gVar.f127374c = null;
            gVar.f127372a = null;
            gVar.f127373b = null;
            gVar.f127380i = 1;
            int i10 = this.f127360b;
            if (i10 > 0) {
                int i11 = this.f127362d;
                if ((i11 & 1) == 0) {
                    this.f127362d = i11 + 1;
                    this.f127360b = i10 - 1;
                    this.f127361c++;
                }
            }
            gVar.f127372a = this.f127359a;
            this.f127359a = gVar;
            int i12 = this.f127362d;
            int i13 = i12 + 1;
            this.f127362d = i13;
            int i14 = this.f127360b;
            if (i14 > 0 && (i13 & 1) == 0) {
                this.f127362d = i12 + 2;
                this.f127360b = i14 - 1;
                this.f127361c++;
            }
            int i15 = 4;
            while (true) {
                int i16 = i15 - 1;
                if ((this.f127362d & i16) != i16) {
                    return;
                }
                int i17 = this.f127361c;
                if (i17 == 0) {
                    g<K, V> gVar2 = this.f127359a;
                    g<K, V> gVar3 = gVar2.f127372a;
                    g<K, V> gVar4 = gVar3.f127372a;
                    gVar3.f127372a = gVar4.f127372a;
                    this.f127359a = gVar3;
                    gVar3.f127373b = gVar4;
                    gVar3.f127374c = gVar2;
                    gVar3.f127380i = gVar2.f127380i + 1;
                    gVar4.f127372a = gVar3;
                    gVar2.f127372a = gVar3;
                } else if (i17 == 1) {
                    g<K, V> gVar5 = this.f127359a;
                    g<K, V> gVar6 = gVar5.f127372a;
                    this.f127359a = gVar6;
                    gVar6.f127374c = gVar5;
                    gVar6.f127380i = gVar5.f127380i + 1;
                    gVar5.f127372a = gVar6;
                    this.f127361c = 0;
                } else if (i17 == 2) {
                    this.f127361c = 0;
                }
                i15 *= 2;
            }
        }

        g<K, V> c() {
            g<K, V> gVar = this.f127359a;
            if (gVar.f127372a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }

        b() {
        }

        void b(int i10) {
            this.f127360b = ((Integer.highestOneBit(i10) * 2) - 1) - i10;
            this.f127362d = 0;
            this.f127361c = 0;
            this.f127359a = null;
        }
    }

    static class c<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private g<K, V> f127363a;

        void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f127372a = gVar2;
                gVar2 = gVar;
                gVar = gVar.f127373b;
            }
            this.f127363a = gVar2;
        }

        public g<K, V> a() {
            g<K, V> gVar = this.f127363a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f127372a;
            gVar.f127372a = null;
            g<K, V> gVar3 = gVar.f127374c;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.f127363a = gVar4;
                    return gVar;
                }
                gVar2.f127372a = gVar4;
                gVar3 = gVar2.f127373b;
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
            return r.this.f127354d;
        }
    }

    final class e extends AbstractSet<K> {

        class a extends r<K, V>.f<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f127377f;
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
            return r.this.f127354d;
        }
    }

    abstract class f<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        g<K, V> f127368a;

        /* renamed from: b, reason: collision with root package name */
        g<K, V> f127369b = null;

        /* renamed from: c, reason: collision with root package name */
        int f127370c;

        f() {
            this.f127368a = r.this.f127353c.f127375d;
            this.f127370c = r.this.f127355e;
        }

        final g<K, V> a() {
            g<K, V> gVar = this.f127368a;
            r rVar = r.this;
            if (gVar == rVar.f127353c) {
                throw new NoSuchElementException();
            }
            if (rVar.f127355e != this.f127370c) {
                throw new ConcurrentModificationException();
            }
            this.f127368a = gVar.f127375d;
            this.f127369b = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f127368a != r.this.f127353c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.f127369b;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            r.this.i(gVar, true);
            this.f127369b = null;
            this.f127370c = r.this.f127355e;
        }
    }

    static final class g<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        g<K, V> f127372a;

        /* renamed from: b, reason: collision with root package name */
        g<K, V> f127373b;

        /* renamed from: c, reason: collision with root package name */
        g<K, V> f127374c;

        /* renamed from: d, reason: collision with root package name */
        g<K, V> f127375d;

        /* renamed from: e, reason: collision with root package name */
        g<K, V> f127376e;

        /* renamed from: f, reason: collision with root package name */
        final K f127377f;

        /* renamed from: g, reason: collision with root package name */
        final int f127378g;

        /* renamed from: h, reason: collision with root package name */
        V f127379h;

        /* renamed from: i, reason: collision with root package name */
        int f127380i;

        g() {
            this.f127377f = null;
            this.f127378g = -1;
            this.f127376e = this;
            this.f127375d = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f127373b; gVar2 != null; gVar2 = gVar2.f127373b) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f127374c; gVar2 != null; gVar2 = gVar2.f127374c) {
                gVar = gVar2;
            }
            return gVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f127377f;
                if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
                    V v10 = this.f127379h;
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
            return this.f127377f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f127379h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f127377f;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f127379h;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f127379h;
            this.f127379h = v10;
            return v11;
        }

        public String toString() {
            return this.f127377f + "=" + this.f127379h;
        }

        g(g<K, V> gVar, K k10, int i10, g<K, V> gVar2, g<K, V> gVar3) {
            this.f127372a = gVar;
            this.f127377f = k10;
            this.f127378g = i10;
            this.f127380i = 1;
            this.f127375d = gVar2;
            this.f127376e = gVar3;
            gVar3.f127375d = this;
            gVar2.f127376e = this;
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
                    if ((gVarA.f127378g & length) == 0) {
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
                    if ((gVarA2.f127378g & length) == 0) {
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
            g<K, V> gVar2 = gVar.f127376e;
            gVar2.f127375d = gVar.f127375d;
            gVar.f127375d.f127376e = gVar2;
            gVar.f127376e = null;
            gVar.f127375d = null;
        }
        g<K, V> gVar3 = gVar.f127373b;
        g<K, V> gVar4 = gVar.f127374c;
        g<K, V> gVar5 = gVar.f127372a;
        int i11 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                k(gVar, gVar3);
                gVar.f127373b = null;
            } else if (gVar4 != null) {
                k(gVar, gVar4);
                gVar.f127374c = null;
            } else {
                k(gVar, null);
            }
            h(gVar5, false);
            this.f127354d--;
            this.f127355e++;
            return;
        }
        g<K, V> gVarB = gVar3.f127380i > gVar4.f127380i ? gVar3.b() : gVar4.a();
        i(gVarB, false);
        g<K, V> gVar6 = gVar.f127373b;
        if (gVar6 != null) {
            i10 = gVar6.f127380i;
            gVarB.f127373b = gVar6;
            gVar6.f127372a = gVarB;
            gVar.f127373b = null;
        } else {
            i10 = 0;
        }
        g<K, V> gVar7 = gVar.f127374c;
        if (gVar7 != null) {
            i11 = gVar7.f127380i;
            gVarB.f127374c = gVar7;
            gVar7.f127372a = gVarB;
            gVar.f127374c = null;
        }
        gVarB.f127380i = Math.max(i10, i11) + 1;
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
        this.f127354d = 0;
        this.f127355e = 0;
        this.f127351a = comparator == null ? f127350i : comparator;
        this.f127353c = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.f127352b = gVarArr;
        this.f127356f = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    private void a() {
        g<K, V>[] gVarArrB = b(this.f127352b);
        this.f127352b = gVarArrB;
        this.f127356f = (gVarArrB.length / 2) + (gVarArrB.length / 4);
    }

    private boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private void h(g<K, V> gVar, boolean z10) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.f127373b;
            g<K, V> gVar3 = gVar.f127374c;
            int i10 = gVar2 != null ? gVar2.f127380i : 0;
            int i11 = gVar3 != null ? gVar3.f127380i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                g<K, V> gVar4 = gVar3.f127373b;
                g<K, V> gVar5 = gVar3.f127374c;
                int i13 = (gVar4 != null ? gVar4.f127380i : 0) - (gVar5 != null ? gVar5.f127380i : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    q(gVar3);
                }
                n(gVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                g<K, V> gVar6 = gVar2.f127373b;
                g<K, V> gVar7 = gVar2.f127374c;
                int i14 = (gVar6 != null ? gVar6.f127380i : 0) - (gVar7 != null ? gVar7.f127380i : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    n(gVar2);
                }
                q(gVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                gVar.f127380i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                gVar.f127380i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            gVar = gVar.f127372a;
        }
    }

    private void k(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f127372a;
        gVar.f127372a = null;
        if (gVar2 != null) {
            gVar2.f127372a = gVar3;
        }
        if (gVar3 == null) {
            int i10 = gVar.f127378g;
            this.f127352b[i10 & (r0.length - 1)] = gVar2;
        } else if (gVar3.f127373b == gVar) {
            gVar3.f127373b = gVar2;
        } else {
            gVar3.f127374c = gVar2;
        }
    }

    private void n(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f127373b;
        g<K, V> gVar3 = gVar.f127374c;
        g<K, V> gVar4 = gVar3.f127373b;
        g<K, V> gVar5 = gVar3.f127374c;
        gVar.f127374c = gVar4;
        if (gVar4 != null) {
            gVar4.f127372a = gVar;
        }
        k(gVar, gVar3);
        gVar3.f127373b = gVar;
        gVar.f127372a = gVar3;
        int iMax = Math.max(gVar2 != null ? gVar2.f127380i : 0, gVar4 != null ? gVar4.f127380i : 0) + 1;
        gVar.f127380i = iMax;
        gVar3.f127380i = Math.max(iMax, gVar5 != null ? gVar5.f127380i : 0) + 1;
    }

    private void q(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f127373b;
        g<K, V> gVar3 = gVar.f127374c;
        g<K, V> gVar4 = gVar2.f127373b;
        g<K, V> gVar5 = gVar2.f127374c;
        gVar.f127373b = gVar5;
        if (gVar5 != null) {
            gVar5.f127372a = gVar;
        }
        k(gVar, gVar2);
        gVar2.f127374c = gVar;
        gVar.f127372a = gVar2;
        int iMax = Math.max(gVar3 != null ? gVar3.f127380i : 0, gVar5 != null ? gVar5.f127380i : 0) + 1;
        gVar.f127380i = iMax;
        gVar2.f127380i = Math.max(iMax, gVar4 != null ? gVar4.f127380i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f127352b, (Object) null);
        this.f127354d = 0;
        this.f127355e++;
        g<K, V> gVar = this.f127353c;
        g<K, V> gVar2 = gVar.f127375d;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f127375d;
            gVar2.f127376e = null;
            gVar2.f127375d = null;
            gVar2 = gVar3;
        }
        gVar.f127376e = gVar;
        gVar.f127375d = gVar;
    }

    g<K, V> d(K k10, boolean z10) {
        int iCompareTo;
        g<K, V> gVar;
        Comparator<? super K> comparator = this.f127351a;
        g<K, V>[] gVarArr = this.f127352b;
        int iR = r(k10.hashCode());
        int length = (gVarArr.length - 1) & iR;
        g<K, V> gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == f127350i ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(gVar2.f127377f) : comparator.compare(k10, gVar2.f127377f);
                if (iCompareTo == 0) {
                    return gVar2;
                }
                g<K, V> gVar3 = iCompareTo < 0 ? gVar2.f127373b : gVar2.f127374c;
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
        g<K, V> gVar4 = this.f127353c;
        if (gVar2 != null) {
            g<K, V> gVar5 = gVar2;
            gVar = new g<>(gVar5, k10, iR, gVar4, gVar4.f127376e);
            if (i10 < 0) {
                gVar5.f127373b = gVar;
            } else {
                gVar5.f127374c = gVar;
            }
            h(gVar5, true);
        } else {
            if (comparator == f127350i && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            gVar = new g<>(gVar2, k10, iR, gVar4, gVar4.f127376e);
            gVarArr[length] = gVar;
        }
        int i11 = this.f127354d;
        this.f127354d = i11 + 1;
        if (i11 > this.f127356f) {
            a();
        }
        this.f127355e++;
        return gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        r<K, V>.d dVar = this.f127357g;
        if (dVar != null) {
            return dVar;
        }
        r<K, V>.d dVar2 = new d();
        this.f127357g = dVar2;
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        r<K, V>.e eVar = this.f127358h;
        if (eVar != null) {
            return eVar;
        }
        r<K, V>.e eVar2 = new e();
        this.f127358h = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        g<K, V> gVarD = d(k10, true);
        V v11 = gVarD.f127379h;
        gVarD.f127379h = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f127354d;
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
        if (gVarG != null && c(gVarG.f127379h, entry.getValue())) {
            return gVarG;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> gVarG = g(obj);
        if (gVarG != null) {
            return gVarG.f127379h;
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
            return gVarJ.f127379h;
        }
        return null;
    }
}
