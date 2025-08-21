package kotlin.reflect.jvm.internal.impl.protobuf;

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
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet;

/* loaded from: classes14.dex */
class d<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final int f146867a;

    /* renamed from: b, reason: collision with root package name */
    private List<d<K, V>.c> f146868b;

    /* renamed from: c, reason: collision with root package name */
    private Map<K, V> f146869c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f146870d;

    /* renamed from: e, reason: collision with root package name */
    private volatile d<K, V>.e f146871e;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    static class a<FieldDescriptorType> extends d<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.t((FieldSet.FieldDescriptorLite) obj, obj2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
        public void r() {
            if (!q()) {
                for (int i10 = 0; i10 < j(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> entryI = i(i10);
                    if (((FieldSet.FieldDescriptorLite) entryI.getKey()).h()) {
                        entryI.setValue(Collections.unmodifiableList((List) entryI.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : k()) {
                    if (((FieldSet.FieldDescriptorLite) entry.getKey()).h()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.r();
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f146872a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f146873b = new C2277b();

        static class a implements Iterator<Object> {
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

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$b$b, reason: collision with other inner class name */
        static class C2277b implements Iterable<Object> {
            C2277b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return b.f146872a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f146873b;
        }
    }

    private class c implements Comparable<d<K, V>.c>, Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private final K f146874a;

        /* renamed from: b, reason: collision with root package name */
        private V f146875b;

        c(d dVar, Map.Entry<K, V> entry) {
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
            return b(this.f146874a, entry.getKey()) && b(this.f146875b, entry.getValue());
        }

        c(K k10, V v10) {
            this.f146874a = k10;
            this.f146875b = v10;
        }

        private boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f146874a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f146875b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f146874a;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f146875b;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            d.this.g();
            V v11 = this.f146875b;
            this.f146875b = v10;
            return v11;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f146874a);
            String strValueOf2 = String.valueOf(this.f146875b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append("=");
            sb2.append(strValueOf2);
            return sb2.toString();
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d<K, V>.c cVar) {
            return getKey().compareTo(cVar.getKey());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$d, reason: collision with other inner class name */
    private class C2278d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private int f146877a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f146878b;

        /* renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f146879c;

        private C2278d() {
            this.f146877a = -1;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f146878b = true;
            int i10 = this.f146877a + 1;
            this.f146877a = i10;
            return i10 < d.this.f146868b.size() ? (Map.Entry) d.this.f146868b.get(this.f146877a) : a().next();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f146879c == null) {
                this.f146879c = d.this.f146869c.entrySet().iterator();
            }
            return this.f146879c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f146877a + 1 < d.this.f146868b.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f146878b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f146878b = false;
            d.this.g();
            if (this.f146877a >= d.this.f146868b.size()) {
                a().remove();
                return;
            }
            d dVar = d.this;
            int i10 = this.f146877a;
            this.f146877a = i10 - 1;
            dVar.v(i10);
        }

        /* synthetic */ C2278d(d dVar, a aVar) {
            this();
        }
    }

    private class e extends AbstractSet<Map.Entry<K, V>> {
        private e() {
        }

        /* synthetic */ e(d dVar, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = d.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C2278d(d.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            d.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (!contains(entry)) {
                d.this.t(entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }
    }

    /* synthetic */ d(int i10, a aVar) {
        this(i10);
    }

    private d(int i10) {
        this.f146867a = i10;
        this.f146868b = Collections.EMPTY_LIST;
        this.f146869c = Collections.EMPTY_MAP;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int f(K r5) {
        /*
            r4 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.d<K, V>$c> r0 = r4.f146868b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.d<K, V>$c> r2 = r4.f146868b
            java.lang.Object r2 = r2.get(r1)
            kotlin.reflect.jvm.internal.impl.protobuf.d$c r2 = (kotlin.reflect.jvm.internal.impl.protobuf.d.c) r2
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
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.d<K, V>$c> r3 = r4.f146868b
            java.lang.Object r3 = r3.get(r2)
            kotlin.reflect.jvm.internal.impl.protobuf.d$c r3 = (kotlin.reflect.jvm.internal.impl.protobuf.d.c) r3
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.d.f(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f146870d) {
            throw new UnsupportedOperationException();
        }
    }

    static <FieldDescriptorType extends FieldSet.FieldDescriptorLite<FieldDescriptorType>> d<FieldDescriptorType, Object> s(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f146869c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f146871e == null) {
            this.f146871e = new e(this, null);
        }
        return this.f146871e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? this.f146868b.get(iF).getValue() : this.f146869c.get(comparable);
    }

    public Map.Entry<K, V> i(int i10) {
        return this.f146868b.get(i10);
    }

    public int j() {
        return this.f146868b.size();
    }

    public Iterable<Map.Entry<K, V>> k() {
        return this.f146869c.isEmpty() ? b.b() : this.f146869c.entrySet();
    }

    public boolean q() {
        return this.f146870d;
    }

    public void r() {
        if (this.f146870d) {
            return;
        }
        this.f146869c = this.f146869c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f146869c);
        this.f146870d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f146868b.size() + this.f146869c.size();
    }

    private void h() {
        g();
        if (this.f146868b.isEmpty() && !(this.f146868b instanceof ArrayList)) {
            this.f146868b = new ArrayList(this.f146867a);
        }
    }

    private SortedMap<K, V> n() {
        g();
        if (this.f146869c.isEmpty() && !(this.f146869c instanceof TreeMap)) {
            this.f146869c = new TreeMap();
        }
        return (SortedMap) this.f146869c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V v(int i10) {
        g();
        V value = this.f146868b.remove(i10).getValue();
        if (!this.f146869c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = n().entrySet().iterator();
            this.f146868b.add(new c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f146868b.isEmpty()) {
            this.f146868b.clear();
        }
        if (!this.f146869c.isEmpty()) {
            this.f146869c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return v(iF);
        }
        if (this.f146869c.isEmpty()) {
            return null;
        }
        return this.f146869c.remove(comparable);
    }

    public V t(K k10, V v10) {
        g();
        int iF = f(k10);
        if (iF >= 0) {
            return this.f146868b.get(iF).setValue(v10);
        }
        h();
        int i10 = -(iF + 1);
        if (i10 >= this.f146867a) {
            return n().put(k10, v10);
        }
        int size = this.f146868b.size();
        int i11 = this.f146867a;
        if (size == i11) {
            d<K, V>.c cVarRemove = this.f146868b.remove(i11 - 1);
            n().put(cVarRemove.getKey(), cVarRemove.getValue());
        }
        this.f146868b.add(i10, new c(k10, v10));
        return null;
    }
}
