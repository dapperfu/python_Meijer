package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.a;
import fsimpl.C14170dq;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.w4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10681w4 extends AbstractC10645s4 implements RandomAccess, InterfaceC10539g5, R5 {

    /* renamed from: d, reason: collision with root package name */
    private static final boolean[] f83287d;

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f83288b;

    /* renamed from: c, reason: collision with root package name */
    private int f83289c;

    static {
        boolean[] zArr = new boolean[0];
        f83287d = zArr;
        new C10681w4(zArr, 0, false);
    }

    C10681w4() {
        this(f83287d, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f83289c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int i12 = i10 + 1;
        boolean[] zArr = this.f83288b;
        int length = zArr.length;
        if (i11 < length) {
            System.arraycopy(zArr, i10, zArr, i12, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[k(length)];
            System.arraycopy(this.f83288b, 0, zArr2, 0, i10);
            System.arraycopy(this.f83288b, i10, zArr2, i12, this.f83289c - i10);
            this.f83288b = zArr2;
        }
        this.f83288b[i10] = zBooleanValue;
        this.f83289c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10645s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10681w4)) {
            return super.equals(obj);
        }
        C10681w4 c10681w4 = (C10681w4) obj;
        if (this.f83289c != c10681w4.f83289c) {
            return false;
        }
        boolean[] zArr = c10681w4.f83288b;
        for (int i10 = 0; i10 < this.f83289c; i10++) {
            if (this.f83288b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10645s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i10 = 0; i10 < this.f83289c; i10++) {
            iB = (iB * 31) + C10611o5.b(this.f83288b[i10]);
        }
        return iB;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f83289c;
    }

    private C10681w4(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f83288b = zArr;
        this.f83289c = i10;
    }

    private static int k(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String l(int i10) {
        return C10663u4.a(this.f83289c, i10, C14170dq.DARKEN, "Index:", ", Size:");
    }

    private final void zzi(int i10) {
        if (i10 < 0 || i10 >= this.f83289c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10602n5
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final InterfaceC10539g5 zzg(int i10) {
        if (i10 >= this.f83289c) {
            return new C10681w4(i10 == 0 ? f83287d : Arrays.copyOf(this.f83288b, i10), this.f83289c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f83289c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f83288b[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        zzi(i10);
        boolean[] zArr = this.f83288b;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10645s4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = C10611o5.f83156b;
        collection.getClass();
        if (!(collection instanceof C10681w4)) {
            return super.addAll(collection);
        }
        C10681w4 c10681w4 = (C10681w4) collection;
        int i10 = c10681w4.f83289c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f83289c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f83288b;
            if (i12 > zArr.length) {
                this.f83288b = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(c10681w4.f83288b, 0, this.f83288b, this.f83289c, c10681w4.f83289c);
            this.f83289c = i12;
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

    public final boolean f(int i10) {
        zzi(i10);
        return this.f83288b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzi(i10);
        return Boolean.valueOf(this.f83288b[i10]);
    }

    public final void h(boolean z10) {
        a();
        int i10 = this.f83289c;
        int length = this.f83288b.length;
        if (i10 == length) {
            boolean[] zArr = new boolean[k(length)];
            System.arraycopy(this.f83288b, 0, zArr, 0, this.f83289c);
            this.f83288b = zArr;
        }
        boolean[] zArr2 = this.f83288b;
        int i11 = this.f83289c;
        this.f83289c = i11 + 1;
        zArr2[i11] = z10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10645s4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        zzi(i10);
        boolean[] zArr = this.f83288b;
        boolean z10 = zArr[i10];
        if (i10 < this.f83289c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f83289c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            boolean[] zArr = this.f83288b;
            System.arraycopy(zArr, i11, zArr, i10, this.f83289c - i11);
            this.f83289c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Boolean) obj).booleanValue());
        return true;
    }
}
