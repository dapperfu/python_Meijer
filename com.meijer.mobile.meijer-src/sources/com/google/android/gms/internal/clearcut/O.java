package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class O extends AbstractC10458t<Double> implements InterfaceC10433k0<Double>, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final O f82019d;

    /* renamed from: b, reason: collision with root package name */
    private double[] f82020b;

    /* renamed from: c, reason: collision with root package name */
    private int f82021c;

    static {
        O o10 = new O();
        f82019d = o10;
        o10.zzv();
    }

    O() {
        this(new double[10], 0);
    }

    private final void f(int i10, double d10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f82021c)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        double[] dArr = this.f82020b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f82020b, i10, dArr2, i10 + 1, this.f82021c - i10);
            this.f82020b = dArr2;
        }
        this.f82020b[i10] = d10;
        this.f82021c++;
        ((AbstractList) this).modCount++;
    }

    private final void h(int i10) {
        if (i10 < 0 || i10 >= this.f82021c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private final String k(int i10) {
        int i11 = this.f82021c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        f(i10, ((Double) obj).doubleValue());
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10458t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        C10424h0.a(collection);
        if (!(collection instanceof O)) {
            return super.addAll(collection);
        }
        O o10 = (O) collection;
        int i10 = o10.f82021c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f82021c;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f82020b;
        if (i12 > dArr.length) {
            this.f82020b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(o10.f82020b, 0, this.f82020b, this.f82021c, o10.f82021c);
        this.f82021c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(double d10) {
        f(this.f82021c, d10);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10458t, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return super.equals(obj);
        }
        O o10 = (O) obj;
        if (this.f82021c != o10.f82021c) {
            return false;
        }
        double[] dArr = o10.f82020b;
        for (int i10 = 0; i10 < this.f82021c; i10++) {
            if (this.f82020b[i10] != dArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        h(i10);
        return Double.valueOf(this.f82020b[i10]);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10458t, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iJ = 1;
        for (int i10 = 0; i10 < this.f82021c; i10++) {
            iJ = (iJ * 31) + C10424h0.j(Double.doubleToLongBits(this.f82020b[i10]));
        }
        return iJ;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        a();
        h(i10);
        double[] dArr = this.f82020b;
        double d10 = dArr[i10];
        int i11 = this.f82021c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, i11 - i10);
        }
        this.f82021c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f82020b;
        System.arraycopy(dArr, i11, dArr, i10, this.f82021c - i11);
        this.f82021c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        h(i10);
        double[] dArr = this.f82020b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f82021c;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10433k0
    public final /* synthetic */ InterfaceC10433k0<Double> zzi(int i10) {
        if (i10 >= this.f82021c) {
            return new O(Arrays.copyOf(this.f82020b, i10), this.f82021c);
        }
        throw new IllegalArgumentException();
    }

    private O(double[] dArr, int i10) {
        this.f82020b = dArr;
        this.f82021c = i10;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10458t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f82021c; i10++) {
            if (obj.equals(Double.valueOf(this.f82020b[i10]))) {
                double[] dArr = this.f82020b;
                System.arraycopy(dArr, i10 + 1, dArr, i10, this.f82021c - i10);
                this.f82021c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
