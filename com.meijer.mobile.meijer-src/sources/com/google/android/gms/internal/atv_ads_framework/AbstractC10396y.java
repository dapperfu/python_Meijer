package com.google.android.gms.internal.atv_ads_framework;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC10396y extends X {

    /* renamed from: a, reason: collision with root package name */
    private final int f81919a;

    /* renamed from: b, reason: collision with root package name */
    private int f81920b;

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f81920b < this.f81919a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f81920b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f81920b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f81920b - 1;
    }

    protected AbstractC10396y(int i10, int i11) {
        r.b(i11, i10, "index");
        this.f81919a = i10;
        this.f81920b = i11;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f81920b;
            this.f81920b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f81920b - 1;
            this.f81920b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }
}
