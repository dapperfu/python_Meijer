package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.a;
import fsimpl.C14170dq;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.f5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10530f5 extends AbstractC10645s4 implements RandomAccess, InterfaceC10584l5, R5 {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f83021d;

    /* renamed from: e, reason: collision with root package name */
    private static final C10530f5 f83022e;

    /* renamed from: b, reason: collision with root package name */
    private int[] f83023b;

    /* renamed from: c, reason: collision with root package name */
    private int f83024c;

    static {
        int[] iArr = new int[0];
        f83021d = iArr;
        f83022e = new C10530f5(iArr, 0, false);
    }

    C10530f5() {
        this(f83021d, 0, true);
    }

    public static C10530f5 e() {
        return f83022e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f83024c)) {
            throw new IndexOutOfBoundsException(l(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f83023b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[h(length)];
            System.arraycopy(this.f83023b, 0, iArr2, 0, i10);
            System.arraycopy(this.f83023b, i10, iArr2, i12, this.f83024c - i10);
            this.f83023b = iArr2;
        }
        this.f83023b[i10] = iIntValue;
        this.f83024c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10645s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10530f5)) {
            return super.equals(obj);
        }
        C10530f5 c10530f5 = (C10530f5) obj;
        if (this.f83024c != c10530f5.f83024c) {
            return false;
        }
        int[] iArr = c10530f5.f83023b;
        for (int i10 = 0; i10 < this.f83024c; i10++) {
            if (this.f83023b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10645s4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f83024c; i11++) {
            i10 = (i10 * 31) + this.f83023b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f83024c;
    }

    private C10530f5(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f83023b = iArr;
        this.f83024c = i10;
    }

    private static int h(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f83024c) {
            throw new IndexOutOfBoundsException(l(i10));
        }
    }

    private final String l(int i10) {
        return C10663u4.a(this.f83024c, i10, C14170dq.DARKEN, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f83024c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f83023b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        k(i10);
        int[] iArr = this.f83023b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10602n5
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final InterfaceC10584l5 zzg(int i10) {
        if (i10 >= this.f83024c) {
            return new C10530f5(i10 == 0 ? f83021d : Arrays.copyOf(this.f83023b, i10), this.f83024c, true);
        }
        throw new IllegalArgumentException();
    }

    final void zzi(int i10) {
        int length = this.f83023b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f83023b = new int[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = h(length);
        }
        this.f83023b = Arrays.copyOf(this.f83023b, length);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10645s4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = C10611o5.f83156b;
        collection.getClass();
        if (!(collection instanceof C10530f5)) {
            return super.addAll(collection);
        }
        C10530f5 c10530f5 = (C10530f5) collection;
        int i10 = c10530f5.f83024c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f83024c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f83023b;
            if (i12 > iArr.length) {
                this.f83023b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(c10530f5.f83023b, 0, this.f83023b, this.f83024c, c10530f5.f83024c);
            this.f83024c = i12;
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

    public final int f(int i10) {
        k(i10);
        return this.f83023b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Integer.valueOf(this.f83023b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10645s4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        k(i10);
        int[] iArr = this.f83023b;
        int i11 = iArr[i10];
        if (i10 < this.f83024c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f83024c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            int[] iArr = this.f83023b;
            System.arraycopy(iArr, i11, iArr, i10, this.f83024c - i11);
            this.f83024c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final void zzh(int i10) {
        a();
        int i11 = this.f83024c;
        int length = this.f83023b.length;
        if (i11 == length) {
            int[] iArr = new int[h(length)];
            System.arraycopy(this.f83023b, 0, iArr, 0, this.f83024c);
            this.f83023b = iArr;
        }
        int[] iArr2 = this.f83023b;
        int i12 = this.f83024c;
        this.f83024c = i12 + 1;
        iArr2[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
