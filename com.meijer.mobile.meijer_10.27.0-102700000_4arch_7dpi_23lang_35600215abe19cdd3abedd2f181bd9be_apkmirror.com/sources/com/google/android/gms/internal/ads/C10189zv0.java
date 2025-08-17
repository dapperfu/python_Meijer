package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.zv0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10189zv0 extends Kt0 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final Object[] f80553d;

    /* renamed from: e, reason: collision with root package name */
    private static final C10189zv0 f80554e;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f80555b;

    /* renamed from: c, reason: collision with root package name */
    private int f80556c;

    static {
        Object[] objArr = new Object[0];
        f80553d = objArr;
        f80554e = new C10189zv0(objArr, 0, false);
    }

    C10189zv0() {
        this(f80553d, 0, true);
    }

    public static C10189zv0 e() {
        return f80554e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f80556c)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f80555b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[h(length)];
            System.arraycopy(this.f80555b, 0, objArr2, 0, i10);
            System.arraycopy(this.f80555b, i10, objArr2, i12, this.f80556c - i10);
            this.f80555b = objArr2;
        }
        this.f80555b[i10] = obj;
        this.f80556c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f80556c;
    }

    private C10189zv0(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f80555b = objArr;
        this.f80556c = i10;
    }

    private static int h(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f80556c;
    }

    private final void zzi(int i10) {
        if (i10 < 0 || i10 >= this.f80556c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    final void f(int i10) {
        int length = this.f80555b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f80555b = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = h(length);
        }
        this.f80555b = Arrays.copyOf(this.f80555b, length);
    }

    @Override // com.google.android.gms.internal.ads.Su0
    public final /* bridge */ /* synthetic */ Su0 zzf(int i10) {
        if (i10 >= this.f80556c) {
            return new C10189zv0(i10 == 0 ? f80553d : Arrays.copyOf(this.f80555b, i10), this.f80556c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        zzi(i10);
        return this.f80555b[i10];
    }

    @Override // com.google.android.gms.internal.ads.Kt0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        zzi(i10);
        Object[] objArr = this.f80555b;
        Object obj = objArr[i10];
        if (i10 < this.f80556c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f80556c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        zzi(i10);
        Object[] objArr = this.f80555b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i10 = this.f80556c;
        int length = this.f80555b.length;
        if (i10 == length) {
            this.f80555b = Arrays.copyOf(this.f80555b, h(length));
        }
        Object[] objArr = this.f80555b;
        int i11 = this.f80556c;
        this.f80556c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
