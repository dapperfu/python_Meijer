package com.google.android.gms.internal.pal;

import java.util.AbstractSet;
import java.util.Iterator;

/* loaded from: classes6.dex */
final class tf extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ wf f84056a;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f84056a.f84192c;
    }

    tf(wf wfVar) {
        this.f84056a = wfVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f84056a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f84056a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new sf(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f84056a.d(obj) != null;
    }
}
