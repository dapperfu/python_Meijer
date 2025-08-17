package Ce;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: Ce.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3031x {

    /* renamed from: Ce.x$a */
    static class a<E> extends AbstractCollection<E> {

        /* renamed from: a, reason: collision with root package name */
        final Collection<E> f4123a;

        /* renamed from: b, reason: collision with root package name */
        final Be.q<? super E> f4124b;

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return U.h(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e10) {
            Be.p.d(this.f4124b.apply(e10));
            return this.f4123a.add(e10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            Q.j(this.f4123a, this.f4124b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (C3031x.c(this.f4123a, obj)) {
                return this.f4124b.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !Q.a(this.f4123a, this.f4124b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return S.l(this.f4123a.iterator(), this.f4124b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f4123a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f4124b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f4123a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f4124b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f4123a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f4124b.apply(it.next())) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) U.h(iterator()).toArray(tArr);
        }

        a(Collection<E> collection, Be.q<? super E> qVar) {
            this.f4123a = collection;
            this.f4124b = qVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                Be.p.d(this.f4124b.apply(it.next()));
            }
            return this.f4123a.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return C3031x.a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (contains(obj) && this.f4123a.remove(obj)) {
                return true;
            }
            return false;
        }
    }

    static StringBuilder b(int i10) {
        C3030w.b(i10, "size");
        return new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
    }

    static boolean a(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    static boolean c(Collection<?> collection, Object obj) {
        Be.p.q(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
