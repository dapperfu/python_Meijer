package com.google.android.gms.measurement.internal;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes6.dex */
final class D implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f85793a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ E f85794b;

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f85793a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f85793a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    D(E e10) {
        Objects.requireNonNull(e10);
        this.f85794b = e10;
        this.f85793a = e10.d1().keySet().iterator();
    }
}
