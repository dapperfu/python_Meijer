package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ig0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6829Ig0 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6964Mg0 f67671a;

    C6829Ig0(C6964Mg0 c6964Mg0) {
        this.f67671a = c6964Mg0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f67671a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f67671a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C6964Mg0 c6964Mg0 = this.f67671a;
        Map mapV = c6964Mg0.v();
        return mapV != null ? mapV.keySet().iterator() : new C6659Dg0(c6964Mg0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapV = this.f67671a.v();
        return mapV != null ? mapV.keySet().remove(obj) : this.f67671a.K(obj) != C6964Mg0.f68693j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f67671a.size();
    }
}
