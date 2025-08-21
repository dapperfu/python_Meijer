package Fd;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
class E implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f9222a;

    /* renamed from: b, reason: collision with root package name */
    final Collection f9223b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ F f9224c;

    E(F f10, Iterator it) {
        this.f9224c = f10;
        this.f9223b = f10.f9242b;
        this.f9222a = it;
    }

    E(F f10) {
        this.f9224c = f10;
        Collection collection = f10.f9242b;
        this.f9223b = collection;
        this.f9222a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    final void a() {
        this.f9224c.zzb();
        if (this.f9224c.f9242b != this.f9223b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f9222a.remove();
        I i10 = this.f9224c.f9245e;
        i10.f9285d--;
        this.f9224c.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f9222a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f9222a.next();
    }
}
