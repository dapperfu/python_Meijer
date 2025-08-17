package Ce;

import Ce.C3031x;
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
        final /* synthetic */ Set f4109a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f4110b;

        /* renamed from: Ce.s0$a$a, reason: collision with other inner class name */
        class C0073a extends AbstractC3010b<E> {

            /* renamed from: c, reason: collision with root package name */
            final Iterator<? extends E> f4111c;

            /* renamed from: d, reason: collision with root package name */
            final Iterator<? extends E> f4112d;

            C0073a() {
                this.f4111c = a.this.f4109a.iterator();
                this.f4112d = a.this.f4110b.iterator();
            }

            @Override // Ce.AbstractC3010b
            protected E a() {
                if (this.f4111c.hasNext()) {
                    return this.f4111c.next();
                }
                while (this.f4112d.hasNext()) {
                    E next = this.f4112d.next();
                    if (!a.this.f4109a.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f4109a = set;
            this.f4110b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y0<E> iterator() {
            return new C0073a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f4109a.contains(obj) || this.f4110b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f4109a.isEmpty() && this.f4110b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f4109a.size();
            Iterator<E> it = this.f4110b.iterator();
            while (it.hasNext()) {
                if (!this.f4109a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    class b<E> extends f<E> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f4114a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f4115b;

        class a extends AbstractC3010b<E> {

            /* renamed from: c, reason: collision with root package name */
            final Iterator<E> f4116c;

            a() {
                this.f4116c = b.this.f4114a.iterator();
            }

            @Override // Ce.AbstractC3010b
            protected E a() {
                while (this.f4116c.hasNext()) {
                    E next = this.f4116c.next();
                    if (b.this.f4115b.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set set, Set set2) {
            super(null);
            this.f4114a = set;
            this.f4115b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public y0<E> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f4114a.contains(obj) && this.f4115b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f4114a.containsAll(collection) && this.f4115b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f4115b, this.f4114a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f4114a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f4115b.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    private static class d<E> extends c<E> implements SortedSet<E> {
        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f4123a).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) S.m(this.f4123a.iterator(), this.f4124b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e10) {
            return new d(((SortedSet) this.f4123a).headSet(e10), this.f4124b);
        }

        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f4123a;
            while (true) {
                E e10 = (Object) sortedSetHeadSet.last();
                if (this.f4124b.apply(e10)) {
                    return e10;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e10);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e10, E e11) {
            return new d(((SortedSet) this.f4123a).subSet(e10, e11), this.f4124b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e10) {
            return new d(((SortedSet) this.f4123a).tailSet(e10), this.f4124b);
        }

        d(SortedSet<E> sortedSet, Be.q<? super E> qVar) {
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

    private static class c<E> extends C3031x.a<E> implements Set<E> {
        c(Set<E> set, Be.q<? super E> qVar) {
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
            return super.retainAll((Collection) Be.p.q(collection));
        }
    }

    public static <E> Set<E> b(Set<E> set, Be.q<? super E> qVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, qVar);
        }
        if (!(set instanceof c)) {
            return new c((Set) Be.p.q(set), (Be.q) Be.p.q(qVar));
        }
        c cVar = (c) set;
        return new c((Set) cVar.f4123a, Be.r.b(cVar.f4124b, qVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> c(SortedSet<E> sortedSet, Be.q<? super E> qVar) {
        if (!(sortedSet instanceof c)) {
            return new d((SortedSet) Be.p.q(sortedSet), (Be.q) Be.p.q(qVar));
        }
        c cVar = (c) sortedSet;
        return new d((SortedSet) cVar.f4123a, Be.r.b(cVar.f4124b, qVar));
    }

    public static <E> f<E> e(Set<E> set, Set<?> set2) {
        Be.p.r(set, "set1");
        Be.p.r(set2, "set2");
        return new b(set, set2);
    }

    public static <E> HashSet<E> f() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> g(int i10) {
        return new HashSet<>(Y.a(i10));
    }

    public static <E> f<E> k(Set<? extends E> set, Set<? extends E> set2) {
        Be.p.r(set, "set1");
        Be.p.r(set2, "set2");
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
        Be.p.q(collection);
        if (collection instanceof c0) {
            collection = ((c0) collection).V1();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return S.v(set.iterator(), collection);
        }
        return j(set, collection.iterator());
    }
}
