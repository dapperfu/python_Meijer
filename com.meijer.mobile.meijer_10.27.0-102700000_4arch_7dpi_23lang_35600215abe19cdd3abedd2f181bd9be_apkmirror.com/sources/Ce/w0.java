package Ce;

import java.util.Iterator;

/* loaded from: classes6.dex */
abstract class w0<F, T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    final Iterator<? extends F> f4122a;

    abstract T a(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4122a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f4122a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f4122a.remove();
    }

    w0(Iterator<? extends F> it) {
        this.f4122a = (Iterator) Be.p.q(it);
    }
}
