package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.ev0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7945ev0 extends Kt0 implements RandomAccess, Ru0, InterfaceC9975xv0 {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f73952d;

    /* renamed from: e, reason: collision with root package name */
    private static final C7945ev0 f73953e;

    /* renamed from: b, reason: collision with root package name */
    private long[] f73954b;

    /* renamed from: c, reason: collision with root package name */
    private int f73955c;

    static {
        long[] jArr = new long[0];
        f73952d = jArr;
        f73953e = new C7945ev0(jArr, 0, false);
    }

    C7945ev0() {
        this(f73952d, 0, true);
    }

    public static C7945ev0 k() {
        return f73953e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f73955c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f73954b;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[l(length)];
            System.arraycopy(this.f73954b, 0, jArr2, 0, i10);
            System.arraycopy(this.f73954b, i10, jArr2, i12, this.f73955c - i10);
            this.f73954b = jArr2;
        }
        this.f73954b[i10] = jLongValue;
        this.f73955c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7945ev0)) {
            return super.equals(obj);
        }
        C7945ev0 c7945ev0 = (C7945ev0) obj;
        if (this.f73955c != c7945ev0.f73955c) {
            return false;
        }
        long[] jArr = c7945ev0.f73954b;
        for (int i10 = 0; i10 < this.f73955c; i10++) {
            if (this.f73954b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f73955c; i11++) {
            long j10 = this.f73954b[i11];
            byte[] bArr = Tu0.f70473b;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f73955c;
    }

    private C7945ev0(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f73954b = jArr;
        this.f73955c = i10;
    }

    private static int l(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f73955c;
    }

    private final void n(int i10) {
        if (i10 < 0 || i10 >= this.f73955c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f73955c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f73954b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        return Long.valueOf(f(i10, ((Long) obj).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.Su0
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final Ru0 zzf(int i10) {
        if (i10 >= this.f73955c) {
            return new C7945ev0(i10 == 0 ? f73952d : Arrays.copyOf(this.f73954b, i10), this.f73955c, true);
        }
        throw new IllegalArgumentException();
    }

    final void zzi(int i10) {
        int length = this.f73954b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f73954b = new long[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = l(length);
        }
        this.f73954b = Arrays.copyOf(this.f73954b, length);
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = Tu0.f70473b;
        collection.getClass();
        if (!(collection instanceof C7945ev0)) {
            return super.addAll(collection);
        }
        C7945ev0 c7945ev0 = (C7945ev0) collection;
        int i10 = c7945ev0.f73955c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f73955c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f73954b;
            if (i12 > jArr.length) {
                this.f73954b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(c7945ev0.f73954b, 0, this.f73954b, this.f73955c, c7945ev0.f73955c);
            this.f73955c = i12;
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

    public final long e(int i10) {
        n(i10);
        return this.f73954b[i10];
    }

    public final long f(int i10, long j10) {
        a();
        n(i10);
        long[] jArr = this.f73954b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        n(i10);
        return Long.valueOf(this.f73954b[i10]);
    }

    public final void h(long j10) {
        a();
        int i10 = this.f73955c;
        int length = this.f73954b.length;
        if (i10 == length) {
            long[] jArr = new long[l(length)];
            System.arraycopy(this.f73954b, 0, jArr, 0, this.f73955c);
            this.f73954b = jArr;
        }
        long[] jArr2 = this.f73954b;
        int i11 = this.f73955c;
        this.f73955c = i11 + 1;
        jArr2[i11] = j10;
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        n(i10);
        long[] jArr = this.f73954b;
        long j10 = jArr[i10];
        if (i10 < this.f73955c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f73955c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            long[] jArr = this.f73954b;
            System.arraycopy(jArr, i11, jArr, i10, this.f73955c - i11);
            this.f73955c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }
}
