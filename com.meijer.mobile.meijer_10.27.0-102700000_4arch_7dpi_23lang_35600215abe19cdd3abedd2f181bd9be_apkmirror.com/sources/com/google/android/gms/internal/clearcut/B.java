package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
final class B implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f81102a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f81103b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ A f81104c;

    B(A a10) {
        this.f81104c = a10;
        this.f81103b = a10.size();
    }

    private final byte b() {
        try {
            A a10 = this.f81104c;
            int i10 = this.f81102a;
            this.f81102a = i10 + 1;
            return a10.p(i10);
        } catch (IndexOutOfBoundsException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f81102a < this.f81103b;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(b());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
