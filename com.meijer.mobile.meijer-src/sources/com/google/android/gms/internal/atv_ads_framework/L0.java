package com.google.android.gms.internal.atv_ads_framework;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class L0 extends AbstractC10338e0 implements RandomAccess, P0, InterfaceC10392w1 {

    /* renamed from: d, reason: collision with root package name */
    private static final L0 f81680d = new L0(new int[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private int[] f81681b;

    /* renamed from: c, reason: collision with root package name */
    private int f81682c;

    L0() {
        this(new int[10], 0, true);
    }

    public static L0 e() {
        return f81680d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.f81682c)) {
            throw new IndexOutOfBoundsException(f(i10));
        }
        int[] iArr = this.f81681b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f81681b, i10, iArr2, i10 + 1, this.f81682c - i10);
            this.f81681b = iArr2;
        }
        this.f81681b[i10] = iIntValue;
        this.f81682c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10338e0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return super.equals(obj);
        }
        L0 l02 = (L0) obj;
        if (this.f81682c != l02.f81682c) {
            return false;
        }
        int[] iArr = l02.f81681b;
        for (int i10 = 0; i10 < this.f81682c; i10++) {
            if (this.f81681b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10338e0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f81682c; i11++) {
            i10 = (i10 * 31) + this.f81681b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f81682c;
    }

    private L0(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f81681b = iArr;
        this.f81682c = i10;
    }

    private final String f(int i10) {
        return "Index:" + i10 + ", Size:" + this.f81682c;
    }

    private final void h(int i10) {
        if (i10 < 0 || i10 >= this.f81682c) {
            throw new IndexOutOfBoundsException(f(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f81682c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f81681b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zza();
        h(i10);
        int[] iArr = this.f81681b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.R0
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final P0 zzg(int i10) {
        if (i10 >= this.f81682c) {
            return new L0(Arrays.copyOf(this.f81681b, i10), this.f81682c, true);
        }
        throw new IllegalArgumentException();
    }

    public final int a(int i10) {
        h(i10);
        return this.f81681b[i10];
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10338e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = S0.f81715d;
        collection.getClass();
        if (!(collection instanceof L0)) {
            return super.addAll(collection);
        }
        L0 l02 = (L0) collection;
        int i10 = l02.f81682c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f81682c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f81681b;
            if (i12 > iArr.length) {
                this.f81681b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(l02.f81681b, 0, this.f81681b, this.f81682c, l02.f81682c);
            this.f81682c = i12;
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

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        h(i10);
        return Integer.valueOf(this.f81681b[i10]);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10338e0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        h(i10);
        int[] iArr = this.f81681b;
        int i11 = iArr[i10];
        if (i10 < this.f81682c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f81682c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            int[] iArr = this.f81681b;
            System.arraycopy(iArr, i11, iArr, i10, this.f81682c - i11);
            this.f81682c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.P0
    public final void zzh(int i10) {
        zza();
        int i11 = this.f81682c;
        int[] iArr = this.f81681b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f81681b = iArr2;
        }
        int[] iArr3 = this.f81681b;
        int i12 = this.f81682c;
        this.f81682c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10338e0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
