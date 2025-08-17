package com.google.android.gms.internal.measurement;

import fsimpl.C14045dq;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class T5 extends AbstractC10520s4 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final Object[] f81990d;

    /* renamed from: e, reason: collision with root package name */
    private static final T5 f81991e;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f81992b;

    /* renamed from: c, reason: collision with root package name */
    private int f81993c;

    static {
        Object[] objArr = new Object[0];
        f81990d = objArr;
        f81991e = new T5(objArr, 0, false);
    }

    T5() {
        this(f81990d, 0, true);
    }

    public static T5 e() {
        return f81991e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f81993c)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f81992b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[h(length)];
            System.arraycopy(this.f81992b, 0, objArr2, 0, i10);
            System.arraycopy(this.f81992b, i10, objArr2, i12, this.f81993c - i10);
            this.f81992b = objArr2;
        }
        this.f81992b[i10] = obj;
        this.f81993c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f81993c;
    }

    private T5(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f81992b = objArr;
        this.f81993c = i10;
    }

    private static int h(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String k(int i10) {
        return C10538u4.a(this.f81993c, i10, C14045dq.DARKEN, "Index:", ", Size:");
    }

    private final void zzh(int i10) {
        if (i10 < 0 || i10 >= this.f81993c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    final void f(int i10) {
        int length = this.f81992b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f81992b = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = h(length);
        }
        this.f81992b = Arrays.copyOf(this.f81992b, length);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10477n5
    public final /* bridge */ /* synthetic */ InterfaceC10477n5 zzg(int i10) {
        if (i10 >= this.f81993c) {
            return new T5(i10 == 0 ? f81990d : Arrays.copyOf(this.f81992b, i10), this.f81993c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        zzh(i10);
        return this.f81992b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10520s4, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        zzh(i10);
        Object[] objArr = this.f81992b;
        Object obj = objArr[i10];
        if (i10 < this.f81993c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f81993c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        zzh(i10);
        Object[] objArr = this.f81992b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i10 = this.f81993c;
        int length = this.f81992b.length;
        if (i10 == length) {
            this.f81992b = Arrays.copyOf(this.f81992b, h(length));
        }
        Object[] objArr = this.f81992b;
        int i11 = this.f81993c;
        this.f81993c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
