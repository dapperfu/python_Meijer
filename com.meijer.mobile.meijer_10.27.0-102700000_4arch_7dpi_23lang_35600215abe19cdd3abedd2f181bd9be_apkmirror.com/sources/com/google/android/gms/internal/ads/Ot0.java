package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class Ot0 extends Kt0 implements RandomAccess, Iu0, InterfaceC9975xv0 {

    /* renamed from: d, reason: collision with root package name */
    private static final boolean[] f69193d;

    /* renamed from: e, reason: collision with root package name */
    private static final Ot0 f69194e;

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f69195b;

    /* renamed from: c, reason: collision with root package name */
    private int f69196c;

    static {
        boolean[] zArr = new boolean[0];
        f69193d = zArr;
        f69194e = new Ot0(zArr, 0, false);
    }

    Ot0() {
        this(f69193d, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f69196c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int i12 = i10 + 1;
        boolean[] zArr = this.f69195b;
        int length = zArr.length;
        if (i11 < length) {
            System.arraycopy(zArr, i10, zArr, i12, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[k(length)];
            System.arraycopy(this.f69195b, 0, zArr2, 0, i10);
            System.arraycopy(this.f69195b, i10, zArr2, i12, this.f69196c - i10);
            this.f69195b = zArr2;
        }
        this.f69195b[i10] = zBooleanValue;
        this.f69196c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ot0)) {
            return super.equals(obj);
        }
        Ot0 ot0 = (Ot0) obj;
        if (this.f69196c != ot0.f69196c) {
            return false;
        }
        boolean[] zArr = ot0.f69195b;
        for (int i10 = 0; i10 < this.f69196c; i10++) {
            if (this.f69195b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i10 = 0; i10 < this.f69196c; i10++) {
            iA = (iA * 31) + Tu0.a(this.f69195b[i10]);
        }
        return iA;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f69196c;
    }

    private Ot0(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f69195b = zArr;
        this.f69196c = i10;
    }

    private static int k(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f69196c;
    }

    private final void m(int i10) {
        if (i10 < 0 || i10 >= this.f69196c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.Su0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Iu0 zzf(int i10) {
        if (i10 >= this.f69196c) {
            return new Ot0(i10 == 0 ? f69193d : Arrays.copyOf(this.f69195b, i10), this.f69196c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f69196c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f69195b[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        m(i10);
        boolean[] zArr = this.f69195b;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = Tu0.f70473b;
        collection.getClass();
        if (!(collection instanceof Ot0)) {
            return super.addAll(collection);
        }
        Ot0 ot0 = (Ot0) collection;
        int i10 = ot0.f69196c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f69196c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f69195b;
            if (i12 > zArr.length) {
                this.f69195b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(ot0.f69195b, 0, this.f69195b, this.f69196c, ot0.f69196c);
            this.f69196c = i12;
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

    public final void f(boolean z10) {
        a();
        int i10 = this.f69196c;
        int length = this.f69195b.length;
        if (i10 == length) {
            boolean[] zArr = new boolean[k(length)];
            System.arraycopy(this.f69195b, 0, zArr, 0, this.f69196c);
            this.f69195b = zArr;
        }
        boolean[] zArr2 = this.f69195b;
        int i11 = this.f69196c;
        this.f69196c = i11 + 1;
        zArr2[i11] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m(i10);
        return Boolean.valueOf(this.f69195b[i10]);
    }

    public final boolean h(int i10) {
        m(i10);
        return this.f69195b[i10];
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        m(i10);
        boolean[] zArr = this.f69195b;
        boolean z10 = zArr[i10];
        if (i10 < this.f69196c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f69196c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            boolean[] zArr = this.f69195b;
            System.arraycopy(zArr, i11, zArr, i10, this.f69196c - i11);
            this.f69196c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Boolean) obj).booleanValue());
        return true;
    }
}
