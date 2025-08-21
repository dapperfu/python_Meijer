package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10578l implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f83098a;

    C10578l(Iterator it) {
        this.f83098a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f83098a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C10658u((String) this.f83098a.next());
    }
}
