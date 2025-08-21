package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Kg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7022Kg0 extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7089Mg0 f68990a;

    C7022Kg0(C7089Mg0 c7089Mg0) {
        this.f68990a = c7089Mg0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f68990a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C7089Mg0 c7089Mg0 = this.f68990a;
        Map mapT = c7089Mg0.t();
        return mapT != null ? mapT.values().iterator() : new C6852Fg0(c7089Mg0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f68990a.size();
    }
}
