package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C11323t;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes7.dex */
class i0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private List<i0<K, V>.d> f88380a;

    /* renamed from: b, reason: collision with root package name */
    private Map<K, V> f88381b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f88382c;

    /* renamed from: d, reason: collision with root package name */
    private volatile i0<K, V>.f f88383d;

    /* renamed from: e, reason: collision with root package name */
    private Map<K, V> f88384e;

    /* renamed from: f, reason: collision with root package name */
    private volatile i0<K, V>.c f88385f;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    class a<FieldDescriptorType> extends i0<FieldDescriptorType, Object> {
        a() {
            super(null);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((Comparable) obj, obj2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void w() {
            if (!v()) {
                for (int i10 = 0; i10 < n(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> entryK = k(i10);
                    if (((C11323t.b) entryK.getKey()).h()) {
                        entryK.setValue(Collections.unmodifiableList((List) entryK.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : r()) {
                    if (((C11323t.b) entry.getKey()).h()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.w();
        }
    }

    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private int f88386a;

        /* renamed from: b, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f88387b;

        private b() {
            this.f88386a = i0.this.f88380a.size();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f88387b == null) {
                this.f88387b = i0.this.f88384e.entrySet().iterator();
            }
            return this.f88387b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f88386a;
            return (i10 > 0 && i10 <= i0.this.f88380a.size()) || a().hasNext();
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
                List list = i0.this.f88380a;
                int i10 = this.f88386a - 1;
                this.f88386a = i10;
                return (Map.Entry) list.get(i10);
            }
            return a().next();
        }
    }

    private class c extends i0<K, V>.f {
        private c() {
            super(i0.this, null);
        }

        /* synthetic */ c(i0 i0Var, a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(i0.this, null);
        }
    }

    private class d implements Map.Entry<K, V>, Comparable<i0<K, V>.d> {

        /* renamed from: a, reason: collision with root package name */
        private final K f88390a;

        /* renamed from: b, reason: collision with root package name */
        private V f88391b;

        d(i0 i0Var, Map.Entry<K, V> entry) {
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
            return b(this.f88390a, entry.getKey()) && b(this.f88391b, entry.getValue());
        }

        d(K k10, V v10) {
            this.f88390a = k10;
            this.f88391b = v10;
        }

        private boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f88390a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f88391b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f88390a;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f88391b;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            i0.this.h();
            V v11 = this.f88391b;
            this.f88391b = v10;
            return v11;
        }

        public String toString() {
            return this.f88390a + "=" + this.f88391b;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(i0<K, V>.d dVar) {
            return getKey().compareTo(dVar.getKey());
        }
    }

    private class e implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private int f88393a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f88394b;

        /* renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f88395c;

        private e() {
            this.f88393a = -1;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f88394b = true;
            int i10 = this.f88393a + 1;
            this.f88393a = i10;
            return i10 < i0.this.f88380a.size() ? (Map.Entry) i0.this.f88380a.get(this.f88393a) : a().next();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f88395c == null) {
                this.f88395c = i0.this.f88381b.entrySet().iterator();
            }
            return this.f88395c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f88393a + 1 < i0.this.f88380a.size() || (!i0.this.f88381b.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f88394b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f88394b = false;
            i0.this.h();
            if (this.f88393a >= i0.this.f88380a.size()) {
                a().remove();
                return;
            }
            i0 i0Var = i0.this;
            int i10 = this.f88393a;
            this.f88393a = i10 - 1;
            i0Var.A(i10);
        }

        /* synthetic */ e(i0 i0Var, a aVar) {
            this();
        }
    }

    private class f extends AbstractSet<Map.Entry<K, V>> {
        private f() {
        }

        /* synthetic */ f(i0 i0Var, a aVar) {
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
            return new e(i0.this, null);
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

    /* synthetic */ i0(a aVar) {
        this();
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
            return this.f88381b.equals(i0Var.f88381b);
        }
        return true;
    }

    private i0() {
        this.f88380a = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f88381b = map;
        this.f88384e = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int g(K r5) {
        /*
            r4 = this;
            java.util.List<com.google.crypto.tink.shaded.protobuf.i0<K, V>$d> r0 = r4.f88380a
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List<com.google.crypto.tink.shaded.protobuf.i0<K, V>$d> r2 = r4.f88380a
            java.lang.Object r2 = r2.get(r1)
            com.google.crypto.tink.shaded.protobuf.i0$d r2 = (com.google.crypto.tink.shaded.protobuf.i0.d) r2
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
            java.util.List<com.google.crypto.tink.shaded.protobuf.i0<K, V>$d> r3 = r4.f88380a
            java.lang.Object r3 = r3.get(r2)
            com.google.crypto.tink.shaded.protobuf.i0$d r3 = (com.google.crypto.tink.shaded.protobuf.i0.d) r3
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.i0.g(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f88382c) {
            throw new UnsupportedOperationException();
        }
    }

    static <FieldDescriptorType extends C11323t.b<FieldDescriptorType>> i0<FieldDescriptorType, Object> x() {
        return new a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.f88381b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f88383d == null) {
            this.f88383d = new f(this, null);
        }
        return this.f88383d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        return iG >= 0 ? this.f88380a.get(iG).getValue() : this.f88381b.get(comparable);
    }

    Set<Map.Entry<K, V>> i() {
        if (this.f88385f == null) {
            this.f88385f = new c(this, null);
        }
        return this.f88385f;
    }

    public Map.Entry<K, V> k(int i10) {
        return this.f88380a.get(i10);
    }

    public int n() {
        return this.f88380a.size();
    }

    public int q() {
        return this.f88381b.size();
    }

    public Iterable<Map.Entry<K, V>> r() {
        return this.f88381b.isEmpty() ? Collections.EMPTY_SET : this.f88381b.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f88380a.size() + this.f88381b.size();
    }

    public boolean v() {
        return this.f88382c;
    }

    public void w() {
        if (this.f88382c) {
            return;
        }
        this.f88381b = this.f88381b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f88381b);
        this.f88384e = this.f88384e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f88384e);
        this.f88382c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V A(int i10) {
        h();
        V value = this.f88380a.remove(i10).getValue();
        if (!this.f88381b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = s().entrySet().iterator();
            this.f88380a.add(new d(this, it.next()));
            it.remove();
        }
        return value;
    }

    private void j() {
        h();
        if (this.f88380a.isEmpty() && !(this.f88380a instanceof ArrayList)) {
            this.f88380a = new ArrayList(16);
        }
    }

    private SortedMap<K, V> s() {
        h();
        if (this.f88381b.isEmpty() && !(this.f88381b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f88381b = treeMap;
            this.f88384e = treeMap.descendingMap();
        }
        return (SortedMap) this.f88381b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        if (!this.f88380a.isEmpty()) {
            this.f88380a.clear();
        }
        if (!this.f88381b.isEmpty()) {
            this.f88381b.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iN = n();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iN; i10++) {
            iHashCode += this.f88380a.get(i10).hashCode();
        }
        if (q() > 0) {
            return iHashCode + this.f88381b.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        if (iG >= 0) {
            return A(iG);
        }
        if (this.f88381b.isEmpty()) {
            return null;
        }
        return this.f88381b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        h();
        int iG = g(k10);
        if (iG >= 0) {
            return this.f88380a.get(iG).setValue(v10);
        }
        j();
        int i10 = -(iG + 1);
        if (i10 >= 16) {
            return s().put(k10, v10);
        }
        if (this.f88380a.size() == 16) {
            i0<K, V>.d dVarRemove = this.f88380a.remove(15);
            s().put(dVarRemove.getKey(), dVarRemove.getValue());
        }
        this.f88380a.add(i10, new d(k10, v10));
        return null;
    }
}
