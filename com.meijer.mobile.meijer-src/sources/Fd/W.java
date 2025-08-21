package Fd;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class W extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z f9590a;

    W(Z z10) {
        this.f9590a = z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f9590a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f9590a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Z z10 = this.f9590a;
        Map mapT = z10.t();
        return mapT != null ? mapT.keySet().iterator() : new O(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapT = this.f9590a.t();
        return mapT != null ? mapT.keySet().remove(obj) : this.f9590a.K(obj) != Z.f9705j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9590a.size();
    }
}
