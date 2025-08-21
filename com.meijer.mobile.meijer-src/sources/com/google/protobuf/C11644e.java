package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.C11663y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11644e extends AbstractC11642c<Boolean> implements C11663y.a, RandomAccess, Z {

    /* renamed from: d, reason: collision with root package name */
    private static final C11644e f91340d = new C11644e(new boolean[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f91341b;

    /* renamed from: c, reason: collision with root package name */
    private int f91342c;

    C11644e() {
        this(new boolean[10], 0, true);
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11644e)) {
            return super.equals(obj);
        }
        C11644e c11644e = (C11644e) obj;
        if (this.f91342c != c11644e.f91342c) {
            return false;
        }
        boolean[] zArr = c11644e.f91341b;
        for (int i10 = 0; i10 < this.f91342c; i10++) {
            if (this.f91341b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iC = 1;
        for (int i10 = 0; i10 < this.f91342c; i10++) {
            iC = (iC * 31) + C11663y.c(this.f91341b[i10]);
        }
        return iC;
    }

    private C11644e(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f91341b = zArr;
        this.f91342c = i10;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f91342c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f91342c;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f91341b[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.C11663y.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C11663y.a b(int i10) {
        if (i10 >= this.f91342c) {
            return new C11644e(Arrays.copyOf(this.f91341b, i10), this.f91342c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f91342c;
    }

    private void h(int i10, boolean z10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f91342c)) {
            boolean[] zArr = this.f91341b;
            if (i11 < zArr.length) {
                System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
            } else {
                boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i10);
                System.arraycopy(this.f91341b, i10, zArr2, i10 + 1, this.f91342c - i10);
                this.f91341b = zArr2;
            }
            this.f91341b[i10] = z10;
            this.f91342c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(o(i10));
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        a();
        C11663y.a(collection);
        if (!(collection instanceof C11644e)) {
            return super.addAll(collection);
        }
        C11644e c11644e = (C11644e) collection;
        int i10 = c11644e.f91342c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f91342c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f91341b;
            if (i12 > zArr.length) {
                this.f91341b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(c11644e.f91341b, 0, this.f91341b, this.f91342c, c11644e.f91342c);
            this.f91342c = i12;
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

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        k(bool.booleanValue());
        return true;
    }

    public void k(boolean z10) {
        a();
        int i10 = this.f91342c;
        boolean[] zArr = this.f91341b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f91341b = zArr2;
        }
        boolean[] zArr3 = this.f91341b;
        int i11 = this.f91342c;
        this.f91342c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(n(i10));
    }

    public boolean n(int i10) {
        l(i10);
        return this.f91341b[i10];
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        a();
        l(i10);
        boolean[] zArr = this.f91341b;
        boolean z10 = zArr[i10];
        if (i10 < this.f91342c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f91342c--;
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
            boolean[] zArr = this.f91341b;
            System.arraycopy(zArr, i11, zArr, i10, this.f91342c - i11);
            this.f91342c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public boolean s(int i10, boolean z10) {
        a();
        l(i10);
        boolean[] zArr = this.f91341b;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }
}
