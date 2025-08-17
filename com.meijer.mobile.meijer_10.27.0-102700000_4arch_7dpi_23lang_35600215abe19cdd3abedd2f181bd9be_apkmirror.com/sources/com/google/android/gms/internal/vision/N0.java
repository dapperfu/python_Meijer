package com.google.android.gms.internal.vision;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class N0 extends AbstractC11008a0<Float> implements X0<Float>, H1, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final N0 f84398d;

    /* renamed from: b, reason: collision with root package name */
    private float[] f84399b;

    /* renamed from: c, reason: collision with root package name */
    private int f84400c;

    N0() {
        this(new float[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f84400c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        float[] fArr = this.f84399b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f84399b, i10, fArr2, i10 + 1, this.f84400c - i10);
            this.f84399b = fArr2;
        }
        this.f84399b[i10] = fFloatValue;
        this.f84400c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return super.equals(obj);
        }
        N0 n02 = (N0) obj;
        if (this.f84400c != n02.f84400c) {
            return false;
        }
        float[] fArr = n02.f84399b;
        for (int i10 = 0; i10 < this.f84400c; i10++) {
            if (Float.floatToIntBits(this.f84399b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f84400c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f84399b[i10]);
        }
        return iFloatToIntBits;
    }

    static {
        N0 n02 = new N0(new float[0], 0);
        f84398d = n02;
        n02.zzb();
    }

    private N0(float[] fArr, int i10) {
        this.f84399b = fArr;
        this.f84400c = i10;
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= this.f84400c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    private final String h(int i10) {
        int i11 = this.f84400c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f84399b[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        f(i10);
        float[] fArr = this.f84399b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f84400c;
    }

    @Override // com.google.android.gms.internal.vision.X0
    public final /* synthetic */ X0<Float> zza(int i10) {
        if (i10 >= this.f84400c) {
            return new N0(Arrays.copyOf(this.f84399b, i10), this.f84400c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        S0.d(collection);
        if (!(collection instanceof N0)) {
            return super.addAll(collection);
        }
        N0 n02 = (N0) collection;
        int i10 = n02.f84400c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f84400c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f84399b;
            if (i12 > fArr.length) {
                this.f84399b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(n02.f84399b, 0, this.f84399b, this.f84400c, n02.f84400c);
            this.f84400c = i12;
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

    public final void e(float f10) {
        a();
        int i10 = this.f84400c;
        float[] fArr = this.f84399b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f84399b = fArr2;
        }
        float[] fArr3 = this.f84399b;
        int i11 = this.f84400c;
        this.f84400c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        f(i10);
        return Float.valueOf(this.f84399b[i10]);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        a();
        f(i10);
        float[] fArr = this.f84399b;
        float f10 = fArr[i10];
        if (i10 < this.f84400c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f84400c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            float[] fArr = this.f84399b;
            System.arraycopy(fArr, i11, fArr, i10, this.f84400c - i11);
            this.f84400c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }
}
