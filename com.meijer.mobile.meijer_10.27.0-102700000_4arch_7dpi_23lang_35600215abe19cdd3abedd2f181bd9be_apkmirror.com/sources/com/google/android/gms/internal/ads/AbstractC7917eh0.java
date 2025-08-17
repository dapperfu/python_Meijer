package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.eh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7917eh0 extends AbstractC7401Zg0 implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8666li0 f73924b = new C7704ch0(C7102Qh0.f69623f, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f73925c = 0;

    public static AbstractC7917eh0 s(Object[] objArr) {
        if (objArr.length == 0) {
            return C7102Qh0.f69623f;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        C7034Oh0.b(objArr2, length);
        return p(objArr2, length);
    }

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
                if (!C6555Af0.a(get(i10), list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !C6555Af0.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    @Deprecated
    public final AbstractC7917eh0 h() {
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

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    /* renamed from: k */
    public final AbstractC8559ki0 iterator() {
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

    @SafeVarargs
    public static AbstractC7917eh0 B(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i10 = length + 12;
        Object[] objArr2 = new Object[i10];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        C7034Oh0.b(objArr2, i10);
        return p(objArr2, i10);
    }

    public static C7598bh0 o(int i10) {
        C6557Ag0.a(i10, "expectedSize");
        return new C7598bh0(i10);
    }

    static AbstractC7917eh0 p(Object[] objArr, int i10) {
        return i10 == 0 ? C7102Qh0.f69623f : new C7102Qh0(objArr, i10);
    }

    public static AbstractC7917eh0 r(Collection collection) {
        if (!(collection instanceof AbstractC7401Zg0)) {
            Object[] array = collection.toArray();
            int length = array.length;
            C7034Oh0.b(array, length);
            return p(array, length);
        }
        AbstractC7917eh0 abstractC7917eh0H = ((AbstractC7401Zg0) collection).h();
        if (!abstractC7917eh0H.l()) {
            return abstractC7917eh0H;
        }
        Object[] array2 = abstractC7917eh0H.toArray();
        return p(array2, array2.length);
    }

    public static AbstractC7917eh0 t() {
        return C7102Qh0.f69623f;
    }

    public static AbstractC7917eh0 z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        C7034Oh0.b(objArr, 6);
        return p(objArr, 6);
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

    AbstractC7917eh0() {
    }

    public static AbstractC7917eh0 q(Iterable iterable) {
        iterable.getClass();
        return r((Collection) iterable);
    }

    public static AbstractC7917eh0 u(Object obj) {
        Object[] objArr = {obj};
        C7034Oh0.b(objArr, 1);
        return p(objArr, 1);
    }

    public static AbstractC7917eh0 v(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        C7034Oh0.b(objArr, 2);
        return p(objArr, 2);
    }

    public static AbstractC7917eh0 x(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        C7034Oh0.b(objArr, 3);
        return p(objArr, 3);
    }

    public static AbstractC7917eh0 y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        C7034Oh0.b(objArr, 5);
        return p(objArr, 5);
    }

    @Override // java.util.List
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final AbstractC8666li0 listIterator(int i10) {
        C6657Df0.b(i10, size(), "index");
        if (isEmpty()) {
            return f73924b;
        }
        return new C7704ch0(this, i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    int a(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
    public AbstractC7917eh0 subList(int i10, int i11) {
        C6657Df0.k(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return C7102Qh0.f69623f;
        }
        return new C7811dh0(this, i10, i12);
    }
}
