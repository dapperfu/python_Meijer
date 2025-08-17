package com.google.android.gms.internal.atv_ads_framework;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.e1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10214e1 extends AbstractC10213e0 implements RandomAccess, R0, InterfaceC10267w1 {

    /* renamed from: d, reason: collision with root package name */
    private static final C10214e1 f80972d = new C10214e1(new long[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private long[] f80973b;

    /* renamed from: c, reason: collision with root package name */
    private int f80974c;

    C10214e1() {
        this(new long[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.f80974c)) {
            throw new IndexOutOfBoundsException(e(i10));
        }
        long[] jArr = this.f80973b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f80973b, i10, jArr2, i10 + 1, this.f80974c - i10);
            this.f80973b = jArr2;
        }
        this.f80973b[i10] = jLongValue;
        this.f80974c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10213e0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10214e1)) {
            return super.equals(obj);
        }
        C10214e1 c10214e1 = (C10214e1) obj;
        if (this.f80974c != c10214e1.f80974c) {
            return false;
        }
        long[] jArr = c10214e1.f80973b;
        for (int i10 = 0; i10 < this.f80974c; i10++) {
            if (this.f80973b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10213e0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f80974c; i11++) {
            long j10 = this.f80973b[i11];
            byte[] bArr = S0.f80875d;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f80974c;
    }

    private C10214e1(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f80973b = jArr;
        this.f80974c = i10;
    }

    private final String e(int i10) {
        return "Index:" + i10 + ", Size:" + this.f80974c;
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= this.f80974c) {
            throw new IndexOutOfBoundsException(e(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f80974c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f80973b[i11] == jLongValue) {
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
        long[] jArr = this.f80973b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.R0
    public final /* bridge */ /* synthetic */ R0 zzg(int i10) {
        if (i10 >= this.f80974c) {
            return new C10214e1(Arrays.copyOf(this.f80973b, i10), this.f80974c, true);
        }
        throw new IllegalArgumentException();
    }

    public final long a(int i10) {
        f(i10);
        return this.f80973b[i10];
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10213e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = S0.f80875d;
        collection.getClass();
        if (!(collection instanceof C10214e1)) {
            return super.addAll(collection);
        }
        C10214e1 c10214e1 = (C10214e1) collection;
        int i10 = c10214e1.f80974c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f80974c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f80973b;
            if (i12 > jArr.length) {
                this.f80973b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(c10214e1.f80973b, 0, this.f80973b, this.f80974c, c10214e1.f80974c);
            this.f80974c = i12;
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
        return Long.valueOf(this.f80973b[i10]);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10213e0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        f(i10);
        long[] jArr = this.f80973b;
        long j10 = jArr[i10];
        if (i10 < this.f80974c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f80974c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            long[] jArr = this.f80973b;
            System.arraycopy(jArr, i11, jArr, i10, this.f80974c - i11);
            this.f80974c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10213e0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        int i10 = this.f80974c;
        long[] jArr = this.f80973b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f80973b = jArr2;
        }
        long[] jArr3 = this.f80973b;
        int i11 = this.f80974c;
        this.f80974c = i11 + 1;
        jArr3[i11] = jLongValue;
        return true;
    }
}
