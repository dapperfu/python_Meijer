package Fd;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class B implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    Map.Entry f9195a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f9196b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C f9197c;

    B(C c10, Iterator it) {
        this.f9196b = it;
        this.f9197c = c10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9196b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f9196b.next();
        this.f9195a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        C3513t.e(this.f9195a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f9195a.getValue();
        this.f9196b.remove();
        this.f9197c.f9207b.f9285d -= collection.size();
        collection.clear();
        this.f9195a = null;
    }
}
