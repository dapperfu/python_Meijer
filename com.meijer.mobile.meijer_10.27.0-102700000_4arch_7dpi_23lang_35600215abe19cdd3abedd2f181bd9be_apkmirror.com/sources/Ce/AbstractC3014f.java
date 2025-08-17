package Ce;

import Ce.b0;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: Ce.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC3014f<K, V> implements Z<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private transient Collection<Map.Entry<K, V>> f4069a;

    /* renamed from: b, reason: collision with root package name */
    private transient Set<K> f4070b;

    /* renamed from: c, reason: collision with root package name */
    private transient Collection<V> f4071c;

    /* renamed from: d, reason: collision with root package name */
    private transient Map<K, Collection<V>> f4072d;

    /* renamed from: Ce.f$a */
    class a extends b0.b<K, V> {
        a() {
        }

        @Override // Ce.b0.b
        Z<K, V> a() {
            return AbstractC3014f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractC3014f.this.i();
        }
    }

    /* renamed from: Ce.f$b */
    class b extends AbstractCollection<V> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC3014f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC3014f.this.d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractC3014f.this.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC3014f.this.size();
        }
    }

    abstract Map<K, Collection<V>> e();

    abstract Collection<Map.Entry<K, V>> f();

    abstract Set<K> g();

    abstract Collection<V> h();

    abstract Iterator<Map.Entry<K, V>> i();

    abstract Iterator<V> k();

    @Override // Ce.Z
    public Collection<Map.Entry<K, V>> a() {
        Collection<Map.Entry<K, V>> collection = this.f4069a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionF = f();
        this.f4069a = collectionF;
        return collectionF;
    }

    @Override // Ce.Z
    public Map<K, Collection<V>> b() {
        Map<K, Collection<V>> map = this.f4072d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapE = e();
        this.f4072d = mapE;
        return mapE;
    }

    public Set<K> j() {
        Set<K> set = this.f4070b;
        if (set != null) {
            return set;
        }
        Set<K> setG = g();
        this.f4070b = setG;
        return setG;
    }

    @Override // Ce.Z
    public Collection<V> values() {
        Collection<V> collection = this.f4071c;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionH = h();
        this.f4071c = collectionH;
        return collectionH;
    }

    AbstractC3014f() {
    }

    @Override // Ce.Z
    public boolean c(Object obj, Object obj2) {
        Collection<V> collection = b().get(obj);
        if (collection != null && collection.contains(obj2)) {
            return true;
        }
        return false;
    }

    public boolean d(Object obj) {
        Iterator<Collection<V>> it = b().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        return b0.a(this, obj);
    }

    public int hashCode() {
        return b().hashCode();
    }

    @Override // Ce.Z
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = b().get(obj);
        if (collection != null && collection.remove(obj2)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return b().toString();
    }
}
