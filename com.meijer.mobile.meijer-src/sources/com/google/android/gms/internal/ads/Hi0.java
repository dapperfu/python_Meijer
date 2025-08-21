package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class Hi0 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    final int[] f68328a;

    /* renamed from: b, reason: collision with root package name */
    final int f68329b;

    /* renamed from: c, reason: collision with root package name */
    final int f68330c;

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Hi0)) {
            return super.equals(obj);
        }
        Hi0 hi0 = (Hi0) obj;
        int i10 = this.f68330c - this.f68329b;
        if (hi0.f68330c - hi0.f68329b != i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f68328a[this.f68329b + i11] != hi0.f68328a[hi0.f68329b + i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f68330c - this.f68329b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && Ii0.a(this.f68328a, ((Integer) obj).intValue(), this.f68329b, this.f68330c) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        C6782Df0.a(i10, this.f68330c - this.f68329b, "index");
        return Integer.valueOf(this.f68328a[this.f68329b + i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.f68329b; i11 < this.f68330c; i11++) {
            i10 = (i10 * 31) + this.f68328a[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int iA;
        if (!(obj instanceof Integer) || (iA = Ii0.a(this.f68328a, ((Integer) obj).intValue(), this.f68329b, this.f68330c)) < 0) {
            return -1;
        }
        return iA - this.f68329b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f68328a;
            int iIntValue = ((Integer) obj).intValue();
            int i10 = this.f68329b;
            int i11 = this.f68330c - 1;
            while (true) {
                if (i11 < i10) {
                    i11 = -1;
                    break;
                }
                if (iArr[i11] == iIntValue) {
                    break;
                }
                i11--;
            }
            if (i11 >= 0) {
                return i11 - this.f68329b;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        Integer num = (Integer) obj;
        C6782Df0.a(i10, this.f68330c - this.f68329b, "index");
        int[] iArr = this.f68328a;
        int i11 = this.f68329b + i10;
        int i12 = iArr[i11];
        num.getClass();
        iArr[i11] = num.intValue();
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        C6782Df0.k(i10, i11, this.f68330c - this.f68329b);
        if (i10 == i11) {
            return Collections.EMPTY_LIST;
        }
        int[] iArr = this.f68328a;
        int i12 = this.f68329b;
        return new Hi0(iArr, i12 + i10, i11 + i12);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f68330c - this.f68329b) * 5);
        sb2.append('[');
        sb2.append(this.f68328a[this.f68329b]);
        int i10 = this.f68329b;
        while (true) {
            i10++;
            if (i10 >= this.f68330c) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f68328a[i10]);
        }
    }

    Hi0(int[] iArr, int i10, int i11) {
        this.f68328a = iArr;
        this.f68329b = i10;
        this.f68330c = i11;
    }
}
