package com.google.android.gms.internal.vision;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.z0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11091z0 extends AbstractC11008a0<Double> implements X0<Double>, H1, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final C11091z0 f84682d;

    /* renamed from: b, reason: collision with root package name */
    private double[] f84683b;

    /* renamed from: c, reason: collision with root package name */
    private int f84684c;

    C11091z0() {
        this(new double[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f84684c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        double[] dArr = this.f84683b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f84683b, i10, dArr2, i10 + 1, this.f84684c - i10);
            this.f84683b = dArr2;
        }
        this.f84683b[i10] = dDoubleValue;
        this.f84684c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11091z0)) {
            return super.equals(obj);
        }
        C11091z0 c11091z0 = (C11091z0) obj;
        if (this.f84684c != c11091z0.f84684c) {
            return false;
        }
        double[] dArr = c11091z0.f84683b;
        for (int i10 = 0; i10 < this.f84684c; i10++) {
            if (Double.doubleToLongBits(this.f84683b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i10 = 0; i10 < this.f84684c; i10++) {
            iB = (iB * 31) + S0.b(Double.doubleToLongBits(this.f84683b[i10]));
        }
        return iB;
    }

    static {
        C11091z0 c11091z0 = new C11091z0(new double[0], 0);
        f84682d = c11091z0;
        c11091z0.zzb();
    }

    private C11091z0(double[] dArr, int i10) {
        this.f84683b = dArr;
        this.f84684c = i10;
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= this.f84684c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    private final String h(int i10) {
        int i11 = this.f84684c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f84683b[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        f(i10);
        double[] dArr = this.f84683b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f84684c;
    }

    @Override // com.google.android.gms.internal.vision.X0
    public final /* synthetic */ X0<Double> zza(int i10) {
        if (i10 >= this.f84684c) {
            return new C11091z0(Arrays.copyOf(this.f84683b, i10), this.f84684c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        S0.d(collection);
        if (!(collection instanceof C11091z0)) {
            return super.addAll(collection);
        }
        C11091z0 c11091z0 = (C11091z0) collection;
        int i10 = c11091z0.f84684c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f84684c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f84683b;
            if (i12 > dArr.length) {
                this.f84683b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(c11091z0.f84683b, 0, this.f84683b, this.f84684c, c11091z0.f84684c);
            this.f84684c = i12;
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

    public final void e(double d10) {
        a();
        int i10 = this.f84684c;
        double[] dArr = this.f84683b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f84683b = dArr2;
        }
        double[] dArr3 = this.f84683b;
        int i11 = this.f84684c;
        this.f84684c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        f(i10);
        return Double.valueOf(this.f84683b[i10]);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        a();
        f(i10);
        double[] dArr = this.f84683b;
        double d10 = dArr[i10];
        if (i10 < this.f84684c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f84684c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            double[] dArr = this.f84683b;
            System.arraycopy(dArr, i11, dArr, i10, this.f84684c - i11);
            this.f84684c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }
}
