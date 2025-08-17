package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class Hu0 extends Kt0 implements RandomAccess, Ou0, InterfaceC9975xv0 {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f67515d;

    /* renamed from: e, reason: collision with root package name */
    private static final Hu0 f67516e;

    /* renamed from: b, reason: collision with root package name */
    private int[] f67517b;

    /* renamed from: c, reason: collision with root package name */
    private int f67518c;

    static {
        int[] iArr = new int[0];
        f67515d = iArr;
        f67516e = new Hu0(iArr, 0, false);
    }

    Hu0() {
        this(f67515d, 0, true);
    }

    public static Hu0 h() {
        return f67516e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f67518c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f67517b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[l(length)];
            System.arraycopy(this.f67517b, 0, iArr2, 0, i10);
            System.arraycopy(this.f67517b, i10, iArr2, i12, this.f67518c - i10);
            this.f67517b = iArr2;
        }
        this.f67517b[i10] = iIntValue;
        this.f67518c++;
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
        if (this.f67518c != hu0.f67518c) {
            return false;
        }
        int[] iArr = hu0.f67517b;
        for (int i10 = 0; i10 < this.f67518c; i10++) {
            if (this.f67517b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f67518c; i11++) {
            i10 = (i10 * 31) + this.f67517b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f67518c;
    }

    private Hu0(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f67517b = iArr;
        this.f67518c = i10;
    }

    private static int l(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f67518c;
    }

    private final void n(int i10) {
        if (i10 < 0 || i10 >= this.f67518c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f67518c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f67517b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    final void k(int i10) {
        int length = this.f67517b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f67517b = new int[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = l(length);
        }
        this.f67517b = Arrays.copyOf(this.f67517b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        return Integer.valueOf(f(i10, ((Integer) obj).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.Su0
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final Ou0 zzf(int i10) {
        if (i10 >= this.f67518c) {
            return new Hu0(i10 == 0 ? f67515d : Arrays.copyOf(this.f67517b, i10), this.f67518c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = Tu0.f70473b;
        collection.getClass();
        if (!(collection instanceof Hu0)) {
            return super.addAll(collection);
        }
        Hu0 hu0 = (Hu0) collection;
        int i10 = hu0.f67518c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f67518c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f67517b;
            if (i12 > iArr.length) {
                this.f67517b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(hu0.f67517b, 0, this.f67517b, this.f67518c, hu0.f67518c);
            this.f67518c = i12;
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
        return this.f67517b[i10];
    }

    public final int f(int i10, int i11) {
        a();
        n(i10);
        int[] iArr = this.f67517b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        n(i10);
        return Integer.valueOf(this.f67517b[i10]);
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        n(i10);
        int[] iArr = this.f67517b;
        int i11 = iArr[i10];
        if (i10 < this.f67518c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f67518c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            int[] iArr = this.f67517b;
            System.arraycopy(iArr, i11, iArr, i10, this.f67518c - i11);
            this.f67518c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.Ou0
    public final void zzi(int i10) {
        a();
        int i11 = this.f67518c;
        int length = this.f67517b.length;
        if (i11 == length) {
            int[] iArr = new int[l(length)];
            System.arraycopy(this.f67517b, 0, iArr, 0, this.f67518c);
            this.f67517b = iArr;
        }
        int[] iArr2 = this.f67517b;
        int i12 = this.f67518c;
        this.f67518c = i12 + 1;
        iArr2[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzi(((Integer) obj).intValue());
        return true;
    }
}
