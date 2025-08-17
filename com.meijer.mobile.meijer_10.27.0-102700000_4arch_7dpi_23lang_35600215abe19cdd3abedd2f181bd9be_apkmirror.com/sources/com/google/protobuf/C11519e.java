package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.C11538y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11519e extends AbstractC11517c<Boolean> implements C11538y.a, RandomAccess, Z {

    /* renamed from: d, reason: collision with root package name */
    private static final C11519e f90501d = new C11519e(new boolean[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f90502b;

    /* renamed from: c, reason: collision with root package name */
    private int f90503c;

    C11519e() {
        this(new boolean[10], 0, true);
    }

    @Override // com.google.protobuf.AbstractC11517c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11519e)) {
            return super.equals(obj);
        }
        C11519e c11519e = (C11519e) obj;
        if (this.f90503c != c11519e.f90503c) {
            return false;
        }
        boolean[] zArr = c11519e.f90502b;
        for (int i10 = 0; i10 < this.f90503c; i10++) {
            if (this.f90502b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC11517c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iC = 1;
        for (int i10 = 0; i10 < this.f90503c; i10++) {
            iC = (iC * 31) + C11538y.c(this.f90502b[i10]);
        }
        return iC;
    }

    private C11519e(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f90502b = zArr;
        this.f90503c = i10;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f90503c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f90503c;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f90502b[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.C11538y.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C11538y.a b(int i10) {
        if (i10 >= this.f90503c) {
            return new C11519e(Arrays.copyOf(this.f90502b, i10), this.f90503c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f90503c;
    }

    private void h(int i10, boolean z10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f90503c)) {
            boolean[] zArr = this.f90502b;
            if (i11 < zArr.length) {
                System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
            } else {
                boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i10);
                System.arraycopy(this.f90502b, i10, zArr2, i10 + 1, this.f90503c - i10);
                this.f90502b = zArr2;
            }
            this.f90502b[i10] = z10;
            this.f90503c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(o(i10));
    }

    @Override // com.google.protobuf.AbstractC11517c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        a();
        C11538y.a(collection);
        if (!(collection instanceof C11519e)) {
            return super.addAll(collection);
        }
        C11519e c11519e = (C11519e) collection;
        int i10 = c11519e.f90503c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f90503c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f90502b;
            if (i12 > zArr.length) {
                this.f90502b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(c11519e.f90502b, 0, this.f90502b, this.f90503c, c11519e.f90503c);
            this.f90503c = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
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
    public void add(int i10, Boolean bool) {
        h(i10, bool.booleanValue());
    }

    @Override // com.google.protobuf.AbstractC11517c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        k(bool.booleanValue());
        return true;
    }

    public void k(boolean z10) {
        a();
        int i10 = this.f90503c;
        boolean[] zArr = this.f90502b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f90502b = zArr2;
        }
        boolean[] zArr3 = this.f90502b;
        int i11 = this.f90503c;
        this.f90503c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(n(i10));
    }

    public boolean n(int i10) {
        l(i10);
        return this.f90502b[i10];
    }

    @Override // com.google.protobuf.AbstractC11517c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        a();
        l(i10);
        boolean[] zArr = this.f90502b;
        boolean z10 = zArr[i10];
        if (i10 < this.f90503c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f90503c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(s(i10, bool.booleanValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            boolean[] zArr = this.f90502b;
            System.arraycopy(zArr, i11, zArr, i10, this.f90503c - i11);
            this.f90503c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public boolean s(int i10, boolean z10) {
        a();
        l(i10);
        boolean[] zArr = this.f90502b;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }
}
