package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class C extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f127159a;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return N.a((Collection) this).toArray();
    }

    public C(N n10) {
        this.f127159a = n10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f127159a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f127159a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f127159a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new B(this.f127159a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f127159a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return N.a((Collection) this).toArray(objArr);
    }
}
