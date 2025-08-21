package Fd;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: Fd.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3579z implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f10382a;

    /* renamed from: b, reason: collision with root package name */
    Collection f10383b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ A f10384c;

    C3579z(A a10) {
        this.f10384c = a10;
        this.f10382a = a10.f9176c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10382a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f10382a.next();
        this.f10383b = (Collection) entry.getValue();
        Object key = entry.getKey();
        return new C3352f0(key, this.f10384c.f9177d.e(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        C3513t.e(this.f10383b != null, "no calls to next() since the last call to remove()");
        this.f10382a.remove();
        this.f10384c.f9177d.f9285d -= this.f10383b.size();
        this.f10383b.clear();
        this.f10383b = null;
    }
}
