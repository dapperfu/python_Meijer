package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10453l implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f82258a;

    C10453l(Iterator it) {
        this.f82258a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f82258a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C10533u((String) this.f82258a.next());
    }
}
