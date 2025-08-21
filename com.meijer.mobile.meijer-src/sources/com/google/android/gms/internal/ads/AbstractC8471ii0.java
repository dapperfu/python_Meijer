package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.ii0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC8471ii0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f75838a;

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f75838a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f75838a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f75838a.remove();
    }

    AbstractC8471ii0(Iterator it) {
        it.getClass();
        this.f75838a = it;
    }
}
