package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes8.dex */
final class c0<E> extends AbstractC11432c<E> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final c0<Object> f89162d = new c0<>(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private E[] f89163b;

    /* renamed from: c, reason: collision with root package name */
    private int f89164c;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        a();
        int i10 = this.f89164c;
        E[] eArr = this.f89163b;
        if (i10 == eArr.length) {
            this.f89163b = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f89163b;
        int i11 = this.f89164c;
        this.f89164c = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    private static <E> E[] e(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> c0<E> f() {
        return (c0<E>) f89162d;
    }

    private void h(int i10) {
        if (i10 < 0 || i10 >= this.f89164c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private String k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f89164c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C11454z.i
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public c0<E> b(int i10) {
        if (i10 >= this.f89164c) {
            return new c0<>(Arrays.copyOf(this.f89163b, i10), this.f89164c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f89164c;
    }

    private c0(E[] eArr, int i10, boolean z10) {
        super(z10);
        this.f89163b = eArr;
        this.f89164c = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        h(i10);
        return this.f89163b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11432c, java.util.AbstractList, java.util.List
    public E remove(int i10) {
        a();
        h(i10);
        E[] eArr = this.f89163b;
        E e10 = eArr[i10];
        if (i10 < this.f89164c - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (r2 - i10) - 1);
        }
        this.f89164c--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        a();
        h(i10);
        E[] eArr = this.f89163b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f89164c)) {
            E[] eArr = this.f89163b;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) e(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f89163b, 0, eArr2, 0, i10);
                System.arraycopy(this.f89163b, i10, eArr2, i10 + 1, this.f89164c - i10);
                this.f89163b = eArr2;
            }
            this.f89163b[i10] = e10;
            this.f89164c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(k(i10));
    }
}
