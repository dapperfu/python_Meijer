package com.google.android.gms.internal.pal;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class U0 extends L implements RandomAccess, I0, InterfaceC10802n1 {

    /* renamed from: d, reason: collision with root package name */
    private static final U0 f82896d;

    /* renamed from: b, reason: collision with root package name */
    private long[] f82897b;

    /* renamed from: c, reason: collision with root package name */
    private int f82898c;

    U0() {
        this(new long[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.f82898c)) {
            throw new IndexOutOfBoundsException(f(i10));
        }
        long[] jArr = this.f82897b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f82897b, i10, jArr2, i10 + 1, this.f82898c - i10);
            this.f82897b = jArr2;
        }
        this.f82897b[i10] = jLongValue;
        this.f82898c++;
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
        if (this.f82898c != u02.f82898c) {
            return false;
        }
        long[] jArr = u02.f82897b;
        for (int i10 = 0; i10 < this.f82898c; i10++) {
            if (this.f82897b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iC = 1;
        for (int i10 = 0; i10 < this.f82898c; i10++) {
            iC = (iC * 31) + J0.c(this.f82897b[i10]);
        }
        return iC;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f82898c;
    }

    static {
        U0 u02 = new U0(new long[0], 0);
        f82896d = u02;
        u02.zzb();
    }

    private U0(long[] jArr, int i10) {
        this.f82897b = jArr;
        this.f82898c = i10;
    }

    private final String f(int i10) {
        return "Index:" + i10 + ", Size:" + this.f82898c;
    }

    private final void zzh(int i10) {
        if (i10 < 0 || i10 >= this.f82898c) {
            throw new IndexOutOfBoundsException(f(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f82898c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f82897b[i11] == jLongValue) {
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
        long[] jArr = this.f82897b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // com.google.android.gms.internal.pal.I0
    public final /* bridge */ /* synthetic */ I0 zzd(int i10) {
        if (i10 >= this.f82898c) {
            return new U0(Arrays.copyOf(this.f82897b, i10), this.f82898c);
        }
        throw new IllegalArgumentException();
    }

    public final long a(int i10) {
        zzh(i10);
        return this.f82897b[i10];
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        J0.e(collection);
        if (!(collection instanceof U0)) {
            return super.addAll(collection);
        }
        U0 u02 = (U0) collection;
        int i10 = u02.f82898c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f82898c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f82897b;
            if (i12 > jArr.length) {
                this.f82897b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(u02.f82897b, 0, this.f82897b, this.f82898c, u02.f82898c);
            this.f82898c = i12;
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
        int i10 = this.f82898c;
        long[] jArr = this.f82897b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f82897b = jArr2;
        }
        long[] jArr3 = this.f82897b;
        int i11 = this.f82898c;
        this.f82898c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzh(i10);
        return Long.valueOf(this.f82897b[i10]);
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        zzh(i10);
        long[] jArr = this.f82897b;
        long j10 = jArr[i10];
        if (i10 < this.f82898c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f82898c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            long[] jArr = this.f82897b;
            System.arraycopy(jArr, i11, jArr, i10, this.f82898c - i11);
            this.f82898c -= i11 - i10;
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
