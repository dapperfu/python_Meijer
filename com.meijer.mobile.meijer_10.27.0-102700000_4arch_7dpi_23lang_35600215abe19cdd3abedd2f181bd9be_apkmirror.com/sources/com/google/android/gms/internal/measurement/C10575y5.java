package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.a;
import fsimpl.C14045dq;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.y5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10575y5 extends AbstractC10520s4 implements RandomAccess, InterfaceC10468m5, R5 {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f82460d;

    /* renamed from: e, reason: collision with root package name */
    private static final C10575y5 f82461e;

    /* renamed from: b, reason: collision with root package name */
    private long[] f82462b;

    /* renamed from: c, reason: collision with root package name */
    private int f82463c;

    static {
        long[] jArr = new long[0];
        f82460d = jArr;
        f82461e = new C10575y5(jArr, 0, false);
    }

    C10575y5() {
        this(f82460d, 0, true);
    }

    public static C10575y5 e() {
        return f82461e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f82463c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f82462b;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[h(length)];
            System.arraycopy(this.f82462b, 0, jArr2, 0, i10);
            System.arraycopy(this.f82462b, i10, jArr2, i12, this.f82463c - i10);
            this.f82462b = jArr2;
        }
        this.f82462b[i10] = jLongValue;
        this.f82463c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10520s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10575y5)) {
            return super.equals(obj);
        }
        C10575y5 c10575y5 = (C10575y5) obj;
        if (this.f82463c != c10575y5.f82463c) {
            return false;
        }
        long[] jArr = c10575y5.f82462b;
        for (int i10 = 0; i10 < this.f82463c; i10++) {
            if (this.f82462b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10520s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f82463c; i11++) {
            long j10 = this.f82462b[i11];
            byte[] bArr = C10486o5.f82316b;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f82463c;
    }

    private C10575y5(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f82462b = jArr;
        this.f82463c = i10;
    }

    private static int h(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f82463c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private final String l(int i10) {
        return C10538u4.a(this.f82463c, i10, C14045dq.DARKEN, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f82463c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f82462b[i11] == jLongValue) {
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
        long[] jArr = this.f82462b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10477n5
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final InterfaceC10468m5 zzg(int i10) {
        if (i10 >= this.f82463c) {
            return new C10575y5(i10 == 0 ? f82460d : Arrays.copyOf(this.f82462b, i10), this.f82463c, true);
        }
        throw new IllegalArgumentException();
    }

    final void zzh(int i10) {
        int length = this.f82462b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f82462b = new long[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = h(length);
        }
        this.f82462b = Arrays.copyOf(this.f82462b, length);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10520s4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = C10486o5.f82316b;
        collection.getClass();
        if (!(collection instanceof C10575y5)) {
            return super.addAll(collection);
        }
        C10575y5 c10575y5 = (C10575y5) collection;
        int i10 = c10575y5.f82463c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f82463c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f82462b;
            if (i12 > jArr.length) {
                this.f82462b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(c10575y5.f82462b, 0, this.f82462b, this.f82463c, c10575y5.f82463c);
            this.f82463c = i12;
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
        int i10 = this.f82463c;
        int length = this.f82462b.length;
        if (i10 == length) {
            long[] jArr = new long[h(length)];
            System.arraycopy(this.f82462b, 0, jArr, 0, this.f82463c);
            this.f82462b = jArr;
        }
        long[] jArr2 = this.f82462b;
        int i11 = this.f82463c;
        this.f82463c = i11 + 1;
        jArr2[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Long.valueOf(this.f82462b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10520s4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        k(i10);
        long[] jArr = this.f82462b;
        long j10 = jArr[i10];
        if (i10 < this.f82463c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f82463c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            long[] jArr = this.f82462b;
            System.arraycopy(jArr, i11, jArr, i10, this.f82463c - i11);
            this.f82463c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10468m5
    public final long zzc(int i10) {
        k(i10);
        return this.f82462b[i10];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}
