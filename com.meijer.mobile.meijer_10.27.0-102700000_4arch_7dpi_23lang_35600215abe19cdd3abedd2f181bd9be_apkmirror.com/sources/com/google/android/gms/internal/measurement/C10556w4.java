package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.a;
import fsimpl.C14045dq;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.w4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10556w4 extends AbstractC10520s4 implements RandomAccess, InterfaceC10414g5, R5 {

    /* renamed from: d, reason: collision with root package name */
    private static final boolean[] f82447d;

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f82448b;

    /* renamed from: c, reason: collision with root package name */
    private int f82449c;

    static {
        boolean[] zArr = new boolean[0];
        f82447d = zArr;
        new C10556w4(zArr, 0, false);
    }

    C10556w4() {
        this(f82447d, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f82449c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int i12 = i10 + 1;
        boolean[] zArr = this.f82448b;
        int length = zArr.length;
        if (i11 < length) {
            System.arraycopy(zArr, i10, zArr, i12, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[k(length)];
            System.arraycopy(this.f82448b, 0, zArr2, 0, i10);
            System.arraycopy(this.f82448b, i10, zArr2, i12, this.f82449c - i10);
            this.f82448b = zArr2;
        }
        this.f82448b[i10] = zBooleanValue;
        this.f82449c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10520s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10556w4)) {
            return super.equals(obj);
        }
        C10556w4 c10556w4 = (C10556w4) obj;
        if (this.f82449c != c10556w4.f82449c) {
            return false;
        }
        boolean[] zArr = c10556w4.f82448b;
        for (int i10 = 0; i10 < this.f82449c; i10++) {
            if (this.f82448b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10520s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i10 = 0; i10 < this.f82449c; i10++) {
            iB = (iB * 31) + C10486o5.b(this.f82448b[i10]);
        }
        return iB;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f82449c;
    }

    private C10556w4(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f82448b = zArr;
        this.f82449c = i10;
    }

    private static int k(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String l(int i10) {
        return C10538u4.a(this.f82449c, i10, C14045dq.DARKEN, "Index:", ", Size:");
    }

    private final void zzi(int i10) {
        if (i10 < 0 || i10 >= this.f82449c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10477n5
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final InterfaceC10414g5 zzg(int i10) {
        if (i10 >= this.f82449c) {
            return new C10556w4(i10 == 0 ? f82447d : Arrays.copyOf(this.f82448b, i10), this.f82449c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f82449c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f82448b[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        zzi(i10);
        boolean[] zArr = this.f82448b;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10520s4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = C10486o5.f82316b;
        collection.getClass();
        if (!(collection instanceof C10556w4)) {
            return super.addAll(collection);
        }
        C10556w4 c10556w4 = (C10556w4) collection;
        int i10 = c10556w4.f82449c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f82449c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f82448b;
            if (i12 > zArr.length) {
                this.f82448b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(c10556w4.f82448b, 0, this.f82448b, this.f82449c, c10556w4.f82449c);
            this.f82449c = i12;
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

    public final boolean f(int i10) {
        zzi(i10);
        return this.f82448b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzi(i10);
        return Boolean.valueOf(this.f82448b[i10]);
    }

    public final void h(boolean z10) {
        a();
        int i10 = this.f82449c;
        int length = this.f82448b.length;
        if (i10 == length) {
            boolean[] zArr = new boolean[k(length)];
            System.arraycopy(this.f82448b, 0, zArr, 0, this.f82449c);
            this.f82448b = zArr;
        }
        boolean[] zArr2 = this.f82448b;
        int i11 = this.f82449c;
        this.f82449c = i11 + 1;
        zArr2[i11] = z10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10520s4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        zzi(i10);
        boolean[] zArr = this.f82448b;
        boolean z10 = zArr[i10];
        if (i10 < this.f82449c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f82449c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            boolean[] zArr = this.f82448b;
            System.arraycopy(zArr, i11, zArr, i10, this.f82449c - i11);
            this.f82449c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Boolean) obj).booleanValue());
        return true;
    }
}
