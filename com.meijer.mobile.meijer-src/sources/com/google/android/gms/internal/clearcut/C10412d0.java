package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.d0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10412d0 extends AbstractC10458t<Float> implements InterfaceC10433k0<Float>, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final C10412d0 f82244d;

    /* renamed from: b, reason: collision with root package name */
    private float[] f82245b;

    /* renamed from: c, reason: collision with root package name */
    private int f82246c;

    static {
        C10412d0 c10412d0 = new C10412d0();
        f82244d = c10412d0;
        c10412d0.zzv();
    }

    C10412d0() {
        this(new float[10], 0);
    }

    private final void f(int i10, float f10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f82246c)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        float[] fArr = this.f82245b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f82245b, i10, fArr2, i10 + 1, this.f82246c - i10);
            this.f82245b = fArr2;
        }
        this.f82245b[i10] = f10;
        this.f82246c++;
        ((AbstractList) this).modCount++;
    }

    private final void h(int i10) {
        if (i10 < 0 || i10 >= this.f82246c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private final String k(int i10) {
        int i11 = this.f82246c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        f(i10, ((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10458t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        C10424h0.a(collection);
        if (!(collection instanceof C10412d0)) {
            return super.addAll(collection);
        }
        C10412d0 c10412d0 = (C10412d0) collection;
        int i10 = c10412d0.f82246c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f82246c;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f82245b;
        if (i12 > fArr.length) {
            this.f82245b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(c10412d0.f82245b, 0, this.f82245b, this.f82246c, c10412d0.f82246c);
        this.f82246c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(float f10) {
        f(this.f82246c, f10);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10458t, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10412d0)) {
            return super.equals(obj);
        }
        C10412d0 c10412d0 = (C10412d0) obj;
        if (this.f82246c != c10412d0.f82246c) {
            return false;
        }
        float[] fArr = c10412d0.f82245b;
        for (int i10 = 0; i10 < this.f82246c; i10++) {
            if (this.f82245b[i10] != fArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        h(i10);
        return Float.valueOf(this.f82245b[i10]);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10458t, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f82246c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f82245b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        a();
        h(i10);
        float[] fArr = this.f82245b;
        float f10 = fArr[i10];
        int i11 = this.f82246c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, i11 - i10);
        }
        this.f82246c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f82245b;
        System.arraycopy(fArr, i11, fArr, i10, this.f82246c - i11);
        this.f82246c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        h(i10);
        float[] fArr = this.f82245b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f82246c;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10433k0
    public final /* synthetic */ InterfaceC10433k0<Float> zzi(int i10) {
        if (i10 >= this.f82246c) {
            return new C10412d0(Arrays.copyOf(this.f82245b, i10), this.f82246c);
        }
        throw new IllegalArgumentException();
    }

    private C10412d0(float[] fArr, int i10) {
        this.f82245b = fArr;
        this.f82246c = i10;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10458t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f82246c; i10++) {
            if (obj.equals(Float.valueOf(this.f82245b[i10]))) {
                float[] fArr = this.f82245b;
                System.arraycopy(fArr, i10 + 1, fArr, i10, this.f82246c - i10);
                this.f82246c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
