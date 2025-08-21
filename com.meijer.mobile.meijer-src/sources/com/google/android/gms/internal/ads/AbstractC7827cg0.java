package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.cg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC7827cg0 extends AbstractC8791li0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f74062a;

    /* renamed from: b, reason: collision with root package name */
    private int f74063b;

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f74063b < this.f74062a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f74063b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f74063b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f74063b - 1;
    }

    protected AbstractC7827cg0(int i10, int i11) {
        C6782Df0.b(i11, i10, "index");
        this.f74062a = i10;
        this.f74063b = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f74063b;
            this.f74063b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f74063b - 1;
            this.f74063b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }
}
