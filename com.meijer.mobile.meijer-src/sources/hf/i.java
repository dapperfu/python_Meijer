package hf;

import com.google.android.gms.common.api.a;
import gf.C14359f;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Predicate;

/* loaded from: classes8.dex */
public abstract class i<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f135351a = new Object[0];

    public static abstract class a<E> {
        static int a(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            return iHighestOneBit < 0 ? a.e.API_PRIORITY_OTHER : iHighestOneBit;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public abstract AbstractC14513C<E> e();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        int size = size();
        if (size == 0) {
            return f135351a;
        }
        Object[] objArr = new Object[size];
        a(objArr, 0);
        return objArr;
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

    @Override // java.util.Collection
    @Deprecated
    public final boolean removeIf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    i() {
    }

    int a(Object[] objArr, int i10) {
        AbstractC14513C<E> abstractC14513CE = e();
        while (abstractC14513CE.hasNext()) {
            objArr[i10] = abstractC14513CE.next();
            i10++;
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C14359f.h(tArr);
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) u.a(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }
}
