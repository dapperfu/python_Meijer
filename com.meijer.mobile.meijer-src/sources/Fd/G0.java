package Fd;

import java.util.Iterator;

/* loaded from: classes6.dex */
abstract class G0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f9251a;

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9251a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f9251a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f9251a.remove();
    }

    G0(Iterator it) {
        it.getClass();
        this.f9251a = it;
    }
}
