package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ig0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6954Ig0 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7089Mg0 f68511a;

    C6954Ig0(C7089Mg0 c7089Mg0) {
        this.f68511a = c7089Mg0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f68511a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f68511a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C7089Mg0 c7089Mg0 = this.f68511a;
        Map mapT = c7089Mg0.t();
        return mapT != null ? mapT.keySet().iterator() : new C6784Dg0(c7089Mg0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapT = this.f68511a.t();
        return mapT != null ? mapT.keySet().remove(obj) : this.f68511a.K(obj) != C7089Mg0.f69533j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f68511a.size();
    }
}
