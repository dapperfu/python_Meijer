package Fd;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class Y extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z f9623a;

    Y(Z z10) {
        this.f9623a = z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f9623a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Z z10 = this.f9623a;
        Map mapT = z10.t();
        return mapT != null ? mapT.values().iterator() : new S(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f9623a.size();
    }
}
