package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.a;
import fsimpl.C14170dq;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.y5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10700y5 extends AbstractC10645s4 implements RandomAccess, InterfaceC10593m5, R5 {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f83300d;

    /* renamed from: e, reason: collision with root package name */
    private static final C10700y5 f83301e;

    /* renamed from: b, reason: collision with root package name */
    private long[] f83302b;

    /* renamed from: c, reason: collision with root package name */
    private int f83303c;

    static {
        long[] jArr = new long[0];
        f83300d = jArr;
        f83301e = new C10700y5(jArr, 0, false);
    }

    C10700y5() {
        this(f83300d, 0, true);
    }

    public static C10700y5 e() {
        return f83301e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f83303c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f83302b;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[h(length)];
            System.arraycopy(this.f83302b, 0, jArr2, 0, i10);
            System.arraycopy(this.f83302b, i10, jArr2, i12, this.f83303c - i10);
            this.f83302b = jArr2;
        }
        this.f83302b[i10] = jLongValue;
        this.f83303c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10645s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10700y5)) {
            return super.equals(obj);
        }
        C10700y5 c10700y5 = (C10700y5) obj;
        if (this.f83303c != c10700y5.f83303c) {
            return false;
        }
        long[] jArr = c10700y5.f83302b;
        for (int i10 = 0; i10 < this.f83303c; i10++) {
            if (this.f83302b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10645s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f83303c; i11++) {
            long j10 = this.f83302b[i11];
            byte[] bArr = C10611o5.f83156b;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f83303c;
    }

    private C10700y5(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f83302b = jArr;
        this.f83303c = i10;
    }

    private static int h(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f83303c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private final String l(int i10) {
        return C10663u4.a(this.f83303c, i10, C14170dq.DARKEN, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f83303c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f83302b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        k(i10);
        long[] jArr = this.f83302b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10602n5
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final InterfaceC10593m5 zzg(int i10) {
        if (i10 >= this.f83303c) {
            return new C10700y5(i10 == 0 ? f83300d : Arrays.copyOf(this.f83302b, i10), this.f83303c, true);
        }
        throw new IllegalArgumentException();
    }

    final void zzh(int i10) {
        int length = this.f83302b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f83302b = new long[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = h(length);
        }
        this.f83302b = Arrays.copyOf(this.f83302b, length);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10645s4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = C10611o5.f83156b;
        collection.getClass();
        if (!(collection instanceof C10700y5)) {
            return super.addAll(collection);
        }
        C10700y5 c10700y5 = (C10700y5) collection;
        int i10 = c10700y5.f83303c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f83303c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f83302b;
            if (i12 > jArr.length) {
                this.f83302b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(c10700y5.f83302b, 0, this.f83302b, this.f83303c, c10700y5.f83303c);
            this.f83303c = i12;
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

    public final void f(long j10) {
        a();
        int i10 = this.f83303c;
        int length = this.f83302b.length;
        if (i10 == length) {
            long[] jArr = new long[h(length)];
            System.arraycopy(this.f83302b, 0, jArr, 0, this.f83303c);
            this.f83302b = jArr;
        }
        long[] jArr2 = this.f83302b;
        int i11 = this.f83303c;
        this.f83303c = i11 + 1;
        jArr2[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Long.valueOf(this.f83302b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10645s4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        k(i10);
        long[] jArr = this.f83302b;
        long j10 = jArr[i10];
        if (i10 < this.f83303c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f83303c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            long[] jArr = this.f83302b;
            System.arraycopy(jArr, i11, jArr, i10, this.f83303c - i11);
            this.f83303c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10593m5
    public final long zzc(int i10) {
        k(i10);
        return this.f83302b[i10];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}
