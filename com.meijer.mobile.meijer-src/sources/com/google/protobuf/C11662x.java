package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.C11663y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11662x extends AbstractC11642c<Integer> implements C11663y.g, RandomAccess, Z {

    /* renamed from: d, reason: collision with root package name */
    private static final C11662x f91592d = new C11662x(new int[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private int[] f91593b;

    /* renamed from: c, reason: collision with root package name */
    private int f91594c;

    C11662x() {
        this(new int[10], 0, true);
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11662x)) {
            return super.equals(obj);
        }
        C11662x c11662x = (C11662x) obj;
        if (this.f91594c != c11662x.f91594c) {
            return false;
        }
        int[] iArr = c11662x.f91593b;
        for (int i10 = 0; i10 < this.f91594c; i10++) {
            if (this.f91593b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f91594c; i11++) {
            i10 = (i10 * 31) + this.f91593b[i11];
        }
        return i10;
    }

    private C11662x(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f91593b = iArr;
        this.f91594c = i10;
    }

    public static C11662x k() {
        return f91592d;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f91594c) {
            throw new IndexOutOfBoundsException(n(i10));
        }
    }

    private String n(int i10) {
        return "Index:" + i10 + ", Size:" + this.f91594c;
    }

    @Override // com.google.protobuf.C11663y.i
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11663y.i<Integer> b3(int i10) {
        if (i10 >= this.f91594c) {
            return new C11662x(Arrays.copyOf(this.f91593b, i10), this.f91594c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f91593b[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f91594c;
    }

    private void h(int i10, int i11) {
        int i12;
        a();
        if (i10 >= 0 && i10 <= (i12 = this.f91594c)) {
            int[] iArr = this.f91593b;
            if (i12 < iArr.length) {
                System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
            } else {
                int[] iArr2 = new int[((i12 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                System.arraycopy(this.f91593b, i10, iArr2, i10 + 1, this.f91594c - i10);
                this.f91593b = iArr2;
            }
            this.f91593b[i10] = i11;
            this.f91594c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(n(i10));
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        a();
        C11663y.a(collection);
        if (!(collection instanceof C11662x)) {
            return super.addAll(collection);
        }
        C11662x c11662x = (C11662x) collection;
        int i10 = c11662x.f91594c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f91594c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f91593b;
            if (i12 > iArr.length) {
                this.f91593b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(c11662x.f91593b, 0, this.f91593b, this.f91594c, c11662x.f91594c);
            this.f91594c = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.C11663y.g
    public void b2(int i10) {
        a();
        int i11 = this.f91594c;
        int[] iArr = this.f91593b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f91593b = iArr2;
        }
        int[] iArr3 = this.f91593b;
        int i12 = this.f91594c;
        this.f91594c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Integer num) {
        h(i10, num.intValue());
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        b2(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.C11663y.g
    public int getInt(int i10) {
        l(i10);
        return this.f91593b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        a();
        l(i10);
        int[] iArr = this.f91593b;
        int i11 = iArr[i10];
        if (i10 < this.f91594c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f91594c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(q(i10, num.intValue()));
    }

    public int q(int i10, int i11) {
        a();
        l(i10);
        int[] iArr = this.f91593b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            int[] iArr = this.f91593b;
            System.arraycopy(iArr, i11, iArr, i10, this.f91594c - i11);
            this.f91594c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }
}
