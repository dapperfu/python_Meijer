package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10345x extends AbstractC10333t<Boolean> implements InterfaceC10308k0<Boolean>, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final C10345x f81600d;

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f81601b;

    /* renamed from: c, reason: collision with root package name */
    private int f81602c;

    static {
        C10345x c10345x = new C10345x();
        f81600d = c10345x;
        c10345x.zzv();
    }

    C10345x() {
        this(new boolean[10], 0);
    }

    private final void f(int i10, boolean z10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f81602c)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        boolean[] zArr = this.f81601b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f81601b, i10, zArr2, i10 + 1, this.f81602c - i10);
            this.f81601b = zArr2;
        }
        this.f81601b[i10] = z10;
        this.f81602c++;
        ((AbstractList) this).modCount++;
    }

    private final void h(int i10) {
        if (i10 < 0 || i10 >= this.f81602c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private final String k(int i10) {
        int i11 = this.f81602c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        f(i10, ((Boolean) obj).booleanValue());
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        C10299h0.a(collection);
        if (!(collection instanceof C10345x)) {
            return super.addAll(collection);
        }
        C10345x c10345x = (C10345x) collection;
        int i10 = c10345x.f81602c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f81602c;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f81601b;
        if (i12 > zArr.length) {
            this.f81601b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c10345x.f81601b, 0, this.f81601b, this.f81602c, c10345x.f81602c);
        this.f81602c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(boolean z10) {
        f(this.f81602c, z10);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10345x)) {
            return super.equals(obj);
        }
        C10345x c10345x = (C10345x) obj;
        if (this.f81602c != c10345x.f81602c) {
            return false;
        }
        boolean[] zArr = c10345x.f81601b;
        for (int i10 = 0; i10 < this.f81602c; i10++) {
            if (this.f81601b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        h(i10);
        return Boolean.valueOf(this.f81601b[i10]);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f81602c; i10++) {
            iF = (iF * 31) + C10299h0.f(this.f81601b[i10]);
        }
        return iF;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        a();
        h(i10);
        boolean[] zArr = this.f81601b;
        boolean z10 = zArr[i10];
        int i11 = this.f81602c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, i11 - i10);
        }
        this.f81602c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f81601b;
        System.arraycopy(zArr, i11, zArr, i10, this.f81602c - i11);
        this.f81602c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        h(i10);
        boolean[] zArr = this.f81601b;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f81602c;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10308k0
    public final /* synthetic */ InterfaceC10308k0<Boolean> zzi(int i10) {
        if (i10 >= this.f81602c) {
            return new C10345x(Arrays.copyOf(this.f81601b, i10), this.f81602c);
        }
        throw new IllegalArgumentException();
    }

    private C10345x(boolean[] zArr, int i10) {
        this.f81601b = zArr;
        this.f81602c = i10;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f81602c; i10++) {
            if (obj.equals(Boolean.valueOf(this.f81601b[i10]))) {
                boolean[] zArr = this.f81601b;
                System.arraycopy(zArr, i10 + 1, zArr, i10, this.f81602c - i10);
                this.f81602c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
