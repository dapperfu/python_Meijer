package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.C11663y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11650k extends AbstractC11642c<Double> implements C11663y.b, RandomAccess, Z {

    /* renamed from: d, reason: collision with root package name */
    private static final C11650k f91406d = new C11650k(new double[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private double[] f91407b;

    /* renamed from: c, reason: collision with root package name */
    private int f91408c;

    C11650k() {
        this(new double[10], 0, true);
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11650k)) {
            return super.equals(obj);
        }
        C11650k c11650k = (C11650k) obj;
        if (this.f91408c != c11650k.f91408c) {
            return false;
        }
        double[] dArr = c11650k.f91407b;
        for (int i10 = 0; i10 < this.f91408c; i10++) {
            if (Double.doubleToLongBits(this.f91407b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f91408c; i10++) {
            iF = (iF * 31) + C11663y.f(Double.doubleToLongBits(this.f91407b[i10]));
        }
        return iF;
    }

    private C11650k(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f91407b = dArr;
        this.f91408c = i10;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f91408c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f91408c;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f91407b[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.C11663y.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C11663y.b b(int i10) {
        if (i10 >= this.f91408c) {
            return new C11650k(Arrays.copyOf(this.f91407b, i10), this.f91408c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f91408c;
    }

    private void k(int i10, double d10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f91408c)) {
            double[] dArr = this.f91407b;
            if (i11 < dArr.length) {
                System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
            } else {
                double[] dArr2 = new double[((i11 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i10);
                System.arraycopy(this.f91407b, i10, dArr2, i10 + 1, this.f91408c - i10);
                this.f91407b = dArr2;
            }
            this.f91407b[i10] = d10;
            this.f91408c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(o(i10));
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        a();
        C11663y.a(collection);
        if (!(collection instanceof C11650k)) {
            return super.addAll(collection);
        }
        C11650k c11650k = (C11650k) collection;
        int i10 = c11650k.f91408c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f91408c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f91407b;
            if (i12 > dArr.length) {
                this.f91407b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(c11650k.f91407b, 0, this.f91407b, this.f91408c, c11650k.f91408c);
            this.f91408c = i12;
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

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        h(d10.doubleValue());
        return true;
    }

    public void h(double d10) {
        a();
        int i10 = this.f91408c;
        double[] dArr = this.f91407b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f91407b = dArr2;
        }
        double[] dArr3 = this.f91407b;
        int i11 = this.f91408c;
        this.f91408c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(n(i10));
    }

    public double n(int i10) {
        l(i10);
        return this.f91407b[i10];
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        a();
        l(i10);
        double[] dArr = this.f91407b;
        double d10 = dArr[i10];
        if (i10 < this.f91408c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f91408c--;
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
            double[] dArr = this.f91407b;
            System.arraycopy(dArr, i11, dArr, i10, this.f91408c - i11);
            this.f91408c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public double s(int i10, double d10) {
        a();
        l(i10);
        double[] dArr = this.f91407b;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }
}
