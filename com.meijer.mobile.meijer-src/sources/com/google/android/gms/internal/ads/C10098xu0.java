package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.xu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10098xu0 extends Kt0 implements RandomAccess, Nu0, InterfaceC10100xv0 {

    /* renamed from: d, reason: collision with root package name */
    private static final float[] f80720d;

    /* renamed from: e, reason: collision with root package name */
    private static final C10098xu0 f80721e;

    /* renamed from: b, reason: collision with root package name */
    private float[] f80722b;

    /* renamed from: c, reason: collision with root package name */
    private int f80723c;

    static {
        float[] fArr = new float[0];
        f80720d = fArr;
        f80721e = new C10098xu0(fArr, 0, false);
    }

    C10098xu0() {
        this(f80720d, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f80723c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int i12 = i10 + 1;
        float[] fArr = this.f80722b;
        int length = fArr.length;
        if (i11 < length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[k(length)];
            System.arraycopy(this.f80722b, 0, fArr2, 0, i10);
            System.arraycopy(this.f80722b, i10, fArr2, i12, this.f80723c - i10);
            this.f80722b = fArr2;
        }
        this.f80722b[i10] = fFloatValue;
        this.f80723c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10098xu0)) {
            return super.equals(obj);
        }
        C10098xu0 c10098xu0 = (C10098xu0) obj;
        if (this.f80723c != c10098xu0.f80723c) {
            return false;
        }
        float[] fArr = c10098xu0.f80722b;
        for (int i10 = 0; i10 < this.f80723c; i10++) {
            if (Float.floatToIntBits(this.f80722b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f80723c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f80722b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f80723c;
    }

    private C10098xu0(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f80722b = fArr;
        this.f80723c = i10;
    }

    private static int k(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String l(int i10) {
        return "Index:" + i10 + ", Size:" + this.f80723c;
    }

    private final void m(int i10) {
        if (i10 < 0 || i10 >= this.f80723c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.Su0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Nu0 zzf(int i10) {
        if (i10 >= this.f80723c) {
            return new C10098xu0(i10 == 0 ? f80720d : Arrays.copyOf(this.f80722b, i10), this.f80723c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f80723c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f80722b[i11] == fFloatValue) {
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
        float[] fArr = this.f80722b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    final void zzi(int i10) {
        int length = this.f80722b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f80722b = new float[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = k(length);
        }
        this.f80722b = Arrays.copyOf(this.f80722b, length);
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = Tu0.f71313b;
        collection.getClass();
        if (!(collection instanceof C10098xu0)) {
            return super.addAll(collection);
        }
        C10098xu0 c10098xu0 = (C10098xu0) collection;
        int i10 = c10098xu0.f80723c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f80723c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f80722b;
            if (i12 > fArr.length) {
                this.f80722b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(c10098xu0.f80722b, 0, this.f80722b, this.f80723c, c10098xu0.f80723c);
            this.f80723c = i12;
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
        return this.f80722b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m(i10);
        return Float.valueOf(this.f80722b[i10]);
    }

    public final void h(float f10) {
        a();
        int i10 = this.f80723c;
        int length = this.f80722b.length;
        if (i10 == length) {
            float[] fArr = new float[k(length)];
            System.arraycopy(this.f80722b, 0, fArr, 0, this.f80723c);
            this.f80722b = fArr;
        }
        float[] fArr2 = this.f80722b;
        int i11 = this.f80723c;
        this.f80723c = i11 + 1;
        fArr2[i11] = f10;
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        m(i10);
        float[] fArr = this.f80722b;
        float f10 = fArr[i10];
        if (i10 < this.f80723c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f80723c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            float[] fArr = this.f80722b;
            System.arraycopy(fArr, i11, fArr, i10, this.f80723c - i11);
            this.f80723c -= i11 - i10;
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
