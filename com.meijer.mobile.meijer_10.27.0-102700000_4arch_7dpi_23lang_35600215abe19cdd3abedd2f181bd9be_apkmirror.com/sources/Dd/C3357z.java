package Dd;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: Dd.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3357z implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f6349a;

    /* renamed from: b, reason: collision with root package name */
    Collection f6350b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ A f6351c;

    C3357z(A a10) {
        this.f6351c = a10;
        this.f6349a = a10.f5143c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6349a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f6349a.next();
        this.f6350b = (Collection) entry.getValue();
        Object key = entry.getKey();
        return new C3130f0(key, this.f6351c.f5144d.e(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        C3291t.e(this.f6350b != null, "no calls to next() since the last call to remove()");
        this.f6349a.remove();
        this.f6351c.f5144d.f5252d -= this.f6350b.size();
        this.f6350b.clear();
        this.f6350b = null;
    }
}
