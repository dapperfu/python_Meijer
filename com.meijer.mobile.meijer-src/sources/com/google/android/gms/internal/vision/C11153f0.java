package com.google.android.gms.internal.vision;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.f0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11153f0 extends AbstractC11133a0<Boolean> implements X0<Boolean>, H1, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final C11153f0 f85374d;

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f85375b;

    /* renamed from: c, reason: collision with root package name */
    private int f85376c;

    C11153f0() {
        this(new boolean[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f85376c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        boolean[] zArr = this.f85375b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f85375b, i10, zArr2, i10 + 1, this.f85376c - i10);
            this.f85375b = zArr2;
        }
        this.f85375b[i10] = zBooleanValue;
        this.f85376c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11133a0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11153f0)) {
            return super.equals(obj);
        }
        C11153f0 c11153f0 = (C11153f0) obj;
        if (this.f85376c != c11153f0.f85376c) {
            return false;
        }
        boolean[] zArr = c11153f0.f85375b;
        for (int i10 = 0; i10 < this.f85376c; i10++) {
            if (this.f85375b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11133a0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iC = 1;
        for (int i10 = 0; i10 < this.f85376c; i10++) {
            iC = (iC * 31) + S0.c(this.f85375b[i10]);
        }
        return iC;
    }

    static {
        C11153f0 c11153f0 = new C11153f0(new boolean[0], 0);
        f85374d = c11153f0;
        c11153f0.zzb();
    }

    private C11153f0(boolean[] zArr, int i10) {
        this.f85375b = zArr;
        this.f85376c = i10;
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= this.f85376c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    private final String h(int i10) {
        int i11 = this.f85376c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f85375b[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        f(i10);
        boolean[] zArr = this.f85375b;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f85376c;
    }

    @Override // com.google.android.gms.internal.vision.X0
    public final /* synthetic */ X0<Boolean> zza(int i10) {
        if (i10 >= this.f85376c) {
            return new C11153f0(Arrays.copyOf(this.f85375b, i10), this.f85376c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11133a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        S0.d(collection);
        if (!(collection instanceof C11153f0)) {
            return super.addAll(collection);
        }
        C11153f0 c11153f0 = (C11153f0) collection;
        int i10 = c11153f0.f85376c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f85376c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f85375b;
            if (i12 > zArr.length) {
                this.f85375b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(c11153f0.f85375b, 0, this.f85375b, this.f85376c, c11153f0.f85376c);
            this.f85376c = i12;
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

    public final void e(boolean z10) {
        a();
        int i10 = this.f85376c;
        boolean[] zArr = this.f85375b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f85375b = zArr2;
        }
        boolean[] zArr3 = this.f85375b;
        int i11 = this.f85376c;
        this.f85376c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        f(i10);
        return Boolean.valueOf(this.f85375b[i10]);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11133a0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        a();
        f(i10);
        boolean[] zArr = this.f85375b;
        boolean z10 = zArr[i10];
        if (i10 < this.f85376c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f85376c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            boolean[] zArr = this.f85375b;
            System.arraycopy(zArr, i11, zArr, i10, this.f85376c - i11);
            this.f85376c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11133a0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }
}
