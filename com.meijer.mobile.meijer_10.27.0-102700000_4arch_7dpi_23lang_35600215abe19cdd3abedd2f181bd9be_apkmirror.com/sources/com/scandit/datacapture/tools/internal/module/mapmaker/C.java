package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class C extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f126207a;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return N.a((Collection) this).toArray();
    }

    public C(N n10) {
        this.f126207a = n10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f126207a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f126207a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f126207a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new B(this.f126207a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f126207a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return N.a((Collection) this).toArray(objArr);
    }
}
