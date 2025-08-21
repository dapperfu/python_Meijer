package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.a;
import com.google.crypto.tink.shaded.protobuf.C11454z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes8.dex */
final class H extends AbstractC11432c<Long> implements C11454z.h, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final H f89112d = new H(new long[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private long[] f89113b;

    /* renamed from: c, reason: collision with root package name */
    private int f89114c;

    H() {
        this(new long[10], 0, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11432c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return super.equals(obj);
        }
        H h10 = (H) obj;
        if (this.f89114c != h10.f89114c) {
            return false;
        }
        long[] jArr = h10.f89113b;
        for (int i10 = 0; i10 < this.f89114c; i10++) {
            if (this.f89113b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11432c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f89114c; i10++) {
            iF = (iF * 31) + C11454z.f(this.f89113b[i10]);
        }
        return iF;
    }

    private H(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f89113b = jArr;
        this.f89114c = i10;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f89114c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f89114c;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f89113b[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C11454z.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C11454z.h b(int i10) {
        if (i10 >= this.f89114c) {
            return new H(Arrays.copyOf(this.f89113b, i10), this.f89114c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f89114c;
    }

    private void h(int i10, long j10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f89114c)) {
            long[] jArr = this.f89113b;
            if (i11 < jArr.length) {
                System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
            } else {
                long[] jArr2 = new long[((i11 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i10);
                System.arraycopy(this.f89113b, i10, jArr2, i10 + 1, this.f89114c - i10);
                this.f89113b = jArr2;
            }
            this.f89113b[i10] = j10;
            this.f89114c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(o(i10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11432c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        a();
        C11454z.a(collection);
        if (!(collection instanceof H)) {
            return super.addAll(collection);
        }
        H h10 = (H) collection;
        int i10 = h10.f89114c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f89114c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f89113b;
            if (i12 > jArr.length) {
                this.f89113b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(h10.f89113b, 0, this.f89113b, this.f89114c, h10.f89114c);
            this.f89114c = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Long l10) {
        h(i10, l10.longValue());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        k(l10.longValue());
        return true;
    }

    public void k(long j10) {
        a();
        int i10 = this.f89114c;
        long[] jArr = this.f89113b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f89113b = jArr2;
        }
        long[] jArr3 = this.f89113b;
        int i11 = this.f89114c;
        this.f89114c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(n(i10));
    }

    public long n(int i10) {
        l(i10);
        return this.f89113b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11432c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        a();
        l(i10);
        long[] jArr = this.f89113b;
        long j10 = jArr[i10];
        if (i10 < this.f89114c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f89114c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(s(i10, l10.longValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            long[] jArr = this.f89113b;
            System.arraycopy(jArr, i11, jArr, i10, this.f89114c - i11);
            this.f89114c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public long s(int i10, long j10) {
        a();
        l(i10);
        long[] jArr = this.f89113b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }
}
