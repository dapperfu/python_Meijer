package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.util.Iterator;

/* renamed from: com.scandit.datacapture.tools.internal.module.mapmaker.p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13409p extends AbstractC13410q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f126251a;

    public C13409p(N n10) {
        this.f126251a = n10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f126251a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f126251a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f126251a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C13408o(this.f126251a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f126251a.remove(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f126251a.size();
    }
}
