package com.google.android.gms.internal.pal;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.pal.z6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC11123z6 extends T6 {

    /* renamed from: a, reason: collision with root package name */
    private final int f85089a;

    /* renamed from: b, reason: collision with root package name */
    private int f85090b;

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f85090b < this.f85089a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f85090b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f85090b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f85090b - 1;
    }

    protected AbstractC11123z6(int i10, int i11) {
        C11059v6.b(i11, i10, "index");
        this.f85089a = i10;
        this.f85090b = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f85090b;
            this.f85090b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f85090b - 1;
            this.f85090b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }
}
