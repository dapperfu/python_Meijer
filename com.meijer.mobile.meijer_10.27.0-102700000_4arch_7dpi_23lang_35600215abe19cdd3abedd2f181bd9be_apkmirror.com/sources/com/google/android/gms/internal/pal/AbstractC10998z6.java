package com.google.android.gms.internal.pal;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.pal.z6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC10998z6 extends T6 {

    /* renamed from: a, reason: collision with root package name */
    private final int f84249a;

    /* renamed from: b, reason: collision with root package name */
    private int f84250b;

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f84250b < this.f84249a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f84250b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f84250b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f84250b - 1;
    }

    protected AbstractC10998z6(int i10, int i11) {
        C10934v6.b(i11, i10, "index");
        this.f84249a = i10;
        this.f84250b = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f84250b;
            this.f84250b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f84250b - 1;
            this.f84250b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }
}
