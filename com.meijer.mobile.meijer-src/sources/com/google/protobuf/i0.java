package com.google.protobuf;

import com.google.protobuf.C11657s;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes8.dex */
class i0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final int f91378a;

    /* renamed from: b, reason: collision with root package name */
    private List<i0<K, V>.e> f91379b;

    /* renamed from: c, reason: collision with root package name */
    private Map<K, V> f91380c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f91381d;

    /* renamed from: e, reason: collision with root package name */
    private volatile i0<K, V>.g f91382e;

    /* renamed from: f, reason: collision with root package name */
    private Map<K, V> f91383f;

    /* renamed from: g, reason: collision with root package name */
    private volatile i0<K, V>.c f91384g;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    class a<FieldDescriptorType> extends i0<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // com.google.protobuf.i0, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((Comparable) obj, obj2);
        }

        @Override // com.google.protobuf.i0
        public void v() {
            if (!t()) {
                for (int i10 = 0; i10 < n(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> entryK = k(i10);
                    if (((C11657s.b) entryK.getKey()).h()) {
                        entryK.setValue(Collections.unmodifiableList((List) entryK.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : r()) {
                    if (((C11657s.b) entry.getKey()).h()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.v();
        }
    }

    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private int f91385a;

        /* renamed from: b, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f91386b;

        private b() {
            this.f91385a = i0.this.f91379b.size();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f91386b == null) {
                this.f91386b = i0.this.f91383f.entrySet().iterator();
            }
            return this.f91386b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f91385a;
            return (i10 > 0 && i10 <= i0.this.f91379b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(i0 i0Var, a aVar) {
            this();
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!a().hasNext()) {
                List list = i0.this.f91379b;
                int i10 = this.f91385a - 1;
                this.f91385a = i10;
                return (Map.Entry) list.get(i10);
            }
            return a().next();
        }
    }

    private class c extends i0<K, V>.g {
        private c() {
            super(i0.this, null);
        }

        /* synthetic */ c(i0 i0Var, a aVar) {
            this();
        }

        @Override // com.google.protobuf.i0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(i0.this, null);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f91389a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f91390b = new b();

        class a implements Iterator<Object> {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }

            a() {
            }
        }

        class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f91389a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f91390b;
        }
    }

    private class e implements Map.Entry<K, V>, Comparable<i0<K, V>.e> {

        /* renamed from: a, reason: collision with root package name */
        private final K f91391a;

        /* renamed from: b, reason: collision with root package name */
        private V f91392b;

        e(i0 i0Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f91391a, entry.getKey()) && b(this.f91392b, entry.getValue());
        }

        e(K k10, V v10) {
            this.f91391a = k10;
            this.f91392b = v10;
        }

        private boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f91391a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f91392b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f91391a;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f91392b;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            i0.this.h();
            V v11 = this.f91392b;
            this.f91392b = v10;
            return v11;
        }

        public String toString() {
            return this.f91391a + "=" + this.f91392b;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(i0<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }
    }

    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private int f91394a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f91395b;

        /* renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f91396c;

        private f() {
            this.f91394a = -1;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f91395b = true;
            int i10 = this.f91394a + 1;
            this.f91394a = i10;
            return i10 < i0.this.f91379b.size() ? (Map.Entry) i0.this.f91379b.get(this.f91394a) : a().next();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f91396c == null) {
                this.f91396c = i0.this.f91380c.entrySet().iterator();
            }
            return this.f91396c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f91394a + 1 < i0.this.f91379b.size() || (!i0.this.f91380c.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f91395b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f91395b = false;
            i0.this.h();
            if (this.f91394a >= i0.this.f91379b.size()) {
                a().remove();
                return;
            }
            i0 i0Var = i0.this;
            int i10 = this.f91394a;
            this.f91394a = i10 - 1;
            i0Var.y(i10);
        }

        /* synthetic */ f(i0 i0Var, a aVar) {
            this();
        }
    }

    private class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        /* synthetic */ g(i0 i0Var, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = i0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(i0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            i0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i0.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (!contains(entry)) {
                i0.this.put(entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }
    }

    /* synthetic */ i0(int i10, a aVar) {
        this(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return super.equals(obj);
        }
        i0 i0Var = (i0) obj;
        int size = size();
        if (size != i0Var.size()) {
            return false;
        }
        int iN = n();
        if (iN != i0Var.n()) {
            return entrySet().equals(i0Var.entrySet());
        }
        for (int i10 = 0; i10 < iN; i10++) {
            if (!k(i10).equals(i0Var.k(i10))) {
                return false;
            }
        }
        if (iN != size) {
            return this.f91380c.equals(i0Var.f91380c);
        }
        return true;
    }

    private i0(int i10) {
        this.f91378a = i10;
        this.f91379b = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f91380c = map;
        this.f91383f = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int g(K r5) {
        /*
            r4 = this;
            java.util.List<com.google.protobuf.i0<K, V>$e> r0 = r4.f91379b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List<com.google.protobuf.i0<K, V>$e> r2 = r4.f91379b
            java.lang.Object r2 = r2.get(r1)
            com.google.protobuf.i0$e r2 = (com.google.protobuf.i0.e) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List<com.google.protobuf.i0<K, V>$e> r3 = r4.f91379b
            java.lang.Object r3 = r3.get(r2)
            com.google.protobuf.i0$e r3 = (com.google.protobuf.i0.e) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i0.g(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f91381d) {
            throw new UnsupportedOperationException();
        }
    }

    static <FieldDescriptorType extends C11657s.b<FieldDescriptorType>> i0<FieldDescriptorType, Object> w(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.f91380c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f91382e == null) {
            this.f91382e = new g(this, null);
        }
        return this.f91382e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        return iG >= 0 ? this.f91379b.get(iG).getValue() : this.f91380c.get(comparable);
    }

    Set<Map.Entry<K, V>> i() {
        if (this.f91384g == null) {
            this.f91384g = new c(this, null);
        }
        return this.f91384g;
    }

    public Map.Entry<K, V> k(int i10) {
        return this.f91379b.get(i10);
    }

    public int n() {
        return this.f91379b.size();
    }

    public int q() {
        return this.f91380c.size();
    }

    public Iterable<Map.Entry<K, V>> r() {
        return this.f91380c.isEmpty() ? d.b() : this.f91380c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f91379b.size() + this.f91380c.size();
    }

    public boolean t() {
        return this.f91381d;
    }

    public void v() {
        if (this.f91381d) {
            return;
        }
        this.f91380c = this.f91380c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f91380c);
        this.f91383f = this.f91383f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f91383f);
        this.f91381d = true;
    }

    private void j() {
        h();
        if (this.f91379b.isEmpty() && !(this.f91379b instanceof ArrayList)) {
            this.f91379b = new ArrayList(this.f91378a);
        }
    }

    private SortedMap<K, V> s() {
        h();
        if (this.f91380c.isEmpty() && !(this.f91380c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f91380c = treeMap;
            this.f91383f = treeMap.descendingMap();
        }
        return (SortedMap) this.f91380c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V y(int i10) {
        h();
        V value = this.f91379b.remove(i10).getValue();
        if (!this.f91380c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = s().entrySet().iterator();
            this.f91379b.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        if (!this.f91379b.isEmpty()) {
            this.f91379b.clear();
        }
        if (!this.f91380c.isEmpty()) {
            this.f91380c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iN = n();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iN; i10++) {
            iHashCode += this.f91379b.get(i10).hashCode();
        }
        if (q() > 0) {
            return iHashCode + this.f91380c.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        if (iG >= 0) {
            return y(iG);
        }
        if (this.f91380c.isEmpty()) {
            return null;
        }
        return this.f91380c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        h();
        int iG = g(k10);
        if (iG >= 0) {
            return this.f91379b.get(iG).setValue(v10);
        }
        j();
        int i10 = -(iG + 1);
        if (i10 >= this.f91378a) {
            return s().put(k10, v10);
        }
        int size = this.f91379b.size();
        int i11 = this.f91378a;
        if (size == i11) {
            i0<K, V>.e eVarRemove = this.f91379b.remove(i11 - 1);
            s().put(eVarRemove.getKey(), eVarRemove.getValue());
        }
        this.f91379b.add(i10, new e(k10, v10));
        return null;
    }
}
