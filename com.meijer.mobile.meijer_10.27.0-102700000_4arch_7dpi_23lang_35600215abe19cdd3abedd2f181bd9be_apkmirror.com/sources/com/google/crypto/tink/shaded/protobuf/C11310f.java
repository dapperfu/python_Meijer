package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.a;
import com.google.crypto.tink.shaded.protobuf.C11329z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11310f extends AbstractC11307c<Boolean> implements C11329z.a, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final C11310f f88339d = new C11310f(new boolean[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f88340b;

    /* renamed from: c, reason: collision with root package name */
    private int f88341c;

    C11310f() {
        this(new boolean[10], 0, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11307c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11310f)) {
            return super.equals(obj);
        }
        C11310f c11310f = (C11310f) obj;
        if (this.f88341c != c11310f.f88341c) {
            return false;
        }
        boolean[] zArr = c11310f.f88340b;
        for (int i10 = 0; i10 < this.f88341c; i10++) {
            if (this.f88340b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11307c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iC = 1;
        for (int i10 = 0; i10 < this.f88341c; i10++) {
            iC = (iC * 31) + C11329z.c(this.f88340b[i10]);
        }
        return iC;
    }

    private C11310f(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f88340b = zArr;
        this.f88341c = i10;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f88341c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f88341c;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f88340b[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C11329z.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C11329z.a b(int i10) {
        if (i10 >= this.f88341c) {
            return new C11310f(Arrays.copyOf(this.f88340b, i10), this.f88341c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f88341c;
    }

    private void h(int i10, boolean z10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f88341c)) {
            boolean[] zArr = this.f88340b;
            if (i11 < zArr.length) {
                System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
            } else {
                boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i10);
                System.arraycopy(this.f88340b, i10, zArr2, i10 + 1, this.f88341c - i10);
                this.f88340b = zArr2;
            }
            this.f88340b[i10] = z10;
            this.f88341c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(o(i10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11307c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        a();
        C11329z.a(collection);
        if (!(collection instanceof C11310f)) {
            return super.addAll(collection);
        }
        C11310f c11310f = (C11310f) collection;
        int i10 = c11310f.f88341c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f88341c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f88340b;
            if (i12 > zArr.length) {
                this.f88340b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(c11310f.f88340b, 0, this.f88340b, this.f88341c, c11310f.f88341c);
            this.f88341c = i12;
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

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        k(bool.booleanValue());
        return true;
    }

    public void k(boolean z10) {
        a();
        int i10 = this.f88341c;
        boolean[] zArr = this.f88340b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f88340b = zArr2;
        }
        boolean[] zArr3 = this.f88340b;
        int i11 = this.f88341c;
        this.f88341c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(n(i10));
    }

    public boolean n(int i10) {
        l(i10);
        return this.f88340b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11307c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        a();
        l(i10);
        boolean[] zArr = this.f88340b;
        boolean z10 = zArr[i10];
        if (i10 < this.f88341c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f88341c--;
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
            boolean[] zArr = this.f88340b;
            System.arraycopy(zArr, i11, zArr, i10, this.f88341c - i11);
            this.f88341c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public boolean s(int i10, boolean z10) {
        a();
        l(i10);
        boolean[] zArr = this.f88340b;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }
}
