package com.google.android.gms.internal.atv_ads_framework;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public abstract class F extends C implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private static final X f81594b = new D(M.f81684f, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f81595c = 0;

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
                if (!C10364n.a(get(i10), list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !C10364n.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    @Deprecated
    public final F h() {
        return this;
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

    @Override // com.google.android.gms.internal.atv_ads_framework.C, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    /* renamed from: k */
    public final W iterator() {
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

    static F o(Object[] objArr, int i10) {
        return i10 == 0 ? M.f81684f : new M(objArr, i10);
    }

    public static F p(Collection collection) {
        if (!(collection instanceof C)) {
            Object[] array = collection.toArray();
            int length = array.length;
            L.b(array, length);
            return o(array, length);
        }
        F fH = ((C) collection).h();
        if (!fH.l()) {
            return fH;
        }
        Object[] array2 = fH.toArray();
        return o(array2, array2.length);
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

    F() {
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    int a(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C, java.util.AbstractCollection, java.util.Collection
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
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public F subList(int i10, int i11) {
        r.c(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return M.f81684f;
        }
        return new E(this, i10, i12);
    }

    @Override // java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final X listIterator(int i10) {
        r.b(i10, size(), "index");
        if (isEmpty()) {
            return f81594b;
        }
        return new D(this, i10);
    }
}
