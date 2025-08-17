package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.C11538y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11525k extends AbstractC11517c<Double> implements C11538y.b, RandomAccess, Z {

    /* renamed from: d, reason: collision with root package name */
    private static final C11525k f90567d = new C11525k(new double[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private double[] f90568b;

    /* renamed from: c, reason: collision with root package name */
    private int f90569c;

    C11525k() {
        this(new double[10], 0, true);
    }

    @Override // com.google.protobuf.AbstractC11517c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11525k)) {
            return super.equals(obj);
        }
        C11525k c11525k = (C11525k) obj;
        if (this.f90569c != c11525k.f90569c) {
            return false;
        }
        double[] dArr = c11525k.f90568b;
        for (int i10 = 0; i10 < this.f90569c; i10++) {
            if (Double.doubleToLongBits(this.f90568b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC11517c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f90569c; i10++) {
            iF = (iF * 31) + C11538y.f(Double.doubleToLongBits(this.f90568b[i10]));
        }
        return iF;
    }

    private C11525k(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f90568b = dArr;
        this.f90569c = i10;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f90569c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f90569c;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f90568b[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.C11538y.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C11538y.b b(int i10) {
        if (i10 >= this.f90569c) {
            return new C11525k(Arrays.copyOf(this.f90568b, i10), this.f90569c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f90569c;
    }

    private void k(int i10, double d10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f90569c)) {
            double[] dArr = this.f90568b;
            if (i11 < dArr.length) {
                System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
            } else {
                double[] dArr2 = new double[((i11 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i10);
                System.arraycopy(this.f90568b, i10, dArr2, i10 + 1, this.f90569c - i10);
                this.f90568b = dArr2;
            }
            this.f90568b[i10] = d10;
            this.f90569c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(o(i10));
    }

    @Override // com.google.protobuf.AbstractC11517c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        a();
        C11538y.a(collection);
        if (!(collection instanceof C11525k)) {
            return super.addAll(collection);
        }
        C11525k c11525k = (C11525k) collection;
        int i10 = c11525k.f90569c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f90569c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f90568b;
            if (i12 > dArr.length) {
                this.f90568b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(c11525k.f90568b, 0, this.f90568b, this.f90569c, c11525k.f90569c);
            this.f90569c = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Double d10) {
        k(i10, d10.doubleValue());
    }

    @Override // com.google.protobuf.AbstractC11517c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        h(d10.doubleValue());
        return true;
    }

    public void h(double d10) {
        a();
        int i10 = this.f90569c;
        double[] dArr = this.f90568b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f90568b = dArr2;
        }
        double[] dArr3 = this.f90568b;
        int i11 = this.f90569c;
        this.f90569c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(n(i10));
    }

    public double n(int i10) {
        l(i10);
        return this.f90568b[i10];
    }

    @Override // com.google.protobuf.AbstractC11517c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        a();
        l(i10);
        double[] dArr = this.f90568b;
        double d10 = dArr[i10];
        if (i10 < this.f90569c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f90569c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(s(i10, d10.doubleValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            double[] dArr = this.f90568b;
            System.arraycopy(dArr, i11, dArr, i10, this.f90569c - i11);
            this.f90569c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public double s(int i10, double d10) {
        a();
        l(i10);
        double[] dArr = this.f90568b;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }
}
