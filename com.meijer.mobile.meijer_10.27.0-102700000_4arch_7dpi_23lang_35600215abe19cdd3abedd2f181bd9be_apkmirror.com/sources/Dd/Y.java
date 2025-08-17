package Dd;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class Y extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z f5590a;

    Y(Z z10) {
        this.f5590a = z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f5590a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Z z10 = this.f5590a;
        Map mapV = z10.v();
        return mapV != null ? mapV.values().iterator() : new S(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f5590a.size();
    }
}
