package Ce;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class U {

    private static class b<T> extends AbstractList<T> {

        /* renamed from: a, reason: collision with root package name */
        private final List<T> f3939a;

        class a implements ListIterator<T> {

            /* renamed from: a, reason: collision with root package name */
            boolean f3940a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ListIterator f3941b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f3942c;

            a(b bVar, ListIterator listIterator) {
                this.f3941b = listIterator;
                this.f3942c = bVar;
            }

            @Override // java.util.ListIterator
            public void add(T t10) {
                this.f3941b.add(t10);
                this.f3941b.previous();
                this.f3940a = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f3941b.hasPrevious();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f3941b.hasNext();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f3942c.h(this.f3941b.nextIndex());
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                C3030w.c(this.f3940a);
                this.f3941b.remove();
                this.f3940a = false;
            }

            @Override // java.util.ListIterator
            public void set(T t10) {
                Be.p.w(this.f3940a);
                this.f3941b.set(t10);
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public T next() {
                if (hasNext()) {
                    this.f3940a = true;
                    return (T) this.f3941b.previous();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public T previous() {
                if (hasPrevious()) {
                    this.f3940a = true;
                    return (T) this.f3941b.next();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return nextIndex() - 1;
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, T t10) {
            this.f3939a.add(h(i10), t10);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f3939a.clear();
        }

        List<T> e() {
            return this.f3939a;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i10) {
            return this.f3939a.get(f(i10));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i10) {
            return this.f3939a.remove(f(i10));
        }

        @Override // java.util.AbstractList, java.util.List
        public T set(int i10, T t10) {
            return this.f3939a.set(f(i10), t10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f3939a.size();
        }

        b(List<T> list) {
            this.f3939a = (List) Be.p.q(list);
        }

        private int f(int i10) {
            int size = size();
            Be.p.o(i10, size);
            return (size - 1) - i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int h(int i10) {
            int size = size();
            Be.p.t(i10, size);
            return size - i10;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new a(this, this.f3939a.listIterator(h(i10)));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i10, int i11) {
            subList(i10, i11).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i10, int i11) {
            Be.p.v(i10, i11, size());
            return U.k(this.f3939a.subList(h(i11), h(i10)));
        }
    }

    private static class c<F, T> extends AbstractList<T> implements RandomAccess, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final List<F> f3943a;

        /* renamed from: b, reason: collision with root package name */
        final Be.g<? super F, ? extends T> f3944b;

        class a extends x0<F, T> {
            a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // Ce.w0
            T a(F f10) {
                return c.this.f3944b.apply(f10);
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i10) {
            return this.f3944b.apply(this.f3943a.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f3943a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new a(this.f3943a.listIterator(i10));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i10) {
            return this.f3944b.apply(this.f3943a.remove(i10));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i10, int i11) {
            this.f3943a.subList(i10, i11).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f3943a.size();
        }

        c(List<F> list, Be.g<? super F, ? extends T> gVar) {
            this.f3943a = (List) Be.p.q(list);
            this.f3944b = (Be.g) Be.p.q(gVar);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }
    }

    private static class d<F, T> extends AbstractSequentialList<T> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        final List<F> f3946a;

        /* renamed from: b, reason: collision with root package name */
        final Be.g<? super F, ? extends T> f3947b;

        class a extends x0<F, T> {
            a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // Ce.w0
            T a(F f10) {
                return d.this.f3947b.apply(f10);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f3946a.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new a(this.f3946a.listIterator(i10));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i10, int i11) {
            this.f3946a.subList(i10, i11).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f3946a.size();
        }

        d(List<F> list, Be.g<? super F, ? extends T> gVar) {
            this.f3946a = (List) Be.p.q(list);
            this.f3947b = (Be.g) Be.p.q(gVar);
        }
    }

    private static class a<T> extends b<T> implements RandomAccess {
        a(List<T> list) {
            super(list);
        }
    }

    static int a(int i10) {
        C3030w.b(i10, "arraySize");
        return He.f.k(i10 + 5 + (i10 / 10));
    }

    static int c(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return d(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (Be.l.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    static int e(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return f(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (Be.l.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int f(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ArrayList<E> g() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> j(int i10) {
        C3030w.b(i10, "initialArraySize");
        return new ArrayList<>(i10);
    }

    public static <T> List<T> k(List<T> list) {
        return list instanceof L ? ((L) list).F() : list instanceof b ? ((b) list).e() : list instanceof RandomAccess ? new a(list) : new b(list);
    }

    public static <F, T> List<T> l(List<F> list, Be.g<? super F, ? extends T> gVar) {
        return list instanceof RandomAccess ? new c(list, gVar) : new d(list, gVar);
    }

    static boolean b(List<?> list, Object obj) {
        if (obj == Be.p.q(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if ((list instanceof RandomAccess) && (list2 instanceof RandomAccess)) {
            for (int i10 = 0; i10 < size; i10++) {
                if (!Be.l.a(list.get(i10), list2.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        return S.h(list.iterator(), list2.iterator());
    }

    private static int d(List<?> list, Object obj) {
        int size = list.size();
        int i10 = 0;
        if (obj == null) {
            while (i10 < size) {
                if (list.get(i10) == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        while (i10 < size) {
            if (obj.equals(list.get(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static <E> ArrayList<E> h(Iterator<? extends E> it) {
        ArrayList<E> arrayListG = g();
        S.a(arrayListG, it);
        return arrayListG;
    }

    @SafeVarargs
    public static <E> ArrayList<E> i(E... eArr) {
        Be.p.q(eArr);
        ArrayList<E> arrayList = new ArrayList<>(a(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }
}
