package com.google.android.gms.internal.pal;

import java.util.Iterator;

/* loaded from: classes6.dex */
final class N1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f82781a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O1 f82782b;

    N1(O1 o12) {
        this.f82782b = o12;
        this.f82781a = o12.f82799a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f82781a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f82781a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
