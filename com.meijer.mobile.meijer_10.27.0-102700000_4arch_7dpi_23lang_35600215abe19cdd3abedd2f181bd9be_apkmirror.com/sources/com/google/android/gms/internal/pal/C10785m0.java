package com.google.android.gms.internal.pal;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.pal.m0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10785m0 extends L implements RandomAccess, I0, InterfaceC10802n1 {

    /* renamed from: d, reason: collision with root package name */
    private static final C10785m0 f83228d;

    /* renamed from: b, reason: collision with root package name */
    private double[] f83229b;

    /* renamed from: c, reason: collision with root package name */
    private int f83230c;

    C10785m0() {
        this(new double[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.f83230c)) {
            throw new IndexOutOfBoundsException(e(i10));
        }
        double[] dArr = this.f83229b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f83229b, i10, dArr2, i10 + 1, this.f83230c - i10);
            this.f83229b = dArr2;
        }
        this.f83229b[i10] = dDoubleValue;
        this.f83230c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10785m0)) {
            return super.equals(obj);
        }
        C10785m0 c10785m0 = (C10785m0) obj;
        if (this.f83230c != c10785m0.f83230c) {
            return false;
        }
        double[] dArr = c10785m0.f83229b;
        for (int i10 = 0; i10 < this.f83230c; i10++) {
            if (Double.doubleToLongBits(this.f83229b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iC = 1;
        for (int i10 = 0; i10 < this.f83230c; i10++) {
            iC = (iC * 31) + J0.c(Double.doubleToLongBits(this.f83229b[i10]));
        }
        return iC;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f83230c;
    }

    static {
        C10785m0 c10785m0 = new C10785m0(new double[0], 0);
        f83228d = c10785m0;
        c10785m0.zzb();
    }

    private C10785m0(double[] dArr, int i10) {
        this.f83229b = dArr;
        this.f83230c = i10;
    }

    private final String e(int i10) {
        return "Index:" + i10 + ", Size:" + this.f83230c;
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= this.f83230c) {
            throw new IndexOutOfBoundsException(e(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f83230c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f83229b[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        f(i10);
        double[] dArr = this.f83229b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // com.google.android.gms.internal.pal.I0
    public final /* bridge */ /* synthetic */ I0 zzd(int i10) {
        if (i10 >= this.f83230c) {
            return new C10785m0(Arrays.copyOf(this.f83229b, i10), this.f83230c);
        }
        throw new IllegalArgumentException();
    }

    public final void a(double d10) {
        zza();
        int i10 = this.f83230c;
        double[] dArr = this.f83229b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f83229b = dArr2;
        }
        double[] dArr3 = this.f83229b;
        int i11 = this.f83230c;
        this.f83230c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        J0.e(collection);
        if (!(collection instanceof C10785m0)) {
            return super.addAll(collection);
        }
        C10785m0 c10785m0 = (C10785m0) collection;
        int i10 = c10785m0.f83230c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f83230c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f83229b;
            if (i12 > dArr.length) {
                this.f83229b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(c10785m0.f83229b, 0, this.f83229b, this.f83230c, c10785m0.f83230c);
            this.f83230c = i12;
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
        f(i10);
        return Double.valueOf(this.f83229b[i10]);
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        f(i10);
        double[] dArr = this.f83229b;
        double d10 = dArr[i10];
        if (i10 < this.f83230c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f83230c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            double[] dArr = this.f83229b;
            System.arraycopy(dArr, i11, dArr, i10, this.f83230c - i11);
            this.f83230c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        a(((Double) obj).doubleValue());
        return true;
    }
}
