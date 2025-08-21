package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.mu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8922mu0 extends Kt0 implements RandomAccess, Ju0, InterfaceC10100xv0 {

    /* renamed from: d, reason: collision with root package name */
    private static final double[] f77758d;

    /* renamed from: e, reason: collision with root package name */
    private static final C8922mu0 f77759e;

    /* renamed from: b, reason: collision with root package name */
    private double[] f77760b;

    /* renamed from: c, reason: collision with root package name */
    private int f77761c;

    static {
        double[] dArr = new double[0];
        f77758d = dArr;
        f77759e = new C8922mu0(dArr, 0, false);
    }

    C8922mu0() {
        this(f77758d, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f77761c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int i12 = i10 + 1;
        double[] dArr = this.f77760b;
        int length = dArr.length;
        if (i11 < length) {
            System.arraycopy(dArr, i10, dArr, i12, i11 - i10);
        } else {
            double[] dArr2 = new double[k(length)];
            System.arraycopy(this.f77760b, 0, dArr2, 0, i10);
            System.arraycopy(this.f77760b, i10, dArr2, i12, this.f77761c - i10);
            this.f77760b = dArr2;
        }
        this.f77760b[i10] = dDoubleValue;
        this.f77761c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8922mu0)) {
            return super.equals(obj);
        }
        C8922mu0 c8922mu0 = (C8922mu0) obj;
        if (this.f77761c != c8922mu0.f77761c) {
            return false;
        }
        double[] dArr = c8922mu0.f77760b;
        for (int i10 = 0; i10 < this.f77761c; i10++) {
            if (Double.doubleToLongBits(this.f77760b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f77761c; i11++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f77760b[i11]);
            byte[] bArr = Tu0.f71313b;
            i10 = (i10 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f77761c;
    }

    private C8922mu0(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f77760b = dArr;
        this.f77761c = i10;
    }

    private static int k(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f77761c;
    }

    private final void m(int i10) {
        if (i10 < 0 || i10 >= this.f77761c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.Su0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Ju0 zzf(int i10) {
        if (i10 >= this.f77761c) {
            return new C8922mu0(i10 == 0 ? f77758d : Arrays.copyOf(this.f77760b, i10), this.f77761c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f77761c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f77760b[i11] == dDoubleValue) {
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
        double[] dArr = this.f77760b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    final void zzi(int i10) {
        int length = this.f77760b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f77760b = new double[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = k(length);
        }
        this.f77760b = Arrays.copyOf(this.f77760b, length);
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = Tu0.f71313b;
        collection.getClass();
        if (!(collection instanceof C8922mu0)) {
            return super.addAll(collection);
        }
        C8922mu0 c8922mu0 = (C8922mu0) collection;
        int i10 = c8922mu0.f77761c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f77761c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f77760b;
            if (i12 > dArr.length) {
                this.f77760b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(c8922mu0.f77760b, 0, this.f77760b, this.f77761c, c8922mu0.f77761c);
            this.f77761c = i12;
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
        return this.f77760b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m(i10);
        return Double.valueOf(this.f77760b[i10]);
    }

    public final void h(double d10) {
        a();
        int i10 = this.f77761c;
        int length = this.f77760b.length;
        if (i10 == length) {
            double[] dArr = new double[k(length)];
            System.arraycopy(this.f77760b, 0, dArr, 0, this.f77761c);
            this.f77760b = dArr;
        }
        double[] dArr2 = this.f77760b;
        int i11 = this.f77761c;
        this.f77761c = i11 + 1;
        dArr2[i11] = d10;
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        m(i10);
        double[] dArr = this.f77760b;
        double d10 = dArr[i10];
        if (i10 < this.f77761c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f77761c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            double[] dArr = this.f77760b;
            System.arraycopy(dArr, i11, dArr, i10, this.f77761c - i11);
            this.f77761c -= i11 - i10;
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
