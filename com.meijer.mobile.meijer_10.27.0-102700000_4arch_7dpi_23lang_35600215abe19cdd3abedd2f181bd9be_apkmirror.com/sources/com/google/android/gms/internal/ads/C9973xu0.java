package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.xu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9973xu0 extends Kt0 implements RandomAccess, Nu0, InterfaceC9975xv0 {

    /* renamed from: d, reason: collision with root package name */
    private static final float[] f79880d;

    /* renamed from: e, reason: collision with root package name */
    private static final C9973xu0 f79881e;

    /* renamed from: b, reason: collision with root package name */
    private float[] f79882b;

    /* renamed from: c, reason: collision with root package name */
    private int f79883c;

    static {
        float[] fArr = new float[0];
        f79880d = fArr;
        f79881e = new C9973xu0(fArr, 0, false);
    }

    C9973xu0() {
        this(f79880d, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f79883c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int i12 = i10 + 1;
        float[] fArr = this.f79882b;
        int length = fArr.length;
        if (i11 < length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[k(length)];
            System.arraycopy(this.f79882b, 0, fArr2, 0, i10);
            System.arraycopy(this.f79882b, i10, fArr2, i12, this.f79883c - i10);
            this.f79882b = fArr2;
        }
        this.f79882b[i10] = fFloatValue;
        this.f79883c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9973xu0)) {
            return super.equals(obj);
        }
        C9973xu0 c9973xu0 = (C9973xu0) obj;
        if (this.f79883c != c9973xu0.f79883c) {
            return false;
        }
        float[] fArr = c9973xu0.f79882b;
        for (int i10 = 0; i10 < this.f79883c; i10++) {
            if (Float.floatToIntBits(this.f79882b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f79883c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f79882b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f79883c;
    }

    private C9973xu0(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f79882b = fArr;
        this.f79883c = i10;
    }

    private static int k(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f79883c;
    }

    private final void m(int i10) {
        if (i10 < 0 || i10 >= this.f79883c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.Su0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Nu0 zzf(int i10) {
        if (i10 >= this.f79883c) {
            return new C9973xu0(i10 == 0 ? f79880d : Arrays.copyOf(this.f79882b, i10), this.f79883c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f79883c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f79882b[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        m(i10);
        float[] fArr = this.f79882b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    final void zzi(int i10) {
        int length = this.f79882b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f79882b = new float[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = k(length);
        }
        this.f79882b = Arrays.copyOf(this.f79882b, length);
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = Tu0.f70473b;
        collection.getClass();
        if (!(collection instanceof C9973xu0)) {
            return super.addAll(collection);
        }
        C9973xu0 c9973xu0 = (C9973xu0) collection;
        int i10 = c9973xu0.f79883c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f79883c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f79882b;
            if (i12 > fArr.length) {
                this.f79882b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(c9973xu0.f79882b, 0, this.f79882b, this.f79883c, c9973xu0.f79883c);
            this.f79883c = i12;
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

    public final float e(int i10) {
        m(i10);
        return this.f79882b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m(i10);
        return Float.valueOf(this.f79882b[i10]);
    }

    public final void h(float f10) {
        a();
        int i10 = this.f79883c;
        int length = this.f79882b.length;
        if (i10 == length) {
            float[] fArr = new float[k(length)];
            System.arraycopy(this.f79882b, 0, fArr, 0, this.f79883c);
            this.f79882b = fArr;
        }
        float[] fArr2 = this.f79882b;
        int i11 = this.f79883c;
        this.f79883c = i11 + 1;
        fArr2[i11] = f10;
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        m(i10);
        float[] fArr = this.f79882b;
        float f10 = fArr[i10];
        if (i10 < this.f79883c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f79883c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            float[] fArr = this.f79882b;
            System.arraycopy(fArr, i11, fArr, i10, this.f79883c - i11);
            this.f79883c -= i11 - i10;
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
