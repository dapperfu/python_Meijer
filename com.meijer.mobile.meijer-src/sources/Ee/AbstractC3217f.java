package Ee;

import Ee.b0;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: Ee.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC3217f<K, V> implements Z<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private transient Collection<Map.Entry<K, V>> f7381a;

    /* renamed from: b, reason: collision with root package name */
    private transient Set<K> f7382b;

    /* renamed from: c, reason: collision with root package name */
    private transient Collection<V> f7383c;

    /* renamed from: d, reason: collision with root package name */
    private transient Map<K, Collection<V>> f7384d;

    /* renamed from: Ee.f$a */
    class a extends b0.b<K, V> {
        a() {
        }

        @Override // Ee.b0.b
        Z<K, V> a() {
            return AbstractC3217f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractC3217f.this.i();
        }
    }

    /* renamed from: Ee.f$b */
    class b extends AbstractCollection<V> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC3217f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC3217f.this.d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractC3217f.this.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC3217f.this.size();
        }
    }

    abstract Map<K, Collection<V>> e();

    abstract Collection<Map.Entry<K, V>> f();

    abstract Set<K> g();

    abstract Collection<V> h();

    abstract Iterator<Map.Entry<K, V>> i();

    abstract Iterator<V> k();

    @Override // Ee.Z
    public Collection<Map.Entry<K, V>> a() {
        Collection<Map.Entry<K, V>> collection = this.f7381a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionF = f();
        this.f7381a = collectionF;
        return collectionF;
    }

    @Override // Ee.Z
    public Map<K, Collection<V>> b() {
        Map<K, Collection<V>> map = this.f7384d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapE = e();
        this.f7384d = mapE;
        return mapE;
    }

    public Set<K> j() {
        Set<K> set = this.f7382b;
        if (set != null) {
            return set;
        }
        Set<K> setG = g();
        this.f7382b = setG;
        return setG;
    }

    @Override // Ee.Z
    public Collection<V> values() {
        Collection<V> collection = this.f7383c;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionH = h();
        this.f7383c = collectionH;
        return collectionH;
    }

    AbstractC3217f() {
    }

    @Override // Ee.Z
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

    @Override // Ee.Z
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
