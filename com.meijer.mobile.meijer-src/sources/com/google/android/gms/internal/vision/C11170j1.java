package com.google.android.gms.internal.vision;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.j1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11170j1 extends AbstractC11133a0<Long> implements X0<Long>, H1, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final C11170j1 f85400d;

    /* renamed from: b, reason: collision with root package name */
    private long[] f85401b;

    /* renamed from: c, reason: collision with root package name */
    private int f85402c;

    C11170j1() {
        this(new long[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f85402c)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        long[] jArr = this.f85401b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f85401b, i10, jArr2, i10 + 1, this.f85402c - i10);
            this.f85401b = jArr2;
        }
        this.f85401b[i10] = jLongValue;
        this.f85402c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11133a0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11170j1)) {
            return super.equals(obj);
        }
        C11170j1 c11170j1 = (C11170j1) obj;
        if (this.f85402c != c11170j1.f85402c) {
            return false;
        }
        long[] jArr = c11170j1.f85401b;
        for (int i10 = 0; i10 < this.f85402c; i10++) {
            if (this.f85401b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11133a0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i10 = 0; i10 < this.f85402c; i10++) {
            iB = (iB * 31) + S0.b(this.f85401b[i10]);
        }
        return iB;
    }

    static {
        C11170j1 c11170j1 = new C11170j1(new long[0], 0);
        f85400d = c11170j1;
        c11170j1.zzb();
    }

    private C11170j1(long[] jArr, int i10) {
        this.f85401b = jArr;
        this.f85402c = i10;
    }

    private final void h(int i10) {
        if (i10 < 0 || i10 >= this.f85402c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private final String k(int i10) {
        int i11 = this.f85402c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f85401b[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        h(i10);
        long[] jArr = this.f85401b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f85402c;
    }

    @Override // com.google.android.gms.internal.vision.X0
    public final /* synthetic */ X0<Long> zza(int i10) {
        if (i10 >= this.f85402c) {
            return new C11170j1(Arrays.copyOf(this.f85401b, i10), this.f85402c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11133a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        S0.d(collection);
        if (!(collection instanceof C11170j1)) {
            return super.addAll(collection);
        }
        C11170j1 c11170j1 = (C11170j1) collection;
        int i10 = c11170j1.f85402c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f85402c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f85401b;
            if (i12 > jArr.length) {
                this.f85401b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(c11170j1.f85401b, 0, this.f85401b, this.f85402c, c11170j1.f85402c);
            this.f85402c = i12;
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
        a();
        int i10 = this.f85402c;
        long[] jArr = this.f85401b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f85401b = jArr2;
        }
        long[] jArr3 = this.f85401b;
        int i11 = this.f85402c;
        this.f85402c = i11 + 1;
        jArr3[i11] = j10;
    }

    public final long f(int i10) {
        h(i10);
        return this.f85401b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return Long.valueOf(f(i10));
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11133a0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        a();
        h(i10);
        long[] jArr = this.f85401b;
        long j10 = jArr[i10];
        if (i10 < this.f85402c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f85402c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            long[] jArr = this.f85401b;
            System.arraycopy(jArr, i11, jArr, i10, this.f85402c - i11);
            this.f85402c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11133a0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
