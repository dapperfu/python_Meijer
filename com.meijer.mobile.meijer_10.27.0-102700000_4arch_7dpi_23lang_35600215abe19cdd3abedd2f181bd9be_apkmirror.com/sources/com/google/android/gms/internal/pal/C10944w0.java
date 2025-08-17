package com.google.android.gms.internal.pal;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.pal.w0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10944w0 extends L implements RandomAccess, I0, InterfaceC10802n1 {

    /* renamed from: d, reason: collision with root package name */
    private static final C10944w0 f84163d;

    /* renamed from: b, reason: collision with root package name */
    private float[] f84164b;

    /* renamed from: c, reason: collision with root package name */
    private int f84165c;

    C10944w0() {
        this(new float[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.f84165c)) {
            throw new IndexOutOfBoundsException(e(i10));
        }
        float[] fArr = this.f84164b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f84164b, i10, fArr2, i10 + 1, this.f84165c - i10);
            this.f84164b = fArr2;
        }
        this.f84164b[i10] = fFloatValue;
        this.f84165c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10944w0)) {
            return super.equals(obj);
        }
        C10944w0 c10944w0 = (C10944w0) obj;
        if (this.f84165c != c10944w0.f84165c) {
            return false;
        }
        float[] fArr = c10944w0.f84164b;
        for (int i10 = 0; i10 < this.f84165c; i10++) {
            if (Float.floatToIntBits(this.f84164b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f84165c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f84164b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f84165c;
    }

    static {
        C10944w0 c10944w0 = new C10944w0(new float[0], 0);
        f84163d = c10944w0;
        c10944w0.zzb();
    }

    private C10944w0(float[] fArr, int i10) {
        this.f84164b = fArr;
        this.f84165c = i10;
    }

    private final String e(int i10) {
        return "Index:" + i10 + ", Size:" + this.f84165c;
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= this.f84165c) {
            throw new IndexOutOfBoundsException(e(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f84165c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f84164b[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        f(i10);
        float[] fArr = this.f84164b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // com.google.android.gms.internal.pal.I0
    public final /* bridge */ /* synthetic */ I0 zzd(int i10) {
        if (i10 >= this.f84165c) {
            return new C10944w0(Arrays.copyOf(this.f84164b, i10), this.f84165c);
        }
        throw new IllegalArgumentException();
    }

    public final void a(float f10) {
        zza();
        int i10 = this.f84165c;
        float[] fArr = this.f84164b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f84164b = fArr2;
        }
        float[] fArr3 = this.f84164b;
        int i11 = this.f84165c;
        this.f84165c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        J0.e(collection);
        if (!(collection instanceof C10944w0)) {
            return super.addAll(collection);
        }
        C10944w0 c10944w0 = (C10944w0) collection;
        int i10 = c10944w0.f84165c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f84165c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f84164b;
            if (i12 > fArr.length) {
                this.f84164b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(c10944w0.f84164b, 0, this.f84164b, this.f84165c, c10944w0.f84165c);
            this.f84165c = i12;
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

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        f(i10);
        return Float.valueOf(this.f84164b[i10]);
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        f(i10);
        float[] fArr = this.f84164b;
        float f10 = fArr[i10];
        if (i10 < this.f84165c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f84165c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            float[] fArr = this.f84164b;
            System.arraycopy(fArr, i11, fArr, i10, this.f84165c - i11);
            this.f84165c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        a(((Float) obj).floatValue());
        return true;
    }
}
