package com.google.android.gms.internal.atv_ads_framework;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC10271y extends X {

    /* renamed from: a, reason: collision with root package name */
    private final int f81079a;

    /* renamed from: b, reason: collision with root package name */
    private int f81080b;

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f81080b < this.f81079a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f81080b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f81080b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f81080b - 1;
    }

    protected AbstractC10271y(int i10, int i11) {
        r.b(i11, i10, "index");
        this.f81079a = i10;
        this.f81080b = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f81080b;
            this.f81080b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f81080b - 1;
            this.f81080b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }
}
