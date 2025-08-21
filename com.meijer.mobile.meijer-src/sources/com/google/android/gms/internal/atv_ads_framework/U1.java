package com.google.android.gms.internal.atv_ads_framework;

import java.util.Iterator;

/* loaded from: classes6.dex */
final class U1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f81745a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ V1 f81746b;

    U1(V1 v12) {
        this.f81746b = v12;
        this.f81745a = v12.f81751a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f81745a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f81745a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
