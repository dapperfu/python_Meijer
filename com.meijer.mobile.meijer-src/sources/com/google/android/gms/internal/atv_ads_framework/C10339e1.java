package com.google.android.gms.internal.atv_ads_framework;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.e1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10339e1 extends AbstractC10338e0 implements RandomAccess, R0, InterfaceC10392w1 {

    /* renamed from: d, reason: collision with root package name */
    private static final C10339e1 f81812d = new C10339e1(new long[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private long[] f81813b;

    /* renamed from: c, reason: collision with root package name */
    private int f81814c;

    C10339e1() {
        this(new long[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.f81814c)) {
            throw new IndexOutOfBoundsException(e(i10));
        }
        long[] jArr = this.f81813b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f81813b, i10, jArr2, i10 + 1, this.f81814c - i10);
            this.f81813b = jArr2;
        }
        this.f81813b[i10] = jLongValue;
        this.f81814c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10338e0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10339e1)) {
            return super.equals(obj);
        }
        C10339e1 c10339e1 = (C10339e1) obj;
        if (this.f81814c != c10339e1.f81814c) {
            return false;
        }
        long[] jArr = c10339e1.f81813b;
        for (int i10 = 0; i10 < this.f81814c; i10++) {
            if (this.f81813b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10338e0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f81814c; i11++) {
            long j10 = this.f81813b[i11];
            byte[] bArr = S0.f81715d;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f81814c;
    }

    private C10339e1(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f81813b = jArr;
        this.f81814c = i10;
    }

    private final String e(int i10) {
        return "Index:" + i10 + ", Size:" + this.f81814c;
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= this.f81814c) {
            throw new IndexOutOfBoundsException(e(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f81814c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f81813b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        f(i10);
        long[] jArr = this.f81813b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.R0
    public final /* bridge */ /* synthetic */ R0 zzg(int i10) {
        if (i10 >= this.f81814c) {
            return new C10339e1(Arrays.copyOf(this.f81813b, i10), this.f81814c, true);
        }
        throw new IllegalArgumentException();
    }

    public final long a(int i10) {
        f(i10);
        return this.f81813b[i10];
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10338e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = S0.f81715d;
        collection.getClass();
        if (!(collection instanceof C10339e1)) {
            return super.addAll(collection);
        }
        C10339e1 c10339e1 = (C10339e1) collection;
        int i10 = c10339e1.f81814c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f81814c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f81813b;
            if (i12 > jArr.length) {
                this.f81813b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(c10339e1.f81813b, 0, this.f81813b, this.f81814c, c10339e1.f81814c);
            this.f81814c = i12;
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
        return Long.valueOf(this.f81813b[i10]);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10338e0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        f(i10);
        long[] jArr = this.f81813b;
        long j10 = jArr[i10];
        if (i10 < this.f81814c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f81814c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            long[] jArr = this.f81813b;
            System.arraycopy(jArr, i11, jArr, i10, this.f81814c - i11);
            this.f81814c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10338e0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        int i10 = this.f81814c;
        long[] jArr = this.f81813b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f81813b = jArr2;
        }
        long[] jArr3 = this.f81813b;
        int i11 = this.f81814c;
        this.f81814c = i11 + 1;
        jArr3[i11] = jLongValue;
        return true;
    }
}
