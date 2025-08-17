package Dd;

import java.util.Iterator;

/* loaded from: classes6.dex */
abstract class G0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f5218a;

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5218a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f5218a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f5218a.remove();
    }

    G0(Iterator it) {
        it.getClass();
        this.f5218a = it;
    }
}
