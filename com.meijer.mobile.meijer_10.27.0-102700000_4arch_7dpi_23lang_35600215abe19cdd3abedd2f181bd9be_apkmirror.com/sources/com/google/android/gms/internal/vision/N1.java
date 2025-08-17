package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class N1<E> extends AbstractC11008a0<E> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final N1<Object> f84401d;

    /* renamed from: b, reason: collision with root package name */
    private E[] f84402b;

    /* renamed from: c, reason: collision with root package name */
    private int f84403c;

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        a();
        int i10 = this.f84403c;
        E[] eArr = this.f84402b;
        if (i10 == eArr.length) {
            this.f84402b = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f84402b;
        int i11 = this.f84403c;
        this.f84403c = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    static {
        N1<Object> n12 = new N1<>(new Object[0], 0);
        f84401d = n12;
        n12.zzb();
    }

    private final void e(int i10) {
        if (i10 < 0 || i10 >= this.f84403c) {
            throw new IndexOutOfBoundsException(f(i10));
        }
    }

    private final String f(int i10) {
        int i11 = this.f84403c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    public static <E> N1<E> h() {
        return (N1<E>) f84401d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f84403c;
    }

    @Override // com.google.android.gms.internal.vision.X0
    public final /* synthetic */ X0 zza(int i10) {
        if (i10 >= this.f84403c) {
            return new N1(Arrays.copyOf(this.f84402b, i10), this.f84403c);
        }
        throw new IllegalArgumentException();
    }

    private N1(E[] eArr, int i10) {
        this.f84402b = eArr;
        this.f84403c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        e(i10);
        return this.f84402b[i10];
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        a();
        e(i10);
        E[] eArr = this.f84402b;
        E e10 = eArr[i10];
        if (i10 < this.f84403c - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (r2 - i10) - 1);
        }
        this.f84403c--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        a();
        e(i10);
        E[] eArr = this.f84402b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f84403c)) {
            E[] eArr = this.f84402b;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) new Object[((i11 * 3) / 2) + 1];
                System.arraycopy(eArr, 0, eArr2, 0, i10);
                System.arraycopy(this.f84402b, i10, eArr2, i10 + 1, this.f84403c - i10);
                this.f84402b = eArr2;
            }
            this.f84402b[i10] = e10;
            this.f84403c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(f(i10));
    }
}
