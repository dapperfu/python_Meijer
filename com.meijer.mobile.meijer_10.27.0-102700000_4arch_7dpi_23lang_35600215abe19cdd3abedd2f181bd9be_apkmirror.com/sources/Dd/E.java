package Dd;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
class E implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f5189a;

    /* renamed from: b, reason: collision with root package name */
    final Collection f5190b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ F f5191c;

    E(F f10, Iterator it) {
        this.f5191c = f10;
        this.f5190b = f10.f5209b;
        this.f5189a = it;
    }

    E(F f10) {
        this.f5191c = f10;
        Collection collection = f10.f5209b;
        this.f5190b = collection;
        this.f5189a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    final void a() {
        this.f5191c.zzb();
        if (this.f5191c.f5209b != this.f5190b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f5189a.remove();
        I i10 = this.f5191c.f5212e;
        i10.f5252d--;
        this.f5191c.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f5189a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f5189a.next();
    }
}
