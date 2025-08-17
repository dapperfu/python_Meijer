package Dd;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class B implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    Map.Entry f5162a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f5163b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C f5164c;

    B(C c10, Iterator it) {
        this.f5163b = it;
        this.f5164c = c10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5163b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f5163b.next();
        this.f5162a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        C3291t.e(this.f5162a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f5162a.getValue();
        this.f5163b.remove();
        this.f5164c.f5174b.f5252d -= collection.size();
        collection.clear();
        this.f5162a = null;
    }
}
