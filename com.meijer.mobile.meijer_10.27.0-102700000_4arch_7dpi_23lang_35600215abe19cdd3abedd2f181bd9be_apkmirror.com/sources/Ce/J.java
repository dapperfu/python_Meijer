package Ce;

import com.google.android.gms.common.api.a;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: classes6.dex */
public abstract class J<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f3881a = new Object[0];

    static abstract class a<E> extends b<E> {

        /* renamed from: a, reason: collision with root package name */
        Object[] f3882a;

        /* renamed from: b, reason: collision with root package name */
        int f3883b;

        /* renamed from: c, reason: collision with root package name */
        boolean f3884c;

        public b<E> e(E... eArr) {
            f(eArr, eArr.length);
            return this;
        }

        private void g(int i10) {
            Object[] objArr = this.f3882a;
            int iC = b.c(objArr.length, this.f3883b + i10);
            if (iC > objArr.length || this.f3884c) {
                this.f3882a = Arrays.copyOf(this.f3882a, iC);
                this.f3884c = false;
            }
        }

        @Override // Ce.J.b
        public b<E> b(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                g(collection.size());
                if (collection instanceof J) {
                    this.f3883b = ((J) collection).e(this.f3882a, this.f3883b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        a(int i10) {
            C3030w.b(i10, "initialCapacity");
            this.f3882a = new Object[i10];
            this.f3883b = 0;
        }

        public a<E> d(E e10) {
            Be.p.q(e10);
            g(1);
            Object[] objArr = this.f3882a;
            int i10 = this.f3883b;
            this.f3883b = i10 + 1;
            objArr[i10] = e10;
            return this;
        }

        final void f(Object[] objArr, int i10) {
            f0.c(objArr, i10);
            g(i10);
            System.arraycopy(objArr, 0, this.f3882a, this.f3883b, i10);
            this.f3883b += i10;
        }
    }

    public static abstract class b<E> {
        public abstract b<E> a(E e10);

        static int c(int i10, int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (i11 <= i10) {
                return i10;
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            return iHighestOneBit < 0 ? a.e.API_PRIORITY_OTHER : iHighestOneBit;
        }

        b() {
        }

        public b<E> b(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    Object[] f() {
        return null;
    }

    abstract boolean l();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: m */
    public abstract y0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f3881a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    int h() {
        throw new UnsupportedOperationException();
    }

    int k() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Be.p.q(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrF = f();
            if (objArrF != null) {
                return (T[]) i0.a(objArrF, k(), h(), tArr);
            }
            tArr = (T[]) f0.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        e(tArr, 0);
        return tArr;
    }

    J() {
    }

    public L<E> a() {
        if (isEmpty()) {
            return L.x();
        }
        return L.n(toArray());
    }

    int e(Object[] objArr, int i10) {
        y0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }
}
