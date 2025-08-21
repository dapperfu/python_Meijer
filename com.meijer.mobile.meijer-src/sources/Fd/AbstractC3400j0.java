package Fd;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: Fd.j0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3400j0 extends AbstractC3340e0 implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private static final I0 f10134b = new C3376h0(C3569y0.f10369f, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10135c = 0;

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i10 = 0; i10 < size; i10++) {
                if (!r.a(get(i10), list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !r.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // Fd.AbstractC3340e0
    /* renamed from: h */
    public final H0 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // Fd.AbstractC3340e0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    static AbstractC3400j0 m(Object[] objArr, int i10) {
        return i10 == 0 ? C3569y0.f10369f : new C3569y0(objArr, i10);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    AbstractC3400j0() {
    }

    public static AbstractC3400j0 n(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        C3558x0.a(objArr, 2);
        return m(objArr, 2);
    }

    @Override // Fd.AbstractC3340e0
    int a(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // Fd.AbstractC3340e0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC3400j0 subList(int i10, int i11) {
        C3513t.d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return C3569y0.f10369f;
        }
        return new C3388i0(this, i10, i12);
    }

    @Override // java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final I0 listIterator(int i10) {
        C3513t.b(i10, size(), "index");
        if (isEmpty()) {
            return f10134b;
        }
        return new C3376h0(this, i10);
    }
}
