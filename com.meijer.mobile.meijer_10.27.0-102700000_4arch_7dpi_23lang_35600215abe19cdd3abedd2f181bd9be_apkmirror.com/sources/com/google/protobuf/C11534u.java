package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.C11538y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11534u extends AbstractC11517c<Float> implements C11538y.f, RandomAccess, Z {

    /* renamed from: d, reason: collision with root package name */
    private static final C11534u f90731d = new C11534u(new float[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private float[] f90732b;

    /* renamed from: c, reason: collision with root package name */
    private int f90733c;

    C11534u() {
        this(new float[10], 0, true);
    }

    @Override // com.google.protobuf.AbstractC11517c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11534u)) {
            return super.equals(obj);
        }
        C11534u c11534u = (C11534u) obj;
        if (this.f90733c != c11534u.f90733c) {
            return false;
        }
        float[] fArr = c11534u.f90732b;
        for (int i10 = 0; i10 < this.f90733c; i10++) {
            if (Float.floatToIntBits(this.f90732b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC11517c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f90733c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f90732b[i10]);
        }
        return iFloatToIntBits;
    }

    private C11534u(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f90732b = fArr;
        this.f90733c = i10;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f90733c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f90733c;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f90732b[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.C11538y.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C11538y.f b(int i10) {
        if (i10 >= this.f90733c) {
            return new C11534u(Arrays.copyOf(this.f90732b, i10), this.f90733c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f90733c;
    }

    private void k(int i10, float f10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f90733c)) {
            float[] fArr = this.f90732b;
            if (i11 < fArr.length) {
                System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
            } else {
                float[] fArr2 = new float[((i11 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i10);
                System.arraycopy(this.f90732b, i10, fArr2, i10 + 1, this.f90733c - i10);
                this.f90732b = fArr2;
            }
            this.f90732b[i10] = f10;
            this.f90733c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(o(i10));
    }

    @Override // com.google.protobuf.AbstractC11517c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        a();
        C11538y.a(collection);
        if (!(collection instanceof C11534u)) {
            return super.addAll(collection);
        }
        C11534u c11534u = (C11534u) collection;
        int i10 = c11534u.f90733c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f90733c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f90732b;
            if (i12 > fArr.length) {
                this.f90732b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(c11534u.f90732b, 0, this.f90732b, this.f90733c, c11534u.f90733c);
            this.f90733c = i12;
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
    public void add(int i10, Float f10) {
        k(i10, f10.floatValue());
    }

    @Override // com.google.protobuf.AbstractC11517c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        h(f10.floatValue());
        return true;
    }

    public void h(float f10) {
        a();
        int i10 = this.f90733c;
        float[] fArr = this.f90732b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f90732b = fArr2;
        }
        float[] fArr3 = this.f90732b;
        int i11 = this.f90733c;
        this.f90733c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(n(i10));
    }

    public float n(int i10) {
        l(i10);
        return this.f90732b[i10];
    }

    @Override // com.google.protobuf.AbstractC11517c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        a();
        l(i10);
        float[] fArr = this.f90732b;
        float f10 = fArr[i10];
        if (i10 < this.f90733c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f90733c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Float set(int i10, Float f10) {
        return Float.valueOf(s(i10, f10.floatValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            float[] fArr = this.f90732b;
            System.arraycopy(fArr, i11, fArr, i10, this.f90733c - i11);
            this.f90733c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public float s(int i10, float f10) {
        a();
        l(i10);
        float[] fArr = this.f90732b;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }
}
