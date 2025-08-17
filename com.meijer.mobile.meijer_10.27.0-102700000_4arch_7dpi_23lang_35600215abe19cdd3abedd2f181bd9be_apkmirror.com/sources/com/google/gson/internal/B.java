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

/* loaded from: classes7.dex */
public final class B<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator<Comparable> f89451i = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Comparator<? super K> f89452a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f89453b;

    /* renamed from: c, reason: collision with root package name */
    e<K, V> f89454c;

    /* renamed from: d, reason: collision with root package name */
    int f89455d;

    /* renamed from: e, reason: collision with root package name */
    int f89456e;

    /* renamed from: f, reason: collision with root package name */
    final e<K, V> f89457f;

    /* renamed from: g, reason: collision with root package name */
    private B<K, V>.b f89458g;

    /* renamed from: h, reason: collision with root package name */
    private B<K, V>.c f89459h;

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
            return B.this.f89455d;
        }
    }

    final class c extends AbstractSet<K> {

        class a extends B<K, V>.d<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f89473f;
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
            return B.this.f89455d;
        }
    }

    private abstract class d<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        e<K, V> f89464a;

        /* renamed from: b, reason: collision with root package name */
        e<K, V> f89465b = null;

        /* renamed from: c, reason: collision with root package name */
        int f89466c;

        d() {
            this.f89464a = B.this.f89457f.f89471d;
            this.f89466c = B.this.f89456e;
        }

        final e<K, V> a() {
            e<K, V> eVar = this.f89464a;
            B b10 = B.this;
            if (eVar == b10.f89457f) {
                throw new NoSuchElementException();
            }
            if (b10.f89456e != this.f89466c) {
                throw new ConcurrentModificationException();
            }
            this.f89464a = eVar.f89471d;
            this.f89465b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f89464a != B.this.f89457f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f89465b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            B.this.g(eVar, true);
            this.f89465b = null;
            this.f89466c = B.this.f89456e;
        }
    }

    static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        e<K, V> f89468a;

        /* renamed from: b, reason: collision with root package name */
        e<K, V> f89469b;

        /* renamed from: c, reason: collision with root package name */
        e<K, V> f89470c;

        /* renamed from: d, reason: collision with root package name */
        e<K, V> f89471d;

        /* renamed from: e, reason: collision with root package name */
        e<K, V> f89472e;

        /* renamed from: f, reason: collision with root package name */
        final K f89473f;

        /* renamed from: g, reason: collision with root package name */
        final boolean f89474g;

        /* renamed from: h, reason: collision with root package name */
        V f89475h;

        /* renamed from: i, reason: collision with root package name */
        int f89476i;

        e(boolean z10) {
            this.f89473f = null;
            this.f89474g = z10;
            this.f89472e = this;
            this.f89471d = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f89469b; eVar2 != null; eVar2 = eVar2.f89469b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f89470c; eVar2 != null; eVar2 = eVar2.f89470c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f89473f;
                if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
                    V v10 = this.f89475h;
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
            return this.f89473f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f89475h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f89473f;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f89475h;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            if (v10 == null && !this.f89474g) {
                throw new NullPointerException("value == null");
            }
            V v11 = this.f89475h;
            this.f89475h = v10;
            return v11;
        }

        public String toString() {
            return this.f89473f + "=" + this.f89475h;
        }

        e(boolean z10, e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f89468a = eVar;
            this.f89473f = k10;
            this.f89474g = z10;
            this.f89476i = 1;
            this.f89471d = eVar2;
            this.f89472e = eVar3;
            eVar3.f89471d = this;
            eVar2.f89472e = this;
        }
    }

    public B() {
        this(f89451i, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f89454c = null;
        this.f89455d = 0;
        this.f89456e++;
        e<K, V> eVar = this.f89457f;
        eVar.f89472e = eVar;
        eVar.f89471d = eVar;
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
        this(f89451i, z10);
    }

    private void f(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f89469b;
            e<K, V> eVar3 = eVar.f89470c;
            int i10 = eVar2 != null ? eVar2.f89476i : 0;
            int i11 = eVar3 != null ? eVar3.f89476i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f89469b;
                e<K, V> eVar5 = eVar3.f89470c;
                int i13 = (eVar4 != null ? eVar4.f89476i : 0) - (eVar5 != null ? eVar5.f89476i : 0);
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
                e<K, V> eVar6 = eVar2.f89469b;
                e<K, V> eVar7 = eVar2.f89470c;
                int i14 = (eVar6 != null ? eVar6.f89476i : 0) - (eVar7 != null ? eVar7.f89476i : 0);
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
                eVar.f89476i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f89476i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f89468a;
        }
    }

    private void i(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f89468a;
        eVar.f89468a = null;
        if (eVar2 != null) {
            eVar2.f89468a = eVar3;
        }
        if (eVar3 == null) {
            this.f89454c = eVar2;
        } else if (eVar3.f89469b == eVar) {
            eVar3.f89469b = eVar2;
        } else {
            eVar3.f89470c = eVar2;
        }
    }

    private void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f89469b;
        e<K, V> eVar3 = eVar.f89470c;
        e<K, V> eVar4 = eVar3.f89469b;
        e<K, V> eVar5 = eVar3.f89470c;
        eVar.f89470c = eVar4;
        if (eVar4 != null) {
            eVar4.f89468a = eVar;
        }
        i(eVar, eVar3);
        eVar3.f89469b = eVar;
        eVar.f89468a = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f89476i : 0, eVar4 != null ? eVar4.f89476i : 0) + 1;
        eVar.f89476i = iMax;
        eVar3.f89476i = Math.max(iMax, eVar5 != null ? eVar5.f89476i : 0) + 1;
    }

    private void k(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f89469b;
        e<K, V> eVar3 = eVar.f89470c;
        e<K, V> eVar4 = eVar2.f89469b;
        e<K, V> eVar5 = eVar2.f89470c;
        eVar.f89469b = eVar5;
        if (eVar5 != null) {
            eVar5.f89468a = eVar;
        }
        i(eVar, eVar2);
        eVar2.f89470c = eVar;
        eVar.f89468a = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f89476i : 0, eVar5 != null ? eVar5.f89476i : 0) + 1;
        eVar.f89476i = iMax;
        eVar2.f89476i = Math.max(iMax, eVar4 != null ? eVar4.f89476i : 0) + 1;
    }

    e<K, V> b(K k10, boolean z10) {
        int iCompareTo;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f89452a;
        e<K, V> eVar2 = this.f89454c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f89451i ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f89473f) : comparator.compare(k10, eVar2.f89473f);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f89469b : eVar2.f89470c;
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
        e<K, V> eVar5 = this.f89457f;
        if (eVar4 != null) {
            eVar = new e<>(this.f89453b, eVar4, k10, eVar5, eVar5.f89472e);
            if (iCompareTo < 0) {
                eVar4.f89469b = eVar;
            } else {
                eVar4.f89470c = eVar;
            }
            f(eVar4, true);
        } else {
            if (comparator == f89451i && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(this.f89453b, eVar4, k10, eVar5, eVar5.f89472e);
            this.f89454c = eVar;
        }
        this.f89455d++;
        this.f89456e++;
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        B<K, V>.b bVar = this.f89458g;
        if (bVar != null) {
            return bVar;
        }
        B<K, V>.b bVar2 = new b();
        this.f89458g = bVar2;
        return bVar2;
    }

    void g(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.f89472e;
            eVar2.f89471d = eVar.f89471d;
            eVar.f89471d.f89472e = eVar2;
        }
        e<K, V> eVar3 = eVar.f89469b;
        e<K, V> eVar4 = eVar.f89470c;
        e<K, V> eVar5 = eVar.f89468a;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                i(eVar, eVar3);
                eVar.f89469b = null;
            } else if (eVar4 != null) {
                i(eVar, eVar4);
                eVar.f89470c = null;
            } else {
                i(eVar, null);
            }
            f(eVar5, false);
            this.f89455d--;
            this.f89456e++;
            return;
        }
        e<K, V> eVarB = eVar3.f89476i > eVar4.f89476i ? eVar3.b() : eVar4.a();
        g(eVarB, false);
        e<K, V> eVar6 = eVar.f89469b;
        if (eVar6 != null) {
            i10 = eVar6.f89476i;
            eVarB.f89469b = eVar6;
            eVar6.f89468a = eVarB;
            eVar.f89469b = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar7 = eVar.f89470c;
        if (eVar7 != null) {
            i11 = eVar7.f89476i;
            eVarB.f89470c = eVar7;
            eVar7.f89468a = eVarB;
            eVar.f89470c = null;
        }
        eVarB.f89476i = Math.max(i10, i11) + 1;
        i(eVar, eVarB);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        B<K, V>.c cVar = this.f89459h;
        if (cVar != null) {
            return cVar;
        }
        B<K, V>.c cVar2 = new c();
        this.f89459h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        if (v10 == null && !this.f89453b) {
            throw new NullPointerException("value == null");
        }
        e<K, V> eVarB = b(k10, true);
        V v11 = eVarB.f89475h;
        eVarB.f89475h = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f89455d;
    }

    public B(Comparator<? super K> comparator, boolean z10) {
        this.f89455d = 0;
        this.f89456e = 0;
        this.f89452a = comparator == null ? f89451i : comparator;
        this.f89453b = z10;
        this.f89457f = new e<>(z10);
    }

    private static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> eVarD = d(entry.getKey());
        if (eVarD != null && a(eVarD.f89475h, entry.getValue())) {
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
            return eVarD.f89475h;
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
            return eVarH.f89475h;
        }
        return null;
    }
}
