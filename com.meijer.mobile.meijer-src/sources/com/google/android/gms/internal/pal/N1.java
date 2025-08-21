package com.google.android.gms.internal.pal;

import java.util.Iterator;

/* loaded from: classes6.dex */
final class N1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f83621a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O1 f83622b;

    N1(O1 o12) {
        this.f83622b = o12;
        this.f83621a = o12.f83639a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f83621a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f83621a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
