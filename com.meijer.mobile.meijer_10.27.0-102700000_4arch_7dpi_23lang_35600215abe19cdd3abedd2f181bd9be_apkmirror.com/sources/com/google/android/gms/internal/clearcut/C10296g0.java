package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.g0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10296g0 extends AbstractC10333t<Integer> implements InterfaceC10308k0<Integer>, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final C10296g0 f81458d;

    /* renamed from: b, reason: collision with root package name */
    private int[] f81459b;

    /* renamed from: c, reason: collision with root package name */
    private int f81460c;

    static {
        C10296g0 c10296g0 = new C10296g0();
        f81458d = c10296g0;
        c10296g0.zzv();
    }

    C10296g0() {
        this(new int[10], 0);
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= this.f81460c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    private final String h(int i10) {
        int i11 = this.f81460c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    private final void k(int i10, int i11) {
        int i12;
        a();
        if (i10 < 0 || i10 > (i12 = this.f81460c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        int[] iArr = this.f81459b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f81459b, i10, iArr2, i10 + 1, this.f81460c - i10);
            this.f81459b = iArr2;
        }
        this.f81459b[i10] = i11;
        this.f81460c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        k(i10, ((Integer) obj).intValue());
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        C10299h0.a(collection);
        if (!(collection instanceof C10296g0)) {
            return super.addAll(collection);
        }
        C10296g0 c10296g0 = (C10296g0) collection;
        int i10 = c10296g0.f81460c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f81460c;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f81459b;
        if (i12 > iArr.length) {
            this.f81459b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c10296g0.f81459b, 0, this.f81459b, this.f81460c, c10296g0.f81460c);
        this.f81460c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(int i10) {
        k(this.f81460c, i10);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10296g0)) {
            return super.equals(obj);
        }
        C10296g0 c10296g0 = (C10296g0) obj;
        if (this.f81460c != c10296g0.f81460c) {
            return false;
        }
        int[] iArr = c10296g0.f81459b;
        for (int i10 = 0; i10 < this.f81460c; i10++) {
            if (this.f81459b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    public final int getInt(int i10) {
        f(i10);
        return this.f81459b[i10];
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f81460c; i11++) {
            i10 = (i10 * 31) + this.f81459b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        a();
        f(i10);
        int[] iArr = this.f81459b;
        int i11 = iArr[i10];
        int i12 = this.f81460c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, i12 - i10);
        }
        this.f81460c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f81459b;
        System.arraycopy(iArr, i11, iArr, i10, this.f81460c - i11);
        this.f81460c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        f(i10);
        int[] iArr = this.f81459b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f81460c;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10308k0
    public final /* synthetic */ InterfaceC10308k0<Integer> zzi(int i10) {
        if (i10 >= this.f81460c) {
            return new C10296g0(Arrays.copyOf(this.f81459b, i10), this.f81460c);
        }
        throw new IllegalArgumentException();
    }

    private C10296g0(int[] iArr, int i10) {
        this.f81459b = iArr;
        this.f81460c = i10;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f81460c; i10++) {
            if (obj.equals(Integer.valueOf(this.f81459b[i10]))) {
                int[] iArr = this.f81459b;
                System.arraycopy(iArr, i10 + 1, iArr, i10, this.f81460c - i10);
                this.f81460c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
