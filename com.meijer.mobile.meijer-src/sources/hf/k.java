package hf;

import gf.C14359f;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

/* loaded from: classes8.dex */
public abstract class k<E> extends i<E> implements List<E>, RandomAccess {

    class a extends AbstractC14515a<E> {
        a(int i10, int i11) {
            super(i10, i11);
        }

        @Override // hf.AbstractC14515a
        protected E a(int i10) {
            return k.this.get(i10);
        }
    }

    class b extends k<E> {

        /* renamed from: b, reason: collision with root package name */
        final transient int f135354b;

        /* renamed from: c, reason: collision with root package name */
        final transient int f135355c;

        @Override // hf.k, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        b(int i10, int i11) {
            this.f135354b = i10;
            this.f135355c = i11;
        }

        @Override // java.util.List
        public E get(int i10) {
            C14359f.f(i10, this.f135355c);
            return k.this.get(i10 + this.f135354b);
        }

        @Override // hf.k, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }

        @Override // hf.k, java.util.List
        /* renamed from: o */
        public k<E> subList(int i10, int i11) {
            C14359f.k(i10, i11, this.f135355c);
            k kVar = k.this;
            int i12 = this.f135354b;
            return kVar.subList(i10 + i12, i11 + i12);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f135355c;
        }

        @Override // hf.k, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }
    }

    static <E> k<E> f(Object[] objArr) {
        return h(objArr, objArr.length);
    }

    @Override // java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC14514D<E> listIterator() {
        return listIterator(0);
    }

    static <E> k<E> h(Object[] objArr, int i10) {
        if (i10 == 0) {
            return m();
        }
        if (i10 == 1) {
            return n(objArr[0]);
        }
        if (i10 < objArr.length) {
            objArr = Arrays.copyOf(objArr, i10);
        }
        return new x(objArr);
    }

    public static <E> k<E> m() {
        return (k<E>) x.f135437c;
    }

    public static <E> k<E> n(E e10) {
        return new C14511A(e10);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return q.b(this, obj);
    }

    @Override // java.util.List
    /* renamed from: l */
    public AbstractC14514D<E> listIterator(int i10) {
        return new a(size(), i10);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return q.d(this, obj);
    }

    k<E> p(int i10, int i11) {
        return new b(i10, i11 - i10);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final void replaceAll(UnaryOperator<E> unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final void sort(Comparator<? super E> comparator) {
        throw new UnsupportedOperationException();
    }

    k() {
    }

    @Override // hf.i
    int a(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // hf.i, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: e */
    public AbstractC14513C<E> iterator() {
        return listIterator();
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return q.a(this, obj);
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer<? super E> consumer) {
        C14359f.h(consumer);
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            consumer.accept(get(i10));
        }
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    /* renamed from: o */
    public k<E> subList(int i10, int i11) {
        C14359f.k(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return m();
        }
        if (i12 == 1) {
            return n(get(i10));
        }
        return p(i10, i11);
    }

    @Override // hf.i, java.util.Collection, java.lang.Iterable, java.util.List
    public Spliterator<E> spliterator() {
        return f.a(size(), 1296, new IntFunction() { // from class: hf.j
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return this.f135352a.get(i10);
            }
        });
    }
}
