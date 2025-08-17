package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.cg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC7702cg0 extends AbstractC8666li0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f73222a;

    /* renamed from: b, reason: collision with root package name */
    private int f73223b;

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f73223b < this.f73222a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f73223b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f73223b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f73223b - 1;
    }

    protected AbstractC7702cg0(int i10, int i11) {
        C6657Df0.b(i11, i10, "index");
        this.f73222a = i10;
        this.f73223b = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f73223b;
            this.f73223b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f73223b - 1;
            this.f73223b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }
}
