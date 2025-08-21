package Z;

import a0.C5637a;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: Z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5603a<K, V> extends n0<K, V> implements Map<K, V> {

    /* renamed from: d, reason: collision with root package name */
    C5603a<K, V>.C0920a f43404d;

    /* renamed from: e, reason: collision with root package name */
    C5603a<K, V>.c f43405e;

    /* renamed from: f, reason: collision with root package name */
    C5603a<K, V>.e f43406f;

    /* renamed from: Z.a$a, reason: collision with other inner class name */
    final class C0920a extends AbstractSet<Map.Entry<K, V>> {
        C0920a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C5603a.this.getSize();
        }
    }

    /* renamed from: Z.a$b */
    final class b extends AbstractC5614l<K> {
        b() {
            super(C5603a.this.getSize());
        }

        @Override // Z.AbstractC5614l
        protected K a(int i10) {
            return C5603a.this.g(i10);
        }

        @Override // Z.AbstractC5614l
        protected void c(int i10) {
            C5603a.this.i(i10);
        }
    }

    /* renamed from: Z.a$c */
    final class c implements Set<K> {
        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = C5603a.this.getSize();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C5603a.this.g(i10);
            }
            return objArr;
        }

        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C5603a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C5603a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return C5603a.this.n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = C5603a.this.getSize() - 1; size >= 0; size--) {
                K kG = C5603a.this.g(size);
                iHashCode += kG == null ? 0 : kG.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C5603a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iD = C5603a.this.d(obj);
            if (iD < 0) {
                return false;
            }
            C5603a.this.i(iD);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return C5603a.this.r(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return C5603a.this.s(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C5603a.this.getSize();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C5603a.q(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i10 = 0; i10 < size; i10++) {
                tArr[i10] = C5603a.this.g(i10);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    /* renamed from: Z.a$d */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        int f43410a;

        /* renamed from: b, reason: collision with root package name */
        int f43411b = -1;

        /* renamed from: c, reason: collision with root package name */
        boolean f43412c;

        d() {
            this.f43410a = C5603a.this.getSize() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f43412c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return C5637a.c(entry.getKey(), C5603a.this.g(this.f43411b)) && C5637a.c(entry.getValue(), C5603a.this.k(this.f43411b));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f43412c) {
                return C5603a.this.g(this.f43411b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f43412c) {
                return C5603a.this.k(this.f43411b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f43411b < this.f43410a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f43412c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            K kG = C5603a.this.g(this.f43411b);
            V vK = C5603a.this.k(this.f43411b);
            return (kG == null ? 0 : kG.hashCode()) ^ (vK != null ? vK.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f43412c) {
                throw new IllegalStateException();
            }
            C5603a.this.i(this.f43411b);
            this.f43411b--;
            this.f43410a--;
            this.f43412c = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            if (this.f43412c) {
                return C5603a.this.j(this.f43411b, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f43411b++;
                this.f43412c = true;
                return this;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: Z.a$e */
    final class e implements Collection<V> {
        @Override // java.util.Collection
        public Object[] toArray() {
            int size = C5603a.this.getSize();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C5603a.this.k(i10);
            }
            return objArr;
        }

        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C5603a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C5603a.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C5603a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iA = C5603a.this.a(obj);
            if (iA < 0) {
                return false;
            }
            C5603a.this.i(iA);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int size = C5603a.this.getSize();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (collection.contains(C5603a.this.k(i10))) {
                    C5603a.this.i(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int size = C5603a.this.getSize();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (!collection.contains(C5603a.this.k(i10))) {
                    C5603a.this.i(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return C5603a.this.getSize();
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i10 = 0; i10 < size; i10++) {
                tArr[i10] = C5603a.this.k(i10);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    /* renamed from: Z.a$f */
    final class f extends AbstractC5614l<V> {
        f() {
            super(C5603a.this.getSize());
        }

        @Override // Z.AbstractC5614l
        protected V a(int i10) {
            return C5603a.this.k(i10);
        }

        @Override // Z.AbstractC5614l
        protected void c(int i10) {
            C5603a.this.i(i10);
        }
    }

    public C5603a() {
    }

    static <T> boolean q(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public C5603a(int i10) {
        super(i10);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C5603a<K, V>.C0920a c0920a = this.f43404d;
        if (c0920a != null) {
            return c0920a;
        }
        C5603a<K, V>.C0920a c0920a2 = new C0920a();
        this.f43404d = c0920a2;
        return c0920a2;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        C5603a<K, V>.c cVar = this.f43405e;
        if (cVar != null) {
            return cVar;
        }
        C5603a<K, V>.c cVar2 = new c();
        this.f43405e = cVar2;
        return cVar2;
    }

    @Override // java.util.Map
    public Collection<V> values() {
        C5603a<K, V>.e eVar = this.f43406f;
        if (eVar != null) {
            return eVar;
        }
        C5603a<K, V>.e eVar2 = new e();
        this.f43406f = eVar2;
        return eVar2;
    }

    public C5603a(n0 n0Var) {
        super(n0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z.n0, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z.n0, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z.n0, java.util.Map
    public V get(Object obj) {
        return (V) super.get(obj);
    }

    public boolean n(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        b(getSize() + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean r(Collection<?> collection) {
        int size = getSize();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        if (size != getSize()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z.n0, java.util.Map
    public V remove(Object obj) {
        return (V) super.remove(obj);
    }

    public boolean s(Collection<?> collection) {
        int size = getSize();
        for (int size2 = getSize() - 1; size2 >= 0; size2--) {
            if (!collection.contains(g(size2))) {
                i(size2);
            }
        }
        if (size != getSize()) {
            return true;
        }
        return false;
    }
}
