package com.google.android.gms.internal.vision;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.z0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11216z0 extends AbstractC11133a0<Double> implements X0<Double>, H1, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final C11216z0 f85522d;

    /* renamed from: b, reason: collision with root package name */
    private double[] f85523b;

    /* renamed from: c, reason: collision with root package name */
    private int f85524c;

    C11216z0() {
        this(new double[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f85524c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        double[] dArr = this.f85523b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f85523b, i10, dArr2, i10 + 1, this.f85524c - i10);
            this.f85523b = dArr2;
        }
        this.f85523b[i10] = dDoubleValue;
        this.f85524c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11133a0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11216z0)) {
            return super.equals(obj);
        }
        C11216z0 c11216z0 = (C11216z0) obj;
        if (this.f85524c != c11216z0.f85524c) {
            return false;
        }
        double[] dArr = c11216z0.f85523b;
        for (int i10 = 0; i10 < this.f85524c; i10++) {
            if (Double.doubleToLongBits(this.f85523b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11133a0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i10 = 0; i10 < this.f85524c; i10++) {
            iB = (iB * 31) + S0.b(Double.doubleToLongBits(this.f85523b[i10]));
        }
        return iB;
    }

    static {
        C11216z0 c11216z0 = new C11216z0(new double[0], 0);
        f85522d = c11216z0;
        c11216z0.zzb();
    }

    private C11216z0(double[] dArr, int i10) {
        this.f85523b = dArr;
        this.f85524c = i10;
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= this.f85524c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    private final String h(int i10) {
        int i11 = this.f85524c;
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
            if (this.f85523b[i10] == dDoubleValue) {
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
        double[] dArr = this.f85523b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f85524c;
    }

    @Override // com.google.android.gms.internal.vision.X0
    public final /* synthetic */ X0<Double> zza(int i10) {
        if (i10 >= this.f85524c) {
            return new C11216z0(Arrays.copyOf(this.f85523b, i10), this.f85524c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11133a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        S0.d(collection);
        if (!(collection instanceof C11216z0)) {
            return super.addAll(collection);
        }
        C11216z0 c11216z0 = (C11216z0) collection;
        int i10 = c11216z0.f85524c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f85524c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f85523b;
            if (i12 > dArr.length) {
                this.f85523b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(c11216z0.f85523b, 0, this.f85523b, this.f85524c, c11216z0.f85524c);
            this.f85524c = i12;
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
        int i10 = this.f85524c;
        double[] dArr = this.f85523b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f85523b = dArr2;
        }
        double[] dArr3 = this.f85523b;
        int i11 = this.f85524c;
        this.f85524c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        f(i10);
        return Double.valueOf(this.f85523b[i10]);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11133a0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        a();
        f(i10);
        double[] dArr = this.f85523b;
        double d10 = dArr[i10];
        if (i10 < this.f85524c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f85524c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            double[] dArr = this.f85523b;
            System.arraycopy(dArr, i11, dArr, i10, this.f85524c - i11);
            this.f85524c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11133a0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }
}
