package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes8.dex */
public final class B<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator<Comparable> f90293i = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Comparator<? super K> f90294a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f90295b;

    /* renamed from: c, reason: collision with root package name */
    e<K, V> f90296c;

    /* renamed from: d, reason: collision with root package name */
    int f90297d;

    /* renamed from: e, reason: collision with root package name */
    int f90298e;

    /* renamed from: f, reason: collision with root package name */
    final e<K, V> f90299f;

    /* renamed from: g, reason: collision with root package name */
    private B<K, V>.b f90300g;

    /* renamed from: h, reason: collision with root package name */
    private B<K, V>.c f90301h;

    class b extends AbstractSet<Map.Entry<K, V>> {

        class a extends B<K, V>.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            B.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && B.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> eVarC;
            if (!(obj instanceof Map.Entry) || (eVarC = B.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            B.this.g(eVarC, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return B.this.f90297d;
        }
    }

    final class c extends AbstractSet<K> {

        class a extends B<K, V>.d<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f90315f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            B.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return B.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return B.this.h(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return B.this.f90297d;
        }
    }

    private abstract class d<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        e<K, V> f90306a;

        /* renamed from: b, reason: collision with root package name */
        e<K, V> f90307b = null;

        /* renamed from: c, reason: collision with root package name */
        int f90308c;

        d() {
            this.f90306a = B.this.f90299f.f90313d;
            this.f90308c = B.this.f90298e;
        }

        final e<K, V> a() {
            e<K, V> eVar = this.f90306a;
            B b10 = B.this;
            if (eVar == b10.f90299f) {
                throw new NoSuchElementException();
            }
            if (b10.f90298e != this.f90308c) {
                throw new ConcurrentModificationException();
            }
            this.f90306a = eVar.f90313d;
            this.f90307b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f90306a != B.this.f90299f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f90307b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            B.this.g(eVar, true);
            this.f90307b = null;
            this.f90308c = B.this.f90298e;
        }
    }

    static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        e<K, V> f90310a;

        /* renamed from: b, reason: collision with root package name */
        e<K, V> f90311b;

        /* renamed from: c, reason: collision with root package name */
        e<K, V> f90312c;

        /* renamed from: d, reason: collision with root package name */
        e<K, V> f90313d;

        /* renamed from: e, reason: collision with root package name */
        e<K, V> f90314e;

        /* renamed from: f, reason: collision with root package name */
        final K f90315f;

        /* renamed from: g, reason: collision with root package name */
        final boolean f90316g;

        /* renamed from: h, reason: collision with root package name */
        V f90317h;

        /* renamed from: i, reason: collision with root package name */
        int f90318i;

        e(boolean z10) {
            this.f90315f = null;
            this.f90316g = z10;
            this.f90314e = this;
            this.f90313d = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f90311b; eVar2 != null; eVar2 = eVar2.f90311b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f90312c; eVar2 != null; eVar2 = eVar2.f90312c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f90315f;
                if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
                    V v10 = this.f90317h;
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
            return this.f90315f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f90317h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f90315f;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f90317h;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            if (v10 == null && !this.f90316g) {
                throw new NullPointerException("value == null");
            }
            V v11 = this.f90317h;
            this.f90317h = v10;
            return v11;
        }

        public String toString() {
            return this.f90315f + "=" + this.f90317h;
        }

        e(boolean z10, e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f90310a = eVar;
            this.f90315f = k10;
            this.f90316g = z10;
            this.f90318i = 1;
            this.f90313d = eVar2;
            this.f90314e = eVar3;
            eVar3.f90313d = this;
            eVar2.f90314e = this;
        }
    }

    public B() {
        this(f90293i, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f90296c = null;
        this.f90297d = 0;
        this.f90298e++;
        e<K, V> eVar = this.f90299f;
        eVar.f90314e = eVar;
        eVar.f90313d = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> d(Object obj) {
        if (obj != 0) {
            try {
                return b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
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

    public B(boolean z10) {
        this(f90293i, z10);
    }

    private void f(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f90311b;
            e<K, V> eVar3 = eVar.f90312c;
            int i10 = eVar2 != null ? eVar2.f90318i : 0;
            int i11 = eVar3 != null ? eVar3.f90318i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f90311b;
                e<K, V> eVar5 = eVar3.f90312c;
                int i13 = (eVar4 != null ? eVar4.f90318i : 0) - (eVar5 != null ? eVar5.f90318i : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    j(eVar);
                } else {
                    k(eVar3);
                    j(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f90311b;
                e<K, V> eVar7 = eVar2.f90312c;
                int i14 = (eVar6 != null ? eVar6.f90318i : 0) - (eVar7 != null ? eVar7.f90318i : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    k(eVar);
                } else {
                    j(eVar2);
                    k(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f90318i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f90318i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f90310a;
        }
    }

    private void i(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f90310a;
        eVar.f90310a = null;
        if (eVar2 != null) {
            eVar2.f90310a = eVar3;
        }
        if (eVar3 == null) {
            this.f90296c = eVar2;
        } else if (eVar3.f90311b == eVar) {
            eVar3.f90311b = eVar2;
        } else {
            eVar3.f90312c = eVar2;
        }
    }

    private void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f90311b;
        e<K, V> eVar3 = eVar.f90312c;
        e<K, V> eVar4 = eVar3.f90311b;
        e<K, V> eVar5 = eVar3.f90312c;
        eVar.f90312c = eVar4;
        if (eVar4 != null) {
            eVar4.f90310a = eVar;
        }
        i(eVar, eVar3);
        eVar3.f90311b = eVar;
        eVar.f90310a = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f90318i : 0, eVar4 != null ? eVar4.f90318i : 0) + 1;
        eVar.f90318i = iMax;
        eVar3.f90318i = Math.max(iMax, eVar5 != null ? eVar5.f90318i : 0) + 1;
    }

    private void k(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f90311b;
        e<K, V> eVar3 = eVar.f90312c;
        e<K, V> eVar4 = eVar2.f90311b;
        e<K, V> eVar5 = eVar2.f90312c;
        eVar.f90311b = eVar5;
        if (eVar5 != null) {
            eVar5.f90310a = eVar;
        }
        i(eVar, eVar2);
        eVar2.f90312c = eVar;
        eVar.f90310a = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f90318i : 0, eVar5 != null ? eVar5.f90318i : 0) + 1;
        eVar.f90318i = iMax;
        eVar2.f90318i = Math.max(iMax, eVar4 != null ? eVar4.f90318i : 0) + 1;
    }

    e<K, V> b(K k10, boolean z10) {
        int iCompareTo;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f90294a;
        e<K, V> eVar2 = this.f90296c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f90293i ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f90315f) : comparator.compare(k10, eVar2.f90315f);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f90311b : eVar2.f90312c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        e<K, V> eVar4 = eVar2;
        if (!z10) {
            return null;
        }
        e<K, V> eVar5 = this.f90299f;
        if (eVar4 != null) {
            eVar = new e<>(this.f90295b, eVar4, k10, eVar5, eVar5.f90314e);
            if (iCompareTo < 0) {
                eVar4.f90311b = eVar;
            } else {
                eVar4.f90312c = eVar;
            }
            f(eVar4, true);
        } else {
            if (comparator == f90293i && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(this.f90295b, eVar4, k10, eVar5, eVar5.f90314e);
            this.f90296c = eVar;
        }
        this.f90297d++;
        this.f90298e++;
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        B<K, V>.b bVar = this.f90300g;
        if (bVar != null) {
            return bVar;
        }
        B<K, V>.b bVar2 = new b();
        this.f90300g = bVar2;
        return bVar2;
    }

    void g(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.f90314e;
            eVar2.f90313d = eVar.f90313d;
            eVar.f90313d.f90314e = eVar2;
        }
        e<K, V> eVar3 = eVar.f90311b;
        e<K, V> eVar4 = eVar.f90312c;
        e<K, V> eVar5 = eVar.f90310a;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                i(eVar, eVar3);
                eVar.f90311b = null;
            } else if (eVar4 != null) {
                i(eVar, eVar4);
                eVar.f90312c = null;
            } else {
                i(eVar, null);
            }
            f(eVar5, false);
            this.f90297d--;
            this.f90298e++;
            return;
        }
        e<K, V> eVarB = eVar3.f90318i > eVar4.f90318i ? eVar3.b() : eVar4.a();
        g(eVarB, false);
        e<K, V> eVar6 = eVar.f90311b;
        if (eVar6 != null) {
            i10 = eVar6.f90318i;
            eVarB.f90311b = eVar6;
            eVar6.f90310a = eVarB;
            eVar.f90311b = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar7 = eVar.f90312c;
        if (eVar7 != null) {
            i11 = eVar7.f90318i;
            eVarB.f90312c = eVar7;
            eVar7.f90310a = eVarB;
            eVar.f90312c = null;
        }
        eVarB.f90318i = Math.max(i10, i11) + 1;
        i(eVar, eVarB);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        B<K, V>.c cVar = this.f90301h;
        if (cVar != null) {
            return cVar;
        }
        B<K, V>.c cVar2 = new c();
        this.f90301h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        if (v10 == null && !this.f90295b) {
            throw new NullPointerException("value == null");
        }
        e<K, V> eVarB = b(k10, true);
        V v11 = eVarB.f90317h;
        eVarB.f90317h = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f90297d;
    }

    public B(Comparator<? super K> comparator, boolean z10) {
        this.f90297d = 0;
        this.f90298e = 0;
        this.f90294a = comparator == null ? f90293i : comparator;
        this.f90295b = z10;
        this.f90299f = new e<>(z10);
    }

    private static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> eVarD = d(entry.getKey());
        if (eVarD != null && a(eVarD.f90317h, entry.getValue())) {
            return eVarD;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (d(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> eVarD = d(obj);
        if (eVarD != null) {
            return eVarD.f90317h;
        }
        return null;
    }

    e<K, V> h(Object obj) {
        e<K, V> eVarD = d(obj);
        if (eVarD != null) {
            g(eVarD, true);
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> eVarH = h(obj);
        if (eVarH != null) {
            return eVarH.f90317h;
        }
        return null;
    }
}
