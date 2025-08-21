package com.google.android.gms.internal.pal;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class U0 extends L implements RandomAccess, I0, InterfaceC10927n1 {

    /* renamed from: d, reason: collision with root package name */
    private static final U0 f83736d;

    /* renamed from: b, reason: collision with root package name */
    private long[] f83737b;

    /* renamed from: c, reason: collision with root package name */
    private int f83738c;

    U0() {
        this(new long[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.f83738c)) {
            throw new IndexOutOfBoundsException(f(i10));
        }
        long[] jArr = this.f83737b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f83737b, i10, jArr2, i10 + 1, this.f83738c - i10);
            this.f83737b = jArr2;
        }
        this.f83737b[i10] = jLongValue;
        this.f83738c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U0)) {
            return super.equals(obj);
        }
        U0 u02 = (U0) obj;
        if (this.f83738c != u02.f83738c) {
            return false;
        }
        long[] jArr = u02.f83737b;
        for (int i10 = 0; i10 < this.f83738c; i10++) {
            if (this.f83737b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iC = 1;
        for (int i10 = 0; i10 < this.f83738c; i10++) {
            iC = (iC * 31) + J0.c(this.f83737b[i10]);
        }
        return iC;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f83738c;
    }

    static {
        U0 u02 = new U0(new long[0], 0);
        f83736d = u02;
        u02.zzb();
    }

    private U0(long[] jArr, int i10) {
        this.f83737b = jArr;
        this.f83738c = i10;
    }

    private final String f(int i10) {
        return "Index:" + i10 + ", Size:" + this.f83738c;
    }

    private final void zzh(int i10) {
        if (i10 < 0 || i10 >= this.f83738c) {
            throw new IndexOutOfBoundsException(f(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f83738c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f83737b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        zzh(i10);
        long[] jArr = this.f83737b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // com.google.android.gms.internal.pal.I0
    public final /* bridge */ /* synthetic */ I0 zzd(int i10) {
        if (i10 >= this.f83738c) {
            return new U0(Arrays.copyOf(this.f83737b, i10), this.f83738c);
        }
        throw new IllegalArgumentException();
    }

    public final long a(int i10) {
        zzh(i10);
        return this.f83737b[i10];
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        J0.e(collection);
        if (!(collection instanceof U0)) {
            return super.addAll(collection);
        }
        U0 u02 = (U0) collection;
        int i10 = u02.f83738c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f83738c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f83737b;
            if (i12 > jArr.length) {
                this.f83737b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(u02.f83737b, 0, this.f83737b, this.f83738c, u02.f83738c);
            this.f83738c = i12;
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

    public final void e(long j10) {
        zza();
        int i10 = this.f83738c;
        long[] jArr = this.f83737b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f83737b = jArr2;
        }
        long[] jArr3 = this.f83737b;
        int i11 = this.f83738c;
        this.f83738c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzh(i10);
        return Long.valueOf(this.f83737b[i10]);
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        zzh(i10);
        long[] jArr = this.f83737b;
        long j10 = jArr[i10];
        if (i10 < this.f83738c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f83738c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            long[] jArr = this.f83737b;
            System.arraycopy(jArr, i11, jArr, i10, this.f83738c - i11);
            this.f83738c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
