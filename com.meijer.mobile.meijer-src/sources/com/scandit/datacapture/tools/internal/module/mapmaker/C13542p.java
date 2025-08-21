package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.util.Iterator;

/* renamed from: com.scandit.datacapture.tools.internal.module.mapmaker.p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13542p extends AbstractC13543q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f127203a;

    public C13542p(N n10) {
        this.f127203a = n10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f127203a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f127203a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f127203a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C13541o(this.f127203a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f127203a.remove(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f127203a.size();
    }
}
