package Ce;

import Ce.AbstractC3014f;
import Ce.Y;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: Ce.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC3012d<K, V> extends AbstractC3014f<K, V> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private transient Map<K, Collection<V>> f4033e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f4034f;

    /* renamed from: Ce.d$a */
    class a extends AbstractC3012d<K, V>.AbstractC0071d<V> {
        @Override // Ce.AbstractC3012d.AbstractC0071d
        V a(K k10, V v10) {
            return v10;
        }

        a() {
            super();
        }
    }

    /* renamed from: Ce.d$b */
    class b extends AbstractC3012d<K, V>.AbstractC0071d<Map.Entry<K, V>> {
        b() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Ce.AbstractC3012d.AbstractC0071d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(K k10, V v10) {
            return Y.d(k10, v10);
        }
    }

    /* renamed from: Ce.d$c */
    private class c extends Y.f<K, Collection<V>> {

        /* renamed from: c, reason: collision with root package name */
        final transient Map<K, Collection<V>> f4037c;

        /* renamed from: Ce.d$c$a */
        class a extends Y.c<K, Collection<V>> {
            a() {
            }

            @Override // Ce.Y.c
            Map<K, Collection<V>> a() {
                return c.this;
            }

            @Override // Ce.Y.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return C3031x.c(c.this.f4037c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return c.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC3012d.this.y(entry.getKey());
                return true;
            }
        }

        /* renamed from: Ce.d$c$b */
        class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a, reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f4040a;

            /* renamed from: b, reason: collision with root package name */
            Collection<V> f4041b;

            b() {
                this.f4040a = c.this.f4037c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f4040a.next();
                this.f4041b = next.getValue();
                return c.this.f(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f4040a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                Be.p.x(this.f4041b != null, "no calls to next() since the last call to remove()");
                this.f4040a.remove();
                AbstractC3012d.q(AbstractC3012d.this, this.f4041b.size());
                this.f4041b.clear();
                this.f4041b = null;
            }
        }

        c(Map<K, Collection<V>> map) {
            this.f4037c = map;
        }

        @Override // Ce.Y.f
        protected Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) Y.h(this.f4037c, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC3012d.this.A(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f4037c == AbstractC3012d.this.f4033e) {
                AbstractC3012d.this.clear();
            } else {
                S.e(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return Y.g(this.f4037c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.f4037c.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionS = AbstractC3012d.this.s();
            collectionS.addAll(collectionRemove);
            AbstractC3012d.q(AbstractC3012d.this, collectionRemove.size());
            collectionRemove.clear();
            return collectionS;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f4037c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f4037c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: keySet */
        public Set<K> h() {
            return AbstractC3012d.this.j();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f4037c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f4037c.toString();
        }

        Map.Entry<K, Collection<V>> f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return Y.d(key, AbstractC3012d.this.A(key, entry.getValue()));
        }
    }

    /* renamed from: Ce.d$d, reason: collision with other inner class name */
    private abstract class AbstractC0071d<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f4043a;

        /* renamed from: b, reason: collision with root package name */
        K f4044b = null;

        /* renamed from: c, reason: collision with root package name */
        Collection<V> f4045c = null;

        /* renamed from: d, reason: collision with root package name */
        Iterator<V> f4046d = S.k();

        abstract T a(K k10, V v10);

        AbstractC0071d() {
            this.f4043a = AbstractC3012d.this.f4033e.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4043a.hasNext() || this.f4046d.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f4046d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f4043a.next();
                this.f4044b = next.getKey();
                Collection<V> value = next.getValue();
                this.f4045c = value;
                this.f4046d = value.iterator();
            }
            return a(e0.a(this.f4044b), this.f4046d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f4046d.remove();
            Collection<V> collection = this.f4045c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f4043a.remove();
            }
            AbstractC3012d.o(AbstractC3012d.this);
        }
    }

    /* renamed from: Ce.d$e */
    private class e extends Y.d<K, Collection<V>> {

        /* renamed from: Ce.d$e$a */
        class a implements Iterator<K> {

            /* renamed from: a, reason: collision with root package name */
            Map.Entry<K, Collection<V>> f4049a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f4050b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f4051c;

            a(e eVar, Iterator it) {
                this.f4050b = it;
                this.f4051c = eVar;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f4050b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f4050b.next();
                this.f4049a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                Be.p.x(this.f4049a != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f4049a.getValue();
                this.f4050b.remove();
                AbstractC3012d.q(AbstractC3012d.this, value.size());
                value.clear();
                this.f4049a = null;
            }
        }

        e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || a().keySet().equals(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            S.e(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return a().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return a().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this, a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection<V> collectionRemove = a().remove(obj);
            if (collectionRemove != null) {
                size = collectionRemove.size();
                collectionRemove.clear();
                AbstractC3012d.q(AbstractC3012d.this, size);
            } else {
                size = 0;
            }
            if (size <= 0) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: Ce.d$f */
    private final class f extends AbstractC3012d<K, V>.i implements NavigableMap<K, Collection<V>> {
        @Override // Ce.AbstractC3012d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // Ce.AbstractC3012d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // Ce.AbstractC3012d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(i().descendingMap());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new f(i().headMap(k10, z10));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Ce.AbstractC3012d.i
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> g() {
            return new g(i());
        }

        @Override // Ce.AbstractC3012d.i, Ce.AbstractC3012d.c, java.util.AbstractMap, java.util.Map
        /* renamed from: keySet, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> h() {
            return (NavigableSet) super.h();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new f(i().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new f(i().tailMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = i().ceilingEntry(k10);
            if (entryCeilingEntry == null) {
                return null;
            }
            return f(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return i().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = i().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return f(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> entryFloorEntry = i().floorEntry(k10);
            if (entryFloorEntry == null) {
                return null;
            }
            return f(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return i().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> entryHigherEntry = i().higherEntry(k10);
            if (entryHigherEntry == null) {
                return null;
            }
            return f(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return i().higherKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = i().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return f(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> entryLowerEntry = i().lowerEntry(k10);
            if (entryLowerEntry == null) {
                return null;
            }
            return f(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return i().lowerKey(k10);
        }

        Map.Entry<K, Collection<V>> n(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionS = AbstractC3012d.this.s();
            collectionS.addAll(next.getValue());
            it.remove();
            return Y.d(next.getKey(), AbstractC3012d.this.z(collectionS));
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return h();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return n(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return n(descendingMap().entrySet().iterator());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Ce.AbstractC3012d.i
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> i() {
            return (NavigableMap) super.i();
        }
    }

    /* renamed from: Ce.d$g */
    private final class g extends AbstractC3012d<K, V>.j implements NavigableSet<K> {
        @Override // Ce.AbstractC3012d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        @Override // Ce.AbstractC3012d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // Ce.AbstractC3012d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(e().descendingMap());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new g(e().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new g(e().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new g(e().tailMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k10) {
            return e().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public K floor(K k10) {
            return e().floorKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Ce.AbstractC3012d.j
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> e() {
            return (NavigableMap) super.e();
        }

        @Override // java.util.NavigableSet
        public K higher(K k10) {
            return e().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        public K lower(K k10) {
            return e().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) S.u(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) S.u(descendingIterator());
        }
    }

    /* renamed from: Ce.d$h */
    private class h extends AbstractC3012d<K, V>.l implements RandomAccess {
        h(K k10, List<V> list, AbstractC3012d<K, V>.k kVar) {
            super(k10, list, kVar);
        }
    }

    /* renamed from: Ce.d$i */
    private class i extends AbstractC3012d<K, V>.c implements SortedMap<K, Collection<V>> {

        /* renamed from: e, reason: collision with root package name */
        SortedSet<K> f4055e;

        i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        SortedSet<K> g() {
            return new j(i());
        }

        @Override // Ce.AbstractC3012d.c, java.util.AbstractMap, java.util.Map
        public SortedSet<K> h() {
            SortedSet<K> sortedSet = this.f4055e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetG = g();
            this.f4055e = sortedSetG;
            return sortedSetG;
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new i(i().headMap(k10));
        }

        SortedMap<K, Collection<V>> i() {
            return (SortedMap) this.f4037c;
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new i(i().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new i(i().tailMap(k10));
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return i().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return i().firstKey();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return i().lastKey();
        }
    }

    /* renamed from: Ce.d$j */
    private class j extends AbstractC3012d<K, V>.e implements SortedSet<K> {
        j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedSet<K> headSet(K k10) {
            return new j(e().headMap(k10));
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new j(e().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new j(e().tailMap(k10));
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return e().comparator();
        }

        SortedMap<K, Collection<V>> e() {
            return (SortedMap) super.a();
        }

        @Override // java.util.SortedSet
        public K first() {
            return e().firstKey();
        }

        @Override // java.util.SortedSet
        public K last() {
            return e().lastKey();
        }
    }

    /* renamed from: Ce.d$k */
    class k extends AbstractCollection<V> {

        /* renamed from: a, reason: collision with root package name */
        final K f4058a;

        /* renamed from: b, reason: collision with root package name */
        Collection<V> f4059b;

        /* renamed from: c, reason: collision with root package name */
        final AbstractC3012d<K, V>.k f4060c;

        /* renamed from: d, reason: collision with root package name */
        final Collection<V> f4061d;

        /* renamed from: Ce.d$k$a */
        class a implements Iterator<V> {

            /* renamed from: a, reason: collision with root package name */
            final Iterator<V> f4063a;

            /* renamed from: b, reason: collision with root package name */
            final Collection<V> f4064b;

            a() {
                Collection<V> collection = k.this.f4059b;
                this.f4064b = collection;
                this.f4063a = AbstractC3012d.x(collection);
            }

            void c() {
                k.this.k();
                if (k.this.f4059b != this.f4064b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f4063a.remove();
                AbstractC3012d.o(AbstractC3012d.this);
                k.this.l();
            }

            Iterator<V> a() {
                c();
                return this.f4063a;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                c();
                return this.f4063a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                c();
                return this.f4063a.next();
            }

            a(Iterator<V> it) {
                this.f4064b = k.this.f4059b;
                this.f4063a = it;
            }
        }

        k(K k10, Collection<V> collection, AbstractC3012d<K, V>.k kVar) {
            this.f4058a = k10;
            this.f4059b = collection;
            this.f4060c = kVar;
            this.f4061d = kVar == null ? null : kVar.f();
        }

        void a() {
            AbstractC3012d<K, V>.k kVar = this.f4060c;
            if (kVar != null) {
                kVar.a();
            } else {
                AbstractC3012d.this.f4033e.put(this.f4058a, this.f4059b);
            }
        }

        AbstractC3012d<K, V>.k e() {
            return this.f4060c;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            k();
            return this.f4059b.equals(obj);
        }

        Collection<V> f() {
            return this.f4059b;
        }

        K h() {
            return this.f4058a;
        }

        void k() {
            Collection<V> collection;
            AbstractC3012d<K, V>.k kVar = this.f4060c;
            if (kVar != null) {
                kVar.k();
                if (this.f4060c.f() != this.f4061d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f4059b.isEmpty() || (collection = (Collection) AbstractC3012d.this.f4033e.get(this.f4058a)) == null) {
                    return;
                }
                this.f4059b = collection;
            }
        }

        void l() {
            AbstractC3012d<K, V>.k kVar = this.f4060c;
            if (kVar != null) {
                kVar.l();
            } else if (this.f4059b.isEmpty()) {
                AbstractC3012d.this.f4033e.remove(this.f4058a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v10) {
            k();
            boolean zIsEmpty = this.f4059b.isEmpty();
            boolean zAdd = this.f4059b.add(v10);
            if (zAdd) {
                AbstractC3012d.n(AbstractC3012d.this);
                if (zIsEmpty) {
                    a();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f4059b.addAll(collection);
            if (zAddAll) {
                AbstractC3012d.p(AbstractC3012d.this, this.f4059b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f4059b.clear();
            AbstractC3012d.q(AbstractC3012d.this, size);
            l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            k();
            return this.f4059b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            k();
            return this.f4059b.containsAll(collection);
        }

        @Override // java.util.Collection
        public int hashCode() {
            k();
            return this.f4059b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            k();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            k();
            boolean zRemove = this.f4059b.remove(obj);
            if (zRemove) {
                AbstractC3012d.o(AbstractC3012d.this);
                l();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f4059b.removeAll(collection);
            if (zRemoveAll) {
                AbstractC3012d.p(AbstractC3012d.this, this.f4059b.size() - size);
                l();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Be.p.q(collection);
            int size = size();
            boolean zRetainAll = this.f4059b.retainAll(collection);
            if (zRetainAll) {
                AbstractC3012d.p(AbstractC3012d.this, this.f4059b.size() - size);
                l();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            k();
            return this.f4059b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            k();
            return this.f4059b.toString();
        }
    }

    /* renamed from: Ce.d$l */
    class l extends AbstractC3012d<K, V>.k implements List<V> {

        /* renamed from: Ce.d$l$a */
        private class a extends AbstractC3012d<K, V>.k.a implements ListIterator<V> {
            a() {
                super();
            }

            public a(int i10) {
                super(l.this.m().listIterator(i10));
            }

            @Override // java.util.ListIterator
            public void add(V v10) {
                boolean zIsEmpty = l.this.isEmpty();
                d().add(v10);
                AbstractC3012d.n(AbstractC3012d.this);
                if (zIsEmpty) {
                    l.this.a();
                }
            }

            private ListIterator<V> d() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return d().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return d().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return d().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return d().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v10) {
                d().set(v10);
            }
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            k();
            return new a();
        }

        l(K k10, List<V> list, AbstractC3012d<K, V>.k kVar) {
            super(k10, list, kVar);
        }

        @Override // java.util.List
        public void add(int i10, V v10) {
            k();
            boolean zIsEmpty = f().isEmpty();
            m().add(i10, v10);
            AbstractC3012d.n(AbstractC3012d.this);
            if (zIsEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = m().addAll(i10, collection);
            if (zAddAll) {
                AbstractC3012d.p(AbstractC3012d.this, f().size() - size);
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public V get(int i10) {
            k();
            return m().get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            k();
            return m().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            k();
            return m().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            k();
            return new a(i10);
        }

        List<V> m() {
            return (List) f();
        }

        @Override // java.util.List
        public V remove(int i10) {
            k();
            V vRemove = m().remove(i10);
            AbstractC3012d.o(AbstractC3012d.this);
            l();
            return vRemove;
        }

        @Override // java.util.List
        public V set(int i10, V v10) {
            k();
            return m().set(i10, v10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            AbstractC3012d<K, V>.k kVarE;
            k();
            AbstractC3012d abstractC3012d = AbstractC3012d.this;
            Object objH = h();
            List<V> listSubList = m().subList(i10, i11);
            if (e() == null) {
                kVarE = this;
            } else {
                kVarE = e();
            }
            return abstractC3012d.B(objH, listSubList, kVarE);
        }
    }

    abstract Collection<V> A(K k10, Collection<V> collection);

    abstract Collection<V> s();

    abstract <E> Collection<E> z(Collection<E> collection);

    static /* synthetic */ int n(AbstractC3012d abstractC3012d) {
        int i10 = abstractC3012d.f4034f;
        abstractC3012d.f4034f = i10 + 1;
        return i10;
    }

    static /* synthetic */ int o(AbstractC3012d abstractC3012d) {
        int i10 = abstractC3012d.f4034f;
        abstractC3012d.f4034f = i10 - 1;
        return i10;
    }

    static /* synthetic */ int p(AbstractC3012d abstractC3012d, int i10) {
        int i11 = abstractC3012d.f4034f + i10;
        abstractC3012d.f4034f = i11;
        return i11;
    }

    static /* synthetic */ int q(AbstractC3012d abstractC3012d, int i10) {
        int i11 = abstractC3012d.f4034f - i10;
        abstractC3012d.f4034f = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> x(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(Object obj) {
        Collection collection = (Collection) Y.i(this.f4033e, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f4034f -= size;
        }
    }

    final List<V> B(K k10, List<V> list, AbstractC3012d<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(k10, list, kVar) : new l(k10, list, kVar);
    }

    @Override // Ce.Z
    public void clear() {
        Iterator<Collection<V>> it = this.f4033e.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f4033e.clear();
        this.f4034f = 0;
    }

    @Override // Ce.AbstractC3014f
    Collection<Map.Entry<K, V>> f() {
        return new AbstractC3014f.a();
    }

    @Override // Ce.Z
    public Collection<V> get(K k10) {
        Collection<V> collectionT = this.f4033e.get(k10);
        if (collectionT == null) {
            collectionT = t(k10);
        }
        return A(k10, collectionT);
    }

    @Override // Ce.AbstractC3014f
    Collection<V> h() {
        return new AbstractC3014f.b();
    }

    @Override // Ce.AbstractC3014f
    Iterator<Map.Entry<K, V>> i() {
        return new b();
    }

    @Override // Ce.AbstractC3014f
    Iterator<V> k() {
        return new a();
    }

    @Override // Ce.Z
    public boolean put(K k10, V v10) {
        Collection<V> collection = this.f4033e.get(k10);
        if (collection != null) {
            if (!collection.add(v10)) {
                return false;
            }
            this.f4034f++;
            return true;
        }
        Collection<V> collectionT = t(k10);
        if (!collectionT.add(v10)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f4034f++;
        this.f4033e.put(k10, collectionT);
        return true;
    }

    @Override // Ce.Z
    public int size() {
        return this.f4034f;
    }

    final Map<K, Collection<V>> u() {
        Map<K, Collection<V>> map = this.f4033e;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f4033e) : map instanceof SortedMap ? new i((SortedMap) this.f4033e) : new c(this.f4033e);
    }

    final Set<K> v() {
        Map<K, Collection<V>> map = this.f4033e;
        return map instanceof NavigableMap ? new g((NavigableMap) this.f4033e) : map instanceof SortedMap ? new j((SortedMap) this.f4033e) : new e(this.f4033e);
    }

    protected AbstractC3012d(Map<K, Collection<V>> map) {
        Be.p.d(map.isEmpty());
        this.f4033e = map;
    }

    @Override // Ce.AbstractC3014f, Ce.Z
    public Collection<Map.Entry<K, V>> a() {
        return super.a();
    }

    Collection<V> t(K k10) {
        return s();
    }

    @Override // Ce.AbstractC3014f, Ce.Z
    public Collection<V> values() {
        return super.values();
    }
}
