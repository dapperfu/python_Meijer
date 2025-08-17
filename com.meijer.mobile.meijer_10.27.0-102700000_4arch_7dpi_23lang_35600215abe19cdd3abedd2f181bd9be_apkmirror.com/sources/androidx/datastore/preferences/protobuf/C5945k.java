package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5958y;
import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5945k extends AbstractC5937c<Double> implements C5958y.b, RandomAccess, Z {

    /* renamed from: d, reason: collision with root package name */
    private static final C5945k f54300d = new C5945k(new double[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private double[] f54301b;

    /* renamed from: c, reason: collision with root package name */
    private int f54302c;

    C5945k() {
        this(new double[10], 0, true);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5937c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5945k)) {
            return super.equals(obj);
        }
        C5945k c5945k = (C5945k) obj;
        if (this.f54302c != c5945k.f54302c) {
            return false;
        }
        double[] dArr = c5945k.f54301b;
        for (int i10 = 0; i10 < this.f54302c; i10++) {
            if (Double.doubleToLongBits(this.f54301b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5937c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f54302c; i10++) {
            iF = (iF * 31) + C5958y.f(Double.doubleToLongBits(this.f54301b[i10]));
        }
        return iF;
    }

    private C5945k(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f54301b = dArr;
        this.f54302c = i10;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f54302c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f54302c;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f54301b[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.C5958y.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C5958y.b b(int i10) {
        if (i10 >= this.f54302c) {
            return new C5945k(Arrays.copyOf(this.f54301b, i10), this.f54302c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f54302c;
    }

    private void k(int i10, double d10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f54302c)) {
            double[] dArr = this.f54301b;
            if (i11 < dArr.length) {
                System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
            } else {
                double[] dArr2 = new double[((i11 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i10);
                System.arraycopy(this.f54301b, i10, dArr2, i10 + 1, this.f54302c - i10);
                this.f54301b = dArr2;
            }
            this.f54301b[i10] = d10;
            this.f54302c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(o(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5937c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        a();
        C5958y.a(collection);
        if (!(collection instanceof C5945k)) {
            return super.addAll(collection);
        }
        C5945k c5945k = (C5945k) collection;
        int i10 = c5945k.f54302c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f54302c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f54301b;
            if (i12 > dArr.length) {
                this.f54301b = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(c5945k.f54301b, 0, this.f54301b, this.f54302c, c5945k.f54302c);
            this.f54302c = i12;
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

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        h(d10.doubleValue());
        return true;
    }

    public void h(double d10) {
        a();
        int i10 = this.f54302c;
        double[] dArr = this.f54301b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f54301b = dArr2;
        }
        double[] dArr3 = this.f54301b;
        int i11 = this.f54302c;
        this.f54302c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(n(i10));
    }

    public double n(int i10) {
        l(i10);
        return this.f54301b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5937c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        a();
        l(i10);
        double[] dArr = this.f54301b;
        double d10 = dArr[i10];
        if (i10 < this.f54302c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f54302c--;
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
            double[] dArr = this.f54301b;
            System.arraycopy(dArr, i11, dArr, i10, this.f54302c - i11);
            this.f54302c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public double s(int i10, double d10) {
        a();
        l(i10);
        double[] dArr = this.f54301b;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }
}
