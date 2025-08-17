package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.a;
import com.google.crypto.tink.shaded.protobuf.C11329z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11328y extends AbstractC11307c<Integer> implements C11329z.g, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final C11328y f88588d = new C11328y(new int[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private int[] f88589b;

    /* renamed from: c, reason: collision with root package name */
    private int f88590c;

    C11328y() {
        this(new int[10], 0, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11307c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11328y)) {
            return super.equals(obj);
        }
        C11328y c11328y = (C11328y) obj;
        if (this.f88590c != c11328y.f88590c) {
            return false;
        }
        int[] iArr = c11328y.f88589b;
        for (int i10 = 0; i10 < this.f88590c; i10++) {
            if (this.f88589b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11307c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f88590c; i11++) {
            i10 = (i10 * 31) + this.f88589b[i11];
        }
        return i10;
    }

    private C11328y(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f88589b = iArr;
        this.f88590c = i10;
    }

    private void k(int i10) {
        if (i10 < 0 || i10 >= this.f88590c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f88590c;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f88589b[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C11329z.i
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C11329z.g b(int i10) {
        if (i10 >= this.f88590c) {
            return new C11328y(Arrays.copyOf(this.f88589b, i10), this.f88590c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f88590c;
    }

    private void h(int i10, int i11) {
        int i12;
        a();
        if (i10 >= 0 && i10 <= (i12 = this.f88590c)) {
            int[] iArr = this.f88589b;
            if (i12 < iArr.length) {
                System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
            } else {
                int[] iArr2 = new int[((i12 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                System.arraycopy(this.f88589b, i10, iArr2, i10 + 1, this.f88590c - i10);
                this.f88589b = iArr2;
            }
            this.f88589b[i10] = i11;
            this.f88590c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m(i10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11307c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        a();
        C11329z.a(collection);
        if (!(collection instanceof C11328y)) {
            return super.addAll(collection);
        }
        C11328y c11328y = (C11328y) collection;
        int i10 = c11328y.f88590c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f88590c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f88589b;
            if (i12 > iArr.length) {
                this.f88589b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(c11328y.f88589b, 0, this.f88589b, this.f88590c, c11328y.f88590c);
            this.f88590c = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void c2(int i10) {
        a();
        int i11 = this.f88590c;
        int[] iArr = this.f88589b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f88589b = iArr2;
        }
        int[] iArr3 = this.f88589b;
        int i12 = this.f88590c;
        this.f88590c = i12 + 1;
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

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        c2(num.intValue());
        return true;
    }

    public int getInt(int i10) {
        k(i10);
        return this.f88589b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11307c, java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        a();
        k(i10);
        int[] iArr = this.f88589b;
        int i11 = iArr[i10];
        if (i10 < this.f88590c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f88590c--;
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
        k(i10);
        int[] iArr = this.f88589b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            int[] iArr = this.f88589b;
            System.arraycopy(iArr, i11, iArr, i10, this.f88590c - i11);
            this.f88590c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }
}
