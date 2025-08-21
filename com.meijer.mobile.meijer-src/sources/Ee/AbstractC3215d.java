package Ee;

import Ee.AbstractC3217f;
import Ee.Y;
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

/* renamed from: Ee.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC3215d<K, V> extends AbstractC3217f<K, V> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private transient Map<K, Collection<V>> f7345e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f7346f;

    /* renamed from: Ee.d$a */
    class a extends AbstractC3215d<K, V>.AbstractC0146d<V> {
        @Override // Ee.AbstractC3215d.AbstractC0146d
        V a(K k10, V v10) {
            return v10;
        }

        a() {
            super();
        }
    }

    /* renamed from: Ee.d$b */
    class b extends AbstractC3215d<K, V>.AbstractC0146d<Map.Entry<K, V>> {
        b() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Ee.AbstractC3215d.AbstractC0146d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(K k10, V v10) {
            return Y.d(k10, v10);
        }
    }

    /* renamed from: Ee.d$c */
    private class c extends Y.f<K, Collection<V>> {

        /* renamed from: c, reason: collision with root package name */
        final transient Map<K, Collection<V>> f7349c;

        /* renamed from: Ee.d$c$a */
        class a extends Y.c<K, Collection<V>> {
            a() {
            }

            @Override // Ee.Y.c
            Map<K, Collection<V>> a() {
                return c.this;
            }

            @Override // Ee.Y.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return C3234x.c(c.this.f7349c.entrySet(), obj);
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
                AbstractC3215d.this.y(entry.getKey());
                return true;
            }
        }

        /* renamed from: Ee.d$c$b */
        class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a, reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f7352a;

            /* renamed from: b, reason: collision with root package name */
            Collection<V> f7353b;

            b() {
                this.f7352a = c.this.f7349c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f7352a.next();
                this.f7353b = next.getValue();
                return c.this.f(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f7352a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                De.p.x(this.f7353b != null, "no calls to next() since the last call to remove()");
                this.f7352a.remove();
                AbstractC3215d.q(AbstractC3215d.this, this.f7353b.size());
                this.f7353b.clear();
                this.f7353b = null;
            }
        }

        c(Map<K, Collection<V>> map) {
            this.f7349c = map;
        }

        @Override // Ee.Y.f
        protected Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) Y.h(this.f7349c, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC3215d.this.A(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f7349c == AbstractC3215d.this.f7345e) {
                AbstractC3215d.this.clear();
            } else {
                S.e(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return Y.g(this.f7349c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.f7349c.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionS = AbstractC3215d.this.s();
            collectionS.addAll(collectionRemove);
            AbstractC3215d.q(AbstractC3215d.this, collectionRemove.size());
            collectionRemove.clear();
            return collectionS;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f7349c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f7349c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: keySet */
        public Set<K> h() {
            return AbstractC3215d.this.j();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f7349c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f7349c.toString();
        }

        Map.Entry<K, Collection<V>> f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return Y.d(key, AbstractC3215d.this.A(key, entry.getValue()));
        }
    }

    /* renamed from: Ee.d$d, reason: collision with other inner class name */
    private abstract class AbstractC0146d<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f7355a;

        /* renamed from: b, reason: collision with root package name */
        K f7356b = null;

        /* renamed from: c, reason: collision with root package name */
        Collection<V> f7357c = null;

        /* renamed from: d, reason: collision with root package name */
        Iterator<V> f7358d = S.k();

        abstract T a(K k10, V v10);

        AbstractC0146d() {
            this.f7355a = AbstractC3215d.this.f7345e.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7355a.hasNext() || this.f7358d.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f7358d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f7355a.next();
                this.f7356b = next.getKey();
                Collection<V> value = next.getValue();
                this.f7357c = value;
                this.f7358d = value.iterator();
            }
            return a(e0.a(this.f7356b), this.f7358d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f7358d.remove();
            Collection<V> collection = this.f7357c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f7355a.remove();
            }
            AbstractC3215d.o(AbstractC3215d.this);
        }
    }

    /* renamed from: Ee.d$e */
    private class e extends Y.d<K, Collection<V>> {

        /* renamed from: Ee.d$e$a */
        class a implements Iterator<K> {

            /* renamed from: a, reason: collision with root package name */
            Map.Entry<K, Collection<V>> f7361a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f7362b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f7363c;

            a(e eVar, Iterator it) {
                this.f7362b = it;
                this.f7363c = eVar;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f7362b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f7362b.next();
                this.f7361a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                De.p.x(this.f7361a != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f7361a.getValue();
                this.f7362b.remove();
                AbstractC3215d.q(AbstractC3215d.this, value.size());
                value.clear();
                this.f7361a = null;
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
                AbstractC3215d.q(AbstractC3215d.this, size);
            } else {
                size = 0;
            }
            if (size <= 0) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: Ee.d$f */
    private final class f extends AbstractC3215d<K, V>.i implements NavigableMap<K, Collection<V>> {
        @Override // Ee.AbstractC3215d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // Ee.AbstractC3215d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // Ee.AbstractC3215d.i, java.util.SortedMap, java.util.NavigableMap
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
        @Override // Ee.AbstractC3215d.i
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> g() {
            return new g(i());
        }

        @Override // Ee.AbstractC3215d.i, Ee.AbstractC3215d.c, java.util.AbstractMap, java.util.Map
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
            Collection<V> collectionS = AbstractC3215d.this.s();
            collectionS.addAll(next.getValue());
            it.remove();
            return Y.d(next.getKey(), AbstractC3215d.this.z(collectionS));
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
        @Override // Ee.AbstractC3215d.i
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> i() {
            return (NavigableMap) super.i();
        }
    }

    /* renamed from: Ee.d$g */
    private final class g extends AbstractC3215d<K, V>.j implements NavigableSet<K> {
        @Override // Ee.AbstractC3215d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        @Override // Ee.AbstractC3215d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // Ee.AbstractC3215d.j, java.util.SortedSet, java.util.NavigableSet
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
        @Override // Ee.AbstractC3215d.j
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

    /* renamed from: Ee.d$h */
    private class h extends AbstractC3215d<K, V>.l implements RandomAccess {
        h(K k10, List<V> list, AbstractC3215d<K, V>.k kVar) {
            super(k10, list, kVar);
        }
    }

    /* renamed from: Ee.d$i */
    private class i extends AbstractC3215d<K, V>.c implements SortedMap<K, Collection<V>> {

        /* renamed from: e, reason: collision with root package name */
        SortedSet<K> f7367e;

        i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        SortedSet<K> g() {
            return new j(i());
        }

        @Override // Ee.AbstractC3215d.c, java.util.AbstractMap, java.util.Map
        public SortedSet<K> h() {
            SortedSet<K> sortedSet = this.f7367e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetG = g();
            this.f7367e = sortedSetG;
            return sortedSetG;
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new i(i().headMap(k10));
        }

        SortedMap<K, Collection<V>> i() {
            return (SortedMap) this.f7349c;
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

    /* renamed from: Ee.d$j */
    private class j extends AbstractC3215d<K, V>.e implements SortedSet<K> {
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

    /* renamed from: Ee.d$k */
    class k extends AbstractCollection<V> {

        /* renamed from: a, reason: collision with root package name */
        final K f7370a;

        /* renamed from: b, reason: collision with root package name */
        Collection<V> f7371b;

        /* renamed from: c, reason: collision with root package name */
        final AbstractC3215d<K, V>.k f7372c;

        /* renamed from: d, reason: collision with root package name */
        final Collection<V> f7373d;

        /* renamed from: Ee.d$k$a */
        class a implements Iterator<V> {

            /* renamed from: a, reason: collision with root package name */
            final Iterator<V> f7375a;

            /* renamed from: b, reason: collision with root package name */
            final Collection<V> f7376b;

            a() {
                Collection<V> collection = k.this.f7371b;
                this.f7376b = collection;
                this.f7375a = AbstractC3215d.x(collection);
            }

            void c() {
                k.this.k();
                if (k.this.f7371b != this.f7376b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f7375a.remove();
                AbstractC3215d.o(AbstractC3215d.this);
                k.this.l();
            }

            Iterator<V> a() {
                c();
                return this.f7375a;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                c();
                return this.f7375a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                c();
                return this.f7375a.next();
            }

            a(Iterator<V> it) {
                this.f7376b = k.this.f7371b;
                this.f7375a = it;
            }
        }

        k(K k10, Collection<V> collection, AbstractC3215d<K, V>.k kVar) {
            this.f7370a = k10;
            this.f7371b = collection;
            this.f7372c = kVar;
            this.f7373d = kVar == null ? null : kVar.f();
        }

        void a() {
            AbstractC3215d<K, V>.k kVar = this.f7372c;
            if (kVar != null) {
                kVar.a();
            } else {
                AbstractC3215d.this.f7345e.put(this.f7370a, this.f7371b);
            }
        }

        AbstractC3215d<K, V>.k e() {
            return this.f7372c;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            k();
            return this.f7371b.equals(obj);
        }

        Collection<V> f() {
            return this.f7371b;
        }

        K h() {
            return this.f7370a;
        }

        void k() {
            Collection<V> collection;
            AbstractC3215d<K, V>.k kVar = this.f7372c;
            if (kVar != null) {
                kVar.k();
                if (this.f7372c.f() != this.f7373d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f7371b.isEmpty() || (collection = (Collection) AbstractC3215d.this.f7345e.get(this.f7370a)) == null) {
                    return;
                }
                this.f7371b = collection;
            }
        }

        void l() {
            AbstractC3215d<K, V>.k kVar = this.f7372c;
            if (kVar != null) {
                kVar.l();
            } else if (this.f7371b.isEmpty()) {
                AbstractC3215d.this.f7345e.remove(this.f7370a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v10) {
            k();
            boolean zIsEmpty = this.f7371b.isEmpty();
            boolean zAdd = this.f7371b.add(v10);
            if (zAdd) {
                AbstractC3215d.n(AbstractC3215d.this);
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
            boolean zAddAll = this.f7371b.addAll(collection);
            if (zAddAll) {
                AbstractC3215d.p(AbstractC3215d.this, this.f7371b.size() - size);
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
            this.f7371b.clear();
            AbstractC3215d.q(AbstractC3215d.this, size);
            l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            k();
            return this.f7371b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            k();
            return this.f7371b.containsAll(collection);
        }

        @Override // java.util.Collection
        public int hashCode() {
            k();
            return this.f7371b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            k();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            k();
            boolean zRemove = this.f7371b.remove(obj);
            if (zRemove) {
                AbstractC3215d.o(AbstractC3215d.this);
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
            boolean zRemoveAll = this.f7371b.removeAll(collection);
            if (zRemoveAll) {
                AbstractC3215d.p(AbstractC3215d.this, this.f7371b.size() - size);
                l();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            De.p.q(collection);
            int size = size();
            boolean zRetainAll = this.f7371b.retainAll(collection);
            if (zRetainAll) {
                AbstractC3215d.p(AbstractC3215d.this, this.f7371b.size() - size);
                l();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            k();
            return this.f7371b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            k();
            return this.f7371b.toString();
        }
    }

    /* renamed from: Ee.d$l */
    class l extends AbstractC3215d<K, V>.k implements List<V> {

        /* renamed from: Ee.d$l$a */
        private class a extends AbstractC3215d<K, V>.k.a implements ListIterator<V> {
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
                AbstractC3215d.n(AbstractC3215d.this);
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

        l(K k10, List<V> list, AbstractC3215d<K, V>.k kVar) {
            super(k10, list, kVar);
        }

        @Override // java.util.List
        public void add(int i10, V v10) {
            k();
            boolean zIsEmpty = f().isEmpty();
            m().add(i10, v10);
            AbstractC3215d.n(AbstractC3215d.this);
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
                AbstractC3215d.p(AbstractC3215d.this, f().size() - size);
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
            AbstractC3215d.o(AbstractC3215d.this);
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
            AbstractC3215d<K, V>.k kVarE;
            k();
            AbstractC3215d abstractC3215d = AbstractC3215d.this;
            Object objH = h();
            List<V> listSubList = m().subList(i10, i11);
            if (e() == null) {
                kVarE = this;
            } else {
                kVarE = e();
            }
            return abstractC3215d.B(objH, listSubList, kVarE);
        }
    }

    abstract Collection<V> A(K k10, Collection<V> collection);

    abstract Collection<V> s();

    abstract <E> Collection<E> z(Collection<E> collection);

    static /* synthetic */ int n(AbstractC3215d abstractC3215d) {
        int i10 = abstractC3215d.f7346f;
        abstractC3215d.f7346f = i10 + 1;
        return i10;
    }

    static /* synthetic */ int o(AbstractC3215d abstractC3215d) {
        int i10 = abstractC3215d.f7346f;
        abstractC3215d.f7346f = i10 - 1;
        return i10;
    }

    static /* synthetic */ int p(AbstractC3215d abstractC3215d, int i10) {
        int i11 = abstractC3215d.f7346f + i10;
        abstractC3215d.f7346f = i11;
        return i11;
    }

    static /* synthetic */ int q(AbstractC3215d abstractC3215d, int i10) {
        int i11 = abstractC3215d.f7346f - i10;
        abstractC3215d.f7346f = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> x(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(Object obj) {
        Collection collection = (Collection) Y.i(this.f7345e, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f7346f -= size;
        }
    }

    final List<V> B(K k10, List<V> list, AbstractC3215d<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(k10, list, kVar) : new l(k10, list, kVar);
    }

    @Override // Ee.Z
    public void clear() {
        Iterator<Collection<V>> it = this.f7345e.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f7345e.clear();
        this.f7346f = 0;
    }

    @Override // Ee.AbstractC3217f
    Collection<Map.Entry<K, V>> f() {
        return new AbstractC3217f.a();
    }

    @Override // Ee.Z
    public Collection<V> get(K k10) {
        Collection<V> collectionT = this.f7345e.get(k10);
        if (collectionT == null) {
            collectionT = t(k10);
        }
        return A(k10, collectionT);
    }

    @Override // Ee.AbstractC3217f
    Collection<V> h() {
        return new AbstractC3217f.b();
    }

    @Override // Ee.AbstractC3217f
    Iterator<Map.Entry<K, V>> i() {
        return new b();
    }

    @Override // Ee.AbstractC3217f
    Iterator<V> k() {
        return new a();
    }

    @Override // Ee.Z
    public boolean put(K k10, V v10) {
        Collection<V> collection = this.f7345e.get(k10);
        if (collection != null) {
            if (!collection.add(v10)) {
                return false;
            }
            this.f7346f++;
            return true;
        }
        Collection<V> collectionT = t(k10);
        if (!collectionT.add(v10)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f7346f++;
        this.f7345e.put(k10, collectionT);
        return true;
    }

    @Override // Ee.Z
    public int size() {
        return this.f7346f;
    }

    final Map<K, Collection<V>> u() {
        Map<K, Collection<V>> map = this.f7345e;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f7345e) : map instanceof SortedMap ? new i((SortedMap) this.f7345e) : new c(this.f7345e);
    }

    final Set<K> v() {
        Map<K, Collection<V>> map = this.f7345e;
        return map instanceof NavigableMap ? new g((NavigableMap) this.f7345e) : map instanceof SortedMap ? new j((SortedMap) this.f7345e) : new e(this.f7345e);
    }

    protected AbstractC3215d(Map<K, Collection<V>> map) {
        De.p.d(map.isEmpty());
        this.f7345e = map;
    }

    @Override // Ee.AbstractC3217f, Ee.Z
    public Collection<Map.Entry<K, V>> a() {
        return super.a();
    }

    Collection<V> t(K k10) {
        return s();
    }

    @Override // Ee.AbstractC3217f, Ee.Z
    public Collection<V> values() {
        return super.values();
    }
}
