package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.mu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8797mu0 extends Kt0 implements RandomAccess, Ju0, InterfaceC9975xv0 {

    /* renamed from: d, reason: collision with root package name */
    private static final double[] f76918d;

    /* renamed from: e, reason: collision with root package name */
    private static final C8797mu0 f76919e;

    /* renamed from: b, reason: collision with root package name */
    private double[] f76920b;

    /* renamed from: c, reason: collision with root package name */
    private int f76921c;

    static {
        double[] dArr = new double[0];
        f76918d = dArr;
        f76919e = new C8797mu0(dArr, 0, false);
    }

    C8797mu0() {
        this(f76918d, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f76921c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int i12 = i10 + 1;
        double[] dArr = this.f76920b;
        int length = dArr.length;
        if (i11 < length) {
            System.arraycopy(dArr, i10, dArr, i12, i11 - i10);
        } else {
            double[] dArr2 = new double[k(length)];
            System.arraycopy(this.f76920b, 0, dArr2, 0, i10);
            System.arraycopy(this.f76920b, i10, dArr2, i12, this.f76921c - i10);
            this.f76920b = dArr2;
        }
        this.f76920b[i10] = dDoubleValue;
        this.f76921c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8797mu0)) {
            return super.equals(obj);
        }
        C8797mu0 c8797mu0 = (C8797mu0) obj;
        if (this.f76921c != c8797mu0.f76921c) {
            return false;
        }
        double[] dArr = c8797mu0.f76920b;
        for (int i10 = 0; i10 < this.f76921c; i10++) {
            if (Double.doubleToLongBits(this.f76920b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f76921c; i11++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f76920b[i11]);
            byte[] bArr = Tu0.f70473b;
            i10 = (i10 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f76921c;
    }

    private C8797mu0(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f76920b = dArr;
        this.f76921c = i10;
    }

    private static int k(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f76921c;
    }

    private final void m(int i10) {
        if (i10 < 0 || i10 >= this.f76921c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.Su0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Ju0 zzf(int i10) {
        if (i10 >= this.f76921c) {
            return new C8797mu0(i10 == 0 ? f76918d : Arrays.copyOf(this.f76920b, i10), this.f76921c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f76921c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f76920b[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        m(i10);
        double[] dArr = this.f76920b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    final void zzi(int i10) {
        int length = this.f76920b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f76920b = new double[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = k(length);
        }
        this.f76920b = Arrays.copyOf(this.f76920b, length);
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = Tu0.f70473b;
        collection.getClass();
        if (!(collection instanceof C8797mu0)) {
            return super.addAll(collection);
        }
        C8797mu0 c8797mu0 = (C8797mu0) collection;
        int i10 = c8797mu0.f76921c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f76921c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f76920b;
            if (i12 > dArr.length) {
                this.f76920b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(c8797mu0.f76920b, 0, this.f76920b, this.f76921c, c8797mu0.f76921c);
            this.f76921c = i12;
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

    public final double e(int i10) {
        m(i10);
        return this.f76920b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m(i10);
        return Double.valueOf(this.f76920b[i10]);
    }

    public final void h(double d10) {
        a();
        int i10 = this.f76921c;
        int length = this.f76920b.length;
        if (i10 == length) {
            double[] dArr = new double[k(length)];
            System.arraycopy(this.f76920b, 0, dArr, 0, this.f76921c);
            this.f76920b = dArr;
        }
        double[] dArr2 = this.f76920b;
        int i11 = this.f76921c;
        this.f76921c = i11 + 1;
        dArr2[i11] = d10;
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        m(i10);
        double[] dArr = this.f76920b;
        double d10 = dArr[i10];
        if (i10 < this.f76921c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f76921c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            double[] dArr = this.f76920b;
            System.arraycopy(dArr, i11, dArr, i10, this.f76921c - i11);
            this.f76921c -= i11 - i10;
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
