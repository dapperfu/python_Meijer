package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class Hu0 extends Kt0 implements RandomAccess, Ou0, InterfaceC10100xv0 {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f68355d;

    /* renamed from: e, reason: collision with root package name */
    private static final Hu0 f68356e;

    /* renamed from: b, reason: collision with root package name */
    private int[] f68357b;

    /* renamed from: c, reason: collision with root package name */
    private int f68358c;

    static {
        int[] iArr = new int[0];
        f68355d = iArr;
        f68356e = new Hu0(iArr, 0, false);
    }

    Hu0() {
        this(f68355d, 0, true);
    }

    public static Hu0 h() {
        return f68356e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f68358c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f68357b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[l(length)];
            System.arraycopy(this.f68357b, 0, iArr2, 0, i10);
            System.arraycopy(this.f68357b, i10, iArr2, i12, this.f68358c - i10);
            this.f68357b = iArr2;
        }
        this.f68357b[i10] = iIntValue;
        this.f68358c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hu0)) {
            return super.equals(obj);
        }
        Hu0 hu0 = (Hu0) obj;
        if (this.f68358c != hu0.f68358c) {
            return false;
        }
        int[] iArr = hu0.f68357b;
        for (int i10 = 0; i10 < this.f68358c; i10++) {
            if (this.f68357b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f68358c; i11++) {
            i10 = (i10 * 31) + this.f68357b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f68358c;
    }

    private Hu0(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f68357b = iArr;
        this.f68358c = i10;
    }

    private static int l(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f68358c;
    }

    private final void n(int i10) {
        if (i10 < 0 || i10 >= this.f68358c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f68358c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f68357b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    final void k(int i10) {
        int length = this.f68357b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f68357b = new int[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = l(length);
        }
        this.f68357b = Arrays.copyOf(this.f68357b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        return Integer.valueOf(f(i10, ((Integer) obj).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.Su0
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final Ou0 zzf(int i10) {
        if (i10 >= this.f68358c) {
            return new Hu0(i10 == 0 ? f68355d : Arrays.copyOf(this.f68357b, i10), this.f68358c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = Tu0.f71313b;
        collection.getClass();
        if (!(collection instanceof Hu0)) {
            return super.addAll(collection);
        }
        Hu0 hu0 = (Hu0) collection;
        int i10 = hu0.f68358c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f68358c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f68357b;
            if (i12 > iArr.length) {
                this.f68357b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(hu0.f68357b, 0, this.f68357b, this.f68358c, hu0.f68358c);
            this.f68358c = i12;
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

    public final int e(int i10) {
        n(i10);
        return this.f68357b[i10];
    }

    public final int f(int i10, int i11) {
        a();
        n(i10);
        int[] iArr = this.f68357b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        n(i10);
        return Integer.valueOf(this.f68357b[i10]);
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        n(i10);
        int[] iArr = this.f68357b;
        int i11 = iArr[i10];
        if (i10 < this.f68358c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f68358c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            int[] iArr = this.f68357b;
            System.arraycopy(iArr, i11, iArr, i10, this.f68358c - i11);
            this.f68358c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.Ou0
    public final void zzi(int i10) {
        a();
        int i11 = this.f68358c;
        int length = this.f68357b.length;
        if (i11 == length) {
            int[] iArr = new int[l(length)];
            System.arraycopy(this.f68357b, 0, iArr, 0, this.f68358c);
            this.f68357b = iArr;
        }
        int[] iArr2 = this.f68357b;
        int i12 = this.f68358c;
        this.f68358c = i12 + 1;
        iArr2[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzi(((Integer) obj).intValue());
        return true;
    }
}
