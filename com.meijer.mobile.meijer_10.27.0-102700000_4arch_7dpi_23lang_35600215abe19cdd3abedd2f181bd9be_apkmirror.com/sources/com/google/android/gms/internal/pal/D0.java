package com.google.android.gms.internal.pal;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class D0 extends L implements RandomAccess, H0, InterfaceC10802n1 {

    /* renamed from: d, reason: collision with root package name */
    private static final D0 f82564d;

    /* renamed from: b, reason: collision with root package name */
    private int[] f82565b;

    /* renamed from: c, reason: collision with root package name */
    private int f82566c;

    D0() {
        this(new int[10], 0);
    }

    public static D0 e() {
        return f82564d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.f82566c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        int[] iArr = this.f82565b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f82565b, i10, iArr2, i10 + 1, this.f82566c - i10);
            this.f82565b = iArr2;
        }
        this.f82565b[i10] = iIntValue;
        this.f82566c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return super.equals(obj);
        }
        D0 d02 = (D0) obj;
        if (this.f82566c != d02.f82566c) {
            return false;
        }
        int[] iArr = d02.f82565b;
        for (int i10 = 0; i10 < this.f82566c; i10++) {
            if (this.f82565b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f82566c; i11++) {
            i10 = (i10 * 31) + this.f82565b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f82566c;
    }

    static {
        D0 d02 = new D0(new int[0], 0);
        f82564d = d02;
        d02.zzb();
    }

    private D0(int[] iArr, int i10) {
        this.f82565b = iArr;
        this.f82566c = i10;
    }

    private final String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f82566c;
    }

    private final void zzi(int i10) {
        if (i10 < 0 || i10 >= this.f82566c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f82566c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f82565b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zza();
        zzi(i10);
        int[] iArr = this.f82565b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // com.google.android.gms.internal.pal.I0
    public final /* bridge */ /* synthetic */ I0 zzd(int i10) {
        if (i10 >= this.f82566c) {
            return new D0(Arrays.copyOf(this.f82565b, i10), this.f82566c);
        }
        throw new IllegalArgumentException();
    }

    public final int a(int i10) {
        zzi(i10);
        return this.f82565b[i10];
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        J0.e(collection);
        if (!(collection instanceof D0)) {
            return super.addAll(collection);
        }
        D0 d02 = (D0) collection;
        int i10 = d02.f82566c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f82566c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f82565b;
            if (i12 > iArr.length) {
                this.f82565b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(d02.f82565b, 0, this.f82565b, this.f82566c, d02.f82566c);
            this.f82566c = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void f(int i10) {
        zza();
        int i11 = this.f82566c;
        int[] iArr = this.f82565b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f82565b = iArr2;
        }
        int[] iArr3 = this.f82565b;
        int i12 = this.f82566c;
        this.f82566c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzi(i10);
        return Integer.valueOf(this.f82565b[i10]);
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        zzi(i10);
        int[] iArr = this.f82565b;
        int i11 = iArr[i10];
        if (i10 < this.f82566c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f82566c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            int[] iArr = this.f82565b;
            System.arraycopy(iArr, i11, iArr, i10, this.f82566c - i11);
            this.f82566c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
