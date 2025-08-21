package com.google.android.gms.internal.pal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.pal.p1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10959p1 extends L implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final C10959p1 f84112d;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f84113b;

    /* renamed from: c, reason: collision with root package name */
    private int f84114c;

    public static C10959p1 a() {
        return f84112d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        zza();
        if (i10 < 0 || i10 > (i11 = this.f84114c)) {
            throw new IndexOutOfBoundsException(e(i10));
        }
        Object[] objArr = this.f84113b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f84113b, i10, objArr2, i10 + 1, this.f84114c - i10);
            this.f84113b = objArr2;
        }
        this.f84113b[i10] = obj;
        this.f84114c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f84114c;
    }

    static {
        C10959p1 c10959p1 = new C10959p1(new Object[0], 0);
        f84112d = c10959p1;
        c10959p1.zzb();
    }

    private final String e(int i10) {
        return "Index:" + i10 + ", Size:" + this.f84114c;
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= this.f84114c) {
            throw new IndexOutOfBoundsException(e(i10));
        }
    }

    @Override // com.google.android.gms.internal.pal.I0
    public final /* bridge */ /* synthetic */ I0 zzd(int i10) {
        if (i10 >= this.f84114c) {
            return new C10959p1(Arrays.copyOf(this.f84113b, i10), this.f84114c);
        }
        throw new IllegalArgumentException();
    }

    private C10959p1(Object[] objArr, int i10) {
        this.f84113b = objArr;
        this.f84114c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        f(i10);
        return this.f84113b[i10];
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        zza();
        f(i10);
        Object[] objArr = this.f84113b;
        Object obj = objArr[i10];
        if (i10 < this.f84114c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f84114c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        zza();
        f(i10);
        Object[] objArr = this.f84113b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i10 = this.f84114c;
        Object[] objArr = this.f84113b;
        if (i10 == objArr.length) {
            this.f84113b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f84113b;
        int i11 = this.f84114c;
        this.f84114c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
