package com.google.android.gms.internal.vision;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.f0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11028f0 extends AbstractC11008a0<Boolean> implements X0<Boolean>, H1, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final C11028f0 f84534d;

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f84535b;

    /* renamed from: c, reason: collision with root package name */
    private int f84536c;

    C11028f0() {
        this(new boolean[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f84536c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        boolean[] zArr = this.f84535b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f84535b, i10, zArr2, i10 + 1, this.f84536c - i10);
            this.f84535b = zArr2;
        }
        this.f84535b[i10] = zBooleanValue;
        this.f84536c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11028f0)) {
            return super.equals(obj);
        }
        C11028f0 c11028f0 = (C11028f0) obj;
        if (this.f84536c != c11028f0.f84536c) {
            return false;
        }
        boolean[] zArr = c11028f0.f84535b;
        for (int i10 = 0; i10 < this.f84536c; i10++) {
            if (this.f84535b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iC = 1;
        for (int i10 = 0; i10 < this.f84536c; i10++) {
            iC = (iC * 31) + S0.c(this.f84535b[i10]);
        }
        return iC;
    }

    static {
        C11028f0 c11028f0 = new C11028f0(new boolean[0], 0);
        f84534d = c11028f0;
        c11028f0.zzb();
    }

    private C11028f0(boolean[] zArr, int i10) {
        this.f84535b = zArr;
        this.f84536c = i10;
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= this.f84536c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    private final String h(int i10) {
        int i11 = this.f84536c;
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
            if (this.f84535b[i10] == zBooleanValue) {
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
        boolean[] zArr = this.f84535b;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f84536c;
    }

    @Override // com.google.android.gms.internal.vision.X0
    public final /* synthetic */ X0<Boolean> zza(int i10) {
        if (i10 >= this.f84536c) {
            return new C11028f0(Arrays.copyOf(this.f84535b, i10), this.f84536c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        S0.d(collection);
        if (!(collection instanceof C11028f0)) {
            return super.addAll(collection);
        }
        C11028f0 c11028f0 = (C11028f0) collection;
        int i10 = c11028f0.f84536c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f84536c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f84535b;
            if (i12 > zArr.length) {
                this.f84535b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(c11028f0.f84535b, 0, this.f84535b, this.f84536c, c11028f0.f84536c);
            this.f84536c = i12;
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
        int i10 = this.f84536c;
        boolean[] zArr = this.f84535b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f84535b = zArr2;
        }
        boolean[] zArr3 = this.f84535b;
        int i11 = this.f84536c;
        this.f84536c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        f(i10);
        return Boolean.valueOf(this.f84535b[i10]);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        a();
        f(i10);
        boolean[] zArr = this.f84535b;
        boolean z10 = zArr[i10];
        if (i10 < this.f84536c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f84536c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            boolean[] zArr = this.f84535b;
            System.arraycopy(zArr, i11, zArr, i10, this.f84536c - i11);
            this.f84536c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }
}
