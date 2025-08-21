package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.x0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10471x0 extends AbstractC10458t<Long> implements InterfaceC10433k0<Long>, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final C10471x0 f82443d;

    /* renamed from: b, reason: collision with root package name */
    private long[] f82444b;

    /* renamed from: c, reason: collision with root package name */
    private int f82445c;

    static {
        C10471x0 c10471x0 = new C10471x0();
        f82443d = c10471x0;
        c10471x0.zzv();
    }

    C10471x0() {
        this(new long[10], 0);
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= this.f82445c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    private final String h(int i10) {
        int i11 = this.f82445c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    private final void k(int i10, long j10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f82445c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        long[] jArr = this.f82444b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f82444b, i10, jArr2, i10 + 1, this.f82445c - i10);
            this.f82444b = jArr2;
        }
        this.f82444b[i10] = j10;
        this.f82445c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        k(i10, ((Long) obj).longValue());
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10458t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        C10424h0.a(collection);
        if (!(collection instanceof C10471x0)) {
            return super.addAll(collection);
        }
        C10471x0 c10471x0 = (C10471x0) collection;
        int i10 = c10471x0.f82445c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f82445c;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f82444b;
        if (i12 > jArr.length) {
            this.f82444b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c10471x0.f82444b, 0, this.f82444b, this.f82445c, c10471x0.f82445c);
        this.f82445c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long e(int i10) {
        f(i10);
        return this.f82444b[i10];
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10458t, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10471x0)) {
            return super.equals(obj);
        }
        C10471x0 c10471x0 = (C10471x0) obj;
        if (this.f82445c != c10471x0.f82445c) {
            return false;
        }
        long[] jArr = c10471x0.f82444b;
        for (int i10 = 0; i10 < this.f82445c; i10++) {
            if (this.f82444b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return Long.valueOf(e(i10));
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10458t, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iJ = 1;
        for (int i10 = 0; i10 < this.f82445c; i10++) {
            iJ = (iJ * 31) + C10424h0.j(this.f82444b[i10]);
        }
        return iJ;
    }

    public final void l(long j10) {
        k(this.f82445c, j10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        a();
        f(i10);
        long[] jArr = this.f82444b;
        long j10 = jArr[i10];
        int i11 = this.f82445c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, i11 - i10);
        }
        this.f82445c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f82444b;
        System.arraycopy(jArr, i11, jArr, i10, this.f82445c - i11);
        this.f82445c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        f(i10);
        long[] jArr = this.f82444b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f82445c;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10433k0
    public final /* synthetic */ InterfaceC10433k0<Long> zzi(int i10) {
        if (i10 >= this.f82445c) {
            return new C10471x0(Arrays.copyOf(this.f82444b, i10), this.f82445c);
        }
        throw new IllegalArgumentException();
    }

    private C10471x0(long[] jArr, int i10) {
        this.f82444b = jArr;
        this.f82445c = i10;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10458t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f82445c; i10++) {
            if (obj.equals(Long.valueOf(this.f82444b[i10]))) {
                long[] jArr = this.f82444b;
                System.arraycopy(jArr, i10 + 1, jArr, i10, this.f82445c - i10);
                this.f82445c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
