package com.google.android.gms.measurement.internal;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes6.dex */
final class D implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f84953a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ E f84954b;

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f84953a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f84953a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    D(E e10) {
        Objects.requireNonNull(e10);
        this.f84954b = e10;
        this.f84953a = e10.d1().keySet().iterator();
    }
}
