package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.a;
import com.google.crypto.tink.shaded.protobuf.C11329z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C11325v extends AbstractC11307c<Float> implements C11329z.f, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final C11325v f88566d = new C11325v(new float[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private float[] f88567b;

    /* renamed from: c, reason: collision with root package name */
    private int f88568c;

    C11325v() {
        this(new float[10], 0, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11307c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11325v)) {
            return super.equals(obj);
        }
        C11325v c11325v = (C11325v) obj;
        if (this.f88568c != c11325v.f88568c) {
            return false;
        }
        float[] fArr = c11325v.f88567b;
        for (int i10 = 0; i10 < this.f88568c; i10++) {
            if (Float.floatToIntBits(this.f88567b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11307c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f88568c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f88567b[i10]);
        }
        return iFloatToIntBits;
    }

    private C11325v(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f88567b = fArr;
        this.f88568c = i10;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f88568c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f88568c;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f88567b[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C11329z.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C11329z.f b(int i10) {
        if (i10 >= this.f88568c) {
            return new C11325v(Arrays.copyOf(this.f88567b, i10), this.f88568c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f88568c;
    }

    private void k(int i10, float f10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f88568c)) {
            float[] fArr = this.f88567b;
            if (i11 < fArr.length) {
                System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
            } else {
                float[] fArr2 = new float[((i11 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i10);
                System.arraycopy(this.f88567b, i10, fArr2, i10 + 1, this.f88568c - i10);
                this.f88567b = fArr2;
            }
            this.f88567b[i10] = f10;
            this.f88568c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(o(i10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11307c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        a();
        C11329z.a(collection);
        if (!(collection instanceof C11325v)) {
            return super.addAll(collection);
        }
        C11325v c11325v = (C11325v) collection;
        int i10 = c11325v.f88568c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f88568c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f88567b;
            if (i12 > fArr.length) {
                this.f88567b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(c11325v.f88567b, 0, this.f88567b, this.f88568c, c11325v.f88568c);
            this.f88568c = i12;
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

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        h(f10.floatValue());
        return true;
    }

    public void h(float f10) {
        a();
        int i10 = this.f88568c;
        float[] fArr = this.f88567b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f88567b = fArr2;
        }
        float[] fArr3 = this.f88567b;
        int i11 = this.f88568c;
        this.f88568c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(n(i10));
    }

    public float n(int i10) {
        l(i10);
        return this.f88567b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11307c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        a();
        l(i10);
        float[] fArr = this.f88567b;
        float f10 = fArr[i10];
        if (i10 < this.f88568c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f88568c--;
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
            float[] fArr = this.f88567b;
            System.arraycopy(fArr, i11, fArr, i10, this.f88568c - i11);
            this.f88568c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public float s(int i10, float f10) {
        a();
        l(i10);
        float[] fArr = this.f88567b;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }
}
