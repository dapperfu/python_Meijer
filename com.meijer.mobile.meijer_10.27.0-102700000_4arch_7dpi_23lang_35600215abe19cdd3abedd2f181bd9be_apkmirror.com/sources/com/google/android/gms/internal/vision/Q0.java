package com.google.android.gms.internal.vision;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class Q0 extends AbstractC11008a0<Integer> implements X0<Integer>, H1, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final Q0 f84445d;

    /* renamed from: b, reason: collision with root package name */
    private int[] f84446b;

    /* renamed from: c, reason: collision with root package name */
    private int f84447c;

    Q0() {
        this(new int[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f84447c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int[] iArr = this.f84446b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f84446b, i10, iArr2, i10 + 1, this.f84447c - i10);
            this.f84446b = iArr2;
        }
        this.f84446b[i10] = iIntValue;
        this.f84447c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q0)) {
            return super.equals(obj);
        }
        Q0 q02 = (Q0) obj;
        if (this.f84447c != q02.f84447c) {
            return false;
        }
        int[] iArr = q02.f84446b;
        for (int i10 = 0; i10 < this.f84447c; i10++) {
            if (this.f84446b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f84447c; i11++) {
            i10 = (i10 * 31) + this.f84446b[i11];
        }
        return i10;
    }

    static {
        Q0 q02 = new Q0(new int[0], 0);
        f84445d = q02;
        q02.zzb();
    }

    private Q0(int[] iArr, int i10) {
        this.f84446b = iArr;
        this.f84447c = i10;
    }

    public static Q0 h() {
        return f84445d;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f84447c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private final String l(int i10) {
        int i11 = this.f84447c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f84446b[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        k(i10);
        int[] iArr = this.f84446b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f84447c;
    }

    @Override // com.google.android.gms.internal.vision.X0
    public final /* synthetic */ X0<Integer> zza(int i10) {
        if (i10 >= this.f84447c) {
            return new Q0(Arrays.copyOf(this.f84446b, i10), this.f84447c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        S0.d(collection);
        if (!(collection instanceof Q0)) {
            return super.addAll(collection);
        }
        Q0 q02 = (Q0) collection;
        int i10 = q02.f84447c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f84447c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f84446b;
            if (i12 > iArr.length) {
                this.f84446b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(q02.f84446b, 0, this.f84446b, this.f84447c, q02.f84447c);
            this.f84447c = i12;
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
        k(i10);
        return this.f84446b[i10];
    }

    public final void f(int i10) {
        a();
        int i11 = this.f84447c;
        int[] iArr = this.f84446b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f84446b = iArr2;
        }
        int[] iArr3 = this.f84446b;
        int i12 = this.f84447c;
        this.f84447c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return Integer.valueOf(e(i10));
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        a();
        k(i10);
        int[] iArr = this.f84446b;
        int i11 = iArr[i10];
        if (i10 < this.f84447c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f84447c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            int[] iArr = this.f84446b;
            System.arraycopy(iArr, i11, iArr, i10, this.f84447c - i11);
            this.f84447c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
