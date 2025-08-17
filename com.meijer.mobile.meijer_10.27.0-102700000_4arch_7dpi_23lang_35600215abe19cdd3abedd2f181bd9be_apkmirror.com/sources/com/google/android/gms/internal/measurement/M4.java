package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.a;
import fsimpl.C14045dq;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class M4 extends AbstractC10520s4 implements RandomAccess, InterfaceC10423h5, R5 {

    /* renamed from: d, reason: collision with root package name */
    private static final double[] f81833d;

    /* renamed from: b, reason: collision with root package name */
    private double[] f81834b;

    /* renamed from: c, reason: collision with root package name */
    private int f81835c;

    static {
        double[] dArr = new double[0];
        f81833d = dArr;
        new M4(dArr, 0, false);
    }

    M4() {
        this(f81833d, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f81835c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        int i12 = i10 + 1;
        double[] dArr = this.f81834b;
        int length = dArr.length;
        if (i11 < length) {
            System.arraycopy(dArr, i10, dArr, i12, i11 - i10);
        } else {
            double[] dArr2 = new double[k(length)];
            System.arraycopy(this.f81834b, 0, dArr2, 0, i10);
            System.arraycopy(this.f81834b, i10, dArr2, i12, this.f81835c - i10);
            this.f81834b = dArr2;
        }
        this.f81834b[i10] = dDoubleValue;
        this.f81835c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10520s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M4)) {
            return super.equals(obj);
        }
        M4 m42 = (M4) obj;
        if (this.f81835c != m42.f81835c) {
            return false;
        }
        double[] dArr = m42.f81834b;
        for (int i10 = 0; i10 < this.f81835c; i10++) {
            if (Double.doubleToLongBits(this.f81834b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10520s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f81835c; i11++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f81834b[i11]);
            byte[] bArr = C10486o5.f82316b;
            i10 = (i10 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f81835c;
    }

    private M4(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f81834b = dArr;
        this.f81835c = i10;
    }

    private static int k(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void l(int i10) {
        if (i10 < 0 || i10 >= this.f81835c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private final String m(int i10) {
        return C10538u4.a(this.f81835c, i10, C14045dq.DARKEN, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10477n5
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final InterfaceC10423h5 zzg(int i10) {
        if (i10 >= this.f81835c) {
            return new M4(i10 == 0 ? f81833d : Arrays.copyOf(this.f81834b, i10), this.f81835c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f81835c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f81834b[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        l(i10);
        double[] dArr = this.f81834b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    final void zzh(int i10) {
        int length = this.f81834b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f81834b = new double[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = k(length);
        }
        this.f81834b = Arrays.copyOf(this.f81834b, length);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10520s4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = C10486o5.f82316b;
        collection.getClass();
        if (!(collection instanceof M4)) {
            return super.addAll(collection);
        }
        M4 m42 = (M4) collection;
        int i10 = m42.f81835c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f81835c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f81834b;
            if (i12 > dArr.length) {
                this.f81834b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(m42.f81834b, 0, this.f81834b, this.f81835c, m42.f81835c);
            this.f81835c = i12;
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

    public final double f(int i10) {
        l(i10);
        return this.f81834b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        l(i10);
        return Double.valueOf(this.f81834b[i10]);
    }

    public final void h(double d10) {
        a();
        int i10 = this.f81835c;
        int length = this.f81834b.length;
        if (i10 == length) {
            double[] dArr = new double[k(length)];
            System.arraycopy(this.f81834b, 0, dArr, 0, this.f81835c);
            this.f81834b = dArr;
        }
        double[] dArr2 = this.f81834b;
        int i11 = this.f81835c;
        this.f81835c = i11 + 1;
        dArr2[i11] = d10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10520s4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        l(i10);
        double[] dArr = this.f81834b;
        double d10 = dArr[i10];
        if (i10 < this.f81835c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f81835c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            double[] dArr = this.f81834b;
            System.arraycopy(dArr, i11, dArr, i10, this.f81835c - i11);
            this.f81835c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Double) obj).doubleValue());
        return true;
    }
}
