package Ee;

import Ee.C3234x;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes6.dex */
public final class s0 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    class a<E> extends f<E> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f7421a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f7422b;

        /* renamed from: Ee.s0$a$a, reason: collision with other inner class name */
        class C0148a extends AbstractC3213b<E> {

            /* renamed from: c, reason: collision with root package name */
            final Iterator<? extends E> f7423c;

            /* renamed from: d, reason: collision with root package name */
            final Iterator<? extends E> f7424d;

            C0148a() {
                this.f7423c = a.this.f7421a.iterator();
                this.f7424d = a.this.f7422b.iterator();
            }

            @Override // Ee.AbstractC3213b
            protected E a() {
                if (this.f7423c.hasNext()) {
                    return this.f7423c.next();
                }
                while (this.f7424d.hasNext()) {
                    E next = this.f7424d.next();
                    if (!a.this.f7421a.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f7421a = set;
            this.f7422b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y0<E> iterator() {
            return new C0148a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f7421a.contains(obj) || this.f7422b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f7421a.isEmpty() && this.f7422b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f7421a.size();
            Iterator<E> it = this.f7422b.iterator();
            while (it.hasNext()) {
                if (!this.f7421a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    class b<E> extends f<E> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f7426a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f7427b;

        class a extends AbstractC3213b<E> {

            /* renamed from: c, reason: collision with root package name */
            final Iterator<E> f7428c;

            a() {
                this.f7428c = b.this.f7426a.iterator();
            }

            @Override // Ee.AbstractC3213b
            protected E a() {
                while (this.f7428c.hasNext()) {
                    E next = this.f7428c.next();
                    if (b.this.f7427b.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set set, Set set2) {
            super(null);
            this.f7426a = set;
            this.f7427b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public y0<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f7426a.contains(obj) && this.f7427b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f7426a.containsAll(collection) && this.f7427b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f7427b, this.f7426a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f7426a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f7427b.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    private static class d<E> extends c<E> implements SortedSet<E> {
        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f7435a).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) S.m(this.f7435a.iterator(), this.f7436b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e10) {
            return new d(((SortedSet) this.f7435a).headSet(e10), this.f7436b);
        }

        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f7435a;
            while (true) {
                E e10 = (Object) sortedSetHeadSet.last();
                if (this.f7436b.apply(e10)) {
                    return e10;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e10);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e10, E e11) {
            return new d(((SortedSet) this.f7435a).subSet(e10, e11), this.f7436b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e10) {
            return new d(((SortedSet) this.f7435a).tailSet(e10), this.f7436b);
        }

        d(SortedSet<E> sortedSet, De.q<? super E> qVar) {
            super(sortedSet, qVar);
        }
    }

    public static abstract class f<E> extends AbstractSet<E> {
        /* synthetic */ f(a aVar) {
            this();
        }

        /* renamed from: a */
        public abstract y0<E> iterator();

        private f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    static boolean a(Set<?> set, Object obj) {
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

    static boolean j(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    private static class c<E> extends C3234x.a<E> implements Set<E> {
        c(Set<E> set, De.q<? super E> qVar) {
            super(set, qVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return s0.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return s0.d(this);
        }
    }

    static abstract class e<E> extends AbstractSet<E> {
        e() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return s0.i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) De.p.q(collection));
        }
    }

    public static <E> Set<E> b(Set<E> set, De.q<? super E> qVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, qVar);
        }
        if (!(set instanceof c)) {
            return new c((Set) De.p.q(set), (De.q) De.p.q(qVar));
        }
        c cVar = (c) set;
        return new c((Set) cVar.f7435a, De.r.b(cVar.f7436b, qVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> c(SortedSet<E> sortedSet, De.q<? super E> qVar) {
        if (!(sortedSet instanceof c)) {
            return new d((SortedSet) De.p.q(sortedSet), (De.q) De.p.q(qVar));
        }
        c cVar = (c) sortedSet;
        return new d((SortedSet) cVar.f7435a, De.r.b(cVar.f7436b, qVar));
    }

    public static <E> f<E> e(Set<E> set, Set<?> set2) {
        De.p.r(set, "set1");
        De.p.r(set2, "set2");
        return new b(set, set2);
    }

    public static <E> HashSet<E> f() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> g(int i10) {
        return new HashSet<>(Y.a(i10));
    }

    public static <E> f<E> k(Set<? extends E> set, Set<? extends E> set2) {
        De.p.r(set, "set1");
        De.p.r(set2, "set2");
        return new a(set, set2);
    }

    static int d(Set<?> set) {
        int iHashCode;
        int i10 = 0;
        for (Object obj : set) {
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            i10 = ~(~(i10 + iHashCode));
        }
        return i10;
    }

    public static <E> Set<E> h() {
        return Collections.newSetFromMap(Y.e());
    }

    static boolean i(Set<?> set, Collection<?> collection) {
        De.p.q(collection);
        if (collection instanceof c0) {
            collection = ((c0) collection).V1();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return S.v(set.iterator(), collection);
        }
        return j(set, collection.iterator());
    }
}
