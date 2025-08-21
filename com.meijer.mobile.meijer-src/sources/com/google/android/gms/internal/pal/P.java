package com.google.android.gms.internal.pal;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class P extends L implements RandomAccess, I0, InterfaceC10927n1 {

    /* renamed from: d, reason: collision with root package name */
    private static final P f83663d;

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f83664b;

    /* renamed from: c, reason: collision with root package name */
    private int f83665c;

    P() {
        this(new boolean[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.f83665c)) {
            throw new IndexOutOfBoundsException(e(i10));
        }
        boolean[] zArr = this.f83664b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f83664b, i10, zArr2, i10 + 1, this.f83665c - i10);
            this.f83664b = zArr2;
        }
        this.f83664b[i10] = zBooleanValue;
        this.f83665c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return super.equals(obj);
        }
        P p10 = (P) obj;
        if (this.f83665c != p10.f83665c) {
            return false;
        }
        boolean[] zArr = p10.f83664b;
        for (int i10 = 0; i10 < this.f83665c; i10++) {
            if (this.f83664b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i10 = 0; i10 < this.f83665c; i10++) {
            iA = (iA * 31) + J0.a(this.f83664b[i10]);
        }
        return iA;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f83665c;
    }

    static {
        P p10 = new P(new boolean[0], 0);
        f83663d = p10;
        p10.zzb();
    }

    private P(boolean[] zArr, int i10) {
        this.f83664b = zArr;
        this.f83665c = i10;
    }

    private final String e(int i10) {
        return "Index:" + i10 + ", Size:" + this.f83665c;
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= this.f83665c) {
            throw new IndexOutOfBoundsException(e(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f83665c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f83664b[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        f(i10);
        boolean[] zArr = this.f83664b;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.internal.pal.I0
    public final /* bridge */ /* synthetic */ I0 zzd(int i10) {
        if (i10 >= this.f83665c) {
            return new P(Arrays.copyOf(this.f83664b, i10), this.f83665c);
        }
        throw new IllegalArgumentException();
    }

    public final void a(boolean z10) {
        zza();
        int i10 = this.f83665c;
        boolean[] zArr = this.f83664b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f83664b = zArr2;
        }
        boolean[] zArr3 = this.f83664b;
        int i11 = this.f83665c;
        this.f83665c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        J0.e(collection);
        if (!(collection instanceof P)) {
            return super.addAll(collection);
        }
        P p10 = (P) collection;
        int i10 = p10.f83665c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f83665c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f83664b;
            if (i12 > zArr.length) {
                this.f83664b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(p10.f83664b, 0, this.f83664b, this.f83665c, p10.f83665c);
            this.f83665c = i12;
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

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        f(i10);
        return Boolean.valueOf(this.f83664b[i10]);
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        f(i10);
        boolean[] zArr = this.f83664b;
        boolean z10 = zArr[i10];
        if (i10 < this.f83665c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f83665c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            boolean[] zArr = this.f83664b;
            System.arraycopy(zArr, i11, zArr, i10, this.f83665c - i11);
            this.f83665c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        a(((Boolean) obj).booleanValue());
        return true;
    }
}
