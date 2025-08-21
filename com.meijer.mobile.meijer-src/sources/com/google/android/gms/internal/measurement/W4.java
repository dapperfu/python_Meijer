package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.a;
import fsimpl.C14170dq;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class W4 extends AbstractC10645s4 implements RandomAccess, InterfaceC10575k5, R5 {

    /* renamed from: d, reason: collision with root package name */
    private static final float[] f82922d;

    /* renamed from: b, reason: collision with root package name */
    private float[] f82923b;

    /* renamed from: c, reason: collision with root package name */
    private int f82924c;

    static {
        float[] fArr = new float[0];
        f82922d = fArr;
        new W4(fArr, 0, false);
    }

    W4() {
        this(f82922d, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f82924c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        int i12 = i10 + 1;
        float[] fArr = this.f82923b;
        int length = fArr.length;
        if (i11 < length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[k(length)];
            System.arraycopy(this.f82923b, 0, fArr2, 0, i10);
            System.arraycopy(this.f82923b, i10, fArr2, i12, this.f82924c - i10);
            this.f82923b = fArr2;
        }
        this.f82923b[i10] = fFloatValue;
        this.f82924c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10645s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W4)) {
            return super.equals(obj);
        }
        W4 w42 = (W4) obj;
        if (this.f82924c != w42.f82924c) {
            return false;
        }
        float[] fArr = w42.f82923b;
        for (int i10 = 0; i10 < this.f82924c; i10++) {
            if (Float.floatToIntBits(this.f82923b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10645s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f82924c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f82923b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f82924c;
    }

    private W4(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f82923b = fArr;
        this.f82924c = i10;
    }

    private static int k(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void l(int i10) {
        if (i10 < 0 || i10 >= this.f82924c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private final String m(int i10) {
        return C10663u4.a(this.f82924c, i10, C14170dq.DARKEN, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10602n5
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final InterfaceC10575k5 zzg(int i10) {
        if (i10 >= this.f82924c) {
            return new W4(i10 == 0 ? f82922d : Arrays.copyOf(this.f82923b, i10), this.f82924c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f82924c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f82923b[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        l(i10);
        float[] fArr = this.f82923b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    final void zzh(int i10) {
        int length = this.f82923b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f82923b = new float[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = k(length);
        }
        this.f82923b = Arrays.copyOf(this.f82923b, length);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10645s4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = C10611o5.f83156b;
        collection.getClass();
        if (!(collection instanceof W4)) {
            return super.addAll(collection);
        }
        W4 w42 = (W4) collection;
        int i10 = w42.f82924c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f82924c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f82923b;
            if (i12 > fArr.length) {
                this.f82923b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(w42.f82923b, 0, this.f82923b, this.f82924c, w42.f82924c);
            this.f82924c = i12;
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

    public final float f(int i10) {
        l(i10);
        return this.f82923b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        l(i10);
        return Float.valueOf(this.f82923b[i10]);
    }

    public final void h(float f10) {
        a();
        int i10 = this.f82924c;
        int length = this.f82923b.length;
        if (i10 == length) {
            float[] fArr = new float[k(length)];
            System.arraycopy(this.f82923b, 0, fArr, 0, this.f82924c);
            this.f82923b = fArr;
        }
        float[] fArr2 = this.f82923b;
        int i11 = this.f82924c;
        this.f82924c = i11 + 1;
        fArr2[i11] = f10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10645s4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        l(i10);
        float[] fArr = this.f82923b;
        float f10 = fArr[i10];
        if (i10 < this.f82924c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f82924c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            float[] fArr = this.f82923b;
            System.arraycopy(fArr, i11, fArr, i10, this.f82924c - i11);
            this.f82924c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Float) obj).floatValue());
        return true;
    }
}
