package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class O extends AbstractC10333t<Double> implements InterfaceC10308k0<Double>, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final O f81179d;

    /* renamed from: b, reason: collision with root package name */
    private double[] f81180b;

    /* renamed from: c, reason: collision with root package name */
    private int f81181c;

    static {
        O o10 = new O();
        f81179d = o10;
        o10.zzv();
    }

    O() {
        this(new double[10], 0);
    }

    private final void f(int i10, double d10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f81181c)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        double[] dArr = this.f81180b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f81180b, i10, dArr2, i10 + 1, this.f81181c - i10);
            this.f81180b = dArr2;
        }
        this.f81180b[i10] = d10;
        this.f81181c++;
        ((AbstractList) this).modCount++;
    }

    private final void h(int i10) {
        if (i10 < 0 || i10 >= this.f81181c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private final String k(int i10) {
        int i11 = this.f81181c;
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

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        C10299h0.a(collection);
        if (!(collection instanceof O)) {
            return super.addAll(collection);
        }
        O o10 = (O) collection;
        int i10 = o10.f81181c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f81181c;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f81180b;
        if (i12 > dArr.length) {
            this.f81180b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(o10.f81180b, 0, this.f81180b, this.f81181c, o10.f81181c);
        this.f81181c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(double d10) {
        f(this.f81181c, d10);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return super.equals(obj);
        }
        O o10 = (O) obj;
        if (this.f81181c != o10.f81181c) {
            return false;
        }
        double[] dArr = o10.f81180b;
        for (int i10 = 0; i10 < this.f81181c; i10++) {
            if (this.f81180b[i10] != dArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        h(i10);
        return Double.valueOf(this.f81180b[i10]);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iJ = 1;
        for (int i10 = 0; i10 < this.f81181c; i10++) {
            iJ = (iJ * 31) + C10299h0.j(Double.doubleToLongBits(this.f81180b[i10]));
        }
        return iJ;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        a();
        h(i10);
        double[] dArr = this.f81180b;
        double d10 = dArr[i10];
        int i11 = this.f81181c;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, i11 - i10);
        }
        this.f81181c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f81180b;
        System.arraycopy(dArr, i11, dArr, i10, this.f81181c - i11);
        this.f81181c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        h(i10);
        double[] dArr = this.f81180b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f81181c;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10308k0
    public final /* synthetic */ InterfaceC10308k0<Double> zzi(int i10) {
        if (i10 >= this.f81181c) {
            return new O(Arrays.copyOf(this.f81180b, i10), this.f81181c);
        }
        throw new IllegalArgumentException();
    }

    private O(double[] dArr, int i10) {
        this.f81180b = dArr;
        this.f81181c = i10;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f81181c; i10++) {
            if (obj.equals(Double.valueOf(this.f81180b[i10]))) {
                double[] dArr = this.f81180b;
                System.arraycopy(dArr, i10 + 1, dArr, i10, this.f81181c - i10);
                this.f81181c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
