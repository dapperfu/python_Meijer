package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Kg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6897Kg0 extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6964Mg0 f68150a;

    C6897Kg0(C6964Mg0 c6964Mg0) {
        this.f68150a = c6964Mg0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f68150a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C6964Mg0 c6964Mg0 = this.f68150a;
        Map mapV = c6964Mg0.v();
        return mapV != null ? mapV.values().iterator() : new C6727Fg0(c6964Mg0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f68150a.size();
    }
}
