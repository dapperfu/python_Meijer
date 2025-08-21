package com.google.android.gms.internal.pal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class rf extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ wf f84681a;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f84681a.f85032c;
    }

    rf(wf wfVar) {
        this.f84681a = wfVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f84681a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.f84681a.b((Map.Entry) obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new qf(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        vf vfVarB;
        if (!(obj instanceof Map.Entry) || (vfVarB = this.f84681a.b((Map.Entry) obj)) == null) {
            return false;
        }
        this.f84681a.f(vfVarB, true);
        return true;
    }
}
