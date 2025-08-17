package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.ii0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC8346ii0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f74998a;

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f74998a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f74998a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f74998a.remove();
    }

    AbstractC8346ii0(Iterator it) {
        it.getClass();
        this.f74998a = it;
    }
}
